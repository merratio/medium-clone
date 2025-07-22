package project.medium_clone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.medium_clone.model.User;
import project.medium_clone.repository.UserRepo;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;


    public void follow(int userId, int targetUserId){
        User user = repo.findById(userId).orElseThrow();

        if(repo.findById(targetUserId).isPresent()){
            if(!user.getFollowing().contains(targetUserId)){
                user.getFollowing().add(targetUserId);
            }

        }

        repo.save(user);

    }

    public void addFollower(int userId, int targetUserId){
        User user = repo.findById(userId).orElseThrow();

        if(repo.findById(targetUserId).isPresent()){
            user.getFollowers().add(targetUserId);
        }

        repo.save(user);

    }

    public void addUser(User user){
        repo.save(user);
    }

    public List<User> findAll(){
        return repo.findAll();
    }

}
