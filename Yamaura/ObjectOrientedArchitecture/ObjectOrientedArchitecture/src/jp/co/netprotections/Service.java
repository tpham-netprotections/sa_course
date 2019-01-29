package jp.co.netprotections;

import java.util.Scanner;



public class Service {


	public static void serviceRegister() {
	    System.out.println("２．サービス利用登録/停止");
	    System.out.print("情報を変更したい会員のidを入力ください");
	    Scanner cr10 = new Scanner(System.in);
	    int selectedId = cr10.nextInt();
	    System.out.println(Member.memberList.get(selectedId).id);
	    System.out.println(Member.memberList.get(selectedId).mail_address);
	    System.out.println(Member.memberList.get(selectedId).phone_number);
	    System.out.println(Member.memberList.get(selectedId).name_kanji);
	    System.out.println(Member.memberList.get(selectedId).name_kana);
	    System.out.println(Member.memberList.get(selectedId).sex_division);
	    System.out.println(Member.memberList.get(selectedId).birth_day);
	    System.out.println(Member.memberList.get(selectedId).address);
	    System.out.println(Member.memberList.get(selectedId).fufululuStatus);
	    System.out.println("１．フフルル：");
	    System.out.println("２．NP後払い：");
	    System.out.println("３．atone：");
	    System.out.print("サービス登録/停止したい番号を入力ください：");
	    Scanner cr11 = new Scanner(System.in);
	    int reqNumber = cr11.nextInt();
	    if (reqNumber == 1) {
	      if (Member.memberList.get(selectedId).fufululuStatus == false) {
	        Member.memberList.get(selectedId).fufululuStatus = true;
	        System.out.println("フフルルサービスを登録しました");
	      }
	      else {
	        Member.memberList.get(selectedId).fufululuStatus = false;
	        System.out.println("フフルルサービスを停止しました");
	      }
	    } else if (reqNumber == 2) {
	      if (Member.memberList.get(selectedId).atobaraiStatus == false) {
	        Member.memberList.get(selectedId).atobaraiStatus = true;
	        System.out.println("NP後払いサービスを登録しました");
	      }
	      else {
	        Member.memberList.get(selectedId).atobaraiStatus = false;
	        System.out.println("NP後払いサービスを停止しました");
	      }
	    } else if (reqNumber == 3) {
	      if ( Member.memberList.get(selectedId).atoneStatus == false) {
	    	 Member.memberList.get(selectedId).atoneStatus = true;
	    	 System.out.println("atoneサービスを登録しました");
	      }
	      else {
	        Member.memberList.get(selectedId).atoneStatus = false;
	        System.out.println("atoneサービスを停止しました");
	      }
	    } else {
	      System.out.println("1~3の番号を入力ください");

	    }
	}



}
