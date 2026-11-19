package Reto;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class RetoSemana13 {
    static Scanner sc = new Scanner(System.in);

    static String[] productos = new String[5];
    static double[] precios = new double[5];

    public static void main(String[] args) {
        menuCompras();
    }

    public static void agregarProductos() {
        int i = 0;
        while (i < productos.length) {
            System.out.println("Agregue el producto" + i);
            productos[i] = sc.nextLine();
            i++;
        }
    }


     public static void menuCompras () {
            System.out.println("Iniciar aplicación presionando 1");
            int init = sc.nextInt();
            sc.nextLine();

            while (init != 0) {
                System.out.println("""
                        Seleccione:
                        1.Agregar productos
                        2.Agregar Precios
                        3.Mostrar productos
                        4.Mostrar precios
                        5 Calcular total
                        6.Salir
                        """);
                int option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("Agregar productos");
                       agregarProductos();
                       break;

                    case 2:
                        System.out.println("Agregar Precios");
                        agregarPrecios();
                        break;

                    case 3:
                        System.out.println("Mostrar productos");
                        mostrarProductos();
                        break;

                    case 4:
                        System.out.println("Mostrar precios");
                        mostrarPrecios();


                    case 6:
                        System.out.println("Salir");
                        init = 0;
                        break;
                    default:
                        System.out.println("Seleccione una opción valida");
                }

            }

        }

     public static void mostrarProductos (){
        for (int i = 0; i< productos.length; i++){
            System.out.println("Productos"+i+ ": "+productos[i]);
        }
     }

     public static void  agregarPrecios (){
    for (int i = 0;i< precios.length;i++){
        System.out.println("Agregue el precio"+i);
        precios[i] = sc.nextDouble();
    }
     }

     public static void mostrarPrecios(){
        for (double precio: precios){
            System.out.println("Precio: $"+precio);
        }

     }
     public static void actualizaPrecio (int i){

     }
    public static void actualizaProducto (int i){

    }
    public static void mostrarTablaProductoPrecio(){

    }


    }






