public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

//    선언부, (괄호안 매개변수)
    int plus(int x, int y) {  // java에서는 매개변수에 데이터 타입 붙여야 함 (자바스크립트는 안붙여도 됨)
        int result = x + y;
        return result;
    }

//    매개변수로 int 타입의 데이터 2개를 받음
    double divide(int x, int y) {
//        자동 타입 변환에 의해서 int 타입의 데이터가 double 타입의 데이터로 변환
        double result = x / y;
        return result;
    }
}
