/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiledpractice;

/**
 *
 * @author Andres Rocha
 */
public class TotalDecodingMessages {
    
    
  public TotalDecodingMessages(int testcases, String inputs[]){
    
    for(int i = 0; i< testcases; i++){
      System.out.println(decodeCounter(inputs[i],0));
    }
    
  }
  
  public int decodeCounter(String code, int counter){
    
    if(code==null)
      return 1;
    else if(code.length()<2)
      return 1;
    else{
      if((code.charAt(0)=='1' || code.charAt(0)=='2')&&(code.charAt(1)<'7')){
        
        counter += decodeCounter(code.substring(2), counter) + decodeCounter(code.substring(1),counter);
        
      }
      else{
        counter += decodeCounter(code.substring(1),counter);
        
      }
      return counter;
    }
    
  } 
  
}
