package org.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        String[] langs1 = new String[4];
        langs1[0] = "Java";
        langs1[1] = "C#";
        langs1[2] = "Python";
        langs1[3] = "PHP";

        String[] langs2 = {"Java", "C#", "Python", "PHP"};
        for (String l : langs2) {
            System.out.println("Я хочу выучить: " + l);
        }

        List<String> langs3 = new ArrayList<String>();
        langs3.add("Java");
        langs3.add("C#");
        langs3.add("Python");
        langs3.add("PHP");
        for (String l : langs3) {
            System.out.println("Я хочу выучить: " + l);
        }

        List<String> langs4 = Arrays.asList("Java", "C#", "Python", "PHP");
        for (String l : langs4) {
            System.out.println("Я хочу выучить: " + l);
        }
    }
}
