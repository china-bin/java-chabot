package com.springboot.fast.model.service.impl;

import com.springboot.fast.model.bean.Chatbot;
import com.springboot.fast.model.bean.Question;
import com.springboot.fast.model.mapper.QuestionMapper;
import com.springboot.fast.model.service.IQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.fast.model.util.SimilaryUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 问题表 服务实现类
 * </p>
 *
 * @author java-chatbot
 * @since 2020-05-13
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements IQuestionService {

    @Override
    public List<Question> getQuestionList(String title, List<String> words) {
        List<Question> questions = this.getBaseMapper().selectByQuestion(words);
        List<Question> getQuestions = SimilaryUtil.getListSimilaryQuestion(title, questions);
        return getQuestions;
    }
}
