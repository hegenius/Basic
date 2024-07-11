package bitc.fullstack405.board1.dto;

import lombok.Data;

@Data
public class BoardFileDTO {
  private int fileIdx;
  private int boardIdx;
  private String originalFileName;
  private String storedFileName;
  private int fileSize;
  private String createUser;
  private String createDate;
  private String updateUser;
  private String updateDate;
}
