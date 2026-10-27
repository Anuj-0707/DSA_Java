package Arrays;
public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] a ={1,2,4,6,7,8,9};
        int[] b ={3,5,8,9,9,10,11,45};
        int toatal_size = a.length+b.length;
        int[] c = new int[toatal_size];
        merge(a, b, c);
        print(c);
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        if(i==a.length){
            while(j<b.length){
                c[k++]=b[j++];
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k++]=a[i++];
            }
        }
    }
    public static void print(int[] x){
        for(int t=0;t<x.length;t++){
            System.out.print(x[t]+" ");
        }
    }
}