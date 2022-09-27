package day0922;

/**
 * Q8 : 오른쪽처럼 년월일을 필드로 갖는 클래스를 만드세요. 다음과 같이 생성자와 메서드 정의
 * 생성자 - 주어진 날짜 설정
 * 메서드 1 - n일뒤의 날짜 반환
 * 메서드 2 - n일 후 날짜 반환
 */
public class DateReturnCod {
    static class YMD {
        int y;
        int m;
        int d;

        YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }
    }
    static int before(YMD day,int n){

        return 0;
    }
    static int after(YMD day, int n){

        return 0;
    }

    public static void main(String[] args) {
        YMD today = new YMD(2022,9,27);



    }
}
