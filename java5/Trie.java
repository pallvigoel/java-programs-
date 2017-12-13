import java.util.Scanner;
import java.util.*;
class Trinode{
	boolean endofnode;
	Trinode arr[]; 
Trinode(){
	arr = new Trinode[26];
for(int i=0;i<26;i++){
arr[i]=null;
endofnode=false;
}
}
boolean search(Trinode r,String a){  
int t;
int l=a.length();
	//for(int k=0;k<26;k++){
for(int i=0;i<l;i++){
t=a.charAt(i)-97;
			
		if(r.arr[t]==null)
			return false;//before function it occured
r=r.arr[t];
}
if(r.endofnode==false)
return false;
return true;
}// map ci
void insert(String a,Trinode r){
int l=a.length();
for(int i=0;i<l;i++){
if(r.arr[a.charAt(i)-97]==null)//searched it out there
{
	r.arr[a.charAt(i)-97]=new Trinode();;
}
r=r.arr[a.charAt(i)-97];

}
r.endofnode=true;
}
boolean delete(String s,Trinode r,int i){
if(r!=null){
if(s.length()==i){
	r.endofnode=false;
	for(int j=0;j<26;j++){
if(r.arr[j]!=null)
	return false;//deletenhi krna//that means you cannot delete it because that may bre prfix of some node
}
return true;
	}
else{
	int t=s.charAt(i)-97;//finsing insdex at each level
	r=r.arr[t];//r is treenode just like root//means previosly vala treue h
		boolean res=delete(s,r,i+1);
		if(res==true){//means delete it
			r.arr[t]=null;
for(int j=0;j<26;j++){
if(r.arr[j]!=null)
	return  false;//that means it is a prefix of some other string
}
if(r.endofnode==true)
	return false; //that means it is a valid string
return true;
}
}
}
return false; 
}
}
class Trie{
	public static void main(String[] args) {
Trinode root=new Trinode();
Scanner ob=new Scanner(System.in);
String a;
for(int i=0;i<5;i++){
a=ob.next();
root.insert(a,root);
}
root.delete("abc",root,0);
boolean k=root.search(root,"abc");
System.out.println(k);
}
}