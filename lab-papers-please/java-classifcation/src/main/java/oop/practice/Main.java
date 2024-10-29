package oop.practice;

public class Main {
    public static void main(String[] args) {
           /*   Task 2
        String filePath = "/Users/viktorianicologlo/Desktop/OOP-LAB1/lab-papers-please/java-classifcation/text.txt";  // Укажите путь к вашему файлу
        FileReader fileReader = new FileReader();
        String fileContent = fileReader.readFileIntoString(filePath);


        TextData textData = new TextData(filePath, fileContent);


        System.out.println("File name: " + textData.getFileName());
        System.out.println("File content: " + textData.getText());
        System.out.println("Number of vowels: " + textData.getNumberOfVowels());
        System.out.println("Number of consonants: " + textData.getNumberOfConsonants());
        System.out.println("Number of letters: " + textData.getNumberOfLetters());
        System.out.println("Number of sentences: " + textData.getNumberOfSentences());
        System.out.println("The longest word: " + textData.getLongestWord()); */


        Display display1 = new Display(3840, 2160, 163, "Dell U2720Q"); // 27-inch, 4K UHD
        Display display2 = new Display(2560, 1440, 109, "ASUS ROG Swift PG279Q"); // 27-inch, QHD
        Display display3 = new Display(5120, 2880, 218, "LG UltraFine 5K"); // 27-inch, 5K
        Display display4 = new Display(3840, 1600, 137, "Asus ProArt PA34VC"); // 34-inch, UWQHD+ (ultrawide)


        /*       Task 1
        System.out.println("\nComparing of displays:");
        display1.compareSize(display2);
        display1.compareSharpness(display2);
        display2.compareSize(display3);
        display2.compareSharpness(display3);
        display1.compareWithMonitor(display3);*/


            Assistant assistant = new Assistant("Tech Assistant");



            assistant.assignDisplay(display1);
            assistant.assignDisplay(display2);
            assistant.assignDisplay(display3);
            assistant.assignDisplay(display4);


            assistant.assist();

        Display boughtDisplay = assistant.buyRandomDisplay();
        System.out.println("Bought display: " + (boughtDisplay != null ? boughtDisplay.getModel() : "None"));

    }
    }



