package menu;

import java.util.List;
import java.util.Scanner;

import auth.Auth;
import data.Data;
import member.Member;
import member.MemberModule;

public class MemberMenu {

  public static void main(String[] args) {

      Member user = new Member(null, null, null, null, null, null ,null);

      user.loginStatus = false;
      user.loginPassword = 1234;

      Data data = new Data();
      List<Member> mList = data.defaultMember();

      //初期メンバーのサービス登録ステータスの設定
      data.setServiceStatus();

        while (true) {
            //メニュー画面の表示
            System.out.println("=========会員管理サービス=========\n" +
                    "1．ログイン/ログアウト\n" +
                    "2．サービス利用登録/停止\n" +
                    "機能を選んでください：");

            //メニュー選択（全角数字）
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            //各機能への条件分岐
            MemberModule m = new MemberModule();
            Auth a = new Auth();
            switch (userInput) {
            case 1:
                a.login(user);
                continue;
            case 2:
                m.serviceStartStop(user, mList);
                continue;
            }
        }

  }

}
