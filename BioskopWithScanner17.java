import java.util.Scanner;
public class BioskopWithScanner17 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[][] penonton = new String[4][2];
    boolean exit = false;

    while(!exit){
        System.out.println("Menu:");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu: ");
        //System.out.println("----------------------------------------------");
        int choice = sc.nextInt();
        sc.nextLine();
        
        switch (choice){
            case 1:
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                int baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                int kolom = sc.nextInt();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    if(penonton[baris-1][kolom-1] == null){
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                    }else{
                        System.out.println("Kursi sudah ditempati. Silakan pilih kursi lain.");
                    }
                }else{
                    System.out.println("Nomor baris atau kolom tidak valid. Harap masukkan antara 1 dan 4 untuk baris, dan antara 1 dan 2 untuk kolom.");
                }
            
                break;
            
            case 2:
                System.out.println("Daftar penonton:");
                for(int i = 0; i<4; i++){
                    for(int j=0; j<2; j++){
                        if(penonton[i][j] != null){
                            System.out.println("Baris: "+(i+1)+", Kolom: "+(j+1)+", Nama: "+penonton[i][j]);
                        }else{
                            System.out.println("Baris: "+(i+1)+", Kolom: "+(j+1)+", Nama: ***");
                        }
                    }
                }
                break;

            case 3:
                exit = true;
                System.out.println("Terima kasih, program berakhir.");
                break;

            default:
            System.out.println("Pilihan menu tidak valid. Silakan coba lagi.");
            break;
        }
        
    }
    }
}