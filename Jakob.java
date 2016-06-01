package DetyratGjateJaveve;
//Algorithm of Jacob in java
import java.util.Scanner;
public class Jakob {
    public static double norma(double[] x, double[] x0, int n)
    {
     double max = 0;
     for(int i =0; i<n; i++)
     {
      if(Math.abs(x[i] - x0[i])<=max)
      {
       max = Math.abs(x[i] - x0[i]);
      }
     
     }
     return max;
    }
   
    public static String ktheX(int n, double[][] A, double[] B, double[] x0, double TOL, int NO)
     {
      int k = 1;
      double[] x = new double[n];
      double shuma =0;
      while( k<=NO)
      {
       for(int i =0; i <n; i++)
       {
        for(int j =0; j < n; j++)
        {
         if(i!=j){ shuma += A[i][j]*x0[j];}
        }
       x[i] = (-shuma + B[i])/A[i][i];
       shuma = 0;
        }
       double normale = norma(x, x0, n);
       if(normale>TOL)
       {

           System.out.print(k + ". ");
           for(int t = 1; t <=n; t++)
           {
             System.out.print("x" +t +" = " + x[t-1] +  " , ");
           }
           System.out.println();
          }
         k = k+ 1;
          for(int p =0; p <n; p++)
          {
           x0[p] = x[p];
        }
      }
      return "Numri i iteracioneve ka tejkaluar " + k;
     }
    
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
      System.out.println("Jepni vleren e n-se: ");
        int n = input.nextInt();
     double[][] A = new double[n][n];
     System.out.println("Jepni vlerat e matrices katrore te rendit " + n + ": ");
      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
             A[i][j] = input.nextDouble();   

            }
           }
     double[] B = new double[n];
     System.out.println("Jepni vlerat e gjymtyreve te lire te sistemit te ekuacioneve te rendit " + n + ": ");
      for(int t = 0; t < n; t++){
          B[t] = input.nextDouble();
      }
     double[] x0 = new double[n];
     System.out.println("Jepni e vektorit fillestar te rendit " + n + ": ");
      for(int k = 0; k < n; k++){
          x0[k] = input.nextDouble();
      }
      System.out.println("Jepni vleren e TOL -it: ");
     double TOL = input.nextDouble();
     System.out.println("Jepni vleren e N0-se: ");
     int NO = input.nextInt();
     System.out.println("rezultati: " + ktheX(n, A, B, x0, TOL, NO));
    }
}

