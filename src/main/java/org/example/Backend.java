package org.example;

public class Backend extends Developer implements BackendAction{
    @Override
    public void back() {
        System.out.println("Backend working");
    }
}
