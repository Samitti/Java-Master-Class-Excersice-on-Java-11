
 class MegaByteConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0)
            System.out.println("Invalid Input");
        else {

            int megabyte = kiloBytes / 1024;
            int kilobyte = kiloBytes % 1024;
            System.out.println(kilobyte + " KB = " + megabyte + " MB and " + kilobyte + " KB ");
        }

    }
}
