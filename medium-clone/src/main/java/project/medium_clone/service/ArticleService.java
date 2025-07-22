package project.medium_clone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.medium_clone.model.Article;
import project.medium_clone.model.Comment;
import project.medium_clone.repository.ArticleRepo;
import project.medium_clone.repository.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepo repo;

    @Autowired
    private UserRepo uRepo;


    public void clap(String id){
        Article art = repo.findById(id).orElseThrow();
        art.setClaps(art.getClaps() + 1);
        repo.save(art);
    }

    public void comment(String id, Comment com){
        Article art = repo.findById(id).orElseThrow();
        art.getComments().add(com);
        repo.save(art);
    }

    public void addAuthor(String artId,int authId){
        Article art = repo.findById(artId).orElseThrow();
        art.setAuthor(authId);
        repo.save(art);
    }

    public List<Article> getUserArticle(int id){

        return repo.findByAuthor(id);

    }


}
