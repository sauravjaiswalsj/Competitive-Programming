import java.util.*;
class LinkedList{
	private class node{
		int data;
		node next;
		node(){
			data=0;
			next=null;
		}
	}
	private node head;
	private node tail;
	private int size=0;
	public void display(){
		node temp=this.head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void addLast(int item){
		node temp=new node();
		temp.data=item;
		temp.next=null;
		if(this.size>=1){
			this.tail.next=temp;
		}
		if(this.size==0){
			this.head=temp;
			this.tail=temp;
		 	this.size++;
		}
		else{
			this.tail=temp;
			this.size++;
		}
		temp=null;
	}
	public int MiddleElement(){
		node temp=this.head;
		int item=0,i=0;
		int mid=this.size/2;
		System.out.println("MId: "+mid);
		while(i<=mid){
			System.out.println(temp.data);
			item=temp.data;
			temp=temp.next;
			i++;
		}
		return item;
	}
	/*
	public void reverse(){
		node temp1,temp2;
		temp1=temp2=this.head;
		temp2.next=null;
		while(temp1!=null){
			temp1=temp1.next;
			temp2=temp1;
			temp2.next=temp1.next;
		}
		while(temp2!=null){
			System.out.println(temp2.data);
			temp2=temp2.next;
		}
	}*/
	public void reverse(){
		node ptr1,start,ptr;
		ptr=start=this.head;
		ptr1=null;
		while(start!=null){
			ptr=start;
			start=start.next;
			System.out.print(ptr.data+" ");
			ptr.next=ptr1;
			ptr1=ptr;
		}
		while(ptr1!=null){
			System.out.println(ptr1.data);
                        ptr1=ptr1.next;
                }
	}
}
public class LinkedListClass{
	public static void main(String[] args){
		LinkedList list=new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		//list.reverse();
		list.addLast(40);
		list.addLast(50);
		list.reverse();
	  	//list.display();	
		//System.out.println("Middle element : "+list.MiddleElement());	
	}
}

