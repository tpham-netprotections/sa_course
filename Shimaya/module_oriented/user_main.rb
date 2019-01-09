require('./data.rb')
require('./user_module.rb')
require('./authentication_module.rb')

@login == nil
# グローバル変数は定義したくない：モジュールの独立性の担保のため

def selection(input)
  case input
  when "1"
    @members = User.signup(@members)
  when "2"
    @login = Authentication.login(@login)
  when "3"
    @login = Authentication.check(@login)
    User.search(@members)
  when "4"
    @login = Authentication.check(@login)
    @members = User.edit(@members)
  when "0"
    exit
  end
end

def menu()
  puts "=========会員管理サービス=========
  １．会員登録
  ２．ログイン/ログアウト
  ３．会員情報検索
  ４．会員情報変更
  ５．サービス利用登録/停止
  ０．終了
  機能を選んでください~~："
  input = gets.chomp
  selection(input)
end

while true
  menu()
end
