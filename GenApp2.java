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
class GenApp2 <T> {
    private T type;
    
    public T getType() {
        return type;
        
    }
    
    public void setType (T type) {
        this.type = type;
    }
    private static <Z> void whatYouDo (){
        System.out.println();
    }
    
    private static <N,T> void anythingYouWanted(N freeParType, T freeTwo) {
        System.out.println(freeParType);
        System.out.println(freeTwo);
    }
    public static void main (String[]Args) {
        anythingYouWanted(1,"Star");
        
        
        
    }
    
}
