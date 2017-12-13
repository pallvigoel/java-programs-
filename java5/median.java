 import java.util.Scanner;
import java.util.*;
public class median
{
public double[] calmed(int a[]){
double[]res=new double[a.length];

PriorityQueue<Integer>higher=new PriorityQueue<Integer>();      
PriorityQueue<Integer>lower=new PriorityQueue<Integer>(new Comparator<Integer>(){
public int compare(Integer a,Integer b){
    return -1*a.compareTo(b);
}
}
);
for(int j=0;j<a.length;j++){
    addelement(lower,higher,a[j]);
    rebalance(lower,higher);
res[j]=median1(lower,higher);
}
return res;
}

double median1(PriorityQueue<Integer>lower,PriorityQueue<Integer>higher){
PriorityQueue<Integer>lowersize=lower.size()<higher.size()?lower:higher;
PriorityQueue<Integer>highersize=lower.size()<higher.size()?higher:lower;
if(lower.size()==higher.size()){
    return(lower.peek()+higher.peek())/2;
}
else{
return highersize.peek();
}
void addelement(PriorityQueue<Integer>lower,PriorityQueue<Integer>higher,int a){
if(lower.size()==0)
lower.add(a);
else if(lower.peek()>a)
lower.add(a);
else
higher.add(a);
}
void rebalance(PriorityQueue<Integer>lower,PriorityQueue<Integer>higher){
PriorityQueue<Integer>lowersize=lower.size()<higher.size()?lower:higher;
PriorityQueue<Integer>highersize=lower.size()<higher.size()?higher:lower;
if(highersize.size()-lowersize.size()>=2)
    lowersize.add(highersize.poll()); 
}public static void main(String[] args) 
    {
    
        median obj=new median();
       Scanner ob=new Scanner(System.in);

int t=ob.nextInt();
int []a=new int[t];
for(int i=0;i<t;i++)
{
    a[i]=ob.nextInt();
}
}

double b[]=obj.calmed(a);
    for(int i=0;i<b.length;i++)
        System.out.println(b[i]);
}
}



