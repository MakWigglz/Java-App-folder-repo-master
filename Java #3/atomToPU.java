import java.util.HashMap;
import java.util.Map; 
/* These lines import the `HashMap` and `Map` classes from the `java.util` package. The `HashMap` class is a generic class that implements the `Map` interface, providing a hash table and set of key-value mappings. The `Map` interface is a collection of key-value pairs, where each key is associated with exactly one value. */



public class PolyurethaneCalculator {  
    // a Class that calculates the mass of P.U. in a given quantity.
    /* In Java, a class is a blueprint for creating objects (also known as instances of the class). The public keyword indicates that this class can be accessed from any other class in the same package or from any other class if it is in the same package as the class that is using it. */

    private static final double MOLAR_MASS_C = 12.01;
    private static final double MOLAR_MASS_H = 1.01;
    private static final double MOLAR_MASS_N = 14.01;
    private static final double MOLAR_MASS_O = 16.00;  
    /* These lines declare four `final` variables of type `double` and initialize them with the molar masses of carbon (C), hydrogen (H), nitrogen (N), and oxygen (O). The `final` keyword indicates that the value of these variables cannot be changed after they are initialized. */

    private static final double MOLAR_MASS_ISOCYANATE = 86.09;
    private static final double MOLAR_MASS_POLYOL = 182.19;
    private static final double MOLAR_MASS_DIISOCYANATE = 284.18;
    /*These lines declare three more final variables of type double and initialize them with the molar masses of isocyanate, polyol, and diisocyanate. */

    private static final double MOLAR_MASS_POLYURETHANE = 1000.0; 
    // Assuming a generic polyurethane formula
    /* his line declares a `final` variable of type `double` and initializes it with the molar mass of a generic polyurethane formula. */


    private static final Map<String, Double> ELEMENT_MASS_FACTORS = new HashMap<>();
    static {
        ELEMENT_MASS_FACTORS.put("C", MOLAR_MASS_C);
        ELEMENT_MASS_FACTORS.put("H", MOLAR_MASS_H);
        ELEMENT_MASS_FACTORS.put("N", MOLAR_MASS_N);
        ELEMENT_MASS_FACTORS.put("O", MOLAR_MASS_O);
    }
    /* These lines declare a static variable of type Map<String, Double> named ELEMENT_MASS_FACTORS and initialize it with the molar masses of carbon (C), hydrogen (H), nitrogen (N), and oxygen (O). The static keyword indicates that this variable belongs to the class itself, rather than to any particular instance of the class. The HashMap class is used to store the molar masses of the elements as key-value pairs. */

    public static void main(String[] args) {  
    //This line declares a `public static` method named `main` that takes an array of `String` objects as its argument. The `public static` keyword indicates that this method belongs to the class itself, rather than to any particular instance of the class. The `main` method is the entry point of the Java application.
        double polyurethaneMass = 100.0; // In grams
        double polyurethaneMoles = polyurethaneMass / MOLAR_MASS_POLYURETHANE;
    /* This line declares a double variable named polyurethaneMass and initializes it with the value 100.0, which represents the mass of the polyurethane sample in grams.*/ 

        double carbonMoles = polyurethaneMoles * 1.0; // Assuming 1:1 stoichiometry for carbon
        double hydrogenMoles = polyurethaneMoles * 2.0; // Assuming 1:2 stoichiometry for hydrogen
        double nitrogenMoles = polyurethaneMoles * 0.5; // Assuming 1:4 stoichiometry for nitrogen
        double oxygenMoles = polyurethaneMoles * 2.0; // Assuming 1:2 stoichiometry for oxygen

        double carbonAtoms = carbonMoles / MOLAR_MASS_C;
        double hydrogenAtoms = hydrogenMoles / MOLAR_MASS_H;
        double nitrogenAtoms = nitrogenMoles / MOLAR_MASS_N;
        double oxygenAtoms = oxygenMoles / MOLAR_MASS_O;
        // These lines calculate the number of atoms of carbon, hydrogen, nitrogen, and oxygen in the polyurethane sample by dividing their respective moles by their molar masses.

        System.out.println("Carbon atoms: " + carbonAtoms);
        System.out.println("Hydrogen atoms: " + hydrogenAtoms);
        System.out.println("Nitrogen atoms: " + nitrogenAtoms);
        System.out.println("Oxygen atoms: " + oxygenAtoms);
        // These lines print the number of atoms of each element to the console.
    }
}
 