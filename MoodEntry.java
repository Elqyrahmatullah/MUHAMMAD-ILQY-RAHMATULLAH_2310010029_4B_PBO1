import java.time.LocalDate;

public class MoodEntry {
    private LocalDate tanggal;
    private int mood;
    private String aktivitas;
    private String catatan;

    public MoodEntry(LocalDate tanggal, int mood, String aktivitas, String catatan) {
        this.tanggal = tanggal;
        this.mood = mood;
        this.aktivitas = aktivitas;
        this.catatan = catatan;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public int getMood() {
        return mood;
    }

    public String getAktivitas() {
        return aktivitas;
    }

    public String getCatatan() {
        return catatan;
    }

    public void tampilkan() {
        System.out.println("Tanggal   : " + tanggal);
        System.out.println("Mood      : " + mood);
        System.out.println("Aktivitas : " + aktivitas);
        System.out.println("Catatan   : " + catatan);
    }
}
