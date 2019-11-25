class Test{
	public int a,b;
	Test(){
		a=-1;
		b=-1;
	}
	Test(int i,int j){
		a=i;
		b=j;
	}
	void mest(Test o){
		o.a*=2;
		o.b=2*2;
	}
	Test(Test ob){//copy constructor
		this.a=ob.a*2;
		this.b=2*2;
	}
}
public class PassbyRefernce{
	public static void main(String[] args){
		Test t=new Test(10,20);
		System.out.println(t.a+""+t.b);// 10, 20
		t.mest(t);	
		System.out.println(t.a+""+t.b);// 20, 4
		Test t2=new Test(t);//copy constructor
		System.out.println(t2.a+""+t2.b); // 0 , 0
		System.out.println(t.a+""+t.b);// 20, 4

	}
}


