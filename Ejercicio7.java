package repasoexamen;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce fichero");
        String ruta = sc.nextLine();
        escribirFichero(ruta);
        leerFichero(ruta);
    }

    public static void escribirFichero(String r) {
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(r)));
                DataOutputStream dos =new DataOutputStream(bos);){
        
            for (int i = 0; i < 20; i++) {
                dos.writeDouble(numAlea());
            }
            
        }catch(FileNotFoundException e){
            System.out.println("Error buscando el fichero");
        }catch(IOException ee){
            System.out.println("Error escribiendo");
        }
    }
    
    public static double numAlea(){
    return Math.floor(Math.random()*(100-1)+1);
    }
    
    public static void leerFichero(String r ){
    
        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(r))))){
            
            while(true){
                System.out.println(dis.readDouble());
                dis.read();
            }
            
        }catch(FileNotFoundException e){
            System.out.println("Error buscando fichero");
        }catch(IOException ee){
            System.out.println("Error leyendo el fichero");
        }
        
    }
}
