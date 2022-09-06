package day0905;

import java.util.Scanner;

public class TriangleCode {

    /**
     * 연습문제 : Q14
     * 왼쪽 아래가 직각 이등변 삼각형
     * @param num
     */
    static void triangleLB(int num) {
        System.out.println("-왼쪽 아래가 직각 이등변 삼각형 출력-");
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     * 연습문제 : Q14
     * 왼쪽 위가 직각 이등변 삼각형
     * @param num
     */
    static void triangleLU(int num) {
        System.out.println("-왼쪽 위가 직각 이등변 삼각형 출력-");
        for(int i=1 ; i<=num ; i++){
            for(int j=num-i ; j>=0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     * 연습문제 : Q14
     * 오른쪽 위가 직각 이등변 삼각형
     * @param num
     */
    static void triangleRU(int num) {
        System.out.println("-오른쪽 위가 직각 이등변 삼각형 출력-");
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<i ; j++){
                System.out.print(" ");
            }
            for(int j=num-i ; j>=0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     * 연습문제 : Q14
     * 오른쪽 아래가 직각 이등변 삼각형
     * @param num
     */
    static void triangleRB(int num) {
        System.out.println("-오른쪽 아래가 직각 이등변 삼각형 출력-");
        for(int i=1 ; i<=num ; i++){
            for(int j=num-i-1 ; j>=0 ; j--){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /**
     * 연습문제 : Q15
     * 피라미드 형 삼각형
     * @param num
     */
    static void spira(int num) {
        System.out.println("-피라미드 형 삼각형 출력-");
        for(int i=1 ; i<=num ; i++){
            for(int j=num-i-1 ; j>=0 ; j--){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            for(int j=num-i-1 ; j>=0 ; j--){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    /**
     * 연습문제 : Q16
     * 숫자 피라미드 형 삼각형
     * @param num
     */
    static void npira(int num) {
        System.out.println("-숫자 피라미드 형 삼각형 출력-");
        int npriaNum= 1;
        for(int i=1 ; i<=num ; i++){
            for(int j=num-i-1 ; j>=0 ; j--){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*i)-1 ; j++){
                System.out.print(npriaNum);
                npriaNum++;
            }
            for(int j=num-i-1 ; j>=0 ; j--){
                System.out.print(" ");
            }
            System.out.println();
        }

    }


    /**
     * Main 단
     * 풀이 : 첫번째 for 문(변수 i)는 단 수를 정하기 때문에
     * 모든 메서드에서 동일하게 들어가고 나머지 공백과 * 부분은 쪼개어 생각하면
     * 쉽게 풀어갈 수 있다.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num;

        do{
            System.out.print("몇단 삼각형 ??  ");
            num = sc.nextInt();
        }while (num<=0);
        System.out.println("-----------출력------------");
        triangleLB(num);
        triangleLU(num);
        triangleRU(num);
        triangleRB(num);
        spira(num);
        npira(num);
    }
}
