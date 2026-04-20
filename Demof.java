import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class Demof
{     
   
     private void ms(int a[],int l,int h){
      int mid; 
      if(l<h){
        mid=l+((h-l)/2);
        ms(a, l, mid);
        ms(a, mid+1, h);
        merge(a, l, mid, h);
      }
     }
     private void merge(int a[],int l,int m,int h){
       int i=l,k=l;
       int j=m+1;
       int b[]=new int[h+1];

       while (i<=m && j<=h){
          if(a[i]<a[j]){
            b[k++]=a[i++];
          }else{
            b[k++]=a[j++];
          }
       }
       while (i<=m) {
        b[k++]=a[i++];
       }
       while (j<=h) {
         b[k++]=a[j++];
       }
       for(int x=l;x<=h;x++){
         a[x]=b[x];
       }  
       //System.arraycopy(b, l, a, l, (h-l)+1);     
     }
     private void swap(int a[],int i,int j){
      int temp=a[i];
      a[i]=a[j];
      a[j]=temp;
     }
      public static void main(String[] args) { 
      
       int a[]={35,50,15,25,80};
       Demof obj=new Demof();
       obj.ms(a, 0, a.length-1);
       for(int x:a){
        System.out.print(x+" ");
       }
      }
}