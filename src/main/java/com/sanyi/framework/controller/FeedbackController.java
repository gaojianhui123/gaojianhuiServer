package com.sanyi.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.sanyi.framework.service.impl.FeedbackService;
import com.sanyi.framework.service.impl.LienPersonnelService;

import org.springframework.core.io.ClassPathResource;
import com.sanyi.framework.service.impl.NurseService;
import javax.servlet.http.HttpServletResponse;
import com.sanyi.framework.util.WordTemplate;
import javax.servlet.http.HttpServletRequest;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.model.Feedback;
import com.sanyi.framework.model.LienPersonnel;
import com.sanyi.framework.page.SanyiPage;
import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

/*
 * 问题反馈Controller
 */
@RestController
@RequestMapping(value = "/feedback")
public class FeedbackController {
	@Autowired
	FeedbackService feedbackService;
	@Autowired
	NurseService nurseService;
	@Autowired
	LienPersonnelService lienPersonnelService;

	// 查询列表
	@RequestMapping(value = "findFeedback", method = RequestMethod.POST)
	public SanyiPage<Feedback> findFeedback(@RequestBody QueryParam<Feedback> query) {
		return feedbackService.selectByBatis(query);
	}

	// 根据id查
	@RequestMapping(value = "findFeedbackById", method = RequestMethod.POST)
	public Optional<Feedback> findFeedbackById(HttpServletRequest request, @RequestBody String id) {
		return feedbackService.findById(id);
	}

	// 新增
	@RequestMapping(value = "saveFeedback", method = RequestMethod.POST)
	public Feedback saveFeedback(HttpServletRequest request, @RequestBody Feedback feedback) {
		Feedback fb = feedbackService.save(feedback);
		// 根据留置人id获取留置人信息
		LienPersonnel lienPersonnel = lienPersonnelService.findById(feedback.getLienPersonnelid()).orElse(new LienPersonnel());
//		mqttGateway.sendToMqtt("新到一个反映问题","FYWTalert" + lienPersonnel.getCbDepartment());
		return fb;
	}
	// 保存 问题反馈改进
	@RequestMapping(value = "saveFeedbackQuestion", method = RequestMethod.POST)
	public Feedback saveFeedbackQuestion(HttpServletRequest request, @RequestBody Feedback feedback) {
		Feedback fb = feedbackService.save(feedback);
		// 根据留置人id获取留置人信息
		LienPersonnel lienPersonnel = lienPersonnelService.findById(feedback.getLienPersonnelid()).orElse(new LienPersonnel());
//		mqttGateway.sendToMqtt("新到一个反映问题","GJWTalert");
		return fb;
	}

	// 逻辑删除
	@RequestMapping(value = "deleteFeedback", method = RequestMethod.POST)
	public Feedback deleteFeedback(HttpServletRequest request, @RequestBody Feedback feedback) {
		feedback.setDeleted(true);
		return feedbackService.logicDelete(feedback);
	}

	// 文件导出执纪审查点安全工作改进建议单
	@RequestMapping(value = "noLimit_exportDaoChu/{id}", method = RequestMethod.GET)
	public void exportDaoChu(@PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map<String, Object> wordDataMap = new HashMap<>();// 存储word中所有数据
		Map<String, Object> parametersMap = new HashMap<>();// 存储不循环的数据
		Optional<Feedback> optional = feedbackService.findById(id);
		Feedback feedback = optional.get();
		parametersMap.put("bumen", feedback.getDepartment());
		parametersMap.put("shijian", feedback.getFkTime());
		parametersMap.put("wenti", feedback.getProblem());
		parametersMap.put("jianyi", feedback.getSuggest());
		parametersMap.put("qianshou", feedback.getFkTime());
		parametersMap.put("qianshouren", feedback.getTitle());
		parametersMap.put("jieguo", feedback.getGjResult());
		parametersMap.put("fankui", feedback.getGjTime());
		parametersMap.put("fuze", feedback.getFzPerson());
		parametersMap.put("tel", feedback.getPhone());
		wordDataMap.put("parametersMap", parametersMap);
//		String realPath = org.springframework.util.ResourceUtils.getFile("classpath:templates/执纪审查点安全工作改进建议单.docx").getAbsolutePath();
		InputStream realPath =  new ClassPathResource("/templates/执纪审查点安全工作改进建议单.docx").getInputStream();
		String fileName = "执纪审查安全工作改进建议单.docx";
		chongYongDaiMa(response, wordDataMap, realPath, fileName);
	}
	/**
     * 导出Word重用的代码
     * @param response
     * @param wordDataMap
     * @param wordPath
     * @param fileName
     * @throws IOException
     */
    public void chongYongDaiMa(HttpServletResponse response, Map<String, Object> wordDataMap, InputStream wordPath,
    		String fileName) throws IOException {
        response.setContentType("application/msword;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment; filename=" + new String(fileName.getBytes(), "iso-8859-1"));
//        File file = new File(wordPath);
//        FileInputStream fileInputStream = new FileInputStream(file);
        WordTemplate template = new WordTemplate(wordPath);
        template.replaceDocument(wordDataMap);
        ServletOutputStream outputStream = response.getOutputStream();
        template.getDocument().write(outputStream);
        outputStream.close();
//        fileInputStream.close();
    }
}
