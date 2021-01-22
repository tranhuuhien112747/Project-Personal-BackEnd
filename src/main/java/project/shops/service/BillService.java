package project.shops.service;

import java.util.List;

import project.shops.model.Bill;

public interface BillService {
    List<Bill> findAllBill();

    void create(Bill bill);

    void deleteById(Long id);

    Bill findById(Long id);
}
