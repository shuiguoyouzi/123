package com.rj.bd;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
/**
 * @desc  日期工具类
 * @author fayake
 *
 */
public class DateUtils {
    @Test
    public void testDateUtil() {
        /**
         * yyyy-MM-dd HH:mm:ss
         * yyyy-MM-dd
         * HH:mm:ss
         * yyyy-MM-dd HH:mm
         * yyyy-MM-dd HH:mm:ss.SSS
         */
        String dateStr1 = "2020-02-18";
        Date date2 = DateUtil.parse(dateStr1);
        /**
         * 格式化日期输出
         */
        String dateStr = "2021-02-18";
        Date dateFormat = DateUtil.parse(dateStr);
        //结果 2021/01/26
        String format = DateUtil.format(dateFormat, "yyyy/MM/dd");
        //常用格式的格式化
        String formatDate = DateUtil.formatDate(dateFormat);
        
        String formatDateTime = DateUtil.formatDateTime(dateFormat);
        
        String formatTime = DateUtil.formatTime(dateFormat);
        /**
         * 获取Date对象的某个部分
         */
        Date datePart = DateUtil.date();
        //获得年的部分
        System.out.println("年:"+DateUtil.year(datePart));
        //获得月份，从0开始计数
        System.out.println("月:"+DateUtil.month(datePart));
        //获得月份枚举
        System.out.println("日:"+DateUtil.dayOfMonth(datePart));
        /**
         * 日期时间偏移
         */
        //昨天
        DateTime yesterday = DateUtil.yesterday();
        System.out.println("昨天:" + yesterday);
        //明天
        System.out.println("明天:"+DateUtil.tomorrow());
        //上周
        System.out.println("上周:"+DateUtil.lastWeek());
        //下周
        System.out.println("下周:"+DateUtil.nextWeek());
        //上个月
        System.out.println("上个月:"+DateUtil.lastMonth());
        //下个月
        System.out.println("下个月:"+DateUtil.nextMonth());
        /**
         * 开始 和 结束时间
         */
        String dateStr2 = "2021-02-18 11:04:44";
        Date date = DateUtil.parse(dateStr2);
        //一天的开始，结果：2021-02-18 00:00:00
        Date beginOfDay = DateUtil.beginOfDay(date);
        System.out.println("一天的开始: "+beginOfDay);
        //一天的结束，结果：2021-02-18 23:59:59
        Date endOfDay = DateUtil.endOfDay(date);
        System.out.println("一天的结束: "+endOfDay);

    }
}
