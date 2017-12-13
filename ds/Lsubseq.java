import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lsubseq{
//int ar[]={1,2,3,4};
int g[][];
 String s1=new String("aebayfmo");
  String s2=new String("babemeo");
  
int c=0;
public int max(int a,int b){
	if(a>b)
		return a;
	else
		return b;
}
public int Lsubr(int j,int i ){
	if(i<0||j<0)
	{
	 	System.out.println("hii");
		return 0;
	 }
	 if(s1.charAt(j)==s2.charAt(i)){

	 	System.out.println("bii");
	return(1+Lsubr(j-1,i-1));

}
else if(s1.charAt(j)!=s2.charAt(i)){	 //if(i==1){
	 	System.out.println("hii");
	 return(max(Lsubr( j, i-1 ),Lsubr(j-1,i )));
	 
	
}
}

	 //if(s1.charAt(j)==s2.charAt(i)){
	 		//return (1+Lsubr(j-1,i-1));//it is the main function from which it has been called
	 	
	 	/*return 1;
	 if(s1.charAt(j)==s2.charAt(i)){
	 	return 1;
	if(i>0&&j>0){

	 }
	 */
	 /*else{
	 
	 */
//return c;



/*
public void Lsub( ){
g=new int [s1.length()][];
for(int i=0;i<s1.length();i++)
g[i]=new int[s2.length()];

for(int j=0;j<s1.length();j++){
for(int i=0;i<s2.length();i++){
g[j][i]=0;
}
}


for(int j=0;j<s1.length();j++){
		boolean f=false;
for(int i=0;i<s2.length();i++){


//it is the current maximum until or unless if our string has not matched ith character

	 if(s1.charAt(j)==s2.charAt(i)&&(j==0||i==0)){
g[j][i]=1;
f=true;
}
	 else if(s1.charAt(j)==s2.charAt(i)&&j>0&&i>0){
g[j][i]=g[j-1][i-1]+1;
f=true;
}
 if(s1.charAt(j)==s2.charAt(i)&&j>0&&i>0){
g[j][i]=g[j-1][i-1]+1;
f=true;
}
if(s1.charAt(j)!=s2.charAt(i)&&j>0&&f==false)
g[j][i]=g[j-1][i];
 if(s1.charAt(j)!=s2.charAt(i)&&f==true&&i>0)
g[j][i]=g[j][i-1];
}


//g[j][i]=g[j][i-j]+g[j-1][i];

}
}

public void print(){
	for(int i=0;i<s1.length();i++){
		for(int j=0;j<s2.length();j++){
System.out.print(g[i][j]+" ");
}
System.out.println(" ");
}
}
*/
public static void main(String []args){
 Lsubseq ob=new  Lsubseq();
int s;
 //Scanner ob2=new Scanner(System.in);//
//ob.Lsub();
s=ob.Lsubr(ob.s1.length()-1,ob.s2.length()-1);
System.out.print(s);
//ob.print();

}
}