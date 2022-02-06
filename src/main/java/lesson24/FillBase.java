package lesson24;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import lesson18.InputStreamRunner;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FillBase {

    public static void main(String[] args) throws IOException, CsvException {
        Map<String, Authors> mapAuthors = new HashMap<>();

        try {
            try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(
                    Objects.requireNonNull(InputStreamRunner.class.getResourceAsStream("/Authors.csv"))))) {
                CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
                CSVReader csvReader = new CSVReaderBuilder(fileReader)
                        .withCSVParser(parser)
                        .build();

                List<String[]> allData = csvReader.readAll();
                for (String[] row : allData) {
                    Authors newAuthor = new Authors(row[0], row[1], row[2]);
                    saveAuthor(newAuthor);
                    mapAuthors.put(row[1], newAuthor);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(
                    Objects.requireNonNull(InputStreamRunner.class.getResourceAsStream("/Books.csv"))))) {
                CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
                CSVReader csvReader = new CSVReaderBuilder(fileReader)
                        .withCSVParser(parser)
                        .build();

                List<String[]> allData = csvReader.readAll();
                for (String[] row : allData) {
                    Books newBook = new Books(row[0], mapAuthors.get(row[1]), row[2], row[3], row[4]);
                    save(newBook);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveAuthor(Authors author) {
        Session session = DbRunner.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(author);
        tx1.commit();
        session.close();
    }

    public static void save(Books book) {
        Session session = DbRunner.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(book);
        tx1.commit();
        session.close();
    }


}

