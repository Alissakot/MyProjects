package lesson28;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Scanner;
import java.util.zip.*;

@Service
public class ArchivariusImpl implements Archivarius {

    public void pack() {

        Scanner fileScanner = new Scanner(System.in);
        System.out.println("Укажите полный путь к файлу:");
        String filePath = "";
        filePath = fileScanner.nextLine();
        String filePathOutput = filePath + ".zip";
        String fileName = "";
        int index1 = filePath.lastIndexOf("\\");
        for (int i = index1 + 1; i < filePath.length(); i++) {
            fileName += filePath.charAt(i);
        }
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(filePathOutput));
             FileInputStream fis = new FileInputStream(filePath)) {
            ZipEntry entry1 = new ZipEntry(fileName);
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}