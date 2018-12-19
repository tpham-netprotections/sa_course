require '.\user_data.rb'
require '.\member.rb'
require  '.\authenticate.rb'
require '.\service.rb'

include Member
include Authenticate
include Service

@login_status = nil

while true
  puts "=========会員管理サービス=========
  １．会員登録
  ２．ログイン/ログアウト
  ３．会員情報検索
  ４．会員情報変更
  ５．サービス利用登録/停止
  ０．終了
  機能を選んでください：
  "
  input = gets.chomp.to_i
  # puts input.class
  if input == 1
    sign_up()

  elsif input == 2
    sign_in()

  elsif input == 3
    if @login_status == true
      show()
    else
      puts "機能を使うにはログインしてください"
      sign_in()
      show()
    end

  elsif input == 4
    if @login_status == true
      change()
    else
      puts "機能を使うにはログインしてください"
      sign_in()
      change()
    end
  elsif input == 5
    if @login_status == true
      delete_user()
    else
      puts "機能を使うにはログインしてください"
      sign_in()
      delete_user()
    end

  elsif input == 0 && @login_status == true
    exit()
    break
  end
end
