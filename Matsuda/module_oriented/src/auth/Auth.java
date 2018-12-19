package auth;

import java.util.Scanner;

import member.Member;

public class Auth {

    //ログイン・ログアウト機能
    public void login (Member user) {
        System.out.println("-----ログイン/ログアウト機能です-----");
        //ログインしている場合
        if (user.loginStatus == true) {
          //ログアウトする
            System.out.println("ログアウトします。");
            user.loginStatus = false;
        //ログインしていない場合
        } else {
          //ログインする
          System.out.println("ログインします。");
          System.out.print("パスワードを入力してください：");
          Scanner scanner = new Scanner(System.in);
          int inputPassword = scanner.nextInt();

          //パスワードが初期値と一致するまで入力を繰り返させる
          while (inputPassword != user.loginPassword) {
              System.out.print("パスワードを入力してください：");
              inputPassword = scanner.nextInt();
          }

          user.loginStatus = true;
          System.out.println("ログインに成功しました。");

          }


    }

    //ログインチェック機能
    public void loginCheck(Member user) {
        if (user.loginStatus  == false) {
            System.out.println("ログインしてください。");
            Auth currentUser = new Auth();
            currentUser.login(user);
        }
    }


}
