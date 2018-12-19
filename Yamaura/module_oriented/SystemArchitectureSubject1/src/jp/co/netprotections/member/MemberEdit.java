package jp.co.netprotections.member;

import java.util.Scanner;

import jp.co.netprotections.SystemArchitectureSubject1Application;

public class MemberEdit {

  /**
   * 会員情報の変更をします.
   */
  public static void memberEdit() {
    System.out.println("４．会員情報変更");
    System.out.print("情報を変更したい会員のidを入力ください");
    Scanner cr10 = new Scanner(System.in);
    int selectedId = cr10.nextInt();
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).id);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).mail_address);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).phone_number);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).name_kanji);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).name_kana);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).sex_division);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).birth_day);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).address);
    System.out.println("１．メールアドレス：");
    System.out.println("２．電話番号：");
    System.out.println("３．名前（漢字）：");
    System.out.println("４．名前（カナ）：");
    System.out.println("５．性別：");
    System.out.println("６．生年月日：");
    System.out.println("７．住所：");
    System.out.print("変更したい項目番号を入力ください：");
    Scanner cr11 = new Scanner(System.in);
    int reqNumber = cr11.nextInt();
    if (reqNumber == 1) {
      System.out.println("メールアドレスを入力してください：");
      Scanner cr12 = new Scanner(System.in);
      SystemArchitectureSubject1Application.memberList.get(selectedId).mail_address = cr12.nextLine();
    } else if (reqNumber == 2) {
      System.out.println("電話番号を入力してください：");
      Scanner cr13 = new Scanner(System.in);
      SystemArchitectureSubject1Application.memberList.get(selectedId).phone_number = cr13.nextLine();
    } else if (reqNumber == 3) {
      System.out.println("名前（漢字)を入力してください：");
      Scanner cr14 = new Scanner(System.in);
      SystemArchitectureSubject1Application.memberList.get(selectedId).name_kanji = cr14.nextLine();
    } else if (reqNumber == 4) {
      System.out.println("名前（カナ)を入力してください：");
      Scanner cr15 = new Scanner(System.in);
      SystemArchitectureSubject1Application.memberList.get(selectedId).name_kana = cr15.nextLine();
    } else if (reqNumber == 5) {
      System.out.println("性別を入力してください：");
      Scanner cr16 = new Scanner(System.in);
      SystemArchitectureSubject1Application.memberList.get(selectedId).sex_division = cr16.nextLine();
    } else if (reqNumber == 6) {
      System.out.println("生年月日を入力してください：");
      Scanner cr17 = new Scanner(System.in);
      SystemArchitectureSubject1Application.memberList.get(selectedId).birth_day = cr17.nextLine();
    } else if (reqNumber == 7) {
      System.out.println("住所を入力してください：");
      Scanner cr18 = new Scanner(System.in);
      SystemArchitectureSubject1Application.memberList.get(selectedId).address = cr18.nextLine();
    } else {
      System.out.println("1~7の番号を入力ください");

    }
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).id);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).mail_address);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).phone_number);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).name_kanji);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).name_kana);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).sex_division);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).birth_day);
    System.out.println(SystemArchitectureSubject1Application.memberList.get(selectedId).address);
  }

}
