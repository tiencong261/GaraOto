<%-- 
    Document   : GDTimKiem
    Created on : Nov 3, 2024, 10:24:04?PM
    Author     : Admin
--%>

<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login Form</title>
</head>
<body>
<div align="center">
    <h1>Employee Login Form</h1>
    <form action="<%=request.getContextPath()%>/login" method="post">
        <table style="with: 100%">
            <tr>
                <td>UserName</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" /></td>
            </tr>
        </table>
        <input type="submit" value="Submit" />
    </form>
</div>
</body>
</html>