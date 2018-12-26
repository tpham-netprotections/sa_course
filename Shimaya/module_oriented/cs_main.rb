require('./data.rb')
require('./service_module.rb')
require('./authentication_module.rb')

@login == nil
# グローバル変数は定義したくない：モジュールの独立性の担保のため

def selection(input)
  case input
  when "1"
    @login = Authentication.login(@login)
  when "2"
    @login = Authentication.check(@login)
    @service_usages = Service.startstop(@service_usages, @services, @members)
  when "0"
    exit
  end
end

def menu()
  puts "=========利用登録サービス=========
  １．ログイン/ログアウト
  ２．サービス利用登録/停止
  ０．終了
  機能を選んでください："
  input = gets.chomp
  selection(input)
end

while true
  menu()
end
