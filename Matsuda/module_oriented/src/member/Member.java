package member;

import java.util.List;
import java.util.Scanner;

import auth.Auth;

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


  public List<Member> memberList;

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

  public void printMemberData (Member member) {
      System.out.println("1.メールアドレス：" + member.userMail);
      System.out.println("2.電話番号：" + member.userPhoneNumber);
      System.out.println("3.名前（漢字）：" + member.userNameKanji);
      System.out.println("4.名前（カナ）:" + member.userNameKana);
      System.out.println("5.性別：" + member.userSex);
      System.out.println("6.生年月日：" + member.userBirthday);
      System.out.println("7.住所：" + member.userAddress);
  }

    //メンバー登録機能
  public void MemberRegistration () {

      Member newMember = new Member(null, null, null, null, null, null, null);

      System.out.println("-----会員登録機能です-----");
      Scanner scanner = new Scanner(System.in);

      System.out.println("=========会員登録=========");
      System.out.println("メールアドレス： ");
      String userMail = scanner.nextLine();
      System.out.println("電話番号： ");
      String userPhoneNumber = scanner.nextLine();
      System.out.println("名前（漢字）：");
      String userNameKanji = scanner.nextLine();
      System.out.println("名前（カナ）：");
      String userNameKana = scanner.nextLine();
      System.out.println("性別：");
      String userSex = scanner.nextLine();
      System.out.println("生年月日：");
      String userBirthday = scanner.nextLine();
      System.out.println("住所：");
      String userAddress = scanner.nextLine();

      newMember.userMail = userMail;
      newMember.userPhoneNumber = userPhoneNumber;
      newMember.userNameKanji = userNameKanji;
      newMember.userNameKana = userNameKana;
      newMember.userSex = userSex;
      newMember.userBirthday = userBirthday;
      newMember.userAddress = userAddress;

      //ユーザーの会員リストへの登録
      memberList.add(newMember);

      System.out.println("新規会員" + userNameKanji + "を登録しました！");


  }

  //サービス利用登録
  public void serviceStartStop (Member member) {

      //ログインチェック
      Auth currentUser = new Auth();
      currentUser.loginCheck(member);

      //会員IDの入力
      System.out.println("会員IDを入力してください");
      Scanner scanner = new Scanner(System.in);
      int memberId = scanner.nextInt();
      Member member1 = memberList.get(memberId);
      member1.printMemberData(member1);



      //サービスメニューの表示
      System.out.println("=========会員管理サービス=========\n" +
              "1．フフルル" +
              "2．後払い" +
              "3．atone" +
              "サービスを選んでください：");

      //利用開始・停止したいサービスの選択

      int serviceId = scanner.nextInt();

      switch (serviceId) {

      case 1:
          if (member1.huhululuStatus == false) {
              member1.huhululuStatus = true;
              System.out.println("フフルルの利用登録完了しました！");
          } else {
              member1.huhululuStatus = false;
              System.out.println("フフルルの利用を停止しました！");
          }
          break;
      case 2:
          if (member1.atobaraiStatus == false) {
              member1.atobaraiStatus = true;
              System.out.println("後払いの利用登録完了しました！");
          } else {
              member1.atobaraiStatus = false;
              System.out.println("後払いの利用停止しました！");
          }
          break;
      case 3:
          if (member1.atoneStatus == false) {
              member1.atoneStatus = true;
              System.out.println("atoneの利用登録完了しました！");
          } else {
              member1.atoneStatus = false;
              System.out.println("atoneの利用停止しました！");
          }

          break;
      }

  }



    //メンバー検索機能
  public void memberSearch (Member user) {
      System.out.println("-----会員検索機能です-----");

      //ログインチェック
      Auth currentUser = new Auth();
      currentUser.loginCheck(user);

      //検索したい会員IDの入力
      Scanner scanner = new Scanner(System.in);
      System.out.print("検索したい会員IDを入力してください：");
      int memberId = scanner.nextInt();

      //SearchMemberIdメソッドの呼び出し
      Member searchResult = memberList.get(memberId);

      if (searchResult != null) {
          searchResult.printMemberData(searchResult);
      } else {
          System.out.println("会員ID" + memberId + "は存在しません。");
      }
  }

   //メンバー編集機能
  public void memberEdit (Member user) {
      System.out.println("-----会員編集機能です-----");

      //ログインチェック
      Auth currentUser = new Auth();
      currentUser.loginCheck(user);

      //編集したい会員のID検索
      System.out.println("検索したい会員IDを入力してください：");
      Scanner scanner = new Scanner(System.in);
      int editId = scanner.nextInt();
      Member searchedMember = memberList.get(editId);

      //編集の実行
      if (searchedMember != null) {
          searchedMember.printMemberData(searchedMember);
          Scanner scanner2 = new Scanner(System.in);
          System.out.println("変更したい項目番号を入力してください");
          String inputNumber = scanner2.nextLine();
          System.out.println("変更したい値を入力してください");
          String editInput = scanner2.nextLine();

          switch (inputNumber) {

          case "1":
              searchedMember.userMail = editInput;
              break;
          case "2":
              searchedMember.userPhoneNumber = editInput;
              break;
          case "3":
              searchedMember.userNameKanji = editInput;
              break;
          case "4":
              searchedMember.userNameKana = editInput;
              break;
          case "5":
              searchedMember.userSex = editInput;
              break;
          case "6":
              searchedMember.userBirthday = editInput;
              break;
          case "7":
              searchedMember.userAddress = editInput;
              break;
          }

          System.out.println("会員情報変更完了しました！");

      }
  }

}
