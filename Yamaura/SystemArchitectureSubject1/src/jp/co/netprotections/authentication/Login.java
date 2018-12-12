package jp.co.netprotections.authentication;

import java.util.Scanner;

import jp.co.netprotections.SystemArchitectureSubject1Application;

public class Login {

  /**
   * ログインメソッドです.
   */
  public static void login() {
    System.out.println("2．ログイン");
    System.out.print("パスワードを入力してください：");
    Scanner cr9 = new Scanner(System.in);
    if (cr9.nextInt() == 1234) {
      SystemArchitectureSubject1Application.loginStatus = true;
      System.out.println("ログイン完了しました");
    } else {
      System.out.println("ログインに失敗しました");
    }
  }

}
