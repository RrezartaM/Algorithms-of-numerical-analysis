
package DetyratGjateJaveve;
// Invers is used in Method of Newton 
import java.lang.*;

public class Invers {

  public static double[][] invert(double[][] a) {
    int n = a.length;
    double x[][] = new double[n][n];
    double b[][] = new double[n][n];
    int index[] = new int[n];
    for (int i=0; i<n; ++i) b[i][i] = 1;

 // Transformojme matricen ne trekendesh te siperm 
    gaussian(a, index);

 //  Rifreskojme  b[i][j] me proporcionet e ruajtura
    for (int i=0; i<n-1; ++i)
      for (int j=i+1; j<n; ++j)
        for (int k=0; k<n; ++k)
          b[index[j]][k]
            -= a[index[j]][i]*b[index[i]][k];

 // performojme ndarjen nga prapa 
    for (int i=0; i<n; ++i) {
      x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
      for (int j=n-2; j>=0; --j) {
        x[j][i] = b[index[j]][i];
        for (int k=j+1; k<n; ++k) {
          x[j][i] -= a[index[j]][k]*x[k][i];
        }
        x[j][i] /= a[index[j]][j];
      }
    }
  return x;
  }

// Metoda per te kryer metoden me pivotim pacial  eleminimet e gausit 
//   indekset[] e ruajtura ne baze te urdherit te pivotit

  public static void gaussian(double a[][], int index[]) {
    int n = index.length;
    double c[] = new double[n];
    for (int i=0; i<n; ++i)  
        index[i] = i;
    for (int i=0; i<n; ++i) {
      double c1 = 0;
      for (int j=0; j<n; ++j) {
        double c0 = Math.abs(a[i][j]);
        if (c0 > c1) c1 = c0;
      }
      c[i] = c1;
    }

 // Kerkon elementin pivot per secilen kolone
    int k = 0;
    for (int j=0; j<n-1; ++j) {
      double pi1 = 0;
      for (int i=j; i<n; ++i) {
        double pi0 = Math.abs(a[index[i]][j]);
        pi0 /= c[index[i]];
        if (pi0 > pi1) {
          pi1 = pi0;
          k = i;
        }
      }

   // Nderrohen rreshtat ne baz te pivotit
      int itmp = index[j];
      index[j] = index[k];
      index[k] = itmp;
      for (int i=j+1; i<n; ++i) {
        double pj = a[index[i]][j]/a[index[j]][j];

     // Shenohen elementet poshte diagonales
        a[index[i]][j] = pj;

     // modifikojm elementet tjera
        for (int l=j+1; l<n; ++l)
          a[index[i]][l] -= pj*a[index[j]][l];
      }
    }
  }
    public static void main(String args[]) {
    double a[][]= {{ 10, 5,1},
    		{5,8, 15},
    		{3,4,6}};
    int n = a.length;
    double d[][] = invert(a);
    for (int i=0; i<n; ++i) { 
    	System.out.println("");
    
      for (int j=0; j<n; ++j)
        System.out.print (d[i][j]+ "  " );
    }
    System.out.println();

  
}}


