package oop.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileReader fileReader = new FileReader();

        //file paths for reading
        String[] filePaths = {
                "/Users/viktorianicologlo/Desktop/OOP-LAB1/lab-papers-please/java-classifcation/text.txt",
                "/Users/viktorianicologlo/Desktop/OOP-LAB1/lab-papers-please/java-classifcation/text2.txt",
                "/Users/viktorianicologlo/Desktop/OOP-LAB1/lab-papers-please/java-classifcation/text3.txt"
        };


        Display display1 = new Display(3840, 2160, 163, "Dell U2720Q"); // 27-inch, 4K UHD
        Display display2 = new Display(2560, 1440, 109, "ASUS ROG Swift PG279Q"); // 27-inch, QHD
        Display display3 = new Display(5120, 2880, 218, "LG UltraFine 5K"); // 27-inch, 5K
        Display display4 = new Display(3840, 1600, 137, "Asus ProArt PA34VC"); // 34-inch, UWQHD+ (ultrawide)

        while (true) {
            // menu
            System.out.println("Please choose an option:");
            System.out.println("1. Task 1 (Compare Displays)");
            System.out.println("2. Task 3 (Assistant)");
            System.out.println("3. Task 4 (Read Files)");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Task 1
                    display1.compareSize(display2);
                    display1.compareSharpness(display2);
                    display2.compareSize(display3);
                    display2.compareSharpness(display3);
                    display1.compareWithMonitor(display3);
                    break;

                case 2:
                    // Task 3
                    Assistant assistant = new Assistant("Tech Assistant");
                    assistant.assignDisplay(display1);
                    assistant.assignDisplay(display2);
                    assistant.assignDisplay(display3);
                    assistant.assignDisplay(display4);
                    assistant.assist();
                    Display boughtDisplay = assistant.buyRandomDisplay();
                    System.out.println("Bought display: " + (boughtDisplay != null ? boughtDisplay.getModel() : "None"));
                    break;

                case 3:
                    //Task 4
                    System.out.println("Choose a file to read:");
                    for (int i = 0; i < filePaths.length; i++) {
                        System.out.println((i + 1) + ". " + filePaths[i]);
                    }
                    System.out.println("Enter the number of the file you want to read:");
                    int fileChoice = scanner.nextInt() - 1; // Convert to zero-based index

                    if (fileChoice >= 0 && fileChoice < filePaths.length) {
                        System.out.println("File to check: " + filePaths[fileChoice]);
                        String fileContent = fileReader.readFileIntoString(filePaths[fileChoice]);
                        TextData textData = new TextData(filePaths[fileChoice], fileContent);

                        System.out.println("File name: " + textData.getFileName());
                        System.out.println("File content: " + textData.getText());
                        System.out.println("Number of vowels: " + textData.getNumberOfVowels());
                        System.out.println("Number of consonants: " + textData.getNumberOfConsonants());
                        System.out.println("Number of letters: " + textData.getNumberOfLetters());
                        System.out.println("Number of sentences: " + textData.getNumberOfSentences());
                        System.out.println("The longest word: " + textData.getLongestWord());
                    } else {
                        System.out.println("Invalid file selection.");
                    }
                    break;

                case 0:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
