import java.util.Scanner;

public class quiz {
    public static void quiz1() {
//    Song 클래스 타입의 객체 mySong 생성
        Song mySong = new Song("Nessun Dorma");
//    Song 클래스 타입의 객체 yourSong 생성
        Song yourSong = new Song("공주는 잠 못 이루고");
//    객체 mySong의 인스턴스 멤버 중 getTitle() 메소드를 사용
        System.out.println("내 노래는 " + mySong.getTitle());
        System.out.println("너 노래는 " + yourSong.getTitle());
    }

    public static void quiz2() {
//    화면 출력이 먼저, 화면 출력 후 바로 뒤에 입력해야 하기 때문에 print() 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("이름과 전화번호 입력 >> ");
//    키보드 입력 받기
        String name = sc.next();
        String tel = sc.next();
//    입력받은 내용을 기반으로 Phone 클래스 타입의 객체 생성
        Phone phone1 = new Phone(name, tel);

        System.out.print("이름과 전화번호 입력 >> ");
//    위에 이미 선언한 변수 재활용
        name = sc.next();
        tel = sc.next();
//  입력받은 내용을 기반으로 Phone 클래스 타입의 두번째 객체 생성
        Phone phone2 = new Phone(name, tel);

        System.out.println(phone1.getName() + "의 전화번호 : " + phone1.getTel());
        System.out.println(phone2.getName() + "의 전화번호 : " + phone2.getTel());

//    System.out.print("이름 입력 >> ");
//    String name = sc.nextLine();
//    System.out.print("전화번호 입력 >> ");
//    String tel = sc.nextLine();
//
//    Phone phone1 = new Phone(name, tel);
//
//    System.out.print("이름 입력 >> ");
//    name = sc.nextLine();
//    System.out.print("전화번호 입력 >> ");
//    tel = sc.nextLine();
//
//    Phone phone2 = new Phone(name, tel);
//
//    System.out.println(phone1.getName() + "의 전화번호 : " + phone1.getTel());
//    System.out.println(phone2.getName() + "의 전화번호 : " + phone2.getTel());

//  nextLine() : \n 오기 전까지 모든 데이터 불러오기 (문장별 문자열)
//  next() : 공백기준 앞에 것만 들고오기 (단어별 문자열)
//  nextInt () : 숫자

    }

    public static void quiz4() {
        Phone2Manager pm = new Phone2Manager();
        pm.printPhone2Manager();
    }

    public static void quiz5() {
        StaticTest staticTest = new StaticTest();
        staticTest.printStaticTest();
    }

    public static void main(String[] args) {
//    System.out.println("\n----- 문제 1) -----\n");
//    quiz1();
//
    System.out.println("\n ----- 문제 2) ----- \n");
    quiz2();
//
//    System.out.println("\n ----- 문제 3) ----- \n");
//    RectArray 파일
//
//    System.out.println("\n ----- 문제 4) ----- \n");
//    quiz4();

//    System.out.println("\n ----- 문제 5) ----- \n");
//    quiz5();

    }
}