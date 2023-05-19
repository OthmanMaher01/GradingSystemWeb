<html>
<head>
<title>Yahoo!!</title>
</head>
<body>

<div class="Main-container">

    <div class="container-login">

        <div class="wrap-login">
            <div class="login-header">
                <h2 style="color:#353c4e;">Grading System</h2>
            </div>
            <div class="login-pic">
                <img src="../../assets/student.svg" alt="IMG">
            </div>

            <form class="login-form" action="/login.do" method="POST">
                <span class="login-form-title">Login</span>

                <div class="wrap-input">
                    <input type="text" class="input" name="name" placeholder="Email" required>
                    <span class="focus-input"></span>
                    <span class="symbol-input">
                            <i class="fa fa-envelope" aria-hidden="true"></i>
                        </span>
                </div>
                <div class="wrap-input">
                    <input type="password" class="input" name="password" placeholder="Password" required>
                    <span class="focus-input"></span>
                    <span class="symbol-input">
                            <i class="fa fa-lock" aria-hidden="true"></i>
                        </span>
                </div>

                <div class="login-form-btn-container">
                    <button class="login-form-btn" type="submit">Login</button>
                </div>
                <div style="display: flex;justify-content: center;">
                <p><font color="red">${errorMessage}</font></p>
                </div>

            </form>

        </div>
    </div>
</div>
</body>
</html>
<style scoped>
    <%@include file="../../style/loginstyle.css"%>
</style>