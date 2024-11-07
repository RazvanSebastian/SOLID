package edu.principles.ocp.correct;

public class FrenchGreet implements Greeter {
    @Override
    public void greet() {
        System.out.println("Bonjour");
    }
}
