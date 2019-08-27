<%-- 
    Document   : stock
    Created on : Jul 16, 2019, 2:57:31 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section id="purchase-sale" class="container">
            <div class="row">
                <aside id="purchase" class="col-md-6">
                <from action="purchaseSubmit.jsp">
                    <table>
                        <tr>
                            <td>Name</td>
                            <td><input type="text" name="name" placeholder="Input product name"</td>
                        </tr>
                        <tr>
                            <td>Quantity</td>
                            <td><input type="number" name="quantity" placeholder="Input product quantity"</td>
                        </tr>
                        <tr>
                            <td>Price</td>
                            <td><input type="number" name="price" placeholder="Input product price"</td>
                        </tr>
                        <tr>
                            <td><button type="submit" value="purchase"/>purchase</td>
                            <td><button type="reset" value="Reset"/>Reset</td>
                        </tr>
                    </table>
                </from>
            </aside>
                       <aside id="sale" class="col-md-6">
                <from action="saleSubmit.jsp">
                    <table>
                        <tr>
                            <td>ID</td>
                            <td><input type="number" name="id" placeholder="Input product Id"</td>
                        </tr>
                        <tr>
                            <td>Quantity</td>
                            <td><input type="number" name="quantity" placeholder="Input product quantity"</td>
                        </tr>
                        <tr>
                            <td>Price</td>
                            <td><input type="number" name="price" placeholder="Input product price"</td>
                        </tr>
                        <tr>
                            <td><button type="submit" value="purchase"/>purchase</td>
                            <td><button type="reset" value="Reset"/>Reset</td>
                        </tr>
                    </table>
                </from>
            </aside>
                </div>
            <section class="row" id="showData">
                <div>
                    
                </div>
            </section>
        </section>
    </body>
</html>
