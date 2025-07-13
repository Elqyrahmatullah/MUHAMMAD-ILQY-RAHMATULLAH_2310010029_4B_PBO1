import java.util.Scanner;
import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MoodTracker tracker = new MoodTracker();

        System.out.print("Masukkan nama Anda: ");
        String nama = sc.nextLine();
        User user = new User(nama);

        boolean jalan = true;
        while (jalan) {
            System.out.println("\n==== Mental Health Tracker ====");
            System.out.println("1. Tambah catatan mood");
            System.out.println("2. Lihat semua catatan");
            System.out.println("3. Statistik mood");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    try {
                        System.out.print("Tanggal (yyyy-mm-dd): ");
                        LocalDate tanggal = LocalDate.parse(sc.nextLine());
                        System.out.print("Mood (1-5): ");
                        int mood = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Aktivitas: ");
                        String aktivitas = sc.nextLine();
                        System.out.print("Catatan: ");
                        String catatan = sc.nextLine();

                        MoodEntry entry = new MoodEntry(tanggal, mood, aktivitas, catatan);
                        tracker.tambahEntry(entry);
                        System.out.println("Motivasi: " + Motivator.dapatkanMotivasi(mood));
                    } catch (Exception e) {
                        System.out.println("Terjadi kesalahan input: " + e.getMessage());
                        sc.nextLine();
                    }
                    break;

                case 2:
                    tracker.tampilkanSemua();
                    break;

                case 3:
                    double rata = tracker.hitungRataMood();
                    MoodEntry terburuk = tracker.moodTerburuk();
                    System.out.println("Rata-rata mood: " + rata);
                    if (terburuk != null) {
                        System.out.println("Hari dengan mood terburuk:");
                        terburuk.tampilkan();
                    }
                    break;

                case 4:
                    jalan = false;
                    System.out.println("Terima kasih, semoga harimu menyenangkan!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        sc.close();
    }
}
