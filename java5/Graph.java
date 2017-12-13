import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Graph{
	/*
void addedge(ArrayList<ArrayList<Integer>>mat,int s,int d){
mat.get(s).set(d,1);
}
*/
public static void main(String []args){
	Scanner ob=new Scanner(System.in);
	int v=ob.nextInt();
ArrayList<ArrayList<Integer>>mat=new ArrayList<ArrayList<Integer>>(v);//created a 
//collections.ncopies

Graph g=new Graph();
for(int i=0;i<v;i++){
	mat.add(new ArrayList<Integer>());
}
}

for(int i=0;i<v;i++){
for(int j=0;j<v;j++){
mat.get(i).add(1);//formation of jagged array that is we formed the jagged array
}
for(int i=0;i<v;i++){
for(int j=0;j<v;j++){	
System.out.println(mat.get(i).get(j));
}
}

/*
System.out.println(mat.get(0).size());
for(int i=0;i<v;i++){
for(int j=0;j<v;j++){	
	mat.get(i).add(0);//initials the 
}
}
for(int i=0;i<v;i++){
for(int j=0;j<v;j++){	
System.out.println(mat.get(i).get(j));
}
}


for(int i=0;i<v;i++){
for(int j=0;j<v;j++){	
	mat.get(i).set(j,1);//initials the 
}
}

int d=0,s=0;
for(int i=0;i<8;i++){
s=ob.nextInt();
 d=ob.nextInt();
System.out.println("next edge");
g.addedge(mat,s,d);
	}

for(int i=0;i<v;i++){
for(int j=0;j<v;j++){
	System.out.print(s);
		System.out.print(d);
System.out.println(mat.get(i).get(j));
}
}
*/
	/*
	for(ArrayList<<ArrayList<Integer>>k:mat){
	for(Integer t:k){
System.out.println(t);		
	}
}
*/
}
}
