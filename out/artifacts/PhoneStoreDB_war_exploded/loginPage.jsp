<%--
  Created by IntelliJ IDEA.
  User: kozik
  Date: 01.10.2020
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>PhoneStore</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      height: 100vh;
      font-family: "Montserrat", sans-serif;
      background: linear-gradient(
              to right,
              #455882,
              #865e5e
      );
      color: #ffffff;
      display: flex;
      justify-content: center;
      align-items: center;
    }
    *,
    *::before,
    *::after {
      box-sizing: border-box;
    }
    h1 {
      text-align: center;
    }
    .formLogin {
      display: flex;
      width: 20vw;
      padding: 10px;
      flex-direction: column;
    }
    input {
      padding: 3px 0 3px 3px;
      margin-bottom: 20px;
      color: #000000;
    }
    label {
      margin-bottom: 5px;
    }
    button.login-button {
      margin-top: 10px;
      padding: 7px 0 7px 0;
      background: linear-gradient(
              to right,
              #2c3e50,
              #425d79
      );
      color: #ffffff;
      border: none;
      border-radius: 15px;
      font-weight: 700;
      text-transform: uppercase;
    }
    .login-button:hover {
      background: #425d79;
    }
    .login-button:active {
      outline: none;
      background-color: #597ca0;
      transform: scale(0.95);
    }
  </style>
</head>
<body>
<form class="formLogin" action="#обработчик">
  <h1>Login Form</h1>
  <label>Email</label>
  <input required type="text" placeholder="username" />
  <label>Password</label>
  <input required type="password" placeholder="pass" />
  <button class="login-button">Login</button>
</form>
</body>
</html>
