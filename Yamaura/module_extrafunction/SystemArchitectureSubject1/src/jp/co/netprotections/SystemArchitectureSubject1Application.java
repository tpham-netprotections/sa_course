package jp.co.netprotections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jp.co.netprotections.authentication.AuthenticationModule;
import jp.co.netprotections.member.MemberModule;
import jp.co.netprotections.membersList.MembersList;
import jp.co.netprotections.data.Data;

public class SystemArchitectureSubject1Application {


  public static boolean loginStatus = false;




  /**
   * メインメソッド.
   * @param args
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    List<MembersList> members = new  ArrayList<MembersList>();
    Data data = new Data();
    MembersList.memberList = data.members;

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









