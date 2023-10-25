package com.example.demo;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class ProductService //CRUD
{
 @Autowired
 private ProductRepository repo;// no new operator
 
 public List<Product> listAll() //RETRIEVE
 {
 return repo.findAll();
 }
 
 public void save(Product product) //CREATE OR INSERT
 {
 repo.save(product);
 }
 
 public Product get(Integer id) //RETRIEVE ON THE BASIS OF ID
 {
 return repo.findById(id).get();
 }
 
 public void delete(Integer id) 
 {
 repo.deleteById(id);
 }
}
