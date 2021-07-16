import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad: ");
        int cant = sc.nextInt();  
        sc.nextLine();              
        System.out.println(cant);

        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese linea: ");  
            String linea = sc.nextLine();
            String vector[] = linea.split(" ");
            System.out.println(linea);
            for (int j = 0; j < vector.length; j++) {
                System.out.print(vector[j] + " ");
            }
        }


    }
}
