import java.util.Scanner;

public class E11 {
public static void main(String[] args) {
        
        //Declaración de variables
        double x,y;
        Scanner lector = new Scanner(System.in);

        //Empieza el programa
        System.out.println("x: ");
        x = lector.nextDouble();

        System.out.println("y: ");
        y = lector.nextDouble();

        lector.close();

        if (x <= y) {
            System.out.println(x + " " + y);
        }
        else{
            System.out.println(y + " " + x);
        }
    }
}
