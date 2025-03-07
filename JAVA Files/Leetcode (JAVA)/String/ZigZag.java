package Leetcode.String;

public class ZigZag{
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (int i = 0; i < s.length(); i++) {
            rows[currentRow] += s.charAt(i);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        String result = "";
        for (String row : rows) {
            result += row;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println("Original String: " + s);
        System.out.println("Converted String: " + convert(s, numRows));
    }
}

