package project.medium_clone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import project.medium_clone.model.User;

@Repository
public interface UserRepo extends MongoRepository<User, Integer> {
}
