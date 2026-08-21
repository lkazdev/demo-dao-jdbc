package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Department seller);
    void update(Department seller);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();

}
