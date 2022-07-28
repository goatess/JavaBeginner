package javaBasico.ejercicios.tema7a9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static ArrayList<Byte> datosList = new ArrayList<>();
    public static void main(String[] args) {
        copyFile("/etc/psswd", "destino.txt");
        convertToMap(datosList);
        
    }
    public static void copyFile(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[]datos = in.readAllBytes();
            in.close();
            for (byte b : datos) {
                datosList.add(b);
            }

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Excepción" + e.getMessage());
        }
    }

    public static void convertToMap(ArrayList<Byte> datos){

        Map<Integer, Byte> byteMap = new HashMap();
        int i = 0;
        for (byte b : datos) {
            i++;
            byteMap.put(i,b);
        }
    }
}
