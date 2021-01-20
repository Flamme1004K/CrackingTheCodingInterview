package study.crackingthecodinginterview;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/* StringBuilder의 replace, reverse 구현 */
public class Week1 {

    static class MyStringBuilder {

        //Char[]가 필요하지 않을까?
        private char[] chars;
        private String string;

        MyStringBuilder() { }

        MyStringBuilder(String string) {
            this.chars = string.toCharArray();
        }

        public void append(String string) {
            String beforeString = String.valueOf(chars);
            String afterString = beforeString + string;
            this.chars = afterString.toCharArray();
        }

        public void insert(String string, int index) {
            String result = String.valueOf(this.chars, 0 ,index) + string + String.valueOf(this.chars, index, chars.length-index);
            this.chars = result.toCharArray();
        }

        public void delete(int start, int end) {

            String result = String.valueOf(this.chars, 0 ,start)
                        + String.valueOf(this.chars, end, chars.length-end);
            this.chars = result.toCharArray();

        }

        public void replace(String string, int index) {
            String result = String.valueOf(this.chars, 0 ,index-1) + string + String.valueOf(this.chars, index, chars.length-index);
            this.chars = result.toCharArray();
        }

        public void reverse() {
            int n = chars.length;

            char[] temp = new char[n];

            for (int i = 0; i < n; i++)
                temp[n - i - 1] = chars[i];

            this.chars = temp;
        }

        @Override
        public String toString() {
            return String.valueOf(chars);
        }
    }

    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder("Hello My Name is ");
        myStringBuilder.replace("asdf", 2);
        myStringBuilder.append("Flamme");
        myStringBuilder.insert("Flamme", 5);
        myStringBuilder.delete(5,10);
        myStringBuilder.reverse();

        // exception 처리해야함
        System.out.println("myStringBuilder = " + myStringBuilder);
    }
}
