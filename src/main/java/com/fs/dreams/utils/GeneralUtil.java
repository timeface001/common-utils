package com.fs.dreams.utils;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by fengsong on 2017/3/14.
 */
public class GeneralUtil {

    /**
     * 判断List是否为空或者长度为0
     *
     * @param list 列表
     * @return boolean
     */
    public static boolean isNullOrEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

    /**
     * 判断List是否不为空
     *
     * @param list 列表
     * @return boolean
     */
    public static boolean isNotNullOrEmpty(List<?> list) {
        return !isNullOrEmpty(list);
    }

    /**
     * 生成Map数据
     *
     * @param keyValues 参数
     */
    public static Map<String, Object> generateMap(Object... keyValues) {

        if (keyValues == null || keyValues.length % 2 != 0) {
            return new ConcurrentHashMap<String, Object>(0);
        } else {
            Map<String, Object> map = new ConcurrentHashMap<String, Object>(keyValues.length / 2);

            for (int i = 0; i < keyValues.length; i++) {
                map.put(String.valueOf(keyValues[i]), keyValues[++i]);
            }

            return map;
        }
    }


}
