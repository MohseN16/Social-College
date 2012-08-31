package app.models;

import app.helpers.MongoHelper;
import org.bson.types.ObjectId;
import org.jongo.MongoCollection;

public class Student extends Person {

    private ObjectId _id;
    private String studentid;
    private String username;
    private String password;

  

    public void setStudentID(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentid() {
        return studentid;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
    
    public void Save() {
        try {
            MongoCollection collection = MongoHelper.getCollection("students");
            collection.save(this);
        } catch (Exception ex) {
            Log log = new Log(ex);
            log.Save();
        }
    }
    
    public static Student finyByUsername(String username)
    {
        MongoCollection collection = MongoHelper.getCollection("students");
          Student stu = collection.findOne(String.format("{username :  '%s'}",username)).as(Student.class);
          return stu;
    }
    public String toCookie()
    {
        return "";
    }
}
