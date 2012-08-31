/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.filters;

import app.helpers.AuthenticateHelper;
import app.models.Log;
import app.models.Student;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import core.security.crypto.AESEncryption;
import java.net.URLDecoder;
import org.debux.webmotion.server.WebMotionFilter;
import org.debux.webmotion.server.call.CookieManger.CookieEntity;

public class MainFilter extends WebMotionFilter {

    public void Authenticate() {
        try {
            CookieEntity cookie = getContext().getCookieManger().get("authenticate");
            if (cookie != null && !cookie.getValue().isEmpty()) {

                String cookie_value = URLDecoder.decode(cookie.getValue(), "UTF-8");
                String value = AESEncryption.decrypt(cookie_value);
                JsonObject obj = (JsonObject) new Gson().fromJson(value, JsonElement.class);
                String username = obj.get("username").getAsString();
                String password = obj.get("password").getAsString();
                Student stu = Student.finyByUsername(username);
                if (stu != null && stu.getPassword().equals(password)) {
                    AuthenticateHelper.current = stu;
                } else {
                   // getContext().getResponse().sendRedirect("/login/");
                    AuthenticateHelper.current = null;
                }
            }
            else
            {
                 //   getContext().getResponse().sendRedirect("/login/");
                    AuthenticateHelper.current = null;
            }
        } catch (Exception ex) {
            AuthenticateHelper.current = null;
            Log log = new Log(ex);
            log.Save();

        }
        doProcess();
    }
}
