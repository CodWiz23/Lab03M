/**
 * This class is the main class and incorporates implementations of my teammate's as per the instructions
 * @author Abdirahman Mohamed
 * @version October 2, 2023
 *
 */
public class Lab3 {
/**
 * main method that creates instances of IStack, IPostFixCalis, 
 * and an object of postFixCalTesting to print its precision method
 * @param args
 */
    public static void main(String[] args) {

        // Creating instance of IStack
        IStack stack = new myStack(); 

        // Creating instance of IPostFixCalis
        IPostFixCal postFixCal = new myPostFixCal(); 

        // Creating object of postFixCalTesting and executing precision method
        postFixCalTesting postFixCalTesting1 = new postFixCalTesting(); 
        double precisionOutput = postFixCalTesting1.precision(); 

        // Printing the output of precision method
        System.out.println("The output of the precision method is: " + precisionOutput);
    }
}
