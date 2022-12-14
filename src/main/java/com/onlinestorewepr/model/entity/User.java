package com.onlinestorewepr.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
   @Id
   @Column
   private String username;
   @Column
   private String password;
   @Column
   private boolean isAdmin;
   @Column
   private String name;
   @Column
   private String phone;
   @Column
   private String gender;
   @Column
   private String address;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "cartId", referencedColumnName = "id")
   private Cart cart;

   @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
   private List<Order> orders;

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public boolean isAdmin() {
      return isAdmin;
   }

   public void setAdmin(boolean admin) {
      isAdmin = admin;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public Cart getCart() {
      return cart;
   }

   public void setCart(Cart cart) {
      this.cart = cart;
   }

   public List<Order> getOrders() {
      return orders;
   }

   public void setOrders(List<Order> orders) {
      this.orders = orders;
   }
}
