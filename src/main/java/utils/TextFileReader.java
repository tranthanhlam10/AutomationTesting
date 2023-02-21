package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReader {
    private String file_path;

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String readTextFile(String file_path) throws FileNotFoundException {
        File file = new File(file_path);
        Scanner read_file = new Scanner(file);
        while (read_file.hasNextLine()) {
            return read_file.nextLine();
        }
        read_file.close(); // đóng file lại
        return null;
    }
}
