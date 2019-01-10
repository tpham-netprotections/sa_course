package member;

public class Member {

  public boolean loginStatus;
  public int loginPassword;
  public String userMail;
  public String userPhoneNumber;
  public String userNameKanji;
  public String userNameKana;
  public String userSex;
  public String userBirthday;
  public String userAddress;

  public boolean huhululuStatus;
  public boolean atobaraiStatus;
  public boolean atoneStatus;

  public Member(String userMail, String userPhoneNumber, String userNameKanji,
          String userNameKana, String userSex, String userBirthday,
          String userAddress){
      this.userMail = userMail;
      this.userPhoneNumber = userPhoneNumber;
      this.userNameKanji = userNameKanji;
      this.userNameKana = userNameKana;
      this.userSex = userSex;
      this.userBirthday = userBirthday;
      this.userAddress = userAddress;
  }

  public void setSerbiceStatus(boolean huhululuStatus, boolean atobaraiStatus, boolean atoneStatus) {
      this.huhululuStatus = huhululuStatus;
      this.atobaraiStatus = atobaraiStatus;
      this.atoneStatus = atoneStatus;
  }


}
