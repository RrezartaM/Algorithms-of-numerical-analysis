package DetyratGjateJaveve;
import java.util.*;
//Algorithem of Gauss Seidel iteration in Java
public class GaussSEIDEL {
    
    public static double ktheNorma(double[] x, double[] x0, int n)
    {
     double max = 0;
     for(int u =0; u<n; u++)
     {
      if(Math.abs(x[u] - x0[u]) <= max)
      {
       max = Math.abs(x[u]-x0[u]);
      }
     }
     return max;
    }
    public static String ktheGausSeidel(int n ,double[][] A, double[] b, double[] x0, double TOL,int N)
    {
     int k =1;
     double shuma =0;
     double shuma1 =0;
     double[] x = new double[n];
     while( k <= N)
     {
      for(int i =0; i<n; i++)
      {
       for(int j = 0; j < i-1; j++)
       {
        shuma += A[i][j]*x[j];
       }
       for(int j = i+1; j<n; j++)
       {
        shuma1 += A[i][j]*x0[j];
       }
       x[i] = (-shuma - shuma1 + b[i])/A[i][i];
       //shuma = 0;
      // shuma1 =0;
      }
      double norma = ktheNorma(x, x0, n);
      if(norma<TOL)
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
     return "Numri i iteracioneve u tejkalua" + k; 
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
     double[] b = new double[n];
     System.out.println("Jepni vlerat e gjymtyreve te lire te sistemit te ekuacioneve te rendit " + n + ": ");
      for(int t = 0; t < n; t++){
          b[t] = input.nextDouble();
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
     System.out.println("Zgjidhjet jane: ");
     System.out.println(ktheGausSeidel( n , A, b,  x0,TOL,NO));
    }
}
