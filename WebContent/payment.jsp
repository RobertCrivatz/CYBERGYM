<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="com.shashi.service.impl.*, com.shashi.service.*,com.shashi.beans.*,java.util.*,javax.servlet.ServletOutputStream,java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Payments</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/changes.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body style="background-color: #E6F9E6;">

	<%
	/* Checking the user credentials */
	String userName = (String) session.getAttribute("username");
	String password = (String) session.getAttribute("password");

	if (userName == null || password == null) {

		response.sendRedirect("login.jsp?message=Session Expired, Login Again!!");
	}

	String sAmount = request.getParameter("amount");

	double amount = 0;

	if (sAmount != null) {
		amount = Double.parseDouble(sAmount);
	}
	%>



	<jsp:include page="header.jsp" />

	<div class="container">
    <div class="row" style="margin-top: 5px; margin-left: 2px; margin-right: 2px;">
        <form action="./OrderServlet" method="post" class="col-md-6 col-md-offset-3"
            style="border: 2px solid black; border-radius: 10px; background-color: #FFE5CC; padding: 10px;">

            <div style="font-weight: bold;" class="text-center">
                <div class="form-group">
                    <img src="images/profile.jpg" alt="Payment Proceed" height="100px" />
                    <h2 style="color: green;">Personal Information</h2>
                </div>
            </div>

            <div class="row">
                <div class="col-md-12 form-group">
                    <label for="full_name">Full Name</label>
                    <input type="text" placeholder="Enter Your Full Name" name="full_name" class="form-control" id="full_name" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-12 form-group">
                    <label for="address">Address</label>
                    <textarea placeholder="Enter Your Address" name="address" class="form-control" id="address" required></textarea>
                </div>
            </div>

            <!-- Additional fields for personal information can be added here -->

            <div class="row text-center">
					<input type="hidden"
							name="amount" value="<%=amount%>">
					<div class="col-md-6 form-group">
						<label>&nbsp;</label>
						<button type="submit" class="form-control btn btn-success">
							Pay :Lei
							<%=amount%></button>
					</div>
            </div>

        </form>
    </div>
</div>

	<!-- ENd of Product Items List -->


	<%@ include file="footer.html"%>

</body>
</html>