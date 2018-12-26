module Authentication
  # ファンクションのためのモジュールで、データは持たない
  # require('./data.rb')

  def check(login)
    if login == nil
      puts "you need to login."
      login = login(login)
    end
    return login
  end

  def login(login)
    if login == true
      puts "You already logged in."
      puts "Do you want to logout?"
      puts "Yes => y / No => n"
      log = gets.chomp
      if log == "y"
        login = nil
        puts "logged out."
      end
    else
      puts "password?"
      password = gets.chomp
      if password == "1234"
        login = true
        puts "logged in."
      else
        # puts "Please try again. password?"
        # login()
        puts "Please try again."
      end
    end
    return login
  end

  module_function :login
  module_function :check

end
