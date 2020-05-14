package com.springboot.fast.controller.front;

import com.springboot.fast.model.bean.Chatbot;
import com.springboot.fast.model.dto.Result;
import com.springboot.fast.model.service.IChatbotService;
import com.springboot.fast.model.util.AnsjSegUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/front/chatbot")
public class FrontChatbotController {
    @Autowired
    IChatbotService chatbotService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String chatbot() {
        return "front/chatbot";
    }



    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public Result chabotPost(@RequestBody Chatbot chatbot) {
        String question = chatbot.getQuestion();
        // 对问题进行分词
        List<String> words = AnsjSegUtil.parseStr(question);

        // 无法进行分词的话直接将问题传入words中
        if (words.size() == 0) {
            words.add(question);
        }
        Chatbot getChatbot = chatbotService.getAnswer(question, words);
        return Result.success(getChatbot);
    }
}
