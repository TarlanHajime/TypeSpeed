package util;

import global.GlobalStrings;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Util {

    public static void writeWordsToArray() {
        String urlPath = GlobalStrings.URL_PATH;
        try {
            URL url = new URL(urlPath);
            for (int i = 0; i < 20; i++) {
                Scanner scanner = new Scanner(url.openStream());
                String randomWord = scanner.useDelimiter("\\A").nextLine();
                String newWord = randomWord.replace("[\"", "").replace("\"]", "");
                System.out.println(newWord);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void writeWordsToFile() {

        String urlPath = GlobalStrings.URL_PATH;
    try {
        URL url = new URL(urlPath);
        for (int i = 0; i < 20; i++) {
            Scanner scanner = new Scanner(url.openStream());
            String randomWord = scanner.useDelimiter("\\A").nextLine();
            String newWord = randomWord.replace("[\"", "").replace("\"]", "");
            System.out.println(newWord);
        }
        } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public static void writeFile(String word) {
        try (FileWriter fileWriter = new FileWriter(GlobalStrings.FILE_NAME, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(word);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
