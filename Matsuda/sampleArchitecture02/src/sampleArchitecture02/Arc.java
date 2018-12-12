package sampleArchitecture02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arc {
   //会員リストのフィールド
    public List<Member> memberList;

   //操作中ユーザーのフィールド
    public boolean loginStatus;
    public int loginPassword;

    //scannerインスタンスのフィールド
    public static Scanner scanner;

    //コンストラクタで会員リストのインスタンスを作成
    public Arc () {
        memberList = new ArrayList<Member>();
//        scanner = new Scanner(System.in);
    }




    public static void main(String[] args) {

                //ユーザーの作成
        Arc user = new Arc();

                //ユーザーの初期値の設定
                user.loginStatus = false;
                user.loginPassword = 1234;

                //デフォルト登録のメンバーを設定
                Member member0  = new Member("tpham@netprotections.co.jp", "01-1234-5678", "Pham Thuc Hung",
                        "ファン　トュック　フン", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
                Member member1  = new Member("vle@netprotections.co.jp", "01-1234-5678", "Le van Hiep",
                        "レ　ヴァン　ヒェップ", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
                Member member2  = new Member("ksato@netprotections.co.jp", "01-1234-5678", "佐藤 健太",
                        "さとう　けんた", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
                Member member3  = new Member("snozaki@netprotections.co.jp", "01-1234-5678", "野崎 才門",
                        "のざき　さいもん", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
                Member member4  = new Member("yiwata@netprotections.co.jp", "01-1234-5678", "岩田 結",
                        "いわた　ゆい", "女性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
                Member member5  = new Member("tnagasaki@netprotections.co.jp", "01-1234-5678", "長崎 太志",
                        "ながさき　たいし", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");
                Member member6  = new Member("khukagawa@netprotections.co.jp", "01-1234-5678", "深川 健太",
                        "ふかがわ　けんた", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階");

                user.memberList.add(member0);
                user.memberList.add(member1);
                user.memberList.add(member2);
                user.memberList.add(member3);
                user.memberList.add(member4);
                user.memberList.add(member5);
                user.memberList.add(member6);


                //本機能
                while (true) {
                    //メニュー画面の表示
                    System.out.println("=========会員管理サービス=========\n" +
                            "1．会員登録\n" +
                            "2．ログイン/ログアウト\n" +
                            "3．会員情報検索\n" +
                            "4．会員情報変更\n" +
                            "5．サービス利用登録/停止\n" +
                            "0．終了\n" +
                            "機能を選んでください：");

                    //メニュー選択（全角数字）
                    Scanner scanner = new Scanner(System.in);
                    int userInput = scanner.nextInt();



                    //各機能への条件分岐
                    switch (userInput) {
                    case 1:
                        user.MemberRegistration(user);
                        continue;
                    case 2:
                        user.login(user);
                        continue;
                    case 3:
                        user.memberSearch(user);
                        continue;
                    case 4:
                        user.memberEdit(user);
                        continue;
                    case 5:
                        user.aboutService(user);
                        continue;
                    case 0:
                        user.exit(user);
                        continue;
                    }
                }
            }

            public void MemberRegistration (Arc user) {
                System.out.println("-----会員登録機能です-----");
                Scanner scanner = new Scanner(System.in);

                System.out.println("=========会員登録=========");
                System.out.println("メールアドレス： ");
                String userMail = scanner.nextLine();
                System.out.println("電話番号： ");
                String userPhoneNumber = scanner.nextLine();
                System.out.println("名前（漢字）：");
                String userNameKanji = scanner.nextLine();
                System.out.println("名前（カナ）：");
                String userNameKana = scanner.nextLine();
                System.out.println("性別：");
                String userSex = scanner.nextLine();
                System.out.println("生年月日：");
                String userBirthday = scanner.nextLine();
                System.out.println("住所：");
                String userAddress = scanner.nextLine();

                //ユーザーのリストへの登録
//                List<Member> members = new ArrayList<Member>();
                Member newMember = new Member(userMail, userPhoneNumber, userNameKanji, userNameKana,
                        userSex, userBirthday, userAddress);
//                members.add(newMember);
                user.memberList.add(newMember);
                System.out.println("新規会員" + userNameKanji + "を登録しました！");

            }

            public void login (Arc user) {
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

            public void loginCheck(Arc user) {
                if (user.loginStatus  == false) {
                    System.out.println("ログインしてください。");
                    Arc currentUser = new Arc();
                    currentUser.login(user);
                }
            }

            public void memberSearch (Arc user) {
                System.out.println("-----会員検索機能です-----");

                user.loginCheck(user);

                //検索したい会員IDの入力
                Scanner scanner = new Scanner(System.in);
                System.out.print("検索したい会員IDを入力してください：");
                int memberId = scanner.nextInt();

                //SearchMemberIdメソッドの呼び出し
                Member searchResult = user.searchWithId(memberId);

                if (searchResult != null) {
                    searchResult.printMemberData(searchResult);
                } else {
                    System.out.println("会員ID" + memberId + "は存在しません。");
                }
            }

            public Member searchWithId (int id) {
                //メンバーIDでメンバーが登録されているか検索
                Member member = memberList.get(id);


                //登録されていたらそのメンバーのデータを返す
                if (member != null) {
                    return member;
                //されていない場合、空の値を返す
                } else {
                    return null;
                }

              }

            public void memberEdit (Arc user) {
                System.out.println("-----会員編集機能です-----");

                System.out.println("検索したい会員IDを入力してください：");
                Scanner scanner = new Scanner(System.in);
                int editId = scanner.nextInt();

                Member searchedMember = user.memberList.get(editId);

                if (searchedMember != null) {
                    searchedMember.printMemberData(searchedMember);
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("変更したい項目番号を入力してください");
                    String inputNumber = scanner2.nextLine();
                    System.out.println("変更したい値を入力してください");
                    String editInput = scanner2.nextLine();

                    switch (inputNumber) {

                    case "1":
                        searchedMember.userMail = editInput;
                        break;
                    case "2":
                        searchedMember.userPhoneNumber = editInput;
                        break;
                    case "3":
                        searchedMember.userNameKanji = editInput;
                        break;
                    case "4":
                        searchedMember.userNameKana = editInput;
                        break;
                    case "5":
                        searchedMember.userSex = editInput;
                        break;
                    case "6":
                        searchedMember.userBirthday = editInput;
                        break;
                    case "7":
                        searchedMember.userAddress = editInput;
                        break;
                    }

                    System.out.println("会員情報変更完了しました！");

                }
            }

            public void aboutService (Arc user) {
                System.out.println("-----サービス利用登録/停止機能です-----");

//python版コード
//                def service_register():
//                    login_check()
//                    print("=========サービス利用登録/停止=========")
//                    member_id = int(input("会員IDを入力してください："))
//                    print("０．フフルル")
//                    print("１．NP後払い")
//                    print("２．atone")
//                    service_id = int(input("サービスIDを入力してください："))
//                    if service_usages[member_id][service_id]:
//                        print("サービス利用停止します")
//                        service_usages[member_id][service_id] = False
//                    else:
//                        print("サービス利用開始します")
//                        service_usages[member_id][service_id] = True
            }

            public void exit (Arc user) {
                System.out.println("-----終了機能です-----");

//python版コード
//                def exit():
//                    sys.exit(1)

            }

}


