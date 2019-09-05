package com.gaojianhui.framework.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;

public class XWPFHelper {
	public static Map<String, Object> getTable(String pattern, List<XWPFTable> tables) {
		Map<String, Object> m = new HashMap<>();
		for (XWPFTable t : tables) {
			if (t.getText().contains(pattern)) {
				m.put("table", t);
				// m.put("startRow", i);
				// m.put("startCell", j);
				return m;
			}
		}
		return m;
	}
 
	public static void clearTable(String pattern, List<XWPFTable> tables, XWPFRun run) {
		// 清除自定义表格填写内容
		List<XWPFTableRow> rows = null;
		List<XWPFTableCell> cells = null;
		for (XWPFTable t : tables) {
			if (t.getText().contains(pattern)) {
				rows = t.getRows();
				//删除模板表格中新增加的行
				for (int i = 2; i < rows.size(); i++) {
					t.removeRow(i);
				}
				cells = rows.get(1).getTableCells();
				for (XWPFTableCell cell : cells) {
					XWPFParagraph par = cell.getParagraphs().get(0);
					for (XWPFRun r : par.getRuns()) {
						r.setText("", 0);
					}
				}
 
			}
		}
	}
 
	// 复制单元格
	public static void copyTableCell(XWPFTableCell target, XWPFTableCell source) {
		// 列属性
		target.getCTTc().setTcPr(source.getCTTc().getTcPr());
		// 删除目标 targetCell 所有单元格
		for (int pos = 0; pos < target.getParagraphs().size(); pos++) {
			target.removeParagraph(pos);
		}
		// 添加段落
		for (XWPFParagraph sp : source.getParagraphs()) {
			XWPFParagraph targetP = target.addParagraph();
			copyParagraph(targetP, sp);
		}
	}
 
	// public static void CopyRun(XWPFRun target, XWPFRun source) {
	// target.getCTR().setRPr(source.getCTR().getRPr());
	// // 设置文本
	// target.setText(source.text());
	// }
	public static void copyParagraph(XWPFParagraph target, XWPFParagraph source) {
		// 设置段落样式
		target.getCTP().setPPr(source.getCTP().getPPr());
		// 添加Run标签
		for (int pos = 0; pos < target.getRuns().size(); pos++) {
			target.removeRun(pos);
		}
		// for (XWPFRun s : source.getRuns()) {
		// XWPFRun targetrun = target.createRun();
		// CopyRun(targetrun, s);
		// }
	}
 
	public static void copytTableRow(XWPFTableRow target, XWPFTableRow source) {
		// 复制样式
		target.getCtRow().setTrPr(source.getCtRow().getTrPr());
		// 复制单元格
		for (int i = 0; i < target.getTableCells().size(); i++) {
			copyTableCell(target.getCell(i), source.getCell(i));
		}
	}
 
	public static XWPFRun getRun(XWPFTableCell cell, XWPFRun source) {
		XWPFParagraph par = cell.getParagraphs().get(0);
		// XWPFRun r = par.getRuns().size() > 0 ? par.getRuns().get(0) :
		// par.createRun();
		XWPFRun r = par.createRun();
		r.getCTR().setRPr(source.getCTR().getRPr());// 复制 run
		r.setFontFamily(source.getFontFamily());
		r.setFontSize(source.getFontSize());
		par.removeRun(source.getTextPosition());
		return r;
	}
 
	public static XWPFTable getTableByTBL(List<XWPFTable> tables, CTTbl tbl) {
		for (int i = 0; i < tables.size(); i++) {
			if (tables.get(i).getCTTbl() == tbl)
				return tables.get(i);
		}
		return null;
	}

}
