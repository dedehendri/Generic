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
public class newclass {
    String nama;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nm){
     this.nama= nm;   
    
    }
 
    private static <T> void nwclass (T free) {
        System.out.println(free);
    }    
    public static void main (String[] Args){
        newclass nw = new newclass();
        
        nw.setNama("abdul");
        System.out.println(nw.getNama());
        nwclass("this example");
        
    }
    
}
