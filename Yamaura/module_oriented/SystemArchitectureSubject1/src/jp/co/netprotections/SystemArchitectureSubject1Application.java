package jp.co.netprotections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jp.co.netprotections.authentication.AuthenticationModule;
import jp.co.netprotections.member.MemberModule;
import jp.co.netprotections.membersList.MembersList;

public class SystemArchitectureSubject1Application {


  public static boolean loginStatus = false;




  /**
   * メインメソッド.
   * @param args
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    List<MembersList> newList = new  ArrayList<MembersList>();
    MembersList member1 = new MembersList(0, "tpham@netprotections.co.jp", "01-1234-5678", "Pham Thuc Hung", "ファン　トュック　フン", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    MembersList member2 = new MembersList(1,"vle@netprotections.co.jp", "01-1234-5678", "Le van Hiep", "ファン　トュック　フン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    MembersList member3 = new MembersList(2, "ksato@netprotections.co.jp", "01-1234-5678", "佐藤 健太", "サトウ　ケンタ", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    MembersList member4 = new MembersList(3, "snozaki@netprotections.co.jp",  "01-1234-5678",   "野崎 才門",  "ノザキ　サイモン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    MembersList member5 = new MembersList(4, "yiwata@netprotections.co.jp",  "01-1234-5678",  "岩田 結",  "イワタ　ユイ",  "女性", "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    MembersList member6 = new MembersList(5,  "tnagasaki@netprotections.co.jp", "01-1234-5678", "長崎 太志", "ナガザキ　タイシ", "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    MembersList member7 = new MembersList(6, "kfukakawa@netprotections.co.jp",  "01-1234-5678",  "深川 健太",  "フカケン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    newList.add(0, member1);
    newList.add(1, member2);
    newList.add(2, member3);
    newList.add(3, member4);
    newList.add(4, member5);
    newList.add(5, member6);
    newList.add(6, member7);
    MembersList.memberList = newList;

    while (true) {
      printMenu();
      Scanner in = new Scanner(System.in);
      int selectedNumber = in.nextInt();
      if (selectedNumber == 1) {
        MemberModule.memberRegister();
      } else if (selectedNumber == 2)  {
        if (AuthenticationModule.loginStatus == false) {
          AuthenticationModule.login();
        } else {
          AuthenticationModule.logout();
        }
      } else if (selectedNumber == 3)  {
        if (AuthenticationModule.loginStatus == true) {
          MemberModule.memberSearch();
        } else {
          System.out.println("ログインが必要な機能です");
        }
      } else if (selectedNumber == 4)  {
        if (AuthenticationModule.loginStatus == true) {
          MemberModule.memberEdit();
        } else {
          System.out.println("ログインが必要な機能です");
        }
      } else {
        System.out.println("０．終了");
      }
    }
  }

  /**
   * menuを表示します.
   */
  public static void printMenu() {
    System.out.println("=========会員管理サービス=========");
    System.out.println("１．会員登録");
    System.out.println("２．ログイン/ログアウト");
    System.out.println("３．会員情報検索");
    System.out.println("４．会員情報変更");
    System.out.println("５．サービス利用登録/停止");
    System.out.println("０．終了");
    System.out.println("機能を選んでください：");
  }





}









