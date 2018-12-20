require('./data.rb')
require('./user_module.rb')
require('./authentication_module.rb')

@login == nil

def selection
  if @imput == "1"
    User.signup
  else
    if @imput == "2"
      Authentication.login
    else
      if @imput == "3"
        User.search
      else
        if @imput == "4"
          User.edit
        end
      end
    end
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
  @imput = gets.chomp
  selection
end

while true
  menu()
end
