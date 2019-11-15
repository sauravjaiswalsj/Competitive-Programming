import java.util.*;
class LinkedList{
	private class node{
		int data;
		node next;
		node(){
			this.data=0;
			this.next=null;
		}
		node(int item){
			this.data=item;
			this.next=null;
		}
	}
	private node head,tail;
	private int size=0;
	public void atBeg(int data){
		node temp=new node(data);
		temp.next=this.head;
		if(this.size==0) this.tail=temp;
		this.head=temp;
		this.size++;
	}
	//5->10->null
	//5->10->15->null
	public void atEnd(int data){
		node temp=new node(data);
		if(this.head==null){
			this.head=temp;
		}else{
			this.tail.next=temp;
		}
		this.tail=temp;
		this.size++;
	}
	public void atMiddle(int data,int index){
		node temp=new node(data);

	public void display(){
		node temp=new node();
		temp=this.head;
		while(temp!=null){
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
}
public class InsertionAtMid{
	public static void main(String[] args){
		LinkedList list=new LinkedList();
		list.atBeg(10);
		list.atBeg(5);
		list.atEnd(15);
		list.display();
	}
}
