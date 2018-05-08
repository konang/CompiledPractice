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
public class Tree {
  
  TreeNode head;
  
  Tree(int data){
    this.head = new TreeNode(data);
  }
  
  Tree(){}
  
  void insert(int data){
    
    TreeNode temp = head;
    if(temp==null){
      head = new TreeNode(data);
      //System.out.println("the head was null, inserted value:"+data);
    }
    else{
      //System.out.println("started insertion of "+data);
      //System.out.println("started cycle, temp value is "+temp.data);
      while(!(temp.left==null && temp.right==null)){
        
        if(data>temp.data){
          //System.out.println("data was greater than "+temp.data);
          if(temp.right!=null){
            temp=temp.right;
            //System.out.println("going to the right");
          }
          else{
            temp.right= new TreeNode(data);
            //System.out.println("inserted node to the right where left was not null inserted value:"+data);
            break;
          }
          
        }
        else if (data<temp.data){
          //System.out.println("data was lower than "+temp.data);
          if(temp.left!=null){
            temp=temp.left;
            //System.out.println("going to the left");
          }
          else{
            temp.left= new TreeNode(data);
            //System.out.println("inserted node to the left where right was not null inserted value:"+data);
            break;
          }
        }
        
      }
      if(temp.left==null && temp.right==null){
        if(data>temp.data){
          temp.right=new TreeNode(data);
          //System.out.println("inserted node to the right where left and right were null and parent value is "+temp.data+" inserted value:"+data);
        }
        else{
          temp.left=new TreeNode(data);
          //System.out.println("inserted node to the left where left and right were null and parent value is "+temp.data+"  inserted value:"+data);
        }
      }
      
      
    }
  }
  
  void traversePreOrder (TreeNode traversing){
    if(traversing!=null){
      System.out.println(traversing.data);
      traversePreOrder(traversing.left);
      traversePreOrder(traversing.right);
    }
    
  }
  
  void traverseInOrder (TreeNode traversing){
    if(traversing!=null){
      
      traverseInOrder(traversing.left);
      System.out.println(traversing.data);
      traverseInOrder(traversing.right);
      
      
    }
  }
  
  void traversePostOrder (TreeNode traversing){
    if(traversing!=null){
      
      traverseInOrder(traversing.left);
      
      traverseInOrder(traversing.right);
      System.out.println(traversing.data);
      
      
    }
  }
    
  }
  

