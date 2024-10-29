package oop.practice;

public class Main {
    public static void main(String[] args) {
        // Чтение файла
        String filePath = "/Users/viktorianicologlo/Desktop/OOP-LAB1/lab-papers-please/java-classifcation/text.txt";  // Укажите путь к вашему файлу
        FileReader fileReader = new FileReader();
        String fileContent = fileReader.readFileIntoString(filePath);

        // Создание объекта TextData
        TextData textData = new TextData(filePath, fileContent);  // передаем имя файла и текст

        // Вывод информации о тексте
        System.out.println("File name: " + textData.getFileName());  // Изменено на getFileName()
        System.out.println("File content: " + textData.getText());
        System.out.println("Number of vowels: " + textData.getNumberOfVowels());
        System.out.println("Number of consonants: " + textData.getNumberOfConsonants());
        System.out.println("Number of letters: " + textData.getNumberOfLetters());
        System.out.println("Number of sentences: " + textData.getNumberOfSentences());
        System.out.println("The longest word: " + textData.getLongestWord());

        // Сравнение дисплеев
        Display display1 = new Display(1920, 1080, 96, "Dell U2720Q");
        Display display2 = new Display(2560, 1440, 109, "ASUS ROG Swift");
        Display display3 = new Display(2560, 1440, 109, "LG UltraFine");

        System.out.println("\nComparing of displays:");
        display1.compareSize(display2);
        display1.compareSharpness(display2);
        display2.compareSize(display3);
        display2.compareSharpness(display3);
        display1.compareWithMonitor(display3);
    }
}

