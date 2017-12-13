 import java.util.Scanner;
public class Heap2 
{
    int arr[];
     int arr2[];
    int endIndex;
    Heap2()
    {
        arr=new int[100];
   arr2=new int[100];
        endIndex=-1;
        endIndex2=-1;
    }
    void insert(int i,int k)
    {
int x;
        if(endIndex<100)
        {
            endIndex++;
        arr[endIndex]=i;
 return i;
        }
        else{
       if( arr[0]<i){//starting from  mAX heaP
        
arr[endIndex]=i;

 proclateUp(arr,endIndex);
 endIndex++;
}
else {
if(endIndex2<100)
            endIndex2++;
arr2[endIndex2]=i;

 proclateUp(arr2,endIndex2);
 endIndex2++;
}
if( endIndex-endIndex2>1){            
x=delete(arr,endIndex);
insert(x,k);
}
else{
 x=delete(arr2,endIndex2);
insert(x,k);
}
int  y=median(k);

return y;
}
      }
    
    int median(int  n){
int t;
if((n+1)%2==0)
{
if(endIndex2>=0&&endIndex>=0)
t=(arr[0]+arr2[0])/2;
if(endIndex2>=0)
return(arr2[endIndex2]);
if(endIndex>=0)
return(arr[0]);
if(endIndex2>=0)
return(arr2[0]);
}
else{
if(endIndex2>=0&&endIndex>=0){
t=arr2[0];
return t;
}
if(endIndex2>=0)
return(arr2[0]);
if(endIndex>=0)
return(arr[0]);
}

    }
    void proclateUp(int arr[],int index)
    {
        if(index<=0)
            return;
        if(arr[index]>arr[(index-1)/2])
        {
            int t=arr[index];
            arr[index]=arr[(index-1)/2];
            arr[(index-1)/2]=t;
            proclateUp((index-1)/2);
        }
    }
    int delete(int arr[],int eindex)
    {
        int temp=arr[0];
        arr[0]=arr[index-1];
        index--;
        proclateDown(arr,0,-1,eindex);
        return temp;
    }
    int leftChild(int i,int ei)
    {
        int p=-1;
        if(i>=0 && i<=ei)
            p=2*i+1;
        return p;
    }
    int rightChild(int i,int ei)
    {
        int p=-1;
        if(i>=0 && i<=ei)
            p=2*i+2;
        return p;
    }
    void proclateDown(int arr[],int index,int max,int ei)
    {
        int l=leftChild(index,ei);
        int r=rightChild(index,ei);
        if(l==-1)
            return;
        max=0;
        if(r!=-1 && arr[r]>arr[max])
            max=r;
           if(l!=-1 && arr[l]>arr[max])
            max=l;
        if(arr[max]>arr[index])
        {
            int t1=arr[max];
            arr[max]=arr[index];
            arr[index]=t1;
            proclateDown(arr,index,max,ei);
        }
    }
  

    void display()
    {
        for(int i=0;i<=endIndex;i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) 
    {
        Heap2 obj=new Heap2();
       Scanner ob=new Scanner(System.In);
int t=ob.nextInt();
for(int i=0;i<t;i++)
{
    int y=ob.nextInt();
 int k=obj.insert(y,i);
 System.out.println(k);
}

    
}
}



