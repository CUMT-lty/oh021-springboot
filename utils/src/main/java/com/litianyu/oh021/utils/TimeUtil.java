package com.litianyu.oh021.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 时间工具类
 */
public class TimeUtil {
    /**
     * 获取毫秒级 unix 时间戳（13 位）
     */
    public static long getUnixTimestampInMilliseconds(int year, int month, int day,
                                                      int hour, int minute, int second,
                                                      String zoneId) {
        LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hour, minute, second);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of(zoneId));
        return zonedDateTime.toInstant().toEpochMilli(); //
    }

    /**
     * 获取秒级 unix 时间戳（10 位）
     */
    public static long getUnixTimestampInSeconds(int year, int month, int day,
                                                 int hour, int minute, int second,
                                                 String zoneId) {
        return getUnixTimestampInMilliseconds(year, month, day, hour, minute, second, zoneId) / 1000;
    }

    public static void main(String[] args) {
        long tsInMilliSeconds = getUnixTimestampInMilliseconds(2025, 3, 16,
                21, 50, 3,
                "Asia/Shanghai");
        System.out.println(tsInMilliSeconds);
        long tsInSeconds = getUnixTimestampInSeconds(2025, 3, 16,
                21, 50, 3,
                "Asia/Shanghai");
        System.out.println(tsInSeconds);
    }
}
