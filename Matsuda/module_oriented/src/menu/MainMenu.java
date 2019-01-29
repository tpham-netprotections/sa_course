package menu;

import java.util.List;
import java.util.Scanner;

import auth.Auth;
import data.Data;
import member.Member;
import member.MemberModule;

public class MainMenu {

  //操作中ユーザーのフィールド
  public boolean loginStatus;
  public int loginPassword;


  public static void main(String[] args) {

    //ユーザーインスタンスの作成
    Member user = new Member(null, null, null, null, null, null ,null);

    //ユーザーの初期値
    user.loginStatus = false;
    user.loginPassword = 1234;

    //デフォルトメンバー追加メソッドの呼び出し
    Data data = new Data();
    List<Member> mList = data.defaultMember();

    while (true) {
          //メニュー画面の表示
          System.out.println("=========会員管理サービス=========\n" +
                  "1．会員登録\n" +
                  "2．ログイン/ログアウト\n" +
                  "3．会員情報検索\n" +
                  "4．会員情報変更\n" +
                  "機能を選んでください：");

          //メニュー選択（全角数字）
          Scanner scanner = new Scanner(System.in);
          int userInput = scanner.nextInt();

          //各機能への条件分岐
          MemberModule m = new MemberModule();
          Auth a = new Auth();
          switch (userInput) {
          case 1:
              m.MemberRegistration(mList);
              continue;
          case 2:
              a.login(user);
              continue;
          case 3:
              m.memberSearch(user, mList);
              continue;
          case 4:
              m.memberEdit(user, mList);
              continue;
          }
      }

  }



}
