import java.util.ArrayList;

public class MoodTracker {
    private ArrayList<MoodEntry> entries = new ArrayList<>();

    public void tambahEntry(MoodEntry entry) {
        entries.add(entry);
    }

    public void tampilkanSemua() {
        if (entries.isEmpty()) {
            System.out.println("Belum ada catatan mood.");
            return;
        }
        for (MoodEntry entry : entries) {
            entry.tampilkan();
            System.out.println("------------------------");
        }
    }

    public double hitungRataMood() {
        if (entries.isEmpty()) return 0;
        int total = 0;
        for (MoodEntry entry : entries) {
            total += entry.getMood();
        }
        return (double) total / entries.size();
    }

    public MoodEntry moodTerburuk() {
        if (entries.isEmpty()) return null;
        MoodEntry terburuk = entries.get(0);
        for (MoodEntry entry : entries) {
            if (entry.getMood() < terburuk.getMood()) {
                terburuk = entry;
            }
        }
        return terburuk;
    }
}
