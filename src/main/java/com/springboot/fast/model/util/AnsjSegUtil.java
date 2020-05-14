package com.springboot.fast.model.util;

import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 分词
 */
public class AnsjSegUtil {
    private static Logger log = LoggerFactory.getLogger(AnsjSegUtil.class);

    public static List<String> parseStr(String str) {
        List<String> data = new ArrayList<>();

        Set<String> expectedNature = new HashSet<String>() {{
            add("n");add("v");add("vd");add("vn");add("vf");
            add("vx");add("vi");add("vl");add("vg");
            add("nt");add("nz");add("nw");add("nl");
            add("ng");add("userDefine");add("wh");
            add("en");add("r");
        }};
        Result result = ToAnalysis.parse(str);
        List<Term> terms = result.getTerms();
        for (int i = 0; i < terms.size(); i++) {
            String word = terms.get(i).getName();
            String natureStr = terms.get(i).getNatureStr();
            if(expectedNature.contains(natureStr)) {
                data.add(word);
            } else {
               log.info("祛除了:" + word + ":" + natureStr);
            }
        }
        return data;
    }
}
