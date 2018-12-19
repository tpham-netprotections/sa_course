package jp.co.netprotections.authentication;

import jp.co.netprotections.SystemArchitectureSubject1Application;

public class Logout {

  /**
   * ログアウトをします.
   */
  public static void logout() {
    System.out.println("2．ログアウト");
    SystemArchitectureSubject1Application.loginStatus = false;
    System.out.println("ログアウトしました");
  }
}
