public class Motivator {
    public static String dapatkanMotivasi(int mood) {
        if (mood <= 2) {
            return "Take a deep breath. You’ve handled hard things before, you’ll do it again.";
        } else if (mood == 3) {
            return "You're doing okay. One step at a time.";
        } else {
            return "Keep going! Today is a good day.";
        }
    }
}
