public class ex4_34_1 {
    private static String message;

    static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            message = "Invalid Value";
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            message = kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB";
        }
        System.out.println(message);
    }

    static String getMessage() {
        return message;
    }
}
