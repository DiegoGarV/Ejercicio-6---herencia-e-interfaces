/*
 * @author Diego García
 * @date 29-10-2022
 * Clase main,en la que el usuario puede interactuar con el programa
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Tienda inter = new Tienda();
        Scanner teclado = new Scanner(System.in);
        String tienda = "Base de Datos Electronica Latinoamericana";
        Persistencia baseDatos = new Persistencia(tienda);
        baseDatos.leerArchivo();
        String contrasena = "Electronicos1234";
        String menu = "1. Probar producto\n"+
        "2. Agruegar/eliminar producto al carrito\n"+
        "3. Comprar\n"+
        "4. Acciones de administrador\n"+
        "5. Salir" + 
        "\nIngrese la opción que desea: ";
        String menu2 = "1. Agregar/eliminar productos disponibles\n"+
        "2. Agruegar/eliminar sucursal\n"+
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
                int op = 0, cont = 0, num=0, op2=0;
                ArrayList<Integer> arreglo = new ArrayList<Integer>();
                while (op<1 || op>9){
                    System.out.println("¿Que tipo de producto desea probar? \n1. Smartphones \n2. Telefono celulares \n3. Telefonos fijos \n4. Camaras fotograficas \n5. Desktops \n6. Laptops \n7. Smart TV \n8. Tablets \n9.Smartwatch");
                    op = teclado.nextInt();
                    if (op<1 || op>9){
                        System.out.println("Respuesta incorrecta.");
                    }
                }
                if (op==1){
                    for (int i=0;i<inter.getProductos().size();i++){
                        if (inter.getProductos().get(i).getTipo().equalsIgnoreCase("smartphone")){
                            cont+=1;
                            System.out.println("Producto "+cont);
                            System.out.println(inter.getProductos().get(i).toString());
                            arreglo.add(i);
                        }
                        else {
                            System.out.println("No tenemos productos de este tipo disponibles");
                        }
                    }
                    while (num<1 || num>cont){
                        System.out.println("Escoja el numero del producto que desea probar");
                        num = teclado.nextInt();
                        if (num<1 || num>cont){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    while (op2<1 || op2>5){
                        System.out.println("Escoja la prueba de producto que quiere hacer \n1. Hacer llamada \n2. Tomar foto \n3. Navegar por internet \n4. Reproducir video \n5. Ver portatibilidad");
                        num = teclado.nextInt();
                        if (op2<1 || op2>5){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    if (op2==1){
                        System.out.println("Ingrese el numero al que desea llamar");
                        int tel = teclado.nextInt();
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).llamada());
                    }
                    else if (op2==2){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).foto());
                    }
                    else if (op2==3){
                        System.out.println("Ingrese el URL que desea visitar");
                        String url = teclado.next();
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).navInternet());
                    }
                    else if (op2==4){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).repVideo());
                    }
                    else if (op2==5){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).portable());
                    }
                }
                else if (op==2){
                    for (int i=0;i<inter.getProductos().size();i++){
                        if (inter.getProductos().get(i).getTipo().equalsIgnoreCase("telefono celular")){
                            cont+=1;
                            System.out.println("Producto "+cont);
                            System.out.println(inter.getProductos().get(i).toString());
                            arreglo.add(i);
                        }
                        else {
                            System.out.println("No tenemos productos de este tipo disponibles");
                        }
                    }
                    while (num<1 || num>cont){
                        System.out.println("Escoja el numero del producto que desea probar");
                        num = teclado.nextInt();
                        if (num<1 || num>cont){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    while (op2<1 || op2>2){
                        System.out.println("Escoja la prueba de producto que quiere hacer \n1. Hacer llamada \n2. Ver portatibilidad");
                        num = teclado.nextInt();
                        if (op2<1 || op2>2){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    if (op2==1){
                        System.out.println("Ingrese el numero al que desea llamar");
                        int tel = teclado.nextInt();
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).llamada());
                    }
                    else if (op2==2){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).portable());
                    }
                }
                else if (op==3){
                    for (int i=0;i<inter.getProductos().size();i++){
                        if (inter.getProductos().get(i).getTipo().equalsIgnoreCase("telefono fijo")){
                            cont+=1;
                            System.out.println("Producto "+cont);
                            System.out.println(inter.getProductos().get(i).toString());
                            arreglo.add(i);
                        }
                        else {
                            System.out.println("No tenemos productos de este tipo disponibles");
                        }
                    }
                    while (num<1 || num>cont){
                        System.out.println("Escoja el numero del producto que desea probar");
                        num = teclado.nextInt();
                        if (num<1 || num>cont){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    System.out.println("Ingrese el numero al que desea llamar");
                    int tel = teclado.nextInt();
                    System.out.println(inter.getProductos().get(arreglo.get(num-1)).llamada());
                }
                else if (op==4){
                    for (int i=0;i<inter.getProductos().size();i++){
                        if (inter.getProductos().get(i).getTipo().equalsIgnoreCase("camara fotografica")){
                            cont+=1;
                            System.out.println("Producto "+cont);
                            System.out.println(inter.getProductos().get(i).toString());
                            arreglo.add(i);
                        }
                        else {
                            System.out.println("No tenemos productos de este tipo disponibles");
                        }
                    }
                    while (num<1 || num>cont){
                        System.out.println("Escoja el numero del producto que desea probar");
                        num = teclado.nextInt();
                        if (num<1 || num>cont){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    while (op2<1 || op2>3){
                        System.out.println("Escoja la prueba de producto que quiere hacer \n1. Tomar foto \n2. Reproducir video \n3. Ver portatibilidad");
                        num = teclado.nextInt();
                        if (op2<1 || op2>3){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    if (op2==1){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).foto());
                    }
                    else if (op2==2){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).repVideo());
                    }
                    else if (op2==3){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).portable());
                    }
                }
                else if (op==5){
                    for (int i=0;i<inter.getProductos().size();i++){
                        if (inter.getProductos().get(i).getTipo().equalsIgnoreCase("desktop")){
                            cont+=1;
                            System.out.println("Producto "+cont);
                            System.out.println(inter.getProductos().get(i).toString());
                            arreglo.add(i);
                        }
                        else {
                            System.out.println("No tenemos productos de este tipo disponibles");
                        }
                    }
                    while (num<1 || num>cont){
                        System.out.println("Escoja el numero del producto que desea probar");
                        num = teclado.nextInt();
                        if (num<1 || num>cont){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    while (op2<1 || op2>3){
                        System.out.println("Escoja la prueba de producto que quiere hacer \n1. Navegar por internet \n2. Reproducir video \n3. Ejecutar videojuego");
                        num = teclado.nextInt();
                        if (op2<1 || op2>3){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    if (op2==1){
                        System.out.println("Ingrese el URL que desea visitar");
                        String url = teclado.next();
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).navInternet());
                    }
                    else if (op2==2){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).repVideo());
                    }
                    else if (op2==3){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).videojuego());
                    }
                }
                else if (op==6){
                    for (int i=0;i<inter.getProductos().size();i++){
                        if (inter.getProductos().get(i).getTipo().equalsIgnoreCase("laptop")){
                            cont+=1;
                            System.out.println("Producto "+cont);
                            System.out.println(inter.getProductos().get(i).toString());
                            arreglo.add(i);
                        }
                        else {
                            System.out.println("No tenemos productos de este tipo disponibles");
                        }
                    }
                    while (num<1 || num>cont){
                        System.out.println("Escoja el numero del producto que desea probar");
                        num = teclado.nextInt();
                        if (num<1 || num>cont){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    while (op2<1 || op2>4){
                        System.out.println("Escoja la prueba de producto que quiere hacer \n1. Navegar por internet \n2. Reproducir video \n3. Ejecutar videojuego \n4. Ver portatibilidad");
                        num = teclado.nextInt();
                        if (op2<1 || op2>4){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    if (op2==1){
                        System.out.println("Ingrese el URL que desea visitar");
                        String url = teclado.next();
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).navInternet());
                    }
                    else if (op2==2){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).repVideo());
                    }
                    else if (op2==3){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).videojuego());
                    }
                    else if (op2==4){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).portable());
                    }
                }
                else if (op==7){
                    for (int i=0;i<inter.getProductos().size();i++){
                        if (inter.getProductos().get(i).getTipo().equalsIgnoreCase("smart tv")){
                            cont+=1;
                            System.out.println("Producto "+cont);
                            System.out.println(inter.getProductos().get(i).toString());
                            arreglo.add(i);
                        }
                        else {
                            System.out.println("No tenemos productos de este tipo disponibles");
                        }
                    }
                    while (num<1 || num>cont){
                        System.out.println("Escoja el numero del producto que desea probar");
                        num = teclado.nextInt();
                        if (num<1 || num>cont){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    while (op2<1 || op2>2){
                        System.out.println("Escoja la prueba de producto que quiere hacer \n1. Navegar por internet \n2. Reproducir video");
                        num = teclado.nextInt();
                        if (op2<1 || op2>2){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    if (op2==1){
                        System.out.println("Ingrese el URL que desea visitar");
                        String url = teclado.next();
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).navInternet());
                    }
                    else if (op2==2){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).repVideo());
                    }
                }
                else if (op==8){
                    for (int i=0;i<inter.getProductos().size();i++){
                        if (inter.getProductos().get(i).getTipo().equalsIgnoreCase("tablet")){
                            cont+=1;
                            System.out.println("Producto "+cont);
                            System.out.println(inter.getProductos().get(i).toString());
                            arreglo.add(i);
                        }
                        else {
                            System.out.println("No tenemos productos de este tipo disponibles");
                        }
                    }
                    while (num<1 || num>cont){
                        System.out.println("Escoja el numero del producto que desea probar");
                        num = teclado.nextInt();
                        if (num<1 || num>cont){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    while (op2<1 || op2>4){
                        System.out.println("Escoja la prueba de producto que quiere hacer \n1. Tomar foto \n2. Navegar por internet \n3. Reproducir video \n4. Ver portatibilidad");
                        num = teclado.nextInt();
                        if (op2<1 || op2>4){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    if (op2==1){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).foto());
                    }
                    else if (op2==2){
                        System.out.println("Ingrese el URL que desea visitar");
                        String url = teclado.next();
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).navInternet());
                    }
                    else if (op2==3){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).repVideo());
                    }
                    else if (op2==4){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).portable());
                    }
                }
                else if (op==9){
                    for (int i=0;i<inter.getProductos().size();i++){
                        if (inter.getProductos().get(i).getTipo().equalsIgnoreCase("smartwatch")){
                            cont+=1;
                            System.out.println("Producto "+cont);
                            System.out.println(inter.getProductos().get(i).toString());
                            arreglo.add(i);
                        }
                        else {
                            System.out.println("No tenemos productos de este tipo disponibles");
                        }
                    }
                    while (num<1 || num>cont){
                        System.out.println("Escoja el numero del producto que desea probar");
                        num = teclado.nextInt();
                        if (num<1 || num>cont){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    while (op2<1 || op2>3){
                        System.out.println("Escoja la prueba de producto que quiere hacer \n1. Tomar foto \n2. Hacer llamada \n3. Ver portatibilidad");
                        num = teclado.nextInt();
                        if (op2<1 || op2>3){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    if (op2==1){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).foto());
                    }
                    else if (op2==2){
                        System.out.println("Ingrese el numero al que desea llamar");
                        int tel = teclado.nextInt();
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).llamada());
                    }
                    else if (op2==3){
                        System.out.println(inter.getProductos().get(arreglo.get(num-1)).portable());
                    }
                }
            }

            else if (opcion==2){
                int op = 0, num = 0;
                while (op<1 || op>2){
                    System.out.println("¿Que desea hacer? \n1. Agruegar producto al carrito \n2. Eliminar producto del carrito");
                    op = teclado.nextInt();
                    if (op<1 || op>2){
                        System.out.println("Respuesta incorrecta.");
                    }
                }
                if (op==1){
                    if (!inter.getProductos().isEmpty()){
                        System.out.println(inter.mostrarProductos());
                        while (num<1 || num>inter.getProductos().size()){
                            System.out.println("Ingrese el numero del producto que desea agruegar al carrito");
                            num = teclado.nextInt();
                            if (num<1 || num>inter.getProductos().size()){
                                System.out.println("Respuesta incorrecta.");
                            }
                        }
                        inter.agruegarAlCarrito(num);
                        System.out.println(inter.mostrarCarrito());
                    }
                    else {
                        System.out.println("Lo sentimos, actualmente no tenemos productos disponibles :(");
                    }
                }
                else if (op==2){
                    if (!inter.getCarrito().isEmpty()){
                        System.out.println(inter.mostrarCarrito());
                        while (num<1 || num>inter.getCarrito().size()){
                            System.out.println("Ingrese el numero del producto que desea eliminar del carrito");
                            num = teclado.nextInt();
                            if (num<1 || num>inter.getCarrito().size()){
                                System.out.println("Respuesta incorrecta.");
                            }
                        }
                        inter.eliminarDelCarrito(num);
                        System.out.println(inter.mostrarCarrito());
                    }
                    else {
                        System.out.println("Aun no tienes ningun producto en tu carrito de compras");
                    }
                }
            }
            
            else if (opcion==3){
                String nombre="";
                int nit=0;
                System.out.println("Ingrese su nombre completo");
                nombre = teclado.nextLine();
                System.out.println("Ingrese su NIT");
                nit = teclado.nextInt();
                System.out.println(inter.hacerCompra(nombre, nit));
                inter.eliminarProductoAuto();
                System.out.println("¡Gracias por su compra!");
            }

            else if (opcion==4){
                String cont = "";
                int tipo = 1;
                while (tipo==1){
                    System.out.println("Ingrese la contrasena de administrador");
                    cont = teclado.next();
                    if (!cont.equals(contrasena)){
                        System.out.println("\nContrasena incorrecta");
                        System.out.println("¿Desea volver a intentar? \n1.Si \n2.No");
                        tipo = teclado.nextInt();
                        System.out.println("  ");
                        if (tipo<1 || tipo>2){
                            System.out.println("Respuesta incorrecta.");
                        }
                    }
                    else {
                        System.out.println("Contrasena aceptada\n");
                        System.out.println(baseDatos.leerArchString());
                        while (opcion2!=4){
                            System.out.println(menu2);
                            opcion2 = teclado.nextInt();
                            System.out.println(" ");
                            teclado.nextLine();

                            if (opcion2==1){
                                int op=0, serie=0, cantidad=0, num=0;
                                String type="", marca="", fechaFabric="", marcadorAR=""; 
                                double precio=0;
                                while (op<1 || op>2){
                                    System.out.println("¿Que desea hacer? \n1. Agruegar producto \n2. Eliminar producto");
                                    op = teclado.nextInt();
                                    if (op<1 || op>2){
                                        System.out.println("Respuesta incorrecta.");
                                    }
                                }
                                if (op==1){
                                    System.out.println("Ingrese el tipo de producto (smartphone, telefono celular, telefono fijo, camara fotografica, desktop, laptop, smart tv, tablets, smartwatch)");
                                    type = teclado.nextLine();
                                    System.out.println("Ingrese la marca del producto");
                                    marca = teclado.nextLine();
                                    System.out.println("Ingrese el numero de serie del producto");
                                    serie = teclado.nextInt();
                                    System.out.println("Ingresa la fecha de fabricacion del producto en formato dd/MM/YYYY");
                                    fechaFabric = teclado.nextLine();
                                    System.out.println("Precio del producto en quetzales");
                                    precio = teclado.nextDouble();
                                    System.out.println("Ingrese el link a la imagen del marcador AR del producto");
                                    marcadorAR = teclado.next();
                                    System.out.println("Ingrese la cantidad de unidades disponibles que hay del producto");
                                    cantidad = teclado.nextInt();
                                    inter.agruegarProducto(precio, serie, type, marca, fechaFabric, marcadorAR, cantidad);
                                    System.out.println(inter.mostrarProductos());
                                }
                                else if (op==2){
                                    if (!inter.getProductos().isEmpty()){
                                        System.out.println(inter.mostrarProductos());
                                        while (num<1 || num>inter.getProductos().size()){
                                            System.out.println("Ingrese el numero del producto que desea eliminar");
                                            num = teclado.nextInt();
                                            if (num<1 || num>inter.getProductos().size()){
                                                System.out.println("Respuesta incorrecta.");
                                            }
                                        }
                                        inter.eliminarProductoManual(num);
                                        System.out.println(inter.mostrarProductos());
                                    }
                                    else {
                                        System.out.println("Lo sentimos, actualmente no tenemos productos disponibles :(");
                                    }
                                }
                            }

                            else if(opcion2==2){
                                int op=0, codigo=0, num=0;
                                String direccion="", pais="", ciudad=""; 
                                while (op<1 || op>2){
                                    System.out.println("¿Que desea hacer? \n1. Agruegar sucursal \n2. Eliminar sucursal");
                                    op = teclado.nextInt();
                                    if (op<1 || op>2){
                                        System.out.println("Respuesta incorrecta.");
                                    }
                                }
                                if (op==1){
                                    System.out.println("Ingrese la direccion de la sucursal");
                                    direccion = teclado.nextLine();
                                    System.out.println("Ingrese el codigo de la sucursal");
                                    codigo = teclado.nextInt();
                                    System.out.println("Ingresa el pais en el que se encuentra la sucursal");
                                    pais = teclado.nextLine();
                                    System.out.println("Ingresa la ciudad en la que se encuentra la sucursal");
                                    ciudad = teclado.nextLine();
                                    inter.agruegarSucursal(direccion, codigo, pais, ciudad);
                                    System.out.println(inter.mostrarSucursales());
                                }
                                else if (op==2){
                                    if (!inter.getSucursales().isEmpty()){
                                        System.out.println(inter.mostrarSucursales());
                                        while (num<1 || num>inter.getSucursales().size()){
                                            System.out.println("Ingrese el numero de la sucursal que desea eliminar");
                                            num = teclado.nextInt();
                                            if (num<1 || num>inter.getSucursales().size()){
                                                System.out.println("Respuesta incorrecta.");
                                            }
                                        }
                                        inter.eliminarSucursal(num);
                                        System.out.println(inter.mostrarSucursales());
                                    }
                                    else {
                                        System.out.println("Aun no contamos con sucursales");
                                    }
                                }
                            }

                            else if(opcion2==3){
                                inter.mostrarFacturas();
                            }

                            else if(opcion2<1 || opcion2>4){
                                System.out.println("Opcion incorrecta.");
                                System.out.println(" ");
                            }
                        }
                        tipo=2;
                    }
                }
            }

            else if (opcion<1 || opcion>5){
                System.out.println("Opcion incorrecta.");
                System.out.println(" ");
            }
        }
        baseDatos.escrArchivo(inter.mostrarProductos());
        baseDatos.escrArchivo(inter.mostrarFacturas());
        baseDatos.escrArchivo(inter.mostrarSucursales());
    }
}