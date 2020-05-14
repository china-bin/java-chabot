package com.springboot.fast.model.service;

import com.springboot.fast.model.bean.Chatbot;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author java-chatbot
 * @since 2020-05-11
 */
public interface IChatbotService extends IService<Chatbot> {

    Chatbot getAnswer(String question, List<String> words);
}
