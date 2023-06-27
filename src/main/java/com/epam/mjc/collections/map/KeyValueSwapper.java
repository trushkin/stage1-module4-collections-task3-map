package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> resMap = new HashMap<>();
        sourceMap.forEach((key, value) -> {
            if(resMap.containsKey(value)){
                resMap.compute(value, (oldKey, newValue) -> (key > newValue) ? newValue : key);
            }else {
                resMap.put(value, key);
            }
        });
        return resMap;
    }
}
