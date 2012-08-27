package app.models;

import app.helpers.MongoHelper;
import org.bson.types.ObjectId;
import org.jongo.MongoCollection;

public class Person {

    private String firstname;
    private String lastname;
    private String mobile;
    private String email;
    private ObjectId _id;

    public Person() {
    }

    public Person(String firstname, String lastname, String mobile, String email, ObjectId _id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile = mobile;
        this.email = email;
        this._id = _id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public ObjectId getId() {
        return _id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void Save() {
        try {
            MongoCollection collection = MongoHelper.getCollection("persons");
            collection.save(this);
        } catch (Exception ex) {
            Log log = new Log(ex);
            log.Save();
        }
    }
}
