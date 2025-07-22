package project.medium_clone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import project.medium_clone.model.Article;

import java.util.List;


@Repository
public interface ArticleRepo extends MongoRepository<Article,String> {
    List<Article> findByAuthor(int author);
}
