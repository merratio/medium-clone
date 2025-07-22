package project.medium_clone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.medium_clone.model.User;
import project.medium_clone.repository.UserRepo;

@SpringBootApplication
public class MediumCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediumCloneApplication.class, args);
	}
}
