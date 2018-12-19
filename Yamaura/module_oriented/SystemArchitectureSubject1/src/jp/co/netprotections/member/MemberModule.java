package jp.co.netprotections.member;

import java.util.Scanner;

import jp.co.netprotections.membersList.MembersList;

public class MemberModule {

	  /**
	   * 会員登録をするメソッドです.
	   */
	  public static void memberRegister() {
	    System.out.println("１．会員登録");
	    System.out.println("会員情報を入力してください");
	    MembersList member = new MembersList();
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
	    MembersList.memberList.add(7, member);
	    System.out.println("会員登録完了しました");
	    System.out.println(member.id);
	    System.out.println(member.mail_address);
	    System.out.println(member.phone_number);
	    System.out.println(member.name_kanji);
	    System.out.println(member.name_kana);
	    System.out.println(member.sex_division);
	    System.out.println(member.birth_day);
	    System.out.println(member.address);
	  }

	  /**
	   * 会員検索をするメソッドです.
	   */
	  public static void memberSearch() {
	    System.out.println("3．会員検索");
	    System.out.print("検索したい会員のidを入力ください：");
	    Scanner cr8 = new Scanner(System.in);
	    int selectedId = cr8.nextInt() ;
	    System.out.println("id：" + MembersList.memberList.get(selectedId).id);
	    System.out.println("メールアドレス：" + MembersList.memberList.get(selectedId).mail_address);
	    System.out.println("電話番号：" + MembersList.memberList.get(selectedId).phone_number);
	    System.out.println("名前（漢字）：" + MembersList.memberList.get(selectedId).name_kanji);
	    System.out.println("名前（カナ）：" + MembersList.memberList.get(selectedId).name_kana);
	    System.out.println("性別 ：" + MembersList.memberList.get(selectedId).sex_division);
	    System.out.println("生年月日 ：" + MembersList.memberList.get(selectedId).sex_division);
	    System.out.println("住所 ：" + MembersList.memberList.get(selectedId).address);
	  }

	  /**
	   * 会員情報の変更をします.
	   */
	  public static void memberEdit() {
	    System.out.println("４．会員情報変更");
	    System.out.print("情報を変更したい会員のidを入力ください");
	    Scanner cr10 = new Scanner(System.in);
	    int selectedId = cr10.nextInt();
	    System.out.println(MembersList.memberList.get(selectedId).id);
	    System.out.println(MembersList.memberList.get(selectedId).mail_address);
	    System.out.println(MembersList.memberList.get(selectedId).phone_number);
	    System.out.println(MembersList.memberList.get(selectedId).name_kanji);
	    System.out.println(MembersList.memberList.get(selectedId).name_kana);
	    System.out.println(MembersList.memberList.get(selectedId).sex_division);
	    System.out.println(MembersList.memberList.get(selectedId).birth_day);
	    System.out.println(MembersList.memberList.get(selectedId).address);
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
	      MembersList.memberList.get(selectedId).mail_address = cr12.nextLine();
	    } else if (reqNumber == 2) {
	      System.out.println("電話番号を入力してください：");
	      Scanner cr13 = new Scanner(System.in);
	      MembersList.memberList.get(selectedId).phone_number = cr13.nextLine();
	    } else if (reqNumber == 3) {
	      System.out.println("名前（漢字)を入力してください：");
	      Scanner cr14 = new Scanner(System.in);
	      MembersList.memberList.get(selectedId).name_kanji = cr14.nextLine();
	    } else if (reqNumber == 4) {
	      System.out.println("名前（カナ)を入力してください：");
	      Scanner cr15 = new Scanner(System.in);
	      MembersList.memberList.get(selectedId).name_kana = cr15.nextLine();
	    } else if (reqNumber == 5) {
	      System.out.println("性別を入力してください：");
	      Scanner cr16 = new Scanner(System.in);
	      MembersList.memberList.get(selectedId).sex_division = cr16.nextLine();
	    } else if (reqNumber == 6) {
	      System.out.println("生年月日を入力してください：");
	      Scanner cr17 = new Scanner(System.in);
	      MembersList.memberList.get(selectedId).birth_day = cr17.nextLine();
	    } else if (reqNumber == 7) {
	      System.out.println("住所を入力してください：");
	      Scanner cr18 = new Scanner(System.in);
	      MembersList.memberList.get(selectedId).address = cr18.nextLine();
	    } else {
	      System.out.println("1~7の番号を入力ください");

	    }
	    System.out.println(MembersList.memberList.get(selectedId).id);
	    System.out.println(MembersList.memberList.get(selectedId).mail_address);
	    System.out.println(MembersList.memberList.get(selectedId).phone_number);
	    System.out.println(MembersList.memberList.get(selectedId).name_kanji);
	    System.out.println(MembersList.memberList.get(selectedId).name_kana);
	    System.out.println(MembersList.memberList.get(selectedId).sex_division);
	    System.out.println(MembersList.memberList.get(selectedId).birth_day);
	    System.out.println(MembersList.memberList.get(selectedId).address);
	  }

}
