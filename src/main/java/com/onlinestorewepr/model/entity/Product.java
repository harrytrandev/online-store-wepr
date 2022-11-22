package com.onlinestorewepr.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
   private int id;
   @Column
   private String name;
   @Column
   private String image;
   @Column
   private String description;
   @Column
   private int price;
   @Column
   private int quantity;
   @Column
   private int discount;
   @Column
   private String size;
   @Column
   private String color;
   @Column
   private String brand;
   @Column
   private boolean status;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "categoryId")
   private Category category;

   @OneToMany(mappedBy = "product")
   private List<CartItem> cartItems;

   @OneToMany(mappedBy = "product")
   private List<OrderItem> orderItems;


   public Product(String name, String image, String description, int price, int quantity, int discount, String size, String color, String brand, boolean status, Category category) {
      this.name = name;
      this.description = description;
      this.price = price;
      this.quantity = quantity;
      this.discount = discount;
      this.size = size;
      this.color = color;
      this.brand = brand;
      this.status = status;
      this.category = category;
   }

   public Product() {

   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getImage() {
      return image;
   }

   public void setImage(String image) {
      this.image = image;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public int getQuantity() {
      return quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public int getDiscount() {
      return discount;
   }

   public void setDiscount(int discount) {
      this.discount = discount;
   }

   public String getSize() {
      return size;
   }

   public void setSize(String size) {
      this.size = size;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public boolean isStatus() {
      return status;
   }

   public void setStatus(boolean status) {
      this.status = status;
   }

   public Category getCategory() {
      return category;
   }

   public void setCategory(Category category) {
      this.category = category;
   }

   public List<CartItem> getCartItems() {
      return cartItems;
   }

   public void setCartItems(List<CartItem> cartItems) {
      this.cartItems = cartItems;
   }

   public List<OrderItem> getOrderItems() {
      return orderItems;
   }

   public void setOrderItems(List<OrderItem> orderItems) {
      this.orderItems = orderItems;
   }
}
