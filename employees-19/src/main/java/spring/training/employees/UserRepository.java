package spring.training.employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    @Query("select distinct u from User u left join fetch u.roles where u.username = :username")
    Optional<User> findUserByUsername(String username);
}
