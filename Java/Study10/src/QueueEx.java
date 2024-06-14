import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

    public static void main(String[] args) {

//        Queue 타입의 변수 선언 및 LinkedList 타입의 객체 선언
        Queue<Message> msgQueue = new LinkedList<>();

//        Queue에 데이터 추가
        msgQueue.offer(new Message("sendMail", "정재원"));
        msgQueue.offer(new Message("sendSMS", "김민석"));
        msgQueue.offer(new Message("sendKakaoTalk", "이민석"));

        while (!msgQueue.isEmpty()) {
//            큐에 저장된 데이터 출력
            Message msg = msgQueue.poll();

            switch (msg.command) {
                case "sendMail":
                    System.out.println(msg.to + "님에게 메일을 보냅니다.");
                    break;

                case "sendSMS":
                    System.out.println(msg.to + "님에게 SMS을 보냅니다.");
                    break;

                case "sendKakaoTalk":
                    System.out.println(msg.to + "님에게 카카오특을 보냅니다.");
                    break;
            }
        }
    }
}
