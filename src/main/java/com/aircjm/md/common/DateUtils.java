package com.aircjm.md.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 * Created by chenjiaming on 2016/2/4.
 */
public class DateUtils {

    /**
     * 获取当前时间按照格式输出字符串
     * 为了线程安全，不能直接定义静态化变量SimpleDateFormat
     */
    private static final String YYYY_MM_DD_HH_MM_SS_SSSZ= "yyyy-MM-dd HH:mm:ss.SSSZ";


    /**
     * 获取当前时间按照格式输出字符串
     * @param date 传入时间
     * @return 字符串时间
     */
    public static String timestampToString(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS_SSSZ);
        return simpleDateFormat.format(date);
    }

}
