/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.helpers;

import com.mongodb.DB;
import com.mongodb.Mongo;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

public class MongoHelper {

    public static MongoCollection getCollection(String name) {
        try {
            Mongo mongo = new Mongo("127.0.0.1", 27017);
            Jongo jongo = new Jongo(mongo.getDB("social-college"));
            MongoCollection coll = jongo.getCollection(name);
            return coll;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public static void Dispose(MongoCollection collection)
    {
        try{
            DB dB = collection.getDBCollection().getDB();
            
        }
        catch(Exception ex)
        {
            
        }
    }
}
