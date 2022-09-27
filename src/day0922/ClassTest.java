package day0922;

import java.util.Scanner;

/**
 * 신체 검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함
 * Q7 : 기호 문자로 사람 수를 출력하도록 하시오

 */

public class ClassTest {

    static final int VMAX = 21; //시력 분포(0.0 ~ 0.1 단위로 21개)
    static class PhysData {
        String name; //이름
        int height; //키
        double vision; //시력
        PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    //키 평균값
    static double aveHeight(PhysData[] dat) {
        double sum = 0;
        for (int i=0 ; i<dat.length; i++)
            sum += dat[i].height;
        return sum / dat.length;
    }

    //시력 분포를 구함
    static void distVision(PhysData[] dat, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for (i=0 ; i<dat.length ; i++)
            if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX /10.0)
                dist[(int)(dat[i].vision*10)]++;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        PhysData[] x = {
            new PhysData("강민하",162,0.3),
            new PhysData("김찬우",173,0.7),
            new PhysData("박준서",175,2.0),
            new PhysData("유서범",171,1.5),
            new PhysData("이수연",168,0.4),
            new PhysData("장경오",174,1.2),
            new PhysData("황지안",169,0.8),
        };
        int[] vdist = new int[VMAX];

        System.out.println("신체검사 리스트");
        System.out.println("이름   키   시력");
        System.out.println("----------------");
        for(int i=0 ; i<x.length ; i++)
            System.out.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height,x[i].vision);

        System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
        distVision(x, vdist);

        System.out.println("\n시력분포");
        for(int i=0 ; i < VMAX ; i++){
            //Q7 문제 부분
            String str = "";
            if(vdist[i]==0){
                str +="*";
            }
            System.out.printf("%3.1f~: %s\n", i / 10.0, str);
        }


    }
}
