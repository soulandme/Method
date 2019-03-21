/*
 * Wendy Wang 
 * Method
 * exercies1- creat a house
 */
// 1) main problem sovling appoach
// using 

package u3house;

/**
 *
 * @author wewan5525
 */
public class U3House {

    /**
     * @param args the command line arguments
     */
    public static void addWalk(int length){

        for (int  i = 1; i <= length; i++){ 
            System.out.print("*");
        }
        System.out.println();
    }
    /**
    * the base of this house is using ____
    * @param length 
    */
    
    public static void addBase(int length){
        
        for (int i = 1; i <= length; i++){
            System.out.println("_______");
        }
        System.out.println();
    }
    
    /**
     * 
     * @param length 
     */
    public static void addWall(int length){
        
        for (int i = 1; i <= length; i++){
            System.out.println(":     :");
        }
        System.out.println();
    }
    
    public static void addRoof(int length){
        
        for (int i = 1; i <= length; i++){
            //System.out.println("/\");
        }
        System.out.println();
    }
    //public static void addRoof(int length){
    //    for (int )
    //}

    public static void main(String[] args) {
       
       addWalk(9);
       addWalk(1);
       addWalk(1);
       addBase(1);
       addWall(3);
       //System.out.println(" ");
       addBase(1);
       addWalk(2);
       addWalk(11);
       
       
        // TODO code application logic here
    
        
    }
    
}
