/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author Dede Hendri
 */
public class GenApp {
    private static <T> void printArray(T[] a) {
        for (Object o : a) {
            System.out.println(o);
            
        }
    }   
    public static void main (String[] Args) {
        Integer iArr[] = new Integer[3];
        iArr [0] = 10;
        iArr [1] = 20;
        iArr [2] = 30;
        printArray(iArr);
        
        String sArr[] = new String[3];
        sArr[0]= "Sepuluh";
        sArr[1]= "Dua Puluh";
        sArr[2]= "Tiga Puluh";
        printArray(sArr);
        
        Double dArr[] = new Double[3];
        dArr[0] =1.0;
        dArr[1] =2.0;
        dArr[2] =3.0;
        printArray(dArr);
        
        Character cArr[] = new Character[3];
        cArr[0] = 'A';
        cArr[1] = 'B';
        cArr[2] = 'C';
        printArray(cArr);
        
        Boolean bArr[]= new Boolean[3];
        bArr[0] = true;
        bArr[1] = false;
        bArr[2] = false;
        printArray(bArr);
        
        
    }
    
    
}
