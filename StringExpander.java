public class StringExpander {
    public static void main(String[] args) {
        String input = "b3c6d15";  
        StringBuilder output = new StringBuilder(); 

        int i = 0;
        while (i < input.length()) {
            char ch = input.charAt(i);  

            if (Character.isLetter(ch)) {  
                i++;  
                int count = 0;

                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    count = count * 10 + (input.charAt(i) - '0');   
                    i++;
                }
                for (int k = 0; k < count; k++) {
                    output.append(ch);
                }
            }
        } 
        System.out.println("Output: " + output.toString());  
    }
}


/*
 Input  : b3c6d15
 output : bbbccccccddddddddddddddd
 */