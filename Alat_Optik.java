import java.util.Scanner;

public class Alat_Optik {

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        System.out.println("Menu");
        System.out.println("1. Rumus Daya Lensa");
        System.out.println("2. Rumus Perbesaran Mikroskop");

        System.out.println("Masukkan angka : ");
        while (true) {
            Scanner angka = new Scanner(System.in);
            String s_angka = angka.nextLine();

            switch (s_angka) {
                case "1":
                    RumusDayaLensa();
                    break;
                case "2":
                    RumusPerbesaranMikroskop();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka yang benar.");
                    break;
            }
        }
    }

    public static void RumusDayaLensa() {
        System.out.println("Menghitung Daya Lensa");
        
        // Meminta input jarak fokus dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jarak fokus lensa (dalam meter): ");
        double f = input.nextDouble();
        
        // Menghitung daya lensa
        double P = 1 / f;  // Rumus daya lensa
        
        System.out.println("Hasilnya adalah = " + P + " dioptri");

        System.out.println("Tekan 0 untuk kembali ke menu sebelumnya");
        Scanner angka = new Scanner(System.in);
        String s_angka = angka.nextLine();
        if (s_angka.equals("0")) {
            showMenu();
        }
    }

    public static void RumusPerbesaranMikroskop() {
        System.out.println("Menghitung Perbesaran Mikroskop");

        // Meminta input perbesaran lensa objektif dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan perbesaran lensa objektif: ");
        double M_obj = input.nextDouble();
        
        // Meminta input perbesaran lensa okuler dari pengguna
        System.out.print("Masukkan perbesaran lensa okuler: ");
        double M_ok = input.nextDouble();
        
        // Menghitung perbesaran total mikroskop
        double M_total = M_obj * M_ok;  // Rumus perbesaran mikroskop
        
        System.out.println("Hasilnya adalah = " + M_total);

        System.out.println("Tekan 0 untuk kembali ke menu sebelumnya");
        Scanner angka = new Scanner(System.in);
        String s_angka = angka.nextLine();
        if (s_angka.equals("0")) {
            showMenu();
        }
    }
}
