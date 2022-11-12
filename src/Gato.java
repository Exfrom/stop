import java.util.Scanner;
public class Gato {
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       String color, apellido;
        System.out.println("Ingrese un apellido con la letra M: ");
        apellido=entrada.nextLine();
        String[][] posicion=new String[2][3];
        posicion[1][1]="posicion";
         
        for(int i=0; i<3;i++){
            System.out.println("Arandano");
        }
        System.out.println("Ingrese un color: ");
            color=entrada.nextLine(); 
            if(color!=blanco){
                System.out.println("Color puede ser correcto!");
            }
        
        
    }
}
    
