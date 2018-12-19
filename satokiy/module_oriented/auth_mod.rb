module Auth

  def login(login_status)
    if login_status == true
      puts 'logoutしました'
      login_status = false
    else
      puts 'パスワードを入力してください'
      puts 'password:'
      password = gets.chomp
      if password == "1234"
        login_status = true
        puts 'loginしました！'
      else
        puts 'パスワードが間違っています。'
      end
    end

    return login_status
  end

  module_function :login
end
