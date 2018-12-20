module Authentication

  require('./data.rb')

  def login
    if @login == true
      puts "You already logged in."
      puts "Do you want to logout?"
      puts "Yes => y / No => n"
      log = gets.chomp
      if log == "y"
        @login = nil
        puts "logged out."
      end
    else
      puts "password?"
      password = gets.chomp
      if password == "1234"
        @login = true
        puts "logged in."
      else
        # puts "Please try again. password?"
        # login()
        puts "Please try again."
      end
    end
  end
  module_function :login

end
