package lesson28;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Scanner;
import java.util.zip.*;

@Service
public class UnArchivariusImpl implements UnArchivarius {

    public void unpack() {

        Scanner fileScanner = new Scanner(System.in);
        System.out.println("Укажите полный путь к архиву:");
        String filePath = "";
        filePath = fileScanner.nextLine();
        System.out.println("Укажите полный путь к папке, в которую хотите извлечь файлы:");
        String fileOutputPath;
        fileOutputPath = fileScanner.nextLine();
        int index = fileOutputPath.lastIndexOf("\\");
        if (index != fileOutputPath.length() - 1) {
            fileOutputPath += "\\";
        }
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(filePath))) {
            ZipEntry entry;
            String name;
            long size;
            while ((entry = zin.getNextEntry()) != null) {
                name = entry.getName();
                size = entry.getSize();
                System.out.printf("File name: %s \t File size: %d \n", name, size);
                FileOutputStream fout = new FileOutputStream(fileOutputPath + name);
                while (zin.available() > 0) {
                    fout.write(zin.read());
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}