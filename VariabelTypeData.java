
import java.util.Scanner;

//PIC -> Package, Import, Class

public class VariabelTypeData {
    
    static String nama;
    static int nilai;
    static Integer sks;
    static final int biaya_sks = 50000;
    static double total_diskon;
    static double diskon;
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Isikan Nama:");
        nama = sc.nextLine();
       
        System.out.print("Isikan Nilai:");
        nilai = sc.nextInt();
        
        System.out.print("Jumlah SKS :");
        sks = sc.nextInt();
        
       
        double total_biaya = sks * biaya_sks;  
        
        
        
        if(total_biaya > 2000000){
            total_biaya = total_biaya - (total_biaya * 0.2);
            diskon = total_biaya * 0.2;
        }
        else if (total_biaya > 1000000){
            total_biaya = total_biaya - (total_biaya * 0.1);
            diskon = total_biaya * 0.1;
        }
        
        System.out.println("Nama anda :" + nama);
        System.out.println("Nilai anda:" + nilai);
        System.out.println("Total Biaya:" + total_biaya); 
        System.out.println("Total yang dibayarkan :" + total_diskon);

        
        
    }
}
