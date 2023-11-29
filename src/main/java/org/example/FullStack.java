package org.example;

public class FullStack  extends Developer implements FrontendAction,BackendAction{
    @Override
    public void back() {
        System.out.println("Fullstack working backend");
    }

    @Override
    public void developGUI() {
        System.out.println("Fullstack working frontend");
    }
}
