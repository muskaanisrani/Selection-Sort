import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the length of the array");
  int y=0;
  int n=sc.nextInt();
  int arr[]=new int[n];
  for (int x=0;x<=n-1;x++) {
    System.out.print("enter the numbers of the array");
     arr[x]=sc.nextInt();
  }
 for (int i=0;i<n-1;i++) {
   int min=arr[i];
   int position=i;
   for (int j=i+1;j<=n-1;j++) {
     if (arr[j]<min) {
       min=arr[j];
       position=j;
     }
   }
   int x=0;
   x=arr[i];
   arr[i]=arr[position];
   arr[position]=x;
 }

  for (int s=0;s<=n-1;s++) {
  System.out.print(arr[s]+",");
}
  }
}
