package com.springboot.fast.model.mapper;

import com.springboot.fast.model.bean.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 问题表 Mapper 接口
 * </p>
 *
 * @author java-chatbot
 * @since 2020-05-13
 */
public interface QuestionMapper extends BaseMapper<Question> {

    List<Question> selectByQuestion(List<String> words);
}
