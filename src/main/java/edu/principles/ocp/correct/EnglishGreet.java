package edu.principles.ocp.correct;

public class EnglishGreet implements Greeter {
    @Override
    public void greet() {
        System.out.println("Hello");
    }
}
