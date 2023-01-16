<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product List</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <h1>Product List</h1>
    <table>
        <tr>
            <th> Product Id </th>
            <th> Category Id </th>
            <th> Product Name </th>
            <th> Price </th>
            <th> Description </th>
        </tr>
        <c:forEach var="product" items="${products}"> 
            <tr>
                <td>${product.getCategoryID()}</td>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
                <td>${product.getProductID()}</td>
                <td>${product.getProductName()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.getDescription()}</td>
                <td>
                    <a href="../../products/changeCategory/${product.getProductID()}"> Update this product </a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="../../categories">Go Back To Category List</a>
</body>
</html>