package com.yi.parquet.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 百科
 * @author YI
 * @date 2018-8-22 18:28:19
 */
@Data
public class Baike implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 书
     */
    private String book;

    /**
     * 标签
     */
    private String tag;

    /**
     * 点赞
     */
    private Integer good;

    /**
     * 鄙视
     */
    private Integer bad;

    /**
     * 作者名称
     */
    private String name;

    /**
     * 作者性别
     */
    private String gender;

    /**
     * 获得的金币打赏
     */
    private Integer goldcoin;

    /**
     * 0：上架、-1：下架
     */
    private Integer status = 0;

    /**
     * 创建时间
     */
    private Date cratedate = new Date();

    /**
     * 更新时间
     */
    private Date updatedate = new Date();

    public Baike(String book, String tag, Integer good, Integer bad, String name, String gender, Integer goldcoin) {
        this.book = book;
        this.tag = tag;
        this.good = good;
        this.bad = bad;
        this.name = name;
        this.gender = gender;
        this.goldcoin = goldcoin;
    }
}