package config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DAOConfig {
    private final String uri = "mongodb+srv://taller:prueba@cluster0.n3abd.mongodb.net/?retryWrites=true&w=majority";
    private MongoCollection<Document> collection;

    public DAOConfig(String Collection){
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("applicationDB");
        collection = database.getCollection(Collection);
    }
	
    public MongoCollection<Document> getCollection(){
        return collection;
    }
}
