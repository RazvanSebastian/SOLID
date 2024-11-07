package edu.principles.ocp.wrong;

/**
 * The behavior and functionality can be easily changed by just extending what is already present - instead of modifying the present code.
 */
public class FrenchGreeter extends Greeter {

    /*
    * Violates OCP: Here we override the behavior of the base class.
    * */
    @Override
    public void greet() {
        out.println("Bonjour");
    }
}
