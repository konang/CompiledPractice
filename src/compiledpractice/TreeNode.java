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
public class TreeNode {
  
    int data;
    TreeNode right;
    TreeNode left;
    
    TreeNode(int data){
        this.data=data;
    }
    
    TreeNode(int data, TreeNode left, TreeNode right){
        this.data=data;
        this.left=left;
        this.left=right;
    }

    
    void setData(int data){
        this.data=data;
    } 
    void setLeft(TreeNode node){
        this.left=node;
    }
    
    void setRight(TreeNode node){
        this.right=node;
    }
    
    int getData (){
        return this.data;
    }
    TreeNode getLeft(){
        return this.left;
    }
    TreeNode getRight(){
        return this.right;
    }
  
}
