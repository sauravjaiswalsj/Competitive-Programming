import java.util.Scanner;
class Box{
	int width,height,depth;
	Box(int w,int h,int d){
		width=w;
		height=h;
		depth=d;
	}
	Box(){//default constructor
		this.width=-1;
		this.height=-1;
		this.depth=-1;
	}
	Box(Box ob){// passing object - copy constructor
		this.width=ob.width;
		this.height=ob.height;
		this.depth=ob.depth;
	}
	double vol(){
		return width*height*depth;
		}
}     		      
public class PassingObjects{
	public static void main(String[] args){
		Box ob1=new Box();
		Box ob2=new Box(10,20,30);
		Box ob3=new Box(ob2);//clone object 2
		System.out.println(ob2.width+" "+ob2.height+" "+ob2.depth);
		System.out.println(ob3.width+" "+ob3.height+" "+ob3.depth);
		ob2=null;
		ob2=new Box(100,200,300);
		System.out.println(ob2.width+" "+ob2.height+" "+ob2.depth);

	}
}	

