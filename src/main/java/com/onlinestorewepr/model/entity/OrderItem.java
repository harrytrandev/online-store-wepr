package com.onlinestorewepr.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "orderItem")
public class OrderItem {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
   private int id;
   @Column
   private int price;
   @Column
   private int quantity;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "productId", referencedColumnName = "id")
   private Product product;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "orderId", referencedColumnName = "id")
   private Order order;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
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

   public Product getProduct() {
      return product;
   }

   public void setProduct(Product product) {
      this.product = product;
   }

   public Order getOrder() {
      return order;
   }

   public void setOrder(Order order) {
      this.order = order;
   }
}
