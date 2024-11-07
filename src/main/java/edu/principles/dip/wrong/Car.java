package edu.principles.dip.wrong;

/**
 * A class should not be fused with the tool it uses to execute an action. Rather, it should be fused to the interface that will allow the tool to connect to the class.
 * The Class and the interface should not know how the tool works. However, the tool needs to meet the specification of the interface.
 * <p>
 * The principle states that our classes should depend upon interfaces or abstract classes instead of concrete classes and functions.
 */
public class Car {
    Engine engine;

    /*
    * Violates DIP principle: what happens if we want an electric engine ?
    */
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        engine.start();
    }
}
