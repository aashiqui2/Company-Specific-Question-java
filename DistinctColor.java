import java.util.Scanner;

public class DistinctColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of test case");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.err.println("Enter red");
            int red = sc.nextInt();
            System.err.println("Enter green");
            int green = sc.nextInt();
            System.err.println("Enter blue");
            int blue = sc.nextInt();
            int distinctColor = 0;

            int minredgreen = Math.min(red, green);// yellow
            distinctColor += minredgreen;
            red-=minredgreen;;
            green-=minredgreen;

            int minbluegreen = Math.min(blue, green);// cyan
            distinctColor += minbluegreen;
            blue-=minbluegreen;
            green-=minbluegreen;

            int minredblue = Math.min(red, green);// magenta
            distinctColor += minredblue;
            red-=minredblue;
            blue-=minredblue;

            if (red > 0) {
                distinctColor++;
            }
            if (blue > 0) {
                distinctColor++;
            }
            if (green > 0) {
                distinctColor++;
            }
            System.out.println(distinctColor);
        }

    }
}

// ! Problem Statement (Rephrased for Clarity)
/*
 * You are given three primary colours: Red, Green, and Blue. Each of these
 * colours has a certain number of drops available. The goal is to determine the
 * maximum number of distinct colours you can produce using these drops.
 * 
 * #### Colours:
 * 1. Primary Colours: Red, Green, Blue
 * 2. Secondary Colours:
 * - Yellow (formed by mixing Red and Green)
 * - Cyan (formed by mixing Green and Blue)
 * - Magenta (formed by mixing Blue and Red)
 * 
 * ### Rules:
 * 1. Mixing Rules:
 * - You can mix 1 drop of two different primary colours to form a secondary
 * colour.
 * - Example: 1 Red + 1 Green = 1 Yellow (Secondary Colour)
 * 
 * 2. Distinct Colour Count:
 * - A colour is distinct if it is either a primary or a secondary colour.
 * - Your task is to maximize the number of distinct colours you can produce.
 * 
 * ### Input Format:
 * - The first line contains an integer **T** denoting the number of test cases.
 * - For each test case, you are given three integers **R**, **G**, and **B**,
 * where:
 * - **R** = Number of drops of Red
 * - **G** = Number of drops of Green
 * - **B** = Number of drops of Blue
 * 
 * ### Output Format:
 * - For each test case, output the maximum number of distinct colours you can
 * form on a new line.
 * 
 * ### Example:
 * Input:
 * 1
 * 3 5 2
 ** Output:**
 * 5
 */
