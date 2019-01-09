require('./Member_module')
require('./User_authentication')
require('./Data')
@login_status = false
def lets_start
  while true do
    puts "=========会員管理サービス=========
１．会員登録
２．ログイン/ログアウト
３．会員情報検索
４．会員情報変更
５．サービス利用登録/停止
０．終了
機能を選んでください："

    input = gets.chomp

    if input == "1" then
      @members = Member_module.register(@members)

    elsif input == "2" then
      @login_status = User_authentication.login(@login_status)

    elsif input == "3" then
      @login_status = User_authentication.search(@login_status, @members)

    elsif input == "4" then
      p "工事中"

    elsif input == "5" then

      p "工事中"


    else input == "0"
    p "工事中"


    end
  end
end

lets_start


