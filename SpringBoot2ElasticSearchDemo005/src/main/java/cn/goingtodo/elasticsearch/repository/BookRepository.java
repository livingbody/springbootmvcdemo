package cn.goingtodo.elasticsearch.repository;

import cn.goingtodo.elasticsearch.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface BookRepository extends ElasticsearchRepository<Book, Integer> {

    //参照
    // https://docs.spring.io/spring-data/elasticsearch/docs/3.0.6.RELEASE/reference/html/
    List<Book> findByBookNameLike(String bookName);

}
