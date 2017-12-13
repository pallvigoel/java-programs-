import java.util.Queue;
/*interface abc{
int x=10;
int fun();//these are return type//these functions must be defined in classesimplementin//these are by their own 
}
*/
class c{
	int x;
	 private void fun(){
	 	System.out.println("helloe");
	 }
	 void f2(){
	 	System.out.println("helloe");
	 }

		}
 class b extends c{

public void fun(){

		System.out.println("bye");//as we are able to change its functanility
}

}

 class d extends b{

 private void fun(){

		System.out.println("bye");//as we are able to change its functanility//since here its mode is
}
}

public class Abs {//will it implements 
int y;
//why do i need to implement
/*
public void fun(){

		System.out.println("bye");
}
*/
/*

void f1(){
				System.out.println("hello");
	}
	*/
public static void main(String []args){
d ob=new d();
ob.fun();
}
}