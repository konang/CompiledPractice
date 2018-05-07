/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiledpractice;

/**
 *
 * @author Andres test
 */
public class LLNode {
    int data;
    LLNode next;
    
    LLNode(int data, LLNode next){
        this.data=data;
        this.next=next;
    }
    
    LLNode(int data){
        this.data=data;
    }
    
    void setData(int data){
        this.data=data;
    } 
    void setLLNode(LLNode next){
        this.next=next;
    }
    
    int getData (){
        return this.data;
    }
    LLNode getLLNode (){
        return this.next;
    }
    
    
}
