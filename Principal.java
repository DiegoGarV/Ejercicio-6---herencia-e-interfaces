/*
 * @author Diego García
 * @date 20-10-2022
 * Clase main,en la que el usuario puede interactuar con el programa
 */
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Tienda carrito = new Tienda();
        Scanner teclado = new Scanner(System.in);
        String contrasena = "Electronicos1234";
        String menu = "1. Probar producto\n"+
        "2. Agruegar producto al carrito\n"+
        "3. Comprar\n"+
        "4. Acciones de administrador\n"+
        "5. Salir" + 
        "\nIngrese la opción que desea: ";
        String menu2 = "1. Agregar productos disponibles\n"+
        "2. Eliminar un producto disponible\n"+
        "3. Ver todas las facturas efectuadas\n"+
        "4. Salir" +
        "\nIngrese la opción que desea: ";
        int opcion = 1;
        int opcion2 = 1;
        while (opcion!=5){
            System.out.println(menu);
            opcion = teclado.nextInt();
            System.out.println(" ");
            teclado.nextLine();

            if (opcion==1){
                int tipo=0, tipo2=0, tp=0;
                String autor="", emoticono="", mensaje="", url="", formato="", hashtag=""; 
                float tamanio=0, resolucion=0, sampleRate=0, bitDepth=0, frameRate=0;
            }

            else if (opcion==2){
                
            }
            
            else if (opcion==3){
                
            }

            else if (opcion==4){
                String cont = "";
                int tipo = 0;
                while (!cont.equals(contrasena) || tipo!=2){
                    System.out.println("Ingrese la contrasena de administrador");
                    cont = teclado.next();
                    System.out.println("Contrasena incorrecta");
                    while (tipo<1 || tipo>2){
                        System.out.println("¿Desea volver a intentar? \n1.Si \n2.No");
                        tipo = teclado.nextInt();
                        if (tipo<1 || tipo>2){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    if (tipo==1){
                        System.out.println("Ingrese la contrasena de administrador");
                        cont = teclado.nextLine();
                        tipo=0;
                    }
                }
                if (cont.equals(contrasena)){
                    System.out.println("Contrasena aceptada");
                    while (opcion2!=4){
                        System.out.println(menu2);
                        opcion2 = teclado.nextInt();
                        System.out.println(" ");
                        teclado.nextLine();
                        if (opcion2==1){

                        }

                        else if(opcion2==2){

                        }

                        else if(opcion2==3){

                        }

                        else if(opcion2<1 || opcion2>4){
                            System.out.println("Opcion incorrecta.");
                            System.out.println(" ");
                        }
                    }
                }
            }

            else if (opcion<1 || opcion>5){
                System.out.println("Opcion incorrecta.");
                System.out.println(" ");
            }
        }
    }
}