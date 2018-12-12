package jp.co.netprotections.member;

import java.util.Scanner;

import jp.co.netprotections.SystemArchitectureSubject1Application;

public class MemberRegister {

  /**
   * 会員登録をするメソッドです.
   */
  public static void memberRegister() {
    System.out.println("１．会員登録");
    System.out.println("会員情報を入力してください");
    SystemArchitectureSubject1Application member = new SystemArchitectureSubject1Application();
    System.out.print("メールアドレス：");
    Scanner cr1 = new Scanner(System.in);
    String mail_address = cr1.nextLine();
    member.mail_address = mail_address;
    System.out.print("電話番号：");
    Scanner cr2 = new Scanner(System.in);
    String phone_number = cr1.nextLine();
    member.phone_number = phone_number;
    System.out.print("名前（漢字）：");
    Scanner cr3 = new Scanner(System.in);
    String name_kanji = cr3.nextLine();
    member.name_kanji = name_kanji;
    System.out.print("名前（カナ）：");
    Scanner cr4 = new Scanner(System.in);
    String name_kana = cr4.nextLine();
    member.name_kana = name_kana;
    System.out.print("性別：");
    Scanner cr5 = new Scanner(System.in);
    String sex_division = cr5.nextLine();
    member.sex_division = sex_division;
    System.out.print("生年月日：");
    Scanner cr6 = new Scanner(System.in);
    String birth_day = cr6.nextLine();
    member.birth_day = birth_day;
    System.out.print("住所：");
    Scanner cr7 = new Scanner(System.in);
    String address = cr7.nextLine();
    member.address = address;
    SystemArchitectureSubject1Application.memberList.add(7, member);
    System.out.println("会員登録完了しました");
    System.out.println(member.id);
    System.out.println(member.phone_number);
  }

}
