/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiledpractice;
import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class SubarrayWithSum {
    
    Scanner reader = new Scanner(System.in);
    
    int arrdata[];
    int arrdesired[]= new int[2];
    
    
    public SubarrayWithSum(){
        
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        reader.nextLine();
        String line;
        while(n>0){
            System.out.println("Enter size of the array and sum desidered: ");
            line= reader.nextLine();
            arrdesired[0]=Integer.parseInt(line.split(" ")[0]);
            arrdesired[1]=Integer.parseInt(line.split(" ")[1]);
            
            System.out.println("Enter data ");
            line= reader.nextLine();
            arrdata = new int[arrdesired[0]];
            for (int i = 0; i<arrdesired[0]; i++){
                arrdata[i] = Integer.parseInt(line.split(" ")[i]);
                
            }
            findSubarray(arrdesired[1], arrdata);
        
            n--;
        }
        reader.close();
    }
    
    void findSubarray(int sum, int dataarr[]){
        int start = 0;
        int end = 0;
        int totalsum=0;
    
        if(dataarr.length<1 || sum<1){
            System.out.println("-1");
        }
        else {
            for(int i=0; i<dataarr.length; i++){
                if(dataarr[i]+totalsum==sum){
                     System.out.println("Se encontro la suma con el final en: "+i);
                    end=i;
                    break;
                }
                else if (dataarr[i]+totalsum<sum){
                    totalsum+=dataarr[i];
                    System.out.println("la suma del valor "+dataarr[start]+" hasta "+dataarr[i]+" no es suficiente, con el valor acumulado de "+totalsum);
                }
                else if (dataarr[i]+totalsum>sum){
                    
                    while(dataarr[i]+totalsum>sum || start==i){
                        System.out.println("Se le va a restar al total de " +totalsum+ " el valor de "+ dataarr[start]+" para achicar la ventana");
                        totalsum-=dataarr[start];
                        start++;
                    }
                    totalsum+=dataarr[i];
                    //System.out.println("la suma del valor "+dataarr[start]+" hasta "+dataarr[i]+" es mas que lo necesario, con el valor acumulado de "+totalsum+" se reiniciara con " + dataarr[i]);
                    
                    if(totalsum==sum){
                     System.out.println("Se encontro la suma con el final en: "+i);
                    end=i;
                    break;
                    }
                    
                }
            }
            System.out.println("Inicio: "+(start+1)+" final: "+(end+1));
        }
    
    }
    
}
