public class VowelsReplace {
    public static void main(String[] args) {
        String s = "aabbii";
        String vowels = "aeiou";
        char[] consonantSequence = "bcdfghjklmnpqrstvwxyz".toCharArray();
        System.out.println(consonantSequence.length);
        int consonantIndex = 0;
        char[] result = s.toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (vowels.contains(String.valueOf(result[i]))) {
                result[i] = consonantSequence[consonantIndex % consonantSequence.length];
                consonantIndex++;
            }
        }
        System.out.println(new String(result));
    }
}
