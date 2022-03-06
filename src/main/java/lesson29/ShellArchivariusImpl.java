package lesson29;

//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.shell.standard.ShellComponent;
//import org.springframework.shell.standard.ShellMethod;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipInputStream;
//import java.util.zip.ZipOutputStream;
//
//@Slf4j
//@ShellComponent
//@RequiredArgsConstructor
//public class ShellArchivariusImpl {
//
//    private final LocalisationService localizationService;
//
//    @ShellMethod(value = "packaging", key = {"pack", "pa", "1"})
//    public String pack(String filePath) {
//        String filePathOutput = filePath + ".zip";
//        String fileName = "";
//        int index1 = filePath.lastIndexOf("\\");
//        for (int i = index1 + 1; i < filePath.length(); i++) {
//            fileName += filePath.charAt(i);
//        }
//        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(filePathOutput));
//             FileInputStream fis = new FileInputStream(filePath)) {
//            ZipEntry entry1 = new ZipEntry(fileName);
//            zout.putNextEntry(entry1);
//            byte[] buffer = new byte[fis.available()];
//            fis.read(buffer);
//            zout.write(buffer);
//            zout.closeEntry();
//        } catch (Exception ex) {
//
//            System.out.println(ex.getMessage());
//        }
//        return localizationService.localize("pack", fileName);
//    }
//
//    @ShellMethod(value = "Unpack", key = {"unpack", "un", "2"})
//    public String unpack(String filePath, String fileOutputPath) {
//
//        int index = fileOutputPath.lastIndexOf("\\");
//        if (index != fileOutputPath.length() - 1) {
//            fileOutputPath += "\\";
//        }
//        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(filePath))) {
//            ZipEntry entry;
//            String name;
//            long size;
//            while ((entry = zin.getNextEntry()) != null) {
//                name = entry.getName();
//                size = entry.getSize();
//                System.out.printf("File name: %s \t File size: %d \n", name, size);
//                FileOutputStream fout = new FileOutputStream(fileOutputPath + name);
//                while (zin.available() > 0) {
//                    fout.write(zin.read());
//                }
//                fout.flush();
//                zin.closeEntry();
//                fout.close();
//            }
//        } catch (Exception ex) {
//
//            System.out.println(ex.getMessage());
//        }
//        return localizationService.localize("unpack", fileOutputPath);
//    }
//}