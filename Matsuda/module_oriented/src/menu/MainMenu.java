package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import auth.Auth;
import member.Member;
import data.Data;

public class MainMenu {

  //操作中ユーザーのフィールド
  public boolean loginStatus;
  public int loginPassword;


  public void main() {

    //ユーザーインスタンスの作成
    Member user = new Member(null, null, null, null, null, null ,null);
    Data data = new Data();

    //上記のリストをmemberListフィールドにセットする
    user.memberList.addAll(data.members);

    //ユーザーの初期値
    user.loginStatus = false;
    user.loginPassword = 1234;

    while (true) {
          //メニュー画面の表示
          System.out.println("=========会員管理サービス=========\n" +
                  "1．会員登録\n" +
                  "2．ログイン/ログアウト\n" +
                  "3．会員情報検索\n" +
                  "4．会員情報変更\n" +
                  "5．サービス利用登録/停止\n" +
                  "0．終了\n" +
                  "機能を選んでください：");

          //メニュー選択（全角数字）
          Scanner scanner = new Scanner(System.in);
          int userInput = scanner.nextInt();



          //各機能への条件分岐
          switch (userInput) {
          case 1:
              user.MemberRegistration();
              continue;
          case 2:
              Auth loginUser = new Auth();
              loginUser.login(user);
              continue;
          case 3:
              user.memberSearch(user);
              continue;
          case 4:
              user.memberEdit(user);
              continue;
//          case 5:
//              user.aboutService(user);
//              continue;
//          case 0:
//              user.exit(user);
//              continue;
          }
      }

  }



}
