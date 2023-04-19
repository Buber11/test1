package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //dadada
        File file = new File("słowa.txt");
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner;
        Random random = new Random();
        String menu = """ 
                Co chcesz zrobić?
                losować jeszcze raz bez usuwania wyrazu z listy -1;
                usunąc podany wyraz z listy i losować jeszcze raz -2;
                zakończ program -3;
                """;
        int wordCounter = 0;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
            wordCounter++;
        }

        int randomNumber;
        Scanner scanner1 = new Scanner(System.in);
        int choosen;
        boolean condition = true;

        while (condition) {
            randomNumber = random.nextInt(Integer.MAX_VALUE) % wordCounter;
            System.out.print("Wylosowane słowo: ");
            System.out.println(words.get(randomNumber));
            System.out.println(menu);
            choosen = scanner1.nextInt();
            switch (choosen) {
                case 2:
                    words.remove(randomNumber);
                    wordCounter --;
                    break;
                case 3:
                    condition = false;
            }


        }

    }
}