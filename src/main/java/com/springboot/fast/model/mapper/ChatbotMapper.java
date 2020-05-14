package com.springboot.fast.model.mapper;

import com.springboot.fast.model.bean.Chatbot;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author java-chatbot
 * @since 2020-05-11
 */
public interface ChatbotMapper extends BaseMapper<Chatbot> {

    List<Chatbot> selectByQuestion(List<String> words);
}
