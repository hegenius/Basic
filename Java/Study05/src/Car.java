//    클래스 선언
public class Car {
//    필드 선언
    String model;
    int speed;

//    Car : 생성자
    public Car(String model) {
//        매개변수인 model과 필드인 model이 이름이 서로 같으므로 this. 를 사용하여 필드와 매개변수를 구분해줌
        this.model = model;
    }

//    메소드 setSpeed
    public void setSpeed(int speed) {
//        매개변수인 speed와 필드인 speed가 이름이 서로 같으므로 this. 를 사용하여 필드와 매개변수를 구분해줌
        this.speed = speed;
    }

//    메소드 run
    public void run() {
//        매개변수와 필드가 이름이 같지 않을 경우 this. 는 생략 가능함
        for (int i = 0; i <= 50; i++) {
            this.setSpeed(i);  // setSpeed(i); this. 생략 가능함, 명확하게 하려면 this 사용
            System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km)");
//            System.out.println(model + "가 달립니다. (시속 : " + this.speed + "km)"); this 생략해도됨
        }
    }
}
