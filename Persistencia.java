import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Persistencia {
    private File data;

    public Persistencia (String nombre){
        data = new File(nombre);
        try {
            data.createNewFile();
        }
        catch (IOException excepcion){
            excepcion.printStackTrace();
        }
    }

    public void escrArchivo(String texto){
        try {
            FileWriter escritor = new FileWriter(data);
            escritor.write(texto);
            escritor.close();
        }
        catch (IOException excepcion) {
            excepcion.printStackTrace();
        }
    }

    public ArrayList<String> leerArchivo(){
        Scanner lector;
        ArrayList<String> textos = new ArrayList<String>();
        try {
            lector = new Scanner(data);
            while (lector.hasNextLine()){
                textos.add(lector.nextLine());
            }
        }
        catch (FileNotFoundException excepcion) {
            excepcion.printStackTrace();
        }
        return textos;
    }

    public String leerArchString(){
        String texto = "";
        Scanner lector;
        try {
            lector = new Scanner(data);
            while (lector.hasNextLine()){
                texto = texto + lector.nextLine() + "\n";
            }
        }
        catch (FileNotFoundException excepcion) {
            excepcion.printStackTrace();
        }
        return texto;
    }

    public void borrarArchivo() {
        data.delete();
    }
}
