package DetyratGjateJaveve;
//Interpolation and the Lagrange Polynomial

public class PolinomiInterpoluesILangranzhit {
    
    public static double[] ktheF(double[] x)
    {
     double[] f = new double[x.length];
     for( int i =0; i < x.length; i++){
     f[i] =Math.pow(Math.E,x[i]);// Math.log(x[i]);
     
     }
  
     return f;
    }
    public static double[] ktheDerivat(double[] x)
    {
        double[] t = new double[x.length];
      
     for(int i =0; i < x.length; i++){
      t[i] = Math.pow(Math.E,x[i]);//-(1/(Math.pow(x[i], 2)));
     }
    
     return t;
    }
    public static double ktheM(double[] x)
    {
       double[] t = ktheDerivat(x);
       double max = 0;
       for(int i =0; i < t.length; i++)
       {
        if(max <= t[i])
        {
         max = t[i];
        }
       }
      return max;
    }
    public static int ktheFaktoriel(int n)
    {
     int fak = 1;
     for(int i=1; i<=n; i++)
     {
      fak = fak* i;
     }
    return fak;
    }
    public static double ktheR(double x, double[] x0)
    {
     
     double M = ktheM(x0);
     double prodhimi = 1;
     for(int i =0; i < x0.length; i++)
     {
      prodhimi = prodhimi * x0[i];
     }
     int n = x0.length;
     int faktoriel = ktheFaktoriel(n+1);
     double R = (M/faktoriel) * prodhimi;
     
     return R;
    }
    public static double ktheZgjidhje(double[] x0,  double x)
    {
     double shuma = 0;
     double[] f = ktheF(x0);
     for(int i = 0; i < x0.length; i++){
      double prodhimi = 1;
      for(int j =0; j < x0.length; j++)
      {
        if( j != i)
        {
         prodhimi = prodhimi * (x - x0[j])/(x0[i] - x0[j]);
        }
      }
     shuma += prodhimi * f[i];
     }
    return shuma;
    }
    
   public static void main(String[] args)
   {
    double[] x0 = { 1.0, 1.1, 1.3,1.4};
    double x = 3;
    System.out.println(ktheZgjidhje(x0, x));
 
    
   }
}
