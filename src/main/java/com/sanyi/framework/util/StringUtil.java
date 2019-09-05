package com.sanyi.framework.util;

import java.util.List;

public class StringUtil {

    public static String listToString1(List<String> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() - 1) {
                    sb.append(list.get(i) + ",");
                } else {
                    sb.append(list.get(i));
                }
            }
        }
        return sb.toString();
    }
    public static String listToString2(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\r\n");
//        	System.out.println(list.get(i)+"\r\n");
        }
        return list.isEmpty() ? "" : sb.toString().substring(0, sb.toString().length() - 1);
    }
    public static String listToString3(List list, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }
    public static class Separator {
        private String next = "";
        private String separator;
        public Separator(String separator) {
            this.separator = separator;
        }
        public String get() {
            String result = next;
            next = separator;
            return result;
        }
    }
    public static String listToString4(List<String> list, Separator separator) {
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            if (s != null && !"".equals(s)) {
                sb.append(separator.get()).append(s);
            }
        }
        return sb.toString();
    }

}
