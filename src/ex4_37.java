public class ex4_37 {

    static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        minutes = minutes % 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }

    static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int remainingMinutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(remainingMinutes,remainingSeconds);
    }
}
