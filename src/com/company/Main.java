//printing a random word for the list

package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static Random rand = new Random();

    public static void main(String[] args) {
	    System.out.println(randomWord());

    }

    public static String randomWord(){
        ArrayList<String> words = new ArrayList<>();
        words.add("module");
        words.add("class");
        words.add("implement");

        int wordIndex = rand.nextInt(words.size()-1);//words.sizeis equal to 3
        String word = words.get(wordIndex);
        return word;


    }

}
