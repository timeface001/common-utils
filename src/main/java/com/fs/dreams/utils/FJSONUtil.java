package com.fs.dreams.utils;

import com.alibaba.fastjson.JSONArray;

import java.util.ListIterator;
import java.util.Objects;

/**
 * @author fengsong
 * @description:一句话描述下类的功能
 * @time 2017-07-14 11:38
 **/
public class FJSONUtil {

    public static String joinJSONArray(JSONArray array, String split) {

        StringBuffer result = new StringBuffer();
        if (array != null && !array.isEmpty()) {
            ListIterator<?> listIterator = array.listIterator();
            while (listIterator.hasNext()) {
                Object object = listIterator.next();
                result.append(Objects.toString(object)).append(",");
            }

            result = result.deleteCharAt(result.length() - 1);
        }

        return result.toString();

    }

}
