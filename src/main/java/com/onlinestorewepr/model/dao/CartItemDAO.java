package com.onlinestorewepr.model.dao;

import com.onlinestorewepr.model.entity.CartItem;
import com.onlinestorewepr.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class CartItemDAO {
   public void insert(CartItem cartItem) {
      Transaction transaction = null;
      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
         transaction = session.beginTransaction();

         session.save(cartItem);

         transaction.commit();
      } catch (Exception e) {
         e.printStackTrace();
         if (transaction != null) {
            transaction.rollback();
         }
      }
   }

   public void update(CartItem cartItem) {
      Transaction transaction = null;
      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
         transaction = session.beginTransaction();

         session.update(cartItem);

         transaction.commit();
      } catch (Exception e) {
         e.printStackTrace();
         if (transaction != null) {
            transaction.rollback();
         }
      }
   }

   public void delete(int id) {
      Transaction transaction = null;
      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
         transaction = session.beginTransaction();

         CartItem cartItem = session.get(CartItem.class, id);
         if (cartItem != null) {
            session.delete(cartItem);
         }

         transaction.commit();
      } catch (Exception e) {
         e.printStackTrace();
         if (transaction != null) {
            transaction.rollback();
         }
      }
   }

   public List<CartItem> getAll() {
      List<CartItem> cartItems = null;
      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
         CriteriaBuilder builder = session.getCriteriaBuilder();
         CriteriaQuery<CartItem> criteriaQuery = builder.createQuery(CartItem.class);
         criteriaQuery.from(CartItem.class);
         cartItems = session.createQuery(criteriaQuery).getResultList();
      } catch (Exception e) {
         e.printStackTrace();
      }
      return cartItems;
   }

   public CartItem get(int id) {
      CartItem cartItem = null;
      try (Session session = HibernateUtil.getSessionFactory().openSession()) {

         cartItem = session.get(CartItem.class, id);

      } catch (Exception e) {
         e.printStackTrace();
      }
      return cartItem;
   }
}
