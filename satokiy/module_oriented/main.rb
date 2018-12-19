require('./member_mod.rb')
require('./auth_mod.rb')
require('./data.rb')

@login_status = false
@login_password = "1234"

def menu()
  puts '-------------------会員登録サービス---------------------'
  puts '使用する機能を選んでください'
  menus = ['終了', '新規会員登録', 'ログイン/ログアウト', '会員情報検索', '会員情報変更', 'サービス利用登録/停止']

  index = 0
  menus.each do |menu|

    puts "#{index}.#{menu}"
    index += 1
  end

  @order = gets.chomp.to_i
  selected_menu = menus[@order]


  puts "------------------#{selected_menu}----------------------"
  if @order == 1
    @members = Member.register(@members)
  end

  if @order == 2
    @login_status = Auth.login(@login_status)
  end

  if @order == 3
    if @login_status == true
      @member = Member.search(@members)
    else
      puts 'ログインしてください'
      @login_status = Auth.login(@login_status)
    end
  end

  if @order == 4
    if @login_status == true
      @members = Member.change(@members)
    else
      puts 'ログインしてください'
      @login_status = Auth.login(@login_status)
    end
  end

  if @order == 0
    exit
  end
end

while true do
  menu
end
