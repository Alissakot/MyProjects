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
        var doc1 = new Document()
                .append("_id", "2")
                .append("city_name", "Санкт-Петербург")
                .append("city_name_on_english", "St.Petersburg")
                .append("population", "5383890")
                .append("city_code", "812");
        myCollection.insertOne(doc1);
        var doc2 = new Document()
                .append("_id", "3")
                .append("city_name", "Новосибирск")
                .append("city_name_on_english", "Novosibirsk")
                .append("population", "1618039")
                .append("city_code", "383");
        myCollection.insertOne(doc2);
        var doc3 = new Document()
                .append("_id", "4")
                .append("city_name", "Екатеринбург")
                .append("city_name_on_english", "Yekaterinburg")
                .append("population", "1483119")
                .append("city_code", "343");
        myCollection.insertOne(doc3);
        var doc4 = new Document()
                .append("_id", "5")
                .append("city_name", "Нижний Новгород")
                .append("city_name_on_english", "Nizhny Novgorod")
                .append("population", "1253511")
                .append("city_code", "8312");
        myCollection.insertOne(doc4);
        var doc5 = new Document()
                .append("_id", "6")
                .append("city_name", "Казань")
                .append("city_name_on_english", "Kazan")
                .append("population", "1251969")
                .append("city_code", "8432");
        myCollection.insertOne(doc5);
        var doc6 = new Document()
                .append("_id", "7")
                .append("city_name", "Челябинск")
                .append("city_name_on_english", "Chelyabinsk")
                .append("population", "1200719")
                .append("city_code", "351");
        myCollection.insertOne(doc6);
        var doc7 = new Document()
                .append("_id", "8")
                .append("city_name", "Омск")
                .append("city_name_on_english", "Omsk")
                .append("population", "1164815")
                .append("city_code", "3812");
        myCollection.insertOne(doc7);
        var doc8 = new Document()
                .append("_id", "9")
                .append("city_name", "Самара")
                .append("city_name_on_english", "Samara")
                .append("population", "1156608")
                .append("city_code", "846");
        myCollection.insertOne(doc8);
        var doc9 = new Document()
                .append("_id", "10")
                .append("city_name", "Ростов-на-Дону")
                .append("city_name_on_english", "Rostov-on-Don")
                .append("population", "1133307")
                .append("city_code", "863");
        myCollection.insertOne(doc9);
    }

}