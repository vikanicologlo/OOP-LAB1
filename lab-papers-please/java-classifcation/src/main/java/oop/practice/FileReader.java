package oop.practice;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//read files
public class FileReader {
    public String readFileIntoString(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return "";
        }
    }
}