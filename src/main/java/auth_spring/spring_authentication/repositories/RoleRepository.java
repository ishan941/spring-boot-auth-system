package auth_spring.spring_authentication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import auth_spring.spring_authentication.Enum.RoleEnum;
import auth_spring.spring_authentication.Model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Role findByRole(RoleEnum role);

}