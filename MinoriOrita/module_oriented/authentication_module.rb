module AuthenticaionModule
  def login_logout(login_status)
    if login_status == false
      p "password:"
      get_password = gets.chomp
      if get_password == "1234"
        p "you can login"
        login_status = true
      else
        p "please redo"
      end
    else
      p "you will logout"
      login_status = false
    end
return login_status
  end

  module_function :login_logout
end
