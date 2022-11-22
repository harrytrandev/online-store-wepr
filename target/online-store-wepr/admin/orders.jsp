<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="vi">
<head>
   <meta charset="utf-8" />
   <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0"/>
   <title>Managements | Orders</title>
   <link rel="icon" type="image/x-icon" href="./assets/img/favicon/favicon.ico" />
   <link href="https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap" rel="stylesheet"/>
   <link rel="stylesheet" href="./assets/vendor/fonts/boxicons.css" />
   <link rel="stylesheet" href="./assets/vendor/css/core.css" class="template-customizer-core-css" />
   <link rel="stylesheet" href="./assets/vendor/css/theme-default.css" class="template-customizer-theme-css" />
   <link rel="stylesheet" href="./assets/css/demo.css" />
   <link rel="stylesheet" href="./assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.css" />
   <link rel="stylesheet" href="./assets/vendor/libs/apex-charts/apex-charts.css" />
   <script src="./assets/vendor/js/helpers.js"></script>
   <script src="./assets/js/config.js"></script>
</head>
<body>
  <!-- Layout wrapper -->
  <div class="layout-wrapper layout-content-navbar">
    <div class="layout-container">
      <jsp:include page="./menu.jsp" />

      <!-- Layout container -->
      <div class="layout-page">
        <jsp:include page="./navbar.jsp" />
        <!-- Content wrapper -->
        <div class="content-wrapper">
          <div class="container-xxl flex-grow-1 container-p-y">
            <h4 class="fw-bold py-3 mb-4"><span class="text-muted fw-light">Managements / </span>Orders</h4>
            <div class="card">
              <h5 class="card-header">Orders</h5>
              <div class="table-responsive text-nowrap">
                <table class="table table-hover">
                  <thead>
                    <tr>
                      <th>ID</th>
                      <th>Date</th>
                      <th>Customer</th>
                      <th>Products</th>
                      <th>Status</th>
                      <th></th>
                    </tr>
                  </thead>
                  <tbody class="table-border-bottom-0">
                    <tr>
                      <td>order01</td>
                      <td>17-10-2022</td>
                      <td>Quảng</td>
                      <td><i class="fab fa-angular fa-lg text-danger"></i> <strong>MaleFashion Logo Shirt - Black XL, MaleFashion Short - Gray XL</strong></td>
                      <td ><span class="badge bg-label-success me-1">Delivered</span></td>
                      <td><a href="./update-order.jsp">Change</a></td>
                    </tr>
                    <tr>
                      <td>order02</td>
                      <td>17-10-2022</td>
                      <td>Dĩ</td>
                      <td><i class="fab fa-angular fa-lg text-danger"></i> <strong>MaleFashion Hoodie</strong></td>
                      <td ><span class="badge bg-label-info me-1">Delivering</span></td>
                      <td><a href="./update-order.jsp">Change</a></td>
                    </tr>
                    <tr>
                      <td>order03</td>
                      <td>17-10-2022</td>
                      <td>Minh</td>
                      <td><i class="fab fa-angular fa-lg text-danger"></i> <strong>MaleFashion Jacket</strong></td>
                      <td ><span class="badge bg-label-warning me-1">Pending</span></td>
                      <td><a href="./update-order.jsp">Change</a></td>
                    </tr>
                    <tr>
                     <td>order04</td>
                     <td>17-10-2022</td>
                     <td>Khoa</td>
                     <td><i class="fab fa-angular fa-lg text-danger"></i> <strong>MaleFashion Jacket</strong></td>
                     <td ><span class="badge bg-label-danger me-1">cancelled</span></td>
                     <td><a href="./update-order.jsp">Change</a></td>
                   </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>

          <jsp:include page="./footer.jsp" />
        </div>
        <!-- Content wrapper -->
      </div>
      <!-- / Layout page -->
    </div>

    <!-- Overlay -->
    <div class="layout-overlay layout-menu-toggle"></div>
  </div>
  <!-- / Layout wrapper -->

  <!-- Core JS -->
  <!-- build:js assets/vendor/js/core.js -->
  <script src="./assets/vendor/libs/jquery/jquery.js"></script>
  <script src="./assets/vendor/libs/popper/popper.js"></script>
  <script src="./assets/vendor/js/bootstrap.js"></script>
  <script src="./assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.js"></script>

  <script src="./assets/vendor/js/menu.js"></script>
  <!-- endbuild -->

  <!-- Vendors JS -->

  <!-- Main JS -->
  <script src="./assets/js/main.js"></script>

  <!-- Active Menu Item -->
  <script>
    document.getElementById('menu-managements').classList.add('active', 'open')
    document.getElementById('menu-managements-orders').classList.add('active')
 </script>
</body>
</html>
