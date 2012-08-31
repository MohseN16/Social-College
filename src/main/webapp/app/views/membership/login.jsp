<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/app/layouts/head.jspf" %>
        <title>social-college</title>
    </head>
    <body>
        <div id="wrapper">
            <%@include file="/app/layouts/header.jspf" %>
            <div id="content" class="container">
                <br/>
                <br/>
                <br/>
                <div class="row">
                    <div class="span5 offset3">
                        <div class="panel">
                            <div class="panel-title">
                                ورود
                            </div>
                            <div class="panel-body">
                                <div class="form-horizontal"> 
                                    <div class="control-group">
                                        <label class="control-label">نام کاربری</label>
                                        <div class="controls">
                                            <input type="text" class="textbox ltr" />
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">رمز عبور </label>
                                        <div class="controls">
                                            <input type="text" class="textbox ltr" />
                                        </div>
                                    </div>
                                    <div class="control-group">

                                        <div class="controls">
                                            <input type="checkbox" id="ch_remember" /><label for="ch_remember">مرا به خاطر بسپار ؟ </label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-footer clearfix">
                                <button class="button accept full">
                                    <span>ورود</span>
                                </button>

                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <%@include file="/app/layouts/footer.jspf" %>
        </div>
    </body>
</html>
