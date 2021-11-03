package com.fab.hotel;

// import java.util.List;

// Using JPA Repository

import org.springframework.data.repository.CrudRepository;
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
// optimizing without using JPA repository

  // List<Customer> findByLastName(String lastName);

  // List<Customer> findAll();

  // Customer findById(int id);
  // HashMap<String, List<Customer>> h1=new HashMap<>();
  // HashMap<Long, Customer> h2=new HashMap<>();

  // List<Customer> findByLastName(String lastName){
  //   if(h1.containsKey(lastName)){
  //       return h1.get(lastName);
  //   }
  //   return null;
  // }

  // Customer findById(long id){
  //   return h2.get(id);
  // }
  // void save(Customer c){
  //     if(!h1.containsKey(c.getLastName())){
  //         h1.put(c.getLastName(), new ArrayList<Customer>());
  //     }
  //     h1.get(c.getLastName()).add(c);
  //     h2.put(c.getId(), c);
  // }
  // List<Customer> findAll(){
  //       return new ArrayList<>(h2.values());
  // }
}
