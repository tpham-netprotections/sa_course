require('./member_module.rb')
#include MemberModule
require('./authentication_module.rb')
require('./data.rb')

#会員情報の項目を配列に入れる
@item=['mail_address','phone_number','name_kanji','name_kana','sex_division','birth_day','address']

#login statusのデフォルトをfalseにする
$login_status = false

def menu
  #メニューを表示する
  p "---------------------"
  p "1.member_register"
  p "2.login/logout"
  p "3.member_search"
  p "4.member_edit"
  p "0.end"

  p "select number:"
  @menu = gets.chomp.to_i
  #１なら会員登録
    if @menu == 1
      MemberModule.member_register(@members)
    #２ならログイン・ログアウト
    elsif @menu == 2
      AuthenticaionModule.login_logout($login_status)
    #３なら会員検索
    elsif @menu == 3
      MemberModule.member_search($login_status,@members)
    #４なら会員編集
    elsif @menu == 4
      MemberModule.member_edit($login_status,@members,@item)
    #上記以外なら終わり
    elsif @menu == 0
     exit
    else
      p "input correct number"
    end
end

#menuメソッドを繰り返す
while true do
  menu
end
