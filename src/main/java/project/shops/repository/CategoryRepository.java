package project.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.shops.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
