
 class c{
 	//c is base class
 void fun(){//private functions are not binherited

		System.out.println("hii");
}	
}//return 
public class F extends c{
int y;
//will super it run only while overiding

void fun(){
	super.fun();

		System.out.println("bye");
}

void f1(){
				System.out.println("hello");
	}
public static void main(String []args){

F ob=new F();
ob.fun();//(b)ob.fun()//downcasting possible only when base class obhas refernce of derived object
/*
c ob=new F();
////ob=o;//base class me derived class ka ob
//o=ob;
F ob1=(F)ob;
ob1.f1();
*/
//(F)c.f1();//as c class does not contain functionslike f1( because we are downcasting)base me chotta dal do
//this not runncing
/*F ob=new F();
ob.fun();
*/
}
}