package project.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.shops.model.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
