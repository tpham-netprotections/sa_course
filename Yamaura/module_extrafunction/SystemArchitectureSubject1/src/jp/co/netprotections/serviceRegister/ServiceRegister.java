package jp.co.netprotections.serviceRegister;

import java.util.Scanner;

import jp.co.netprotections.membersList.MembersList;

public class ServiceRegister {


	public static void serviceRegister() {
	    System.out.println("１．サービス利用登録/停止");
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
	    System.out.println(MembersList.memberList.get(selectedId).fufululuStatus);
	    System.out.println("１．フフルル：");
	    System.out.println("２．NP後払い：");
	    System.out.println("３．atone：");
	    System.out.print("サービス登録/停止したい番号を入力ください：");
	    Scanner cr11 = new Scanner(System.in);
	    int reqNumber = cr11.nextInt();
	    if (reqNumber == 1) {
	      if (MembersList.memberList.get(selectedId).fufululuStatus == false) {
	        MembersList.memberList.get(selectedId).fufululuStatus = true;
	        System.out.println("フフルルサービスを登録しました");
	      }
	      else {
	        MembersList.memberList.get(selectedId).fufululuStatus = false;
	        System.out.println("フフルルサービスを停止しました");
	      }
	    } else if (reqNumber == 2) {
	      if (MembersList.memberList.get(selectedId).atobaraiStatus == false) {
	        MembersList.memberList.get(selectedId).atobaraiStatus = true;
	        System.out.println("NP後払いサービスを登録しました");
	      }
	      else {
	        MembersList.memberList.get(selectedId).atobaraiStatus = false;
	        System.out.println("NP後払いサービスを停止しました");
	      }
	    } else if (reqNumber == 3) {
	      if ( MembersList.memberList.get(selectedId).atoneStatus == false) {
	    	 MembersList.memberList.get(selectedId).atoneStatus = true;
	    	 System.out.println("atoneサービスを登録しました");
	      }
	      else {
	        MembersList.memberList.get(selectedId).atoneStatus = false;
	        System.out.println("atoneサービスを停止しました");
	      }
	    } else {
	      System.out.println("1~3の番号を入力ください");

	    }
	}
}
