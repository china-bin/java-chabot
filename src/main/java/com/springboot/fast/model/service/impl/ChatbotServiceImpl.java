package com.springboot.fast.model.service.impl;

import com.springboot.fast.model.bean.Chatbot;
import com.springboot.fast.model.mapper.ChatbotMapper;
import com.springboot.fast.model.service.IChatbotService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.fast.model.util.SimilaryUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author java-chatbot
 * @since 2020-05-11
 */
@Service
public class ChatbotServiceImpl extends ServiceImpl<ChatbotMapper, Chatbot> implements IChatbotService {

    @Override
    public Chatbot getAnswer(String question, List<String> words) {
        List<Chatbot> chatbots = this.getBaseMapper().selectByQuestion(words);
        Chatbot chatbot = SimilaryUtil.getOneSimilaryQuestion(question, chatbots);
        return chatbot;
    }
}
