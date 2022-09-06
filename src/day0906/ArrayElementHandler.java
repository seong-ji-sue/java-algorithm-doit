package day0906;

import java.util.Arrays;

public class ArrayElementHandler {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }
    static void reverse(int[] a) {
        for(int i=0 ; i<a.length/2 ; i++) {
            swap(a, i, a.length-i-1);
        }
    }

    /**
     * 연습문제 Q3 : a 배열의 모든 요소의 합계
     * @param a
     * @return
     */
    static int sumOf(int[] a) {
        System.out.println("-배열의 합계-");
        int sum = 0;
        for(int el : a) {
            sum += el;
        }
        return sum;
    }
    /**
     * 연습문제 Q4 : a 배열의 모든 요소를 배열 b에 복사
     * @param a
     * @return
     */
    static String copy(int[] a,int[] b) {
        System.out.println("-배열의 복사-");
        for(int i=0 ; i<a.length ; i++) {
            b[i] = a[i];
        }
        return Arrays.toString(b);
    }
    /**
     * 연습문제 Q5 : a 배열의 모든 요소를 배열 b에 역순으로 복사하고 copy
     * @param a
     * @return
     */
    static String recopy(int[] a,int[] b) {
        System.out.println("-배열의 역순 복사-");
        copy(a,b);
        reverse(b);
        return Arrays.toString(b);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = new int[4];

        System.out.println("-----정답 출력~!-------");
        System.out.println(sumOf(a));
        System.out.println(copy(a,b));
        System.out.println(recopy(a,b));




    }
}
