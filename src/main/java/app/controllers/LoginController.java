/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.models.Student;
import org.debux.webmotion.server.WebMotionController;
import org.debux.webmotion.server.call.CookieManger;
import org.debux.webmotion.server.call.CookieManger.CookieEntity;
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

    public Render authenticate(CookieManger manager, String username, String password) {
        Student stu = Student.finyByUsername(username);
        if (stu != null && stu.getPassword().equals(password)) {
            CookieEntity cookie = manager.create("authenticate", stu.toCookie());
            cookie.setPath("/");
            manager.add(cookie);
            return renderJSON("result",1);
        } else {
            return renderJSON("result",1);
        }

    }
}
