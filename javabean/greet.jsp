<html>
<body style="background-color:powderblue;">
<jsp:useBean id="b" class="BeanPack.Ashu">
<jsp:setProperty name="b" property="id" param="number"/>
<jsp:setProperty name="b" property="name" param="username"/>
<h3 style="text-align:center;"><br><br>
Bank Account details :<br><br>
Account Number: <jsp:getProperty name="b" property="id"/><br><br>
Account Holder Name: <jsp:getProperty name="b" property="name"/><br><br>
</jsp:useBean>
</h3>
</body>
</html>