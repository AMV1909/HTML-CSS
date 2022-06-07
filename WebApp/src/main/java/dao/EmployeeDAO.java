package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;
import config.DAOConfig;
import model.Employee;
import org.bson.Document;

public class EmployeeDAO {
    private DAOConfig daoConfig = null;
    private MongoCollection<Document> collection = null;

    public EmployeeDAO() {
        daoConfig = new DAOConfig("employees");
        collection = daoConfig.getCollection();
    }
	
    public void SaveEmployee(Employee object){
        InsertOneResult result = collection.insertOne(new Document()
            .append("Name", object.getName())
            .append("Document", object.getDocument())
            .append("User", object.getUser())
            .append("Password", object.getPassword()));
        
        System.out.println("Success! Inserted document id: " + result.getInsertedId());
    }
	
    public boolean Login(String User, String Password){
        Document item = new Document();
        item.put("User", User);
        item.put("Password", Password);
            
        Document doc = null;
        
        try{
            doc = collection.find(item).first();
            System.out.println(doc.toJson());
        }catch(Exception e){
            System.out.println(e);
        }
        
        return doc != null;
    }
}
