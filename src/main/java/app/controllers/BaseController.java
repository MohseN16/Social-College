package app.controllers;

import org.debux.webmotion.server.WebMotionController;
import org.debux.webmotion.server.render.Render;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseController extends WebMotionController {

    private static final Logger log = LoggerFactory.getLogger(BaseController.class);
    
    public Render index() {
        return renderView("index.jsp","name","Social College");
        
    }
    
}
