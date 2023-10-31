import java.util.Scanner;
public class BioskopWithScanner17 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String nama, next;
    int baris, kolom;
    String[][] penonton = new String[4][2];

    while(true){
        System.out.print("Masukkan nama: ");
        nama = sc.next();
        System.out.print("Masukkan baris: ");
        baris = sc.nextInt();
        System.out.print("Masukkan Kolom: ");
        kolom = sc.nextInt();
        sc.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.print("Input penonton lainnya? (y/n): ");
        next = sc.next();

        if(next.equalsIgnoreCase("n")){
            break;
        }
    }
    }
}
