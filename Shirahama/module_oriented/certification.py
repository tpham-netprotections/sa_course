# certification module

# デフォルト設定

password = 1234

# ２．ログイン/ログアウト
def login(login_status):
    global password
    input_password = int(input("パスワードを入力してください:"))

    if input_password == password:
        login_status = True
        print("ログインしました。")
    else:
        print("パスワードが違います")
    return login_status

def logout(login_status):
    select_login_logout = input("ログアウトしますか？(はい/いいえ):")
    if select_login_logout == "はい":
        login_status = False
        print("ログアウトしました")
    else:
        print("メニューに戻ります")
    return login_status