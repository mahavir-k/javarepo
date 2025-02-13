package arrays;
//Sum of array
/*import java.util.Scanner;
public class arr {
    public static void main(String[]args){
        System.out.print("Enter the size of array:");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        int sum=0;
        for(int a=0;a<n;a++){

            sum=sum+ar[a];
        }
        System.out.print("Sum of two "+sum);
    }
}*/

//Read an array of n length and print the max of all elements.
/*import java.util.Scanner;
public class arr{
    public static void main(String[]args){
        System.out.println("Enter the size of array:");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();

        }
        int max=ar[0];
        for(int i=0;i<n;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println("Maximum value is:="+max);
    }
}*/


//Array with function

/*public class arr{
    public static void main(String[]args){
        int[] ar={10,20};
        System.out.println("Given value is="+ar[0]+" and "+ar[1]);
        swap(ar);
        System.out.println(ar[0]+" and "+ar[1]);
        //System.out.println(ar[1]);
    }
    public static void swap(int[]a){
        int temp=a[0];
        a[0]=a[1];
        a[1]=temp;
    }
}*/

/*import java.util.Scanner;
public class arr{
    public static void main(String[]args){
        System.out.println("Enter the size of arrays:");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        swap(ar);
        System.out.println("Swap value is= "+ar[0]+" and "+ar[1]);
        //System.out.println(ar[1]);
    }
    public static void swap(int[]a){
        int temp=a[0];
        a[0]=a[1];
        a[1]=temp;
    }
}*/

//Given array of length n and two indexes index 1 and index 2 swap the elements of those two indexes
/*import java.util.Scanner;
public class arr {

    public static void main(String[] args) {
        System.out.print("Enter the array size=");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int idx1 = scn.nextInt();
        int idx2 = scn.nextInt();

        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/



//Given array of length n Reverse the whole array
/*import java.util.Scanner;
public class arr{
    public static void main(String[]args){
        System.out.print("Enter the size of array=");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        reverse(ar);
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void reverse(int[]ar){
        int s=0;
        int en=ar.length-1;
        while(s<en){
            int temp=ar[s];
            ar[s]=ar[en];
            ar[en]=temp;
            s++;
            en--;
        }
    }
}*/


//Reverse part of array
/*import java.util.Scanner;
public class arr{
    public static void main(String[]args){
        System.out.print("Enter the size of array=");
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        int s=scn.nextInt();
        int e=scn.nextInt();
        reversePart(ar,s,e);
        for(int a=0;a<n;a++ ){
            System.out.print(ar[a]+" ");
        }
    }
    public static void reversePart(int[]ar,int s,int e){
        int sp=s;
        int en=e;

        while(sp<en) {
            int temp = ar[sp];
            ar[sp] = ar[en];
            ar[en] = temp;
            sp++;
            en--;
        }
    }
}*/

//Rotate array
//Given n elements rotate array from last to first by k times:


/*import java.util.Scanner;
public class arr{
    public static void main(String[]args){
        System.out.print("Enter the size of array=");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        System.out.print("Enter the value of k=");
        int k=scn.nextInt();
        k=k%n;
        reversePart(ar,0,n-1);
        reversePart(ar,0,k-1);
        reversePart(ar,k,n-1);
        System.out.print("Rotate array is..:");
        for(int a=0;a<n;a++){
            System.out.print(ar[a]+" ");
        }

    }
    public static void reversePart(int[]ar,int s,int e){
        int sp=s;
        int en=e;
        while(sp<en) {
            int temp = ar[sp];
            ar[sp] = ar[en];
            ar[en] = temp;
            sp++;
            en--;
        }
    }
}*/

//Given N array elements count total number of elements having atleast 1 elements greater than itself.

/*import java.util.Scanner;
public class arr{
    public static void main(String[]args){
        System.out.print("Enter the length of array=");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        int max=ar[0];
        for(int i=0;i<n;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(ar[i]==max){
                count++;
            }
        }
        System.out.println("Maximum count of maximum number is="+(n-count));
    }
}*/

//Given n array elements check if there exists a pair (i,j)such that ar[i]+ar[j]==k and i!=j

/*import java.util.Scanner;
public class arr{
    public static void main(String[]args){
        System.out.print("Enter the Size of array=");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        System.out.print("Enter the value of k=");
        int k=scn.nextInt();
        System.out.print(twosum(ar,k));
    }
    public static boolean twosum(int[]ar, int k){
        int n=ar.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]+ar[j]==k){
                    return true;
                }
            }
        }
        return false;

    }
}*/

//Given array[N] find max of arr[i]-arr[j]
/*import java.util.Scanner;
public class arr{
    public static void main(String[]args){
        System.out.print("Enter the size of Array=");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        System.out.print("Result is="+maxdifference_1(ar));
    }
    public static int maxdifference_1(int[]ar){
        int min= ar[0]; //Integer.MAX_VALUE;
        int max= ar.length-1; //Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return max-min;
}
}*/

//Given N array elements find i,j such that ar[i]+ar[j]+i-j is max
/*import java.util.Scanner;
public class arr{
    public static void main(String[]args){
        System.out.print("Enter the size of Array=");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        arr a=new arr();
        System.out.println("Result is="+a.maxdifference_1(ar));

    }
    public  int maxdifference_1(int[]ar){
        for(int i=0;i<ar.length;i++){
            ar[i]=ar[i]+i;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];

            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return max-min;
    }
}*/

//Given N array elements find i,j such that ar[i]-ar[j]+j-i is max;
/*import java.util.Scanner;
public class arr{
    public static void main(String[]args){
        System.out.print("Enter the size of the array=");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        System.out.print("Result is="+maxdifference_1(ar));

    }
    public static int maxdifference_1(int[]ar){
        for(int i=0;i<ar.length;i++){
            ar[i]=ar[i]-i;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return max-min;


    }
}*/

//>>>>>>>>>>>>>>>>>>.................
/*import java.util.Scanner;
public class arr{
    public static void main(String[]args){
        System.out.println("Enter the value of array=");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        duplicate(ar);
        System.out.print()

    }
    public static void duplicate(int[]ar){
        int count,val,db_val=0,db_count=0;
        for(int i=0;i<ar.length-3;i++){

            if(ar[i]==ar[i+1]&&ar[i+1]==ar[i+2]){
                 count=3;
                val=ar[i];
            }
             else if (ar[i]==ar[i+1]) {
                 count=ar[i];
                 val=2;
            } else if (ar[i+1]==ar[i+2]) {
                 count=ar[i+1];
                 val=2;

            }
             else{
                 count=ar[i];
                 val=1;
            }
             if(val>db_val){
                 db_val=val;
                 db_count=count;
             }
        }
        System.out.println(db_val+" "+db_count);
    }
}*/

