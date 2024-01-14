<%@page import="java.util.List"%>
<%@page import="com.jsp.contactbook.entity.Contact"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Contact List</title>
    <style>
        .contact-details {
            display: none;
        }
    </style>
    <script>
        function showContactDetails(contactId) {
            // You can use AJAX to fetch and display details based on the selected contactId
            // For simplicity, I'm just displaying an alert here
            alert("Contact details for ID " + contactId);
        }

        function confirmDelete(contactId) {
            var confirmDelete = confirm("Are you sure you want to delete this contact?");
            if (confirmDelete) {
                // Perform the delete operation (you can use AJAX or redirect to a servlet)
                alert("Contact deleted for ID " + contactId);
            }
        }
    </script>
</head>
<body>
    <h2>Contact List</h2>

    <table border="1">
        <thead>
            <tr>
               <!--  <th>Contact ID</th> -->
                <th>First Name</th>
                <th>Last Name</th>
                <th>Phone Number</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <% 
                List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");
                for (Contact contact : contacts) {
            %>
            <tr>
               <%--  <td><%=contact.getContactId() %></td> --%>
                <td><%=contact.getContactFirstName() %></td>
                <td><%=contact.getContactLastName() %></td>
                <td><%=contact.getContactPhno() %></td>
                <td>
                <a href="updateContactRequest?id=<%=contact.getContactId() %>"> update</a>
                 <a href="deleteContact?id=<%=contact.getContactId() %>"> delete</a>
             
                </td>
            </tr>
            <% } %>
        </tbody>
    </table>
    <div style="position: fixed; bottom:10px; right: 10px;"><A href="logout">Logout</A>
</div>
</body>
</html>
