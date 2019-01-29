package jp.co.netprotections;

import java.util.Scanner;

import jp.co.netprotections.Interface.CsMemberApplication;
import jp.co.netprotections.Interface.CustomerApplication;

public class Authentication {

      /**
       * loginStatusの値でログインをするか、ログアウトをするか条件分岐します.
       */
	 public static void loginLogout(boolean loginStatus) {
		 if (loginStatus == false) {
	       loginMessage();
		   Scanner ps = new Scanner(System.in);
		   int password = ps.nextInt();
	       login(password);
		 } else {
		   logout();
		 }
	 }



      /**
       * ログインメッセージを表示するメソッドです.
       */
	  public static void loginMessage() {
  	    System.out.print("パスワードを入力してください：");
	  }

	  /**
	   * ログインメソッドです.
	   */
	  public static void login(int password) {
	    if (password == 1234) {
	    	CsMemberApplication.loginStatus = true;
	    	CustomerApplication.loginStatus = true;
	      System.out.println("ログイン完了しました");
	    } else {
	      System.out.println("ログインに失敗しました");
	    }
	  }

	  /**
	   * ログアウトをします.
	   */
	  public static void logout() {
	    CsMemberApplication.loginStatus = false;
	    CustomerApplication.loginStatus = false;
	    System.out.println("ログアウトしました");
	  }

}