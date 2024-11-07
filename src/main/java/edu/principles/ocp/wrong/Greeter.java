package edu.principles.ocp.wrong;

import java.io.PrintStream;

public class Greeter {

    protected PrintStream out;

    public void greet() {
        out.println("Hello!");
    }
}
