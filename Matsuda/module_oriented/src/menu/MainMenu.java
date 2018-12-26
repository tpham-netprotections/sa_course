package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import auth.Auth;
import member.Member;

public class MainMenu {

  //操作中ユーザーのフィールド
  public boolean loginStatus;
  public int loginPassword;


  public static void main(String[] args) {

    //ユーザーインスタンスの作成
    Member user = new Member(null, null, null, null, null, null ,null);

    //初期登録メンバーのためのリストインスタンス作成
    List<Member> mList = new ArrayList<Member>();
    //MemberクラスのmemberListフィールドのインスタンスを作成
    user.memberList = new ArrayList<Member>();

    //初期登録メンバーのフィールドを設定
    Member member0  = new Member("tpham@netprotections.co.jp", "01-1234-5678", "Pham Thuc Hung",
            "ファン　トュック　フン", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Member member1  = new Member("vle@netprotections.co.jp", "01-1234-5678", "Le van Hiep",
            "レ　ヴァン　ヒェップ", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Member member2  = new Member("ksato@netprotections.co.jp", "01-1234-5678", "佐藤 健太",
            "さとう　けんた", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Member member3  = new Member("snozaki@netprotections.co.jp", "01-1234-5678", "野崎 才門",
            "のざき　さいもん", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Member member4  = new Member("yiwata@netprotections.co.jp", "01-1234-5678", "岩田 結",
            "いわた　ゆい", "女性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Member member5  = new Member("tnagasaki@netprotections.co.jp", "01-1234-5678", "長崎 太志",
            "ながさき　たいし", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Member member6  = new Member("khukagawa@netprotections.co.jp", "01-1234-5678", "深川 健太",
            "ふかがわ　けんた", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");

    //初期登録メンバーリストの作成
    mList.add(member0);
    mList.add(member1);
    mList.add(member2);
    mList.add(member3);
    mList.add(member4);
    mList.add(member5);
    mList.add(member6);

    //上記のリストをmemberListフィールドにセットする
    user.memberList.addAll(mList);

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
