package app.models;

import org.bson.types.ObjectId;

public class Person {

    protected String firstname;
    protected String lastname;
    protected String mobile;
    protected String email;
    

    public Person() {
    }

    public Person(String firstname, String lastname, String mobile, String email, ObjectId _id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile = mobile;
        this.email = email;
    
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

    

    public String getMobile() {
        return mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
