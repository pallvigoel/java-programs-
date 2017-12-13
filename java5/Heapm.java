import java.util.Iterator;
import java.lang.Iterable;
import java.util.Scanner;
public class Heapm {
	int a[];
	int ei;
	Heapm()
{
	a=new int[100];
	ei=0;
}
void print(){
int i;
for(i=0;i<=ei;i++)
{
	System.out.println(a[i]);
}
}

void swap(int i,int n){
	int t;
t=a[i];
a[i]=a[n];
a[n]=t;
}
int leftchild(int i){
int t=-1;
if(i>=0&&i<=(ei-1)/2)
{
	t=(2*i)+1;
}
return t;
}
int rightchild(int i){
	int t=-1;
if(i>=0&&i<=(ei-2)/2)
{t=(2*i)+2;
}
return t;
}
void delete(int i){
//	swap(i,n);//be educatSSSional
		

		int t,m=i;
t=a[i];
a[i]=a[ei];
a[ei]=t;

if(leftchild(i)==-1)
	return;
if(a[i]<leftchild(i)){

m=leftchild(i);
}
if(rightchild(i)!=-1&&a[m]<rightchild(i)){
m=rightchild(i);
}
if(a[m]==a[i])
return;
t=a[i];
a[i]=a[m];
a[m]=t;

delete(m);
}

void percolate(int ei){
int t;
	if(ei<=0)
		return;
if(a[ei]>a[(ei-1)/2]){
 t=a[ei];

a[ei]=a[(ei-1)/2];
a[(ei-1)/2]=t;
percolate((ei-1)/2);
}
}
void insert(int b){
a[ei]=b;
percolate(ei);
ei++;
}

public static void main(String []args){
Heapm ob=new Heapm();
int b,f,i;
int n[]={0};
ob.insert(100);
ob.insert(19);
ob.insert(36);
ob.insert(17);
ob.insert(3);
ob.insert(25);
for(i=0;i<5;i++){
n[i]=ob.a[0];
ob.delete(0);
ob.ei--;
ob.print();
}

/*a
student


package heap;
class Heap3 
{
    Student arr[];
    int endIndex;
    Heap3()
    {
        arr=new Student[100];
        endIndex=-1;
    }
    void insert(Student i)
    {
        if(endIndex<100)
        {
            endIndex++;
            arr[endIndex]=i;
            proclateUp(endIndex);
        }
    }
    void proclateUp(int index)
    {
        if(index<=0)
            return;
        if(arr[index].compareTo(arr[(index-1)/2])>0)
        {
            Student t=arr[index];
            arr[index]=arr[(index-1)/2];
            arr[(index-1)/2]=t;
            proclateUp((index-1)/2);
        }
    }
    void display()
    {
        arr[0].toString();
    }
}
public class Student implements Comparable<Student>
{
    int roll;
    String name;
    float cgpa;
    Student( int r,String n,float c)
    {
        roll=r;name=n;cgpa=c;
    }
    @Override
    public int compareTo(Student o) 
    {
        if(cgpa==o.cgpa)
            return 0;
        else if(cgpa>o.cgpa)
            return 1;
        else
            return -1;
    }
    public String toString()
    {
        return (roll+" "+name+" "+cgpa);
    }
    public static void main(String[] args) 
    {
        Heap3 o=new Heap3();
        o.insert(new Student(1111,"Rob",9.8f));
        o.insert(new Student(1234,"Ozge",7.4f));
        o.insert(new Student(9768,"Jim",9.2f));
        o.insert(new Student(1981,"Zanny",8.9f));
        o.display();
    }  
}
*/
  int min( int n){
    int i,s,t=10000;
    i=n-1;
    while(i>=(n/2)){
        if(arr[i]<arr[i-1])
        s=arr[i];
    else
        s=arr[i-1];
        if(s<t)
            t=s;
        
i=i-2;
    }
    return t;
    
    
}

/*
for(i=0;i<5;i++)
System.out.println(n[i]);
*/
//ob.print();
/*
int a[]={5,7,9,3,6,11};
int i;
int j,t,p;
for(i=1;i<6;i++){
	p=(i-1)/2;
	if(a[p]<a[i]){
t=a[p];
a[p]=a[i];
a[i]=t;
}

	//swap(a[i],a[p]);

j=p;
System.out.println(j);
while(j>0){
t=(j-1)/2;
	if(a[t]<a[j]){
int r=a[t];
a[t]=a[j];
a[j]=r;
j=t;
}
else
break;
}
*/

}

}