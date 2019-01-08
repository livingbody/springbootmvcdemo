package cn.goingtodo.elasticsearch.bean;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "atguigu", type = "book")
@Data
public class Book {
    private Integer id;
    private String bookName;
    private String author;

}
