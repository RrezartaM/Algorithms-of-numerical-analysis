package DetyratGjateJaveve;


//NormaInfinitEX is used in method of Newton 

import java.util.*;


public class NormaInfinitEX {
  public static double ktheNorme(int n, double[] x)
  {
   double max = 0;
   for(int i =0; i<n; i++)
   {
    if(x[i] >= max)
    {
     max = x[i];
    }
   }
  return max;
  }
 public static void main(String[] args)
 {
  
    Scanner norma = new Scanner(System.in);
    System.out.println("Jepni rendin e vargut x");
    int n = norma.nextInt();
    double[] x = new double[n];
        System.out.println("Jepni vlerat e vargut x: ");
    for(int i =0; i <n; i++)
    {
     x[i] = norma.nextDouble();
    }
    System.out.println(ktheNorme(n, x));
 }
}
