/**
 * Write a class called MyRegex which will contain a string pattern.
 * You need to write a regular expression and assign it to the pattern
 * such that it can be used to validate an IP address. Use the following definition of an IP address:
 *
 * IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D
 * may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
 * Some valid IP address:
 *
 * 000.12.12.034
 * 121.234.12.12
 * 23.45.12.56
 * Some invalid IP address:
 *
 * 000.12.234.23.23
 * 666.666.23.23
 * .213.123.23.32
 * 23.45.22.32.
 * I.Am.not.an.ip
 * In this problem you will be provided strings containing any combination of ASCII characters.
 * You have to write a regular expression to find the valid IPs.
 *
 * Just write the MyRegex class which contains a String . The string should contain the correct regular expression.
 *
 * (MyRegex class MUST NOT be public)
 *
 * Sample Input
 *
 * 000.12.12.034
 * 121.234.12.12
 * 23.45.12.56
 * 00.12.123.123123.123
 * 122.23
 * Hello.IP
 *
 *
 * Sample Output
 *
 * true
 * true
 * true
 * false
 * false
 * false
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;



public class RegexAlgorithm {


        static String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        /* \\d{1,2} can also be written as [0-9]|[0-9][0-9]. It represents one or two digit number
        * (0|1)\\d{2} can also be written as (0|1)[0-9][0-9]. It represents a three digit number that starts with 0 or 1
        *  2[0-4]\\d can also be written as 2[0-4][0-9]. It represents three digit number from 200 to 249
        *  25[0-5] represents three digit number from 250 to 255
        * */
        static String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;

        public static boolean isValidIpAddress(String input) {
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(input);

            return m.matches();
        }

        public static void main(String[] args) {
            System.out.println("Enter the input");

            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                System.out.println(isValidIpAddress(scanner.next()));
            }

        }


}
