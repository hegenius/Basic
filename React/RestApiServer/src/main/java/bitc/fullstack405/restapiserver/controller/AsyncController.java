package bitc.fullstack405.restapiserver.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


// @CrossOrigin(URL) : CORS 오류 발생 시 외부 서버의 접속을 허용하는 어노테이션, @Controller, @RestController 클래스 및 메소드에 사용할 수 있음
// 2개 이상의 URL을 허용하려면  @CrossOrigin 안에 {} 를 사용하고 URL 을 여러개 사용하면 됨
//@CrossOrigin({"http://localhost:5173", "http://localhost:3000", "http://localhost:4000"})


//@CrossOrigin("http://localhost:5173")
@RequestMapping("/async")
@RestController
public class AsyncController {

  @RequestMapping("/")
  public String index() throws Exception {
    return "비동기 통신 접속 테스트의 index 메소드";
  }

//  @CrossOrigin("http://localhost:5173")
  @RequestMapping(value = "/sendDataGet", method = RequestMethod.GET)
  public Object sendDataGet() throws Exception {
    Map<String, String> result = new HashMap<>();

    result.put("result", "success");
    result.put("data", "axios를 이용한 GET 방식 비동기 통신");

    return result;
  }

//  @CrossOrigin("http://localhost:5173")
  @GetMapping("/sendDataGetParam")
  public Object sendDataGetParam(@RequestParam("idx") int idx) throws Exception {
    Map<String, String> result = new HashMap<>();

    result.put("result", "success");
    result.put("data", String.valueOf(idx));

    return result;
  }

//  @CrossOrigin("http://localhost:5173")
  @PostMapping("/sendDataPost")
  public Object sendDataPost(@RequestParam("userId") String userId, @RequestParam("userPw") String userPw) throws Exception {
    Map<String, String> user = new HashMap<>();

    user.put("userId", userId);
    user.put("userPw", userPw);

    Map<String, Object> result = new HashMap<>();

    result.put("result", "success");
    result.put("data", user);

    return result;
  }

//  @CrossOrigin("http://localhost:5173")
  @PutMapping("/sendDataPut")
  public Object sendDataPut(@RequestParam("idx") String idx) throws Exception {
    Map<String, Object> result = new HashMap<>();

    result.put("result", "success");
    result.put("data", idx + 100);  // idx + 100 => 문자열 + 숫자 => 전체 문자열

    return result;
  }

//  @CrossOrigin("http://localhost:5173")
  @DeleteMapping("/sendDataDelete")
  public Object sendDataDelete(@RequestParam("idx") int idx) throws Exception {
    Map<String, Object> result = new HashMap<>();

    result.put("result", "success");
    result.put("data", idx - 100); // idx - 100 => 0

    return result;
  }
}


