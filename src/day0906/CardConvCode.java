package day0906;

import java.util.Scanner;

public class CardConvCode {

    /**
     * 실습 2-6 10진수 자연수를 **진수의 수로 변환
     * @param x
     * @param r
     * @param d
     * @return
     */
    static int cardConv(int x, int r, char [] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x/=r;
        } while (x!=0);
        for(int i=0 ; i<digits/2 ; i++) {
            char t = d[i];
            d[i] = d[digits-i-1];
            d[digits-i-1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no;
        int cd;
        int dno;
        char[] cno = new char[36];

        System.out.println("10진수를 기수 변환함 ");

        do {
            System.out.print("변환하는 음이 아닌 정수 : ");
            no = sc.nextInt();
        }while (no<0);

        do {
            System.out.print("변환할 기수 선택 (2~36) : ");
            cd = sc.nextInt();
        }while (cd<2 || cd>36);

        dno = cardConv(no, cd, cno);

        System.out.print(cd + "진수 변환 :  ");

        for(int i=0 ; i<dno ; i++){
            System.out.print(cno[i]);
        }

        System.out.println(" 입니다.");




    }
}
