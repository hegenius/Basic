package bitc.fullstack405.board2.dto;

import lombok.Data;

// t_user 테이블과
@Data
public class UserDTO {
  private String userId;
  private String userPw;
  private String userName;
  private String userEmail;
  private String createDate;
  private String updateDate;
}
