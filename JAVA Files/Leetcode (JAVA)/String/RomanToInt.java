package Leetcode.String;

        public class RomanToInt {
            // Function to get the value of a Roman numeral
            int value(char r) {
                if (r == 'I') return 1;
                if (r == 'V') return 5;
                if (r == 'X') return 10;
                if (r == 'L') return 50;
                if (r == 'C') return 100;
                if (r == 'D') return 500;
                if (r == 'M') return 1000;
                return -1;
            }
        
            // Function to convert Roman numeral to integer
            int romanToInt(String s) {
                int total = 0;
                for (int i = 0; i < s.length(); i++) {
                    int s1 = value(s.charAt(i));
        
                    if (i + 1 < s.length()) {
                        int s2 = value(s.charAt(i + 1));
                        if (s1 >= s2) {
                            total += s1;
                        } else {
                            total += s2 - s1;
                            i++; // Skip the next character
                        }
                    } else {
                        total += s1;
                    }
                }
                return total;
            }
        
            public static void main(String[] args) {
                RomanToInt converter = new RomanToInt();
                String roman = "VII";
                System.out.println("Roman numeral: " + roman);
                System.out.println("Integer value: " + converter.romanToInt(roman));
            }
        }
        
    