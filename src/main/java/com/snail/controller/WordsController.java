package com.snail.controller;

import com.snail.domain.WordsDomain;
import com.snail.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/words")
public class WordsController {


    @Autowired
    private WordsService wordsService;
//    private WordsDao wordsDao;

    @ResponseBody
    @GetMapping("/all")
    String findAllUser(){
        return "success";
    }

    @ResponseBody
    @PostMapping("/selectWords")
    public List<WordsDomain> selectWords(@RequestParam("userId")String userId,
                                         @RequestParam("classId")String classId) {
        return wordsService.selectWords(userId, classId);
    }

//    @ResponseBody  String userId, String classId
//    @PostMapping("/add")
//    public int addUser(UserDomain user){
//        return userService.addUser(user);
//    }
//
//    @ResponseBody
//    @GetMapping("/all")
//    public Object findAllUser(
//            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
//                    int pageNum,
//            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
//                    int pageSize){
//        return userService.findAllUser(pageNum,pageSize);
//    }


}
