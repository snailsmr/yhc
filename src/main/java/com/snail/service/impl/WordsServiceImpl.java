package com.snail.service.impl;

import com.snail.Mapper.WordsMapper;
import com.snail.domain.WordsDomain;
import com.snail.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WordsServiceImpl implements WordsService {
    // 理解错误，limit 1，2 最后一个数字代表的偏移量而不是右区间
//    private int times = 0;  // 用户请求次数
//    private int step = 50;  // 每次请求返回的单词条数
//    private int start = 0;  // limit左区间
//    private int end = step; // limit右区间

    // 修改后：
    private int times = 0;  // 用户请求次数
    private int step = 50;  // 每次请求返回的单词条数
    private int start = 0;  // limit左区间
    private int end = step; // 偏移量

    @Autowired
    private WordsMapper wordsMapper;
    private Map<List<String>, Integer> map = new HashMap<>();

    @Override
    public List<WordsDomain> selectWords(String userId, String classId) {
        List<String> keyList = new ArrayList<String>();
        keyList.add(userId);
        keyList.add(classId);



        boolean status = map.containsKey(keyList);  // 判断当前用户是否已经请求过某个词库
//        boolean status = true;

        System.out.println("status**********" + status);
//        for (Map.Entry<List<String>, Integer> entry : map.entrySet()) {
//            System.out.println("Key = " + entry.getKey().toString() + ", Value = " + entry.getValue());
//        }


        // 理解错误，limit 1，2 最后一个数字代表的偏移量而不是右区间
//        if (status) {   // 非首次请求
//            times += 1;
//            map.put(keyList, times);
//        } else {        // 首次请求
//            times = 1;
//            map.put(keyList, times);
//        }
//
//        if (times >= 2) {
//            start = step * (times - 1);
//            end = step * times;
//        }


        // 修改后：
        if (status) {   // 非首次请求
            times += 1;
            map.put(keyList, times);
        } else {        // 首次请求
            times = 1;
            map.put(keyList, times);
        }

        if (times >= 2) {
            start = step * (times - 1);
            end = step;
        }

        return wordsMapper.selectWords(start, end);
    }


}
