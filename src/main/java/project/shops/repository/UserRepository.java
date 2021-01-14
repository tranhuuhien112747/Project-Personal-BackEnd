package project.shops.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import project.shops.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
