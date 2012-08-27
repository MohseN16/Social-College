package app.models;

import app.helpers.MongoHelper;
import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.jongo.MongoCollection;


public class Log {
    
    private String message;
    private String target;
    private int line;
    private String method;
    private  DateTime time;
    private int type;

    private ObjectId _id;

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }
    
    public Log() {
    }
    public Log(Exception ex)
    {
        this.time = DateTime.now();
        StackTraceElement stack =ex.getStackTrace()[0];
        this.line = stack.getLineNumber();
        this.method = stack.getMethodName();
        this.target = stack.getClassName();
        this.type = 0;
        this.message = ex.getMessage();
    }

    public Log(String message, String target, int line, String method, DateTime time, int type) {
        this.message = message;
        this.target = target;
        this.line = line;
        this.method = method;
        this.time = time;
        this.type = type;
      
    }

    public int getLine() {
        return line;
    }

    public String getMessage() {
        return message;
    }

    public String getMethod() {
        return method;
    }

    public String getTarget() {
        return target;
    }

    

    public DateTime getTime() {
        return time;
    }

    public int getType() {
        return type;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setTarget(String target) {
        this.target = target;
    }


    public void setTime(DateTime time) {
        this.time = time;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public  void Save()
    {
        MongoCollection collection = MongoHelper.getCollection("logs");
        collection.save(this);
    }
    
}
