import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;//think about your parenyts are so hardworking waj
  class Students implements Comparable<Students>,Iterator<Integer>{



  	public int next(){
	return 
}

public int hasnext(){
	return 
}
	public String  name;//inner classes couls be privvate
	 public int rollno;
	 public int cgpa;
public String toString(){
return name+" "+rollno+" "+cgpa;//since comparable class does not all
}
public int compareTo(Students s){
	return rollno-s.rollno;

}
}
/*
class comp implements Comparator<Students>{
public int compare(Students s1,Students s2){
return s2.name.compareTo(s1.name);
}
}
*///made a class implement 
/*
 class  it implements Iterator<Integer>{
//to use iterator we need a class which implements iterator


}
*/
public class sorts{
	public static void main(String []args){

List<Students>l=new ArrayList<>();
Students []o=new Students[100];

		for(int i=0;i<2;i++){
o[i]=new Students();
}		Scanner ob=new Scanner(System.in);

		for(int i=0;i<2;i++){
				o[i].cgpa=ob.nextInt();
o[i].rollno=ob.nextInt();
o[i].name=ob.next();
l.add(o[i]);
}
Collections.sort(l);//Collections.sort(l,new comp());
System.out.println(l);
Iterator<Integer>i=new it();
while(i.hasNext()){
System.out.println(i.next());
}
}
}	

