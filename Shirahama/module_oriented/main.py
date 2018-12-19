# スクリプト起動コマンド：python ~~.py 

import member_module
import certification_module


# デフォルト設定
login_status = False


# menu
def menu():
    global login_status
    print(login_status)
    #ログイン時
    if login_status == True:
        print("""=========会員管理サービス=========
    １．会員登録
    ２．ログアウト
    ３．会員情報検索
    ４．会員情報変更
    ５．サービス利用登録/停止
    ０．終了""")

        select_menu = int(input("メニューを選択してください："))

        if select_menu == 1:
            member_module.register()
            menu()
        elif select_menu == 2:
            login_status = certification_module.logout(login_status)
            menu()
        elif select_menu == 3:
            member_module.member_search()
            menu()
        elif select_menu == 4:
            member_module.edit()
            menu()
        else:
            print("ご利用ありがとうございました。")

    #ログアウト時:
    else:
        print("""=========会員管理サービス=========
    １．会員登録
    ２．ログイン
    ５．サービス利用登録/停止
    ０．終了""")

        select_menu = int(input("メニューを選択してください："))

        if select_menu == 1:
            member_module.register()
            menu()
        elif select_menu == 2:
            login_status = certification_module.login(login_status)
            menu()
        else:
            print("ご利用ありがとうございました。")

menu()