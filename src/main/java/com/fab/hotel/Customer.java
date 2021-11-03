package com.fab.hotel;

import javax.persistence.*;
// Cutomer Table Entry
@Entity
@Table(name = "customer")
public class Customer {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)

  @Column(name = "id")
  private int id;

  @Column(name = "firstname")
  private String firstName;

  @Column(name = "lastname")
  private String lastName;

  protected Customer() {}

  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%d, firstName='%s', lastName='%s']",
        id, firstName, lastName);
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}
