import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        
        Scanner sc03 = new Scanner(System.in);
        int pilihan;
        
        do {
            
            pilihan = sc03.nextInt();
            System.out.println();
            switch (pilihan){
                case 1 -> {
                    System.out.println();
                }
                case 2 -> {
                    System.out.println();
                }
                case 3 -> {
                    System.out.println();
                }
                case 4 -> {
                    System.out.println();
                }
                case 5 -> {
                    System.out.println();
                }
                case 0 -> {
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                }
                default -> {
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                }
            }
        } while (pilihan != 0);
        System.out.println();
    }
}