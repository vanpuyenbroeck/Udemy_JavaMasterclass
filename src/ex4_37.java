public class ex4_37 {

    static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        minutes = minutes % 60;

        String leadingHours = "";
        String leadingMinutes = "";
        String leadingSeconds = "";
        if (hours < 10) {
            leadingHours = "0";
        }
        if (minutes < 10) {
            leadingMinutes = "0";
        }
        if (seconds < 10) {
            leadingSeconds = "0";
        }
        return leadingHours + hours + "h " + leadingMinutes + minutes + "m " + leadingSeconds + seconds + "s";
    }

    static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int remainingMinutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(remainingMinutes, remainingSeconds);
    }
}
