import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {

        //Opret et objekt af Scanner
        Scanner scanner = new Scanner(System.in);

        //Write code here
        //Udskriv programs funktion til skærm
        System.out.println("Calculating from binary numbers to decimal numbers!");

        //Skriv til skærmen at bruger skal indtaste noget binær kode
        System.out.println("Please enter a binary number:");
        String binaryNumber = scanner.nextLine();

        //Omregningen og print ud:
        System.out.println("The answer is: " + Integer.parseInt(binaryNumber, 2));


    }
}
