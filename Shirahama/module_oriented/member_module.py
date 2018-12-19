# member module

members = {
    0:{'mail_address':"tpham@netprotections.co.jp", 'phone_number':"01-1234-5678", 'name_kanji':"Pham Thuc Hung", 'name_kana':"ファン　トュック　フン", 'sex_division':"男性", 'birth_day':"1991/09/16", 'address':"東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    1:{'mail_address':"vle@netprotections.co.jp", 'phone_number':"01-1234-5678", 'name_kanji':"Le van Hiep", 'name_kana':"ファン　トュック　フン", 'sex_division':"男性", 'birth_day':"1991/09/16", 'address':"東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    2:{'mail_address':"ksato@netprotections.co.jp", 'phone_number':"01-1234-5678", 'name_kanji':"佐藤 健太", 'name_kana':"サトウ　ケンタ", 'sex_division':"男性", 'birth_day':"1991/09/16", 'address':"東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    3:{'mail_address':"snozaki@netprotections.co.jp", 'phone_number':"01-1234-5678", 'name_kanji':"野崎 才門", 'name_kana':"ノザキ　サイモン", 'sex_division':"男性", 'birth_day':"1991/09/16", 'address':"東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    4:{'mail_address':"yiwata@netprotections.co.jp", 'phone_number':"01-1234-5678", 'name_kanji':"岩田 結", 'name_kana':"イワタ　ユイ", 'sex_division':"女性", 'birth_day':"1991/09/16", 'address':"東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    5:{'mail_address':"tnagasaki@netprotections.co.jp", 'phone_number':"01-1234-5678", 'name_kanji':"長崎 太志", 'name_kana':"ナガザキ　タイシ", 'sex_division':"男性", 'birth_day':"1991/09/16", 'address':"東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    6:{'mail_address':"kfukakawa@netprotections.co.jp", 'phone_number':"01-1234-5678", 'name_kanji':"深川 健太", 'name_kana':"フカケン", 'sex_division':"男性", 'birth_day':"1991/09/16", 'address':"東京都中央区銀座1-10-6 銀座ファーストビル4階"}
    }

# １．会員登録
def register():
    global members
    global member
    member={}
    member["mail_address"] = input("メールアドレスを入力してください：")
    member["phone_number"] = input("電話番号を入力してください(例：000-0000-0000)：")
    member["name_kanji"] = input("名前を漢字で入力してください(例：山田　太郎)：")
    member["name_kana"] = input("名前をカタカナで入力してください(例：ヤマダ　タロウ)：")
    member["sex_division"] = input("性別を入力してください(男性/女性/その他)：")
    member["birth_day"] = input("誕生日を入力してください(例：1990/01/01)：")
    member["address"] = input("住所を入力してください：")

    print(member)
    members[7] = member
    print(members)


# ３．会員情報検索
def member_search():
    global members
    member_id_select = int(input("表示したいユーザーのIDを選んでください："))
    print(members[member_id_select])


# ４．会員情報変更
def edit():
    global member
    print("1.メールアドレス：%s" %(member["mail_address"]))
    print("2.電話番号：%s" %(member["phone_number"]))
    print("3.名前(漢字)：%s" %(member["name_kanji"]))
    print("4.名前(カナ)：%s" %(member["name_kana"]))
    print("5.性別：%s" %(member["sex_division"]))
    print("6.生年月日：%s" %(member["birth_day"]))
    print("7.住所：%s" %(member["address"]))

    options_select = int(input("何を変更しますか？："))
    member_edit = input("何に変更しますか：")

    options={
        1 : "mail_address",
        2 : "phone_number",
        3 : "name_kanji",
        4 : "name_kana",
        5 : "sex_division",
        6 : "birth_day",
        7 : "address"
    }

    member[options.get(options_select)] = member_edit

    print("変更が完了しました")
    print(member)