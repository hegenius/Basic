import java.util.Scanner;

public class RectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    Rect 클래스 타입의 배열 rect 생성, new Rect[4]를 사용하여 크기가 4인 배열 생성
//    Rect 클래스 타입의 배열을 생성한 것이지 Rect 클래스 타입의 객체를 생성한 것은 아님, Rect 클래스 타입의 배열 요소는 현재 모두 null 임
        Rect[] rect = new Rect[4];

        for (int i = 0; i < rect.length; i++) {
            System.out.print((i + 1) + " 너비와 높이 >> ");
//      nextInt() 를 사용하여 키보드 입력을 정수로 받음
            int width = sc.nextInt();
            int heigth = sc.nextInt();
//      Rect 클래스 타입의 배열의 i번 index에 새로운 Rect 클래스 타입의 객체를 생성하여 저장
            rect[i] = new Rect(width, heigth);

            if (i + 1 == rect.length) {
                System.out.println("저장하였습니다..");
            }
        }

//    총합을 저장할 변수 선언
        int total = 0;

//    for문을 통해서 Rect 클래스 타입의 배열이 가지고 있는 모든 데이터 출력
        for (int i = 0; i < rect.length; i++) {
            total = total + rect[i].getArea();
        }

        System.out.println("사각형의 전체 합은 : " + total);
    }
}
