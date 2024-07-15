package bitc.fullstack405.board2.dto;

import lombok.Data;

@Data
public class BoardDTO {
  private int boardIdx;
  private String title;
  private String contents;
  private int hitCnt;
  private String CreateDate;
  private String CreateUser;
  private String UpdateDate;
  private String UpdateUser;
}
