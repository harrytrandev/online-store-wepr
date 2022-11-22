package com.onlinestorewepr.controller.admin.category;

import com.onlinestorewepr.model.bus.CategoryBUS;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value={"/admin/category/update"})
public class UpdateCategoryServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    CategoryBUS categoryBUS = new CategoryBUS(req, resp);
    categoryBUS.ShowUpdateCategory();
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    CategoryBUS categoryBUS = new CategoryBUS(req, resp);
    categoryBUS.UpdateCategory();
  }
}
