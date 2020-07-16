/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiledpractice;
import java.util.ArrayList;
/**
 *
 * @author Andre
 */
class GCD
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE
        
        ArrayList<Integer>[] GCD = new ArrayList[num];
        int returnGDC=1;
        int actualGDC=1;
        boolean endloop = false;
        
        for (int i = 0; i < num; i++){
            
            GCD[i] = new ArrayList<Integer>();
            
        }
        
        
        for (int i = 0; i < num; i++){
         
         actualGDC=arr[i];
         
         while(actualGDC>0){
             
             if(arr[i]%actualGDC==0){
                GCD[i].add(actualGDC);
                System.out.println("Se agrego "+ actualGDC+" con el numero "+arr[i]);
             }
             actualGDC--;
             
         }
            
        }
        
        //Loop to find the GCD from all the divisible numbers in the lists
        for (int i = 0; i < GCD[0].size(); i++){
            
            if (endloop)
                break;
            else 
                endloop = true;
            
            returnGDC=GCD[0].get(i);
            for (int j = 0; j< num; j++){
                if(!endloop)
                    break;
                if(!GCD[j].contains(returnGDC)) 
                    endloop = false;
                
            
            }
            
            
        }
        
        return returnGDC;
        
        
    }
    // METHOD SIGNATURE ENDS
    
    public static void main (String args[]){
        int arr[] = {2, 8 , 4, 10 , 6};
        System.out.println(generalizedGCD(5,arr ));
    }
}





/*
 Otra forma de hacerlo con Map

package compiledpractice;
import java.util.ArrayList;
import java.util.*;

class GCD
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int generalizedGCD(int num, int[] arr)
    {
// WRITE YOUR CODE HERE
        
        //create an auxiliary map that will track the count of each time a number is divisible by that specific number
        //need to find the highest number so that will by my possible highest range for my GDC
        int highestNumber=0;
        for(int i=0; i<arr.length; i++){
            
            if(arr[i]>highestNumber) highestNumber=arr[i];
            
        }
        
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        //filling with 0s my map
        for(int i=0; i<highestNumber+1; i++){
            
            occurrences.put(i, 0);
            
        }
        
        //finding all divisible numbers
        int actualDivisible=1;
        for(int i=0; i<arr.length; i++){
            
            actualDivisible=arr[i];
            while(actualDivisible>0){
                if(arr[i]%actualDivisible==0){
                	System.out.println("Se agrego "+ actualDivisible+" con el numero "+arr[i]);
                    occurrences.replace(actualDivisible, occurrences.get(actualDivisible)+1);//adding one more occurence to the specific divisble
                }
                actualDivisible--;
            }
            
        }
        int GCD=1;
      //Finding the most occurrences shift from all cases to less
        for(int i=1; i<highestNumber+1; i++){
        	System.out.println("Se evaulua "+ i+" con el numero "+occurrences.get(i));
            if(occurrences.get(i)>=num) GCD=i;
            
            
        }
        
        
        return GCD;
        
        
        
    }
    // METHOD SIGNATURE ENDS
    
    public static void main (String args[]){
        int arr[] = {2, 8 , 4, 10 , 6};
        System.out.println(generalizedGCD(5,arr ));
    }
}

  
  
 */