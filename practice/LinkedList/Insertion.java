import java.util.*;
class LinkedList{
	private class node{
		int data;
		node next;
		node(){
			data=0;
			next=null;
		}
		node(int item){
			data=item;
			next=null;
		}
	}
	 private node head,tail;
         private int size=0;
         public void display(){
		 node temp=this.head;
                 while(temp!=null){
			 System.out.print(temp.data+" ");
                         temp=temp.next; 
		 }
		 System.out.println(" First: "+this.head.data+" last:"+this.tail.data);

	 }
	 public void addFirst(int item){
		node temp=new node(item);
		temp.next=this.head;
		this.head=temp;
		if(size==0) this.tail=temp;
		this.size++;
	 }		
         public void addLast(int item){
		 node temp=new node(item);
			 if(this.head == null){
				 this.head=temp;
			 }	 
                         else{
                                this.tail.next=temp;
                         }       
                         this.tail=temp;
			 this.size++;
			 temp=null;
	 }
	 public int middleElement(){
		 node temp=this.head;
		 int mid=this.size/2;
		 int i=0,count=-1;
		 while(i<=mid){
			count=temp.data;
			temp=temp.next;
			i++;
		 }
		 return count;
	 }
	 public int FasterMid(){
		 node slow=this.head;
		 node fast=this.head;
		 while(fast.next!=null && fast.next.next!=null){
			 slow=slow.next;
			 fast=fast.next.next;
		 }System.out.println(slow.next);
		 return slow.data;
	 }
}
public class Insertion{
       public static void main(String[] args){
	       LinkedList list=new LinkedList();
	       Scanner cin=new Scanner(System.in);
	       int n=cin.nextInt();
	       for(int i=0;i<n;i++){
		       list.addLast(cin.nextInt());
	       }
	       list.display();
	       System.out.println(list.middleElement());
	       list.addFirst(100);
	       list.addLast(200);
	       list.display();
	       System.out.println("Faster Mid: "+list.FasterMid());

       }
}


