<%-- <%@page import="com.jsp.contactbook.entity.Contact"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Add JavaScript for phone number validation -->
<script>
    function validatePhoneNumber() {
        var phoneNumber = document.getElementById('phoneNumber').value;
        // Your phone number validation logic goes here
        // For example, you can use a regular expression
        var phoneNumberRegex = /^\d{10}$/; // Assuming a 10-digit phone number
        if (!phoneNumberRegex.test(phoneNumber)) {
            alert('Please enter a valid 10-digit phone number');
            return false;
        }
        return true;
    }
</script>

</head>
<body>
<%Contact cont=(Contact)request.getAttribute("contact"); %>
    <form id="form-1" action="updateDataRequest" onsubmit="return validatePhoneNumber();">
    
     <table border="1">
        <thead>
            <tr>
                <th>Contact ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Phone Number</th>
                <th>Update</th>
            </tr>
        </thead>
         <tbody>
           
            <tr>
                <td> <input value="<%=cont.getContactId() %>" type="hidden" name="id">  </td>
                <td> <input value="<%=cont.getContactFirstName() %>" type="text" name="fname" placeholder="ENTER FIRST NAME"></td>
                <td> <input value="<%=cont.getContactLastName() %>" name="lname" placeholder="ENTER LAST NAME"> </td>
                <td> <input value="<%=cont.getContactPhno() %>" id="phoneNumber" name="cno" placeholder="ENTER CONTACT NUMBER"></td>
                <td><input type="submit" value="Update"> </td>
            </tr>
            
        </tbody>
        </table>
    
    </form>

</body>
</html>
 --%>
 <%@page import="com.jsp.contactbook.entity.User"%>
<%@page import="com.jsp.contactbook.entity.Contact"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Add JavaScript for phone number validation -->
<script>
    function validatePhoneNumber() {
        var phoneNumber = document.getElementById('phoneNumber').value;
        // Your phone number validation logic goes here
        // For example, you can use a regular expression
        var phoneNumberRegex = /^\d{10}$/; // Assuming a 10-digit phone number
        if (!phoneNumberRegex.test(phoneNumber)) {
            alert('Please enter a valid 10-digit phone number');
            return false;
        }
        return true;
    }
</script>

</head>
<body>
<% 
        User user = (User) session.getAttribute("user");
        Contact cont=(Contact)request.getAttribute("contact");
    %>
    <form id="form-1" action="updateDataRequest" method="post" onsubmit="return validatePhoneNumber();">
    
     <table border="1">
        <thead>
            <tr>
                <th>Contact</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Phone Number</th>
                <th>Update</th>
            </tr>
        </thead>
         <tbody>
           
            <tr>
             <td> <input value="<%=cont.getContactId() %>" type="hidden" name="id">  </td>
                <td> <input value="<%=cont.getContactFirstName() %>" type="text" name="fname" placeholder="ENTER FIRST NAME"></td>
                <td> <input value="<%=cont.getContactLastName() %>" name="lname" placeholder="ENTER LAST NAME"> </td>
                <td> <input value="<%=cont.getContactPhno() %>" id="phoneNumber" name="cno" placeholder="ENTER CONTACT NUMBER"></td>
                <td><input type="submit" value="Update"> </td>
            </tr>
            
        </tbody>
        </table>
        <div style="position: fixed; bottom:10px; right: 10px;"><A href="logout">Logout</A>
</div>
    
    </form>

</body>
</html>
 