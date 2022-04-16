package lesson40.migration;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

@ChangeLog
public class DatabaseChangelog {

    @ChangeSet(order = "001", id = "dropDb", author = "Nadezhda", runAlways = true)
    public void dropDb(MongoDatabase db) {
        db.drop();
    }

    @ChangeSet(order = "002", id = "insertNewCity", author = "Nadezhda")
    public void insertNewCity(MongoDatabase db) {
        MongoCollection<Document> myCollection = db.getCollection("cities");
        var doc = new Document()
                .append("_id", "1")
                .append("city_name", "Москва")
                .append("city_name_on_english", "Moscow")
                .append("population", "12561175")
                .append("city_code", "495");
        myCollection.insertOne(doc);
    }

}
