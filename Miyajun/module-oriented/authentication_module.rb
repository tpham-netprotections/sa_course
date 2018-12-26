def login
  print "パスワードを入力してください: "
  password = gets.chomp
  if password == "1234"
    @session = true
    print "ログインしました\n"
  else
    print "パスワードが間違っています\n"
  end
end

def logout
  @session = nil
  print "ログアウトしました\n"
end

def authenticate
  unless @session
    if @input == 2
      login
    else
      print "ログインしてください\n"
      login
    end
  end
end

