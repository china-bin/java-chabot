package com.springboot.fast.model.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 问题表
 * </p>
 *
 * @author java-chatbot
 * @since 2020-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 问题类型：1表示单选，2表示多选，3表示填空，4表示判断，5表示问答
     */
    private String type;

    /**
     * 题干
     */
    private String title;

    /**
     * A选项答案
     */
    private String optionA;

    /**
     * B选项答案
     */
    private String optionB;

    /**
     * C选项答案
     */
    private String optionC;

    /**
     * D选项答案
     */
    private String optionD;

    /**
     * 答案
     */
    private String answer;

    /**
     * 解析
     */
    private String analyse;

    /**
     * 该题的分数
     */
    private BigDecimal score;

    private Integer createBy;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    private Integer updateBy;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModified;


}
