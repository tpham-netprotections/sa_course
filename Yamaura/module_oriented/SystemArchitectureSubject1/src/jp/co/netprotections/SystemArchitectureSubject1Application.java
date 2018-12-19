package jp.co.netprotections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jp.co.netprotections.authentication.Login;
import jp.co.netprotections.authentication.Logout;
import jp.co.netprotections.member.MemberEdit;
import jp.co.netprotections.member.MemberRegister;
import jp.co.netprotections.member.MemberSearch;

public class SystemArchitectureSubject1Application {

  public int id;
  public String mail_address;
  public String phone_number;
  public String name_kanji;
  public String name_kana;
  public String sex_division;
  public String birth_day;
  public String address;
  public static boolean loginStatus = false;
  public static List<SystemArchitectureSubject1Application> memberList;

  /**
   *コンストラクタ.
   * @param id2
   * @param mail_address2
   * @param phone_number2
   * @param name_kanji2
   * @param name_kana2
   * @param sex_division2
   * @param birth_day2
   * @param address2
   */
  public SystemArchitectureSubject1Application(
      int id2,
      String mail_address2,
      String phone_number2,
      String name_kanji2,
      String name_kana2,
      String sex_division2,
      String  birth_day2,
      String  address2
  ) {
    this.id = id2;
    this.mail_address = mail_address2;
    this.phone_number = phone_number2;
    this.name_kanji = name_kanji2;
    this.name_kana = name_kana2;
    this.sex_division = sex_division2;
    this. birth_day =  birth_day2;
    this. address =  address2;
  }

  public SystemArchitectureSubject1Application() {
    this.id = 7;
  }

  /**
   * メインメソッド.
   * @param args
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    List<SystemArchitectureSubject1Application> newList = new  ArrayList<SystemArchitectureSubject1Application>();
    SystemArchitectureSubject1Application member1 = new SystemArchitectureSubject1Application(0, "tpham@netprotections.co.jp", "01-1234-5678", "Pham Thuc Hung", "ファン　トュック　フン", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    SystemArchitectureSubject1Application member2 = new SystemArchitectureSubject1Application(1,"vle@netprotections.co.jp", "01-1234-5678", "Le van Hiep", "ファン　トュック　フン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    SystemArchitectureSubject1Application member3 = new SystemArchitectureSubject1Application(2, "ksato@netprotections.co.jp", "01-1234-5678", "佐藤 健太",  "サトウ　ケンタ",  "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    SystemArchitectureSubject1Application member4 = new SystemArchitectureSubject1Application(3, "snozaki@netprotections.co.jp",  "01-1234-5678",   "野崎 才門",  "ノザキ　サイモン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    SystemArchitectureSubject1Application member5 = new SystemArchitectureSubject1Application(4, "yiwata@netprotections.co.jp",  "01-1234-5678",  "岩田 結",  "イワタ　ユイ",  "女性", "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    SystemArchitectureSubject1Application member6 = new SystemArchitectureSubject1Application(5,  "tnagasaki@netprotections.co.jp", "01-1234-5678", "長崎 太志", "ナガザキ　タイシ", "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    SystemArchitectureSubject1Application member7 = new SystemArchitectureSubject1Application(6, "kfukakawa@netprotections.co.jp",  "01-1234-5678",  "深川 健太",  "フカケン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    newList.add(0, member1);
    newList.add(1, member2);
    newList.add(2, member3);
    newList.add(3, member4);
    newList.add(4, member5);
    newList.add(5, member6);
    newList.add(6, member7);
    memberList = newList;

    while (true) {
      printMenu();
      Scanner in = new Scanner(System.in);
      int selectedNumber = in.nextInt();
      if (selectedNumber == 1) {
        MemberRegister.memberRegister();
      } else if (selectedNumber == 2)  {
        if (loginStatus == false) {
          Login.login();
        } else {
          Logout.logout();
        }
      } else if (selectedNumber == 3)  {
        if (loginStatus == true) {
          MemberSearch.memberSearch();
        } else {
          System.out.println("ログインが必要な機能です");
        }
      } else if (selectedNumber == 4)  {
        if (loginStatus == true) {
          MemberEdit.memberEdit();
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









