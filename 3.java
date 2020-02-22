public class Soal3 {
    
	public static void main(String[] args) {
       //Belah Ketupat Jumlah Bintang 5
       System.out.println("jumlah bintang : 5 ");
        int a = 5;
        //segitiga atas
        for (int i=0;i<a/2+1;i++) {
            for (int j=0;j<a/2-i;j++){
               System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
               if (i==0 || j==0 || j==2*i)
                    System.out.print("*");
               else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //segitiga bawah
        for (int i=a/2-1;i>=0;i--) {
            for (int j=0;j<a/2-i;j++){
               System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
               if (i==a/2 || j==0 || j==2*i)
                    System.out.print("*");
               else
                    System.out.print(" ");
            }
            System.out.println();
        }
    // Jumlah bintang 6
      System.out.println("jumlah bintang : 6 ");
        int b = 6;
        //segitiga atas
        for (int i=0;i<b/2;i++) {
            for (int j=0;j<b/2-i;j++){
               System.out.print(" ");
            }
            for (int j=0;j<2*i+2;j++){
               if (i==0 || j==0 || j==2*i+1)
                    System.out.print("*");
               else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //segitiga bawah
        for (int i=b/2-1;i>=0;i--) {
            for (int j=0;j<b/2-i;j++){
               System.out.print(" ");
            }
            for (int j=0;j<2*i+2;j++){
               if (i==b/2 || j==0 || j==2*i+1)
                    System.out.print("*");
               else
                    System.out.print(" ");
            }
            System.out.println();
        }
  System.out.println("\n");
    
      //Jumlah bintang 9
System.out.println("jumlah bintang : 9 ");
        int c = 9;
        //segitiga atas
        for (int i=0;i<c/2+1;i++) {
            for (int j=0;j<c/2-i;j++){
               System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
               if (i==0 || j==0 || j==2*i)
                    System.out.print("*");
               else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //segitiga bawah
        for (int i=c/2-1;i>=0;i--) {
            for (int j=0;j<c/2-i;j++){
               System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
               if (i==c/2 || j==0 || j==2*i)
                    System.out.print("*");
               else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}