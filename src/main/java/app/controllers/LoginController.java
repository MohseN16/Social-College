/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.helpers.MongoHelper;
import app.models.Person;
import org.debux.webmotion.server.WebMotionController;
import org.debux.webmotion.server.render.Render;
import org.jongo.MongoCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author mohsen
 */
public class LoginController extends WebMotionController {
        private static final Logger log = LoggerFactory.getLogger(BaseController.class);
    
    public Render index() {
        return renderView("/membership/login.jsp","name","Social College");
    }
}
