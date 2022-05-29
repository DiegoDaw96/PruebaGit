
package repasoexamen;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    
    public static void main(String[] args) {
       try(FileReader fr = new FileReader("Prueba1.txt")){
       
           int temp = fr.read();
           while(temp!=-1){
           
               if(temp!=32){
                   
                   if(Character.isUpperCase(temp)){
                   System.out.print((char)Character.toLowerCase(temp));
                   }else System.out.print((char)Character.toUpperCase(temp));
                   
               }
               temp=fr.read();
           }
           
       }catch(FileNotFoundException e){
           System.out.println("Error al encontrar el fichero");
       }catch(IOException ee){
           System.out.println("Error al leer el fichero");
       }
       
    }
}
