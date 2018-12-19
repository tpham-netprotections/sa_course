package jp.co.netprotections.member;

import java.util.Scanner;

import jp.co.netprotections.SystemArchitectureSubject1Application;

public class MemberSearch {

  /**
   * 会員検索をするメソッドです.
   */
  public static void memberSearch() {
    System.out.println("3．会員検索");
    System.out.print("検索したい会員のidを入力ください：");
    Scanner cr8 = new Scanner(System.in);
    int selectedId = cr8.nextInt() ;
    System.out.println("id：" + SystemArchitectureSubject1Application.memberList.get(selectedId).id);
    System.out.println("メールアドレス：" + SystemArchitectureSubject1Application.memberList.get(selectedId).mail_address);
    System.out.println("電話番号：" + SystemArchitectureSubject1Application.memberList.get(selectedId).phone_number);
    System.out.println("名前（漢字）：" + SystemArchitectureSubject1Application.memberList.get(selectedId).name_kanji);
    System.out.println("名前（カナ）：" + SystemArchitectureSubject1Application.memberList.get(selectedId).name_kana);
    System.out.println("性別 ：" + SystemArchitectureSubject1Application.memberList.get(selectedId).sex_division);
    System.out.println("生年月日 ：" + SystemArchitectureSubject1Application.memberList.get(selectedId).sex_division);
    System.out.println("住所 ：" + SystemArchitectureSubject1Application.memberList.get(selectedId).address);

  }
}
