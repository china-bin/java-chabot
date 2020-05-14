package com.springboot.fast.model.util;

import com.springboot.fast.model.bean.Chatbot;
import com.springboot.fast.model.bean.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xm.similarity.text.CosineSimilarity;
import org.xm.similarity.text.TextSimilarity;

import java.util.*;

public class SimilaryUtil {
    private static Logger log = LoggerFactory.getLogger(SimilaryUtil.class);

    public static Chatbot getOneSimilaryQuestion(String question, List<Chatbot> chatbots) {
        if (chatbots == null || chatbots.size() == 0) {
            Chatbot chatbot = new Chatbot();
            chatbot.setAnswer("抱歉，库中未找到对应的回复。");
            return chatbot;
        }
        List<Double> scores = new ArrayList<>();
        // 相似度计算工具
        TextSimilarity similarity = new CosineSimilarity();
        for (int i = 0; i < chatbots.size(); i++) {
            String q = chatbots.get(i).getQuestion();
            // 计算文本相似度
            double score = similarity.getSimilarity(question, q);
            log.info("相似度:" + q + ":" + score);
            scores.add(score);
        }
        int maxIndex = getMaxScoreIndex(scores);

        return chatbots.get(maxIndex);
    }

    private static int getMaxScoreIndex(List<Double> scores) {
        int index = 0;
        double score = 0.0;

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > score) {
                index = i;
                score = scores.get(i);
            }
        }
        log.info("找出最相似分数为:" + index + ":" + score);
        return index;
    }


    public static List<Question> getListSimilaryQuestion(String title, List<Question> questions) {
        if (questions == null || questions.size() == 0) {
            return null;
        }
        List<Map.Entry<Question, Double>> questionAndSores = new ArrayList<>();

        Map<Question, Double> questionAndSore = new HashMap<>();
        TextSimilarity similarity = new CosineSimilarity();
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            double score = similarity.getSimilarity(title, question.getTitle());
            questionAndSore.put(question, score);
        }
        questionAndSores.addAll(questionAndSore.entrySet());

        Collections.sort(questionAndSores, new Comparator<Map.Entry<Question, Double>>() {
            @Override
            public int compare(Map.Entry<Question, Double> o1, Map.Entry<Question, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        List<Question> retQuestions = new ArrayList<>();
        for (int i = 0; i < questionAndSores.size(); i++) {
                retQuestions.add(questionAndSores.get(i).getKey());
        }

        return retQuestions;


    }
}
