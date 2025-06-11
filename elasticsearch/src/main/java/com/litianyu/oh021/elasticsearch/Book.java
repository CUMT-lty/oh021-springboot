package com.litianyu.oh021.elasticsearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;


@Data
@Document(indexName = "books")
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    // 用的是 book 这个 index

    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    // TODO
    @Field(type = FieldType.Text, analyzer = "ik_smart", searchAnalyzer = "ik_max_word")
    private String title;

    // TODO
    @Field(type = FieldType.Text, analyzer = "ik_smart", searchAnalyzer = "ik_max_word")
    private String author;

    @Field(type = FieldType.Date)
    private Date releaseDate;

    @Field(type = FieldType.Double)
    private double amazonRating;

    @Field(type = FieldType.Boolean)
    private boolean bestSeller;

    // TODO :这种嵌套对象怎么解析
    private HashMap<String,Double> prices;

    
}
