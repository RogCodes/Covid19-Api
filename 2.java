import java.util.Arrays;

public class Soal2 {   

    public static void main(String[] args) {
  
       char[] varData = {'J', 'M', 'I', 'N', 'L', 'K',
                         'H', 'G', 'F'};
       
       char[] varDataLain = {'g', 'h', 'i', 'j',
                             'a', 'c','b', 'e', 'd',
                             'g', 'e', 'f'};
       
       String tampilan1 = "";
       String tampilan2 = "";
  
       // Menampilkan elemen larik karakter
       tampilan1 += "\n\nHuruf Array Acak               : ";
       for (int x = 0; x < varData.length; x++)
          tampilan1 += varData[x] + "   ";
  
       Arrays.sort(varData);
  
       // Menampilkan elemen larik karakter setelah diurutkan
       tampilan1 += "\nArray huruf setelah di urutkan : ";
       
       for (int x = 3; x < varData.length; x++)
          tampilan1 += varData[x] + "   ";
       System.out.print(tampilan1);
       
       System.out.print(varData[0]);
       System.out.print(varData[1]);
       System.out.print(varData[2]);
       
      
       //Menampilkan elemen larik karakter 
       tampilan2 += "\n\nHuruf Array Acak               : ";
       for (int x = 0; x < varDataLain.length; x++)
          tampilan2 += varDataLain[x] + "   ";
  
       Arrays.sort(varDataLain);
       // Menampilkan elemen larik karakter setelah diurutkan
       tampilan2 += "\nArray huruf setelah di urutkan : [";
       for (int x = 0; x < varDataLain.length; x++)
          tampilan2 += varDataLain[x] + "   ";
  
       System.out.print(tampilan2 + "]");
    }
}