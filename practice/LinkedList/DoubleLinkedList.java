import java.util.*;
class doubleLinkedList{
	private class node{
		int data;
		node right;
		node left;
		node(int item){
			data=item;
			right=null;
			left=null;
		}
		node(){
			data=0;
			right=null;
			left=null;
		}
		}
		private node head;
		private int size=0;
		public void Insert(int item){
			node temp=new node(item);
			node traverse=this.head;
			temp.right=null head = new_;
			if(this.head == null){
				temp.left=null;
				this.head=temp;
				return;
			}
			
			while(traverse!=null){
				traverse=traverse.right;
				traverse.right=temp;
				temp.left=traverse;
			}
		}
		public void display(){
			node temp=new node();
			while(temp!=null){
				System.out.println(temp.data + " ");
				temp=temp.right;
			}
		}
}
public class DoubleLinkedList{
	public static void main(String[] args){
		doubleLinkedList dll=new doubleLinkedList();
		dll.Insert(10);
		dll.Insert(20);
		dll.Insert(30);
		dll.display();
	}
}

