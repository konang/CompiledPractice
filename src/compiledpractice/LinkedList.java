/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiledpractice;

/**
 *
 * @author Andre
 */
public class LinkedList {
    LLNode head;
    LLNode curr;
    
    LinkedList(int data){
        head = new LLNode(data);
        curr=head;
    }
    
    void addFirst(int data){
        head = new LLNode(data, head);
    }
    
    void add(int data){
        if(head==null) addFirst(data);
        else{
            LLNode last = new LLNode(data);
            LLNode temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=last;
        }
    }
    
    int search(int data){
        
        int position=0;
        LLNode temp= head;
        
        while(temp!=null ){
            
            if(temp.data==data) return position;
            position++;
            temp=temp.next;
        }
        return -1;
    }
    
    LLNode findNode(int position){
        
        int counter =0;
        LLNode temp= head;
        
        while(temp!=null ){
            
            if(counter==position) return temp;
            counter++;
            temp=temp.next;
        }
        return null;
    }
    
    void printAll(){
        
        LLNode temp= head;
        
        while(temp!=null ){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    
    }
    
}
