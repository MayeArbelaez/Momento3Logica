package Reto;
import java.util.Scanner;
public class Matriz2D {

    public static void main(String[] args) {

        int [] [] numbers = new int[3][3];
        int [] [] ages = {{2,5,7}, {34,19,7}}; // shape (2,3) la matriz tiene 2 filas y cada numero representa las colunas, es decir, tiene 3 columnas.

        for (int i =0; i< ages.length; i++){

            for (int j=0; j< ages[i].length;j++)
                System.out.print(ages[i][j]+" ");
            System.out.println();
        }
Scanner datos = new Scanner(System.in);
        String [] [] form = new String[4][6];
        String [] nombresCol= {"id","Nombre", "Apellido","email","telefono","Contraseña" };

        for (int i =0; i < form.length;i++){
            System.out.println("----"+"Digite los datos del cliente "+(i+1)+"---");
            for (int j=0;j< form[i].length;j++){
                System.out.println("Ingrese el "+nombresCol[j]+": ");

                form [i][j]= datos.nextLine();


            }
        }

        System.out.println("=========================================================================");
        for (int c = 0; c < nombresCol.length; c++) {
            // Imprime cada título seguido de un tabulador (\t) para que queden alineados
            System.out.print(nombresCol[c] + "|");

        }

        System.out.print("\n");

for (int i=0; i< form.length;i++){
    System.out.println("-------Datos del cliente "+(i+1));
    for (int j=0; j< form[i].length;j++){
        System.out.print(form[i][j]+"\t\t");

    }
    System.out.println();
}
    }

}
