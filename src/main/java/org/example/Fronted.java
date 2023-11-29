package org.example;

public class Fronted extends Developer implements FrontendAction{
    @Override
    public void developGUI() {
        System.out.println("Frontend working");
    }
}
