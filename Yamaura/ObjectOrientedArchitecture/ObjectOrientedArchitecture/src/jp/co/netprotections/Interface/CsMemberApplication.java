package jp.co.netprotections.Interface;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jp.co.netprotections.Authentication;
import jp.co.netprotections.Member;


public class CsMemberApplication {

	public static boolean loginStatus = false;



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    List<Member> newList = new  ArrayList<Member>();
	    Member member1 = new Member(0, "tpham@netprotections.co.jp", "01-1234-5678", "Pham Thuc Hung", "ファン　トュック　フン", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階", false, false, false);
	    Member member2 = new Member(1,"vle@netprotections.co.jp", "01-1234-5678", "Le van Hiep", "ファン　トュック　フン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階", false, false, false);
	    Member member3 = new Member(2, "ksato@netprotections.co.jp", "01-1234-5678", "佐藤 健太", "サトウ　ケンタ", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階", false, false, false);
	    Member member4 = new Member(3, "snozaki@netprotections.co.jp",  "01-1234-5678",   "野崎 才門",  "ノザキ　サイモン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階", false, false, false);
	    Member member5 = new Member(4, "yiwata@netprotections.co.jp",  "01-1234-5678",  "岩田 結",  "イワタ　ユイ",  "女性", "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階", false, false, false);
	    Member member6 = new Member(5,  "tnagasaki@netprotections.co.jp", "01-1234-5678", "長崎 太志", "ナガザキ　タイシ", "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階", false, false, false);
	    Member member7 = new Member(6, "kfukakawa@netprotections.co.jp",  "01-1234-5678",  "深川 健太",  "フカケン",  "男性",  "1991/09/16",  "東京都中央区銀座1-10-6 銀座ファーストビル4階", false, false, false);
	    newList.add(0, member1);
	    newList.add(1, member2);
	    newList.add(2, member3);
	    newList.add(3, member4);
	    newList.add(4, member5);
	    newList.add(5, member6);
	    newList.add(6, member7);
	    Member.memberList = newList;

	    while (true) {
	        printMenu();
	        Scanner in = new Scanner(System.in);
	        int selectedNumber = in.nextInt();
	        if (selectedNumber == 1) {
	          Member.memberRegister();
	        } else if (selectedNumber == 2)  {
	          Authentication.loginLogout(loginStatus);
	        } else if (selectedNumber == 3)  {
	          if (loginStatus == true) {
	            Member.memberSearch();
	          } else {
	            System.out.println("ログインが必要な機能です");
	            Authentication.loginLogout(loginStatus);
	            if (loginStatus == true) {
		            Member.memberSearch();
		          }

	          }
	        } else if (selectedNumber == 4)  {
	          if (loginStatus == true) {
	            Member.memberEdit();
	          } else {
	            System.out.println("ログインが必要な機能です");
	            Authentication.loginLogout(loginStatus);
	            if (loginStatus == true) {
	            	Member.memberSearch();
	            }
	          }
	        } else if (selectedNumber == 0) {
	            System.out.println("０．終了");
	            break;
	        } else {
	        	System.out.println("０～４の数値を入力ください");
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
	      System.out.println("０．終了");
	      System.out.println("機能を選んでください：");
	    }



}
