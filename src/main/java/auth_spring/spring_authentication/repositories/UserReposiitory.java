package auth_spring.spring_authentication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import auth_spring.spring_authentication.Model.UserModel;

@Repository
public interface UserReposiitory extends JpaRepository<UserModel, Integer> {
    UserModel findByEmail(String email);

}
