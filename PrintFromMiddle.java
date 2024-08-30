public class PrintFromMiddle {
    public static void main(String[] args) {
        String s = "PROGRAM";
        printMiddle(s);
    }

    public static void printMiddle(String s) {
        int length = s.length();
        int middleIndex = length / 2;
        String temp = "";
            for (int i = middleIndex; i < length; i++) {
                System.out.print(s.substring(middleIndex, i + 1)+"\n");
                temp = s.substring(middleIndex, i + 1);
            }

            for (int i = 0; i < middleIndex; i++) {
                System.out.print(temp + s.substring(0, i + 1)+"\n");
            }
    }
}
/*
 * G
 * GR
 * GRA
 * GRAM
 * GRAMP
 * GRAMPR
 * GRAMPRO
 */
