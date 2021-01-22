package project.shops.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.shops.model.Bill;
import project.shops.repository.BillRepository;
import project.shops.service.BillService;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;

    @Override
    public List<Bill> findAllBill() {
        return billRepository.findAll();
    }

    @Override
    public void create(Bill bill) {
        billRepository.save(bill);
    }

    @Override
    public void deleteById(Long id) {
        billRepository.deleteById(id);
    }

    @Override
    public Bill findById(Long id) {
        return billRepository.findById(id).orElse(null);
    }
}
