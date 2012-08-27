package app.controllers;

import app.helpers.MongoHelper;
import app.models.Person;
import org.debux.webmotion.server.WebMotionController;
import org.debux.webmotion.server.render.Render;
import org.jongo.MongoCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Base extends WebMotionController {

    private static final Logger log = LoggerFactory.getLogger(Base.class);
    
    public Render index() {
        MongoCollection collection = MongoHelper.getCollection("persons");
        Person p = new Person();
        p.setEmail("mosenkk@gmail.com");
        p.setFirstname("Mohsen");
        p.setLastname("Karimi");
        p.setMobile("09360462966");
        collection.save(p);
        return renderView("index.jsp","name","Social College");
        
    }
    
}
