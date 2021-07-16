import java.util.*;
public class moreRepeats {
    public static void main(String[] args) throws Exception {
        //Metodo para calcular dato que mas se repite
        Scanner sc = new Scanner(System.in);
        List<String> ciudades = new ArrayList<String>();
        List<Integer> cantidad = new ArrayList<Integer>();
        System.out.println("==============================");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la ciudad: "); 
            String linea = sc.nextLine();
            String datos[] = linea.split(" ");     
            int sw = 0;
            for (int j = 0; j < ciudades.size() ; j++) {
                if(datos[0].equals(ciudades.get(j))){
                  int cant = cantidad.get(j);
                  cantidad.set(j, cant +1);
                    sw = 1;
                }                
            }
            if(sw == 0){
                ciudades.add(datos[0]);
                cantidad.add(1);
            }           
        }
        int mayor = 0;
        int pos = 0;
        for (int k = 0; k < cantidad.size(); k++) {
            if(cantidad.get(k)> mayor){
                mayor = cantidad.get(k);
                pos = k;
            }
        }
        System.out.println("La ciudad que mas se repite es: " + ciudades.get(pos));

    }
}
