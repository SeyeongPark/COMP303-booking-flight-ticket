package com.spring.jpa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Passenger entity class - Model class
@Entity
@Table(name = "passenger")
public class Passenger {
  @Id
  @Column(name = "username")
  private String username;
  @Column(name = "password")
  private String password;
  public Passenger() {}

  public Passenger(String username, String password) {
    super();
    this.username = username;
    this.password = password;
  }
  public String getUserName() {
    return username;
  }
  public void setUserName(String name) {
    this.username = name;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


}