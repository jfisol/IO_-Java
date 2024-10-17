
/* @author Joju Figureoa*/
import  java.io.*;  //Libreria que permite utilizar la entradas y salidas de teclado.
public class Main {
    public static void main(String[] args) {
     String nombreArchivo = "Fichero.txt";
     FileWriter writer; // Este objeto servirá para escribir información en un archivo;

        /*Cuando se utilizen archivos hay que itilizar try catch*/
        try {
            //abriendo el flujo de lectura
            writer = new FileWriter(nombreArchivo);//si se utiliza stringWriter no se necesita un archivo
            //usando el flujo de lectura
            writer.write("Abriendo el archivo \n");
            writer.write("Segunda Linea");
            //cerrando el flujo
            writer.close();

        }catch (IOException e){
            System.out.println("Error"+ e);
        }

        //LECTURA DE ARCHIVO
        FileReader reader; /*Para guardar en memoria se usa el StringWriter*/

        try {

            reader = new FileReader(nombreArchivo); //si se utiliza StringWriter se sustitulle nombre archivo por una cadena de texto para leerles
            int caracter;
            caracter = reader.read(); //agregando valor al caracter
            while (caracter != -1){
                System.out.print((char)caracter);//convertimos el caracter correspondiente haciendole casteo
                caracter = reader.read();
            }
            reader.close(); //cerramos el objeto de lectura

        }catch (IOException e){
            System.out.println("Error"+ e);
        }

    }
}