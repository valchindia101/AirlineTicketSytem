import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class MongoConnection {
	
	public static void main(String[] args) {
        // 1. Define your connection string
        String connectionString = "mongodb://localhost:27017"; 
        // For Atlas, replace with your mongodb+srv:// URI

        // 2. Create the MongoClient inside a try-with-resources block 
        // (or manage its lifecycle globally so it stays open while your app runs)
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            
            System.out.println("Successfully connected to MongoDB!");

            // 3. Access a specific database (it will be created if it doesn't exist)
            MongoDatabase database = mongoClient.getDatabase("AppointmentDB");
            System.out.println("Connected to database: " + database.getName());

            // 4. Access a specific collection
            MongoCollection<Document> collection = database.getCollection("Appointment Info");
            MongoCollection<Document> collection1 = database.getCollection("Doctor Info");
            MongoCollection<Document> collection2 = database.getCollection("Patient Info");
            
            // 5. Quick test: Insert a sample document
            Document sampleDoc = new Document("name", "Alice")
                                    .append("role", "Developer")
                                    .append("status", "Active");
            
            collection.insertOne(sampleDoc);
            System.out.println("Inserted sample document into 'users' collection.");
            
        } catch (Exception e) {
            System.err.println("An error occurred while connecting to MongoDB: " + e.getMessage());
        }
    }

}
