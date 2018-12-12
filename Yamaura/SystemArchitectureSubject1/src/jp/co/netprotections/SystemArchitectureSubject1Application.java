package jp.co.netprotections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemArchitectureSubject1Application {

  static boolean loginStatus = false;

  /**
   * メインメソッド.
   * @param args
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    List<Members> memberList = new ArrayList<Members>();
    Members member1 = new Members(1, "tpham@netprotections.co.jp", "01-1234-5678", "Pham Thuc Hung", "ファン　トュック　フン", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Members member2 = new Members(2,"vle@netprotections.co.jp", "01-1234-5678", "Le van Hiep", "ファン　トュック　フン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Members member3 = new Members(3, "ksato@netprotections.co.jp", "01-1234-5678", "佐藤 健太",  "サトウ　ケンタ",  "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Members member4 = new Members(4, "snozaki@netprotections.co.jp",  "01-1234-5678",   "野崎 才門",  "ノザキ　サイモン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Members member5 = new Members(5, "yiwata@netprotections.co.jp",  "01-1234-5678",  "岩田 結",  "イワタ　ユイ",  "女性", "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Members member6 = new Members(6,  "tnagasaki@netprotections.co.jp", "01-1234-5678", "長崎 太志", "ナガザキ　タイシ", "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    Members member7 = new Members(6, "kfukakawa@netprotections.co.jp",  "01-1234-5678",  "深川 健太",  "フカケン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階");
    memberList.add(0, member1);
    memberList.add(1, member2);
    memberList.add(2, member3);
    memberList.add(3, member4);
    memberList.add(4, member5);
    memberList.add(5, member6);
    memberList.add(6, member7);
    while (true) {
      System.out.println("=========会員管理サービス=========");
      System.out.println("１．会員登録");
      System.out.println("２．ログイン/ログアウト");
      System.out.println("３．会員情報検索");
      System.out.println("４．会員情報変更");
      System.out.println("５．サービス利用登録/停止");
      System.out.println("０．終了");
      System.out.println("機能を選んでください：");
      Scanner cr0 = new Scanner(System.in);
      int selectedNumber = cr0.nextInt();
      if (selectedNumber == 1) {
        System.out.println("１．会員登録");
        System.out.println("会員情報を入力してください");
        Members member = new Members();
        member.setId(7);
        System.out.print("メールアドレス：");
        Scanner cr1 = new Scanner(System.in);
        String mail_address = cr1.nextLine();
        member.setMail_address(mail_address);
        System.out.print("電話番号：");
        Scanner cr2 = new Scanner(System.in);
        String phone_number = cr1.nextLine();
        member.setPhone_number(phone_number);
        System.out.print("名前（漢字）：");
        Scanner cr3 = new Scanner(System.in);
        String name_kanji = cr3.nextLine();
        member.setName_kanji(name_kanji);
        System.out.print("名前（カナ）：");
        Scanner cr4 = new Scanner(System.in);
        String name_kana = cr4.nextLine();
        member.setName_kana(name_kana);
        System.out.print("性別：");
        Scanner cr5 = new Scanner(System.in);
        String sex_division = cr5.nextLine();
        member.setName_kana(sex_division);
        System.out.print("生年月日：");
        Scanner cr6 = new Scanner(System.in);
        String birth_day = cr6.nextLine();
        member.setName_kana(birth_day);
        System.out.print("住所：");
        Scanner cr7 = new Scanner(System.in);
        String address = cr7.nextLine();
        member.setName_kana(address);
        memberList.add(7, member);
        System.out.println("会員登録完了しました");

      } else if (selectedNumber == 3) {
    	  System.out.println("3．会員検索");
    	  if (loginStatus == true) {
    		System.out.print("検索したい会員のidを入力ください：");
    		Scanner cr8 = new Scanner(System.in);
           	int selectedID = cr8.nextInt() ;
        	System.out.println("id：" + memberList.get(selectedID).getId());
        	System.out.println("メールアドレス：" + memberList.get(selectedID).getMail_address());
        	System.out.println("電話番号：" + memberList.get(selectedID).getPhone_number());
        	System.out.println("名前（漢字）：" + memberList.get(selectedID).getName_kanji());
        	System.out.println("名前（カナ）：" + memberList.get(selectedID).getName_kana());
        	System.out.println("性別 ：" + memberList.get(selectedID).getSex_division());
        	System.out.println("生年月日 ：" + memberList.get(selectedID).getBirth_day());
        	System.out.println("住所 ：" + memberList.get(selectedID).getAddress());
    	  } else {
    	    System.out.println("ログインが必要です");
    	    System.out.print("パスワードを入力してください：");
    	    Scanner password = new Scanner(System.in);
    	    if (password.nextInt() == 1234) {
    	      loginStatus = true;
      		  System.out.println("3．会員検索");
      	      System.out.print("検索したい会員のidを入力ください：");
      	      Scanner cr8 = new Scanner(System.in);
              int selectedID = cr8.nextInt() ;
          	  System.out.println("id：" + memberList.get(selectedID).getId());
          	  System.out.println("メールアドレス：" + memberList.get(selectedID).getMail_address());
          	  System.out.println("電話番号：" + memberList.get(selectedID).getPhone_number());
          	  System.out.println("名前（漢字）：" + memberList.get(selectedID).getName_kanji());
          	  System.out.println("名前（カナ）：" + memberList.get(selectedID).getName_kana());
          	  System.out.println("性別 ：" + memberList.get(selectedID).getSex_division());
          	  System.out.println("生年月日 ：" + memberList.get(selectedID).getBirth_day());
          	  System.out.println("住所 ：" + memberList.get(selectedID).getAddress());
            } else {
               System.out.println("ログインに失敗しました");
            }
    	  }

      } else if (selectedNumber == 2) {
          method2();
      } else if (selectedNumber == 4) {
    	  System.out.println("４．会員情報変更");
    	  if (loginStatus == true) {
    	  System.out.print("情報を変更したい会員のidを入力ください");
          Scanner cr10 = new Scanner(System.in);
          int selectedId = cr10.nextInt();
          System.out.println("id：" + memberList.get(selectedId).getId());
          System.out.println("メールアドレス：" + memberList.get(selectedId).getMail_address());
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
        	  memberList.get(selectedId).setMail_address(cr12.nextLine());
          } else if (reqNumber == 2) {
        	  System.out.println("電話番号を入力してください：");
        	  Scanner cr13 = new Scanner(System.in);
        	  memberList.get(selectedId).setPhone_number(cr13.nextLine());
          } else if (reqNumber == 3) {
        	  System.out.println("名前（漢字)を入力してください：");
        	  Scanner cr14 = new Scanner(System.in);
        	  memberList.get(selectedId).setName_kanji(cr14.nextLine());
          } else if (reqNumber == 4) {
        	  System.out.println("名前（カナ)を入力してください：");
        	  Scanner cr15 = new Scanner(System.in);
        	  memberList.get(selectedId).setName_kana(cr15.nextLine());
          } else if (reqNumber == 5) {
        	  System.out.println("性別を入力してください：");
        	  Scanner cr16 = new Scanner(System.in);
        	  memberList.get(selectedId).setSex_division(cr16.nextLine());
          } else if (reqNumber == 6) {
        	  System.out.println("生年月日を入力してください：");
        	  Scanner cr17 = new Scanner(System.in);
        	  memberList.get(selectedId).setBirth_day(cr17.nextLine());
          } else if (reqNumber == 7) {
        	  System.out.println("住所を入力してください：");
        	  Scanner cr18 = new Scanner(System.in);
        	  memberList.get(selectedId).setAddress(cr18.nextLine());
          } else {
        	  System.out.println("1~7の番号を入力ください");
          }
    	  } else {
      	    System.out.println("ログインが必要です");
      	    System.out.print("パスワードを入力してください：");
      	    Scanner password = new Scanner(System.in);
      	    if (password.nextInt() == 1234) {
      	      loginStatus = true;
        	  System.out.print("情報を変更したい会員のidを入力ください");
              Scanner cr10 = new Scanner(System.in);
              int selectedId = cr10.nextInt();
              System.out.println("id：" + memberList.get(selectedId).getId());
              System.out.println("メールアドレス：" + memberList.get(selectedId).getMail_address());
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
            	  memberList.get(selectedId).setMail_address(cr12.nextLine());
              } else if (reqNumber == 2) {
            	  System.out.println("電話番号を入力してください：");
            	  Scanner cr13 = new Scanner(System.in);
            	  memberList.get(selectedId).setPhone_number(cr13.nextLine());
              } else if (reqNumber == 3) {
            	  System.out.println("名前（漢字)を入力してください：");
            	  Scanner cr14 = new Scanner(System.in);
            	  memberList.get(selectedId).setName_kanji(cr14.nextLine());
              } else if (reqNumber == 4) {
            	  System.out.println("名前（カナ)を入力してください：");
            	  Scanner cr15 = new Scanner(System.in);
            	  memberList.get(selectedId).setName_kana(cr15.nextLine());
              } else if (reqNumber == 5) {
            	  System.out.println("性別を入力してください：");
            	  Scanner cr16 = new Scanner(System.in);
            	  memberList.get(selectedId).setSex_division(cr16.nextLine());
              } else if (reqNumber == 6) {
            	  System.out.println("生年月日を入力してください：");
            	  Scanner cr17 = new Scanner(System.in);
            	  memberList.get(selectedId).setBirth_day(cr17.nextLine());
              } else if (reqNumber == 7) {
            	  System.out.println("住所を入力してください：");
            	  Scanner cr18 = new Scanner(System.in);
            	  memberList.get(selectedId).setAddress(cr18.nextLine());
              } else {
            	  System.out.println("1~7の番号を入力ください");
              }
    	  } else {
    		  System.out.println("ログインに失敗しました");
    	  }
    	  }

      } else {
        System.out.println("０．終了");
      }

    }
  }


  static void method2() {
  	if (loginStatus == false) {
        System.out.println("2．ログイン");
        System.out.print("パスワードを入力してください：");
        Scanner cr9 = new Scanner(System.in);
        if (cr9.nextInt() == 1234) {
          loginStatus = true;
          System.out.println("ログイン完了しました");
        } else {
          System.out.println("ログインに失敗しました");
        }
	} else {
		System.out.println("2．ログアウト");
		boolean loginStatus = false;
		System.out.println("ログアウトしました");
	}
  }


}









