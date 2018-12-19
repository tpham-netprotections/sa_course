package jp.co.netprotections.authentication;

import java.util.Scanner;

public class AuthenticationModule {

	public static boolean loginStatus = false;

	  /**
	   * ログインメソッドです.
	   */
	  public static void login() {
	    System.out.println("2．ログイン");
	    System.out.print("パスワードを入力してください：");
	    Scanner cr9 = new Scanner(System.in);
	    if (cr9.nextInt() == 1234) {
	      loginStatus = true;
	      System.out.println("ログイン完了しました");
	    } else {
	      System.out.println("ログインに失敗しました");
	    }
	  }

	  /**
	   * ログアウトをします.
	   */
	  public static void logout() {
	    System.out.println("2．ログアウト");
	    loginStatus = false;
	    System.out.println("ログアウトしました");
	  }

}
