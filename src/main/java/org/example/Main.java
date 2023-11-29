package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Developer> developerList  = new ArrayList<>();
        for (int i = 0; i < new Random().nextInt(0,25); i++) {
            if (i%2 == 0) {
                developerList.add(new Fronted());
            }
            else developerList.add(new Backend());
        }

        for (Developer dev:developerList) {
            if(dev instanceof Fronted) ((Fronted) dev).developGUI();
        }
        System.out.println(developerList.size());//для проверки

    }
}