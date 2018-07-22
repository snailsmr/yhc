package com.snail.service;

import com.snail.domain.WordsDomain;

import java.util.List;

public interface WordsService {

    // 分批返回单词列表
    List<WordsDomain> selectWords(String userId, String classId);

}
