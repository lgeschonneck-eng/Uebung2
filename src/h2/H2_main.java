package h2;

public class H2_main {
 public static void main(String[] args) {
	 int i = 3;
	 int j = 7;
	 int k = 5;
	 
	 
	 int min, max;
	 
	 min = i;
	 if (j < min) {
		 min = j;
	 }
	 if ( k < min) {
		 min = k;
	 }
	 
	 
	 max = i;
	 if (j > max) {
		 max = j;
	 }
	 if (k > max) {
		 max = k;
	 }
	 
	 System.out.println("i = " +i + ", j = " + j + ", k = " + k);
	 System.out.println("min = " + min);
	 System.out.println("max = " +max);
 }
}
