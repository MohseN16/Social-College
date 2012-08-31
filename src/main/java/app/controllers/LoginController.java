/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.models.Log;
import app.models.Student;
import javax.servlet.http.Cookie;
import org.debux.webmotion.server.WebMotionController;
import org.debux.webmotion.server.render.Render;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author mohsen
 */
public class LoginController extends WebMotionController {

    private static final Logger log = LoggerFactory.getLogger(BaseController.class);

    public Render index() {
        return renderView("/membership/login.jsp", "name", "Social College");
    }

    public Render authenticate(String username, String password) {
        try {
            Student stu = Student.finyByUsername(username);
            if (stu != null && stu.getPassword().equals(password)) {
                Cookie cookie = new Cookie("authenticate", stu.toCookie());
                cookie.setPath("/");
                cookie.setMaxAge(6000 * 1000);

                getContext().getResponse().addCookie(cookie);

                return renderJSON("result", 1);
            } else {
                return renderJSON("result", 0);
            }

        } catch (Exception ex) {
            Log log = new Log(ex);
            log.Save();
            return renderJSON("result", 0);
        }

    }
    public Render signout()
    {
        Cookie cookie = new Cookie("authenticate", null);
        cookie.setPath("/");
        cookie.setMaxAge(0);
        getContext().getResponse().addCookie(cookie);
        return renderRedirect("/login/");
    }
}
