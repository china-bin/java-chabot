package com.springboot.fast.model.service;

import com.springboot.fast.model.bean.Question;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 问题表 服务类
 * </p>
 *
 * @author java-chatbot
 * @since 2020-05-13
 */
public interface IQuestionService extends IService<Question> {

    List<Question> getQuestionList(String title, List<String> words);
}
