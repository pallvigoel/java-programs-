import java.util.Queue;
interface abc{
int x=10;
int fun();//these are return type//these functions must be defined in classesimplementin//these are by their own 
}
abstract class c{
	int x;
	public abstract void fun();
abstract void f1();
}

class b extends c{
int y;
void f1(){
				System.out.println("hello");
	}
public void fun(){

		System.out.println("bye");
}

}//

public class Abstr extends c{//will it implements 
int y;
//why do i need to implement

public void fun(){

		System.out.println("bye");
}

void f1(){
				System.out.println("hello");
	}
public static void main(String []args){
Abstr ob=new Abstr();
ob.f1();
}
}
