package lesson24;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class BookRunner {
    public static void main(String[] args) {

        String command = "";
        Scanner bookScanner = new Scanner(System.in);
        System.out.println("Если Вы хотите искать по автору - введите \"1\"; если по названию книги - введите \"2\"");
        command = bookScanner.nextLine().toLowerCase();
        if (command.equals("1")) {
            System.out.println("Введите автора");
            command = bookScanner.nextLine().toLowerCase();
            findByAuthor(command);
        } else {
            System.out.println("Введите название книги");
            command = bookScanner.nextLine().toLowerCase();
            findByBookName(command);
        }
    }

    public static void findByAuthor(String authorName) {
        Session session = DbRunner.getSessionFactory().openSession();
        Query<Authors> searchAuthors = session.createQuery("from Authors where AuthorName like :name", Authors.class);
        searchAuthors.setParameter("name", "%" + authorName + "%");
        List<Authors> authorsList = searchAuthors.getResultList();
        for (int i = 0; i < authorsList.size(); i++) {
            System.out.println(authorsList.get(i).getAuthorId());
            Query<Books> searchBooks = session.createQuery("from Books where AuthorID = :ID", Books.class);
            searchBooks.setParameter("ID", authorsList.get(i).getId());
            searchBooks.getResultList().forEach(System.out::println);
        }
        session.close();
    }

    public static void findByBookName(String bookName) {
        Session session = DbRunner.getSessionFactory().openSession();
        Query<Books> searchQuery = session.createQuery("from Books where BookName like :name", Books.class);
        searchQuery.setParameter("name", "%" + bookName + "%");
        searchQuery.getResultList().forEach(System.out::println);
        session.close();
    }
}