/**
 *  Java program to create, update, display, and delete HashMap.
 */

package com.mycollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of HashMap.
        HashMap<String, ArrayList<String>> storage = new HashMap<>();

        // Storages of items.
        ArrayList<String> letters = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();

        // Add.
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("H");

        words.add("Apricot");
        words.add("Bisquitte");
        words.add("Coffee");
        words.add("Dumplings");
        words.add("Eggplant");
        words.add("Falafel");
        words.add("Hot Dog");

        sentences.add("Apricot is an european fruit.");
        sentences.add("Bisquitte is used in deserts.");
        sentences.add("Coffee originated in the ancient coffee forests of the Ethiopian plateau.");
        sentences.add("Dumplings originated in ancient China.");
        sentences.add("Eggplant is a delicatessen.");
        sentences.add("Falafel originated in Egypt.");
        sentences.add("Hot Dog is always good.");

        storage.put("letters", letters);
        storage.put("words", words);
        storage.put("sentences", sentences);

        for(Map.Entry<String, ArrayList<String>> parts : storage.entrySet()) {
            System.out.println(parts.getKey() + " " + parts.getValue());
        }

    }
}