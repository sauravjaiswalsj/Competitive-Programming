/*Given a Binary Search Tree, find the sum of all leaf nodes. BST has the following property (duplicate nodes are possible):

The left subtree of a node contains only nodes with keys less than the node’s key.

The right subtree of a node contains only nodes with keys greater than or equal to the node’s key.

Input:
The first line consists of integer N, denoting the number of elements in the BST. The second line of each test case consists of N space-separated integers denoting the elements in the BST.

Output:
print the sum of leaf nodes.

Constraints:
1 <= T <= 103     
1 <= N <= 105

Example:
Input:
6
67 34 82 12 45 78
Output:
135

Explanation:
In first test case, the BST for the given input will be-

               67

          /             \

   34                  82

  /    \                /

12   45         78

Hence, the required sum= 12 + 45 + 78 = 135

sample input :

6
67 34 82 12 45 78

sample output :

135 */  
 
import java.util.*;
import java.lang.*;
 
class Guvi
{
  static class Node{
    int data;
    Node left,right;
    Node(int item){
      this.data=item;
      left=null;
      right=null;
    }
  }//Node
  static int sum;
  static void leafSum(Node root){
    if(root==null){
      return;
    }
    if(root.left==null && root.right == null){
      sum+=root.data;
    }
    leafSum(root.left);
    leafSum(root.right);
  }
  static Node Insert(Node root,int value){
    if(root==null){
    	Node n=new Node(value);
        return n;
    }
    if(value<root.data)
      root.left=Insert(root.left,value);
    else
      root.right=Insert(root.right,value);
    return root;
  }
    
public static void main (String[] args) throws java.lang.Exception 
  { 
   // your code goes here 
  Scanner cin=new Scanner(System.in);
  int n=cin.nextInt();
  Node root=null;
  while(n-- > 0){
    int data=cin.nextInt();
    root=Insert(root,data);
  }
  sum=0;
  leafSum(root);
  System.out.println(sum);
   } 
 }
