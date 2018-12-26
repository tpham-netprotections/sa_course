require('./member_mod.rb')
require('./auth_mod.rb')
require('./data.rb')

@login_status = false
@login_password = "1234"

def cs_menu()

  puts '-------------------利用登録サービス---------------------'
  puts '使用する機能を選んでください'
  menus = ['終了', 'サービス利用登録/停止', 'ログイン/ログアウト']

  index = 0
  menus.each do |menu|

    puts "#{index}.#{menu}"
    index += 1
  end

  @order = gets.chomp.to_i
  selected_menu = menus[@order]

  puts "------------------#{selected_menu}----------------------"

  if @order == 1
    if @login_status == true
      @service_usages = Member.service_register(@service_usages, @services)
    else
      puts 'ログインしてください'
      @login_status = Auth.login(@login_status)
    end
  end

  if @order == 2
    @login_status = Auth.login(@login_status)
  end

  if @order == 0
    exit
  end
end

while true do
  cs_menu
end
