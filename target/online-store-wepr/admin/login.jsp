<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="vi">
<head> 
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0"/>
	<title>MaleFashion Admin</title>
	<link href="https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap" rel="stylesheet"/>
	<link rel="stylesheet" href="./assets/vendor/css/core.css" class="template-customizer-core-css" />
	<link rel="stylesheet" href="./assets/vendor/css/theme-default.css" class="template-customizer-theme-css" />
	<link rel="stylesheet" href="./assets/vendor/css/pages/page-auth.css" />
	<link rel="stylesheet" href="./assets/css/login-custom.css">
</head>
<body>
	<!-- Content -->
	<div class="container-xxl">
		<div class="authentication-wrapper authentication-basic container-p-y" style="padding-bottom: 6.5rem !important;">
			<div class="authentication-inner">
				<div class="card">
					<div class="card-body">
						<!-- Logo -->
						<div class="c-logo">
							<img src="./assets/img/logo.png" alt="">
						</div>
						<form id="formAuthentication" class="mb-3" action="index.jsp" method="POST">
							<!-- Username -->
							<div class="mb-3">
								<input type="text" id="email" class="form-control" name="email-username" placeholder="Username" autofocus/>
							</div>
							<!-- Password -->
							<div class="mb-3">
								<input type="password" id="password" class="form-control" name="password" placeholder="Password" autocomplete="off"/>
							</div>
							<div class="mb-3">
								<button class="btn btn-primary d-grid w-100" type="submit">Sign in</button>
							</div>
						</form>
						<div class="mb-4"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="./footer.jsp" />
</body>
</html>
