import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int count,i=0,j=0,temp;
      int num[]=new int[100];
      System.out.println("Enter number of array elements :");
      count = sc.nextInt();
      for(i=0;i<count;i++){
          System.out.println("Enter array elements"+(i+1)+":");
          num[i]=sc.nextInt();

      }
      j=i-1;
      i=0;
      sc.close();
      while(i<j){
          temp=num[i];
          num[i]=num[j];
          num[j]=temp;
          j++;
          j--;
      }

      System.out.println("Reversed array is :");
      for(i=0;i<count;i++){
          System.out.println(num[i]+" ");
      }
    }
}
