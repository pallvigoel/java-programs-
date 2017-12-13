import java.util.Scanner;
import java.util.*;
class Student implements Comparable<Student>{
	String  name;
	int rollno;
	int cgpa;
	int ei;
	Student(){
	ei=-1;	
	}
	/*
	public int compareTo(Student o){
if(cgpa==o.cgpa)
	return 0;
else if(cgpa>o.cgpa)
	return 0;
else
return -1;
}
public String toString(){
return(name+" "+rollno+" "+cgpa);
}
*/
/*
void swap(Student a,Student b){
	Student t=a;
	a=b;
	b=t;
} 

void percolateup(int index,Student arr[]){
	if(index<=0)
		return;
	if(arr[index].compareTo(arr[(index-1)/2])==1)
		{swap(arr[index],arr[(index-1)/2]);
	    percolateup((index-1)/2,arr);}
}
void insert(Student arr[],String n,int r,int c){
if(ei<100){(){

	ei++;
	arr[ei].name=n;
	arr[ei].rollno=r;
	arr[ei].cgpa=c;
	percolateup(ei,arr);
}
}*/

void print(){
	System.out.println(this);
}
class comp<Student>implements Comparator{

public int compare(Student s1,Student s2){
return s1.name.compareTo(s2.name);
}



}
}
public static void main(String []args){
	
	Student [] o=new Student[100];
	int i;
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		for( i=0;i<n;i++){
o[i]=new Student();
		
}
for( i=0;i<n;i++){

		o[i].name=ob.next();
		o[i].rollno=ob.nextInt();
		o[i].cgpa=ob.nextInt();

		o[i].percolateup(i,o);
}

Collections.sort(o,comp);
o[0].print();
	}
}
}

//sorting in java