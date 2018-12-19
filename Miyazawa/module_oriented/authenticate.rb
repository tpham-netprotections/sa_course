module Authenticate

  def sign_in
    if @login_status == nil
        while @login_status == nil
        puts "パスワードを入力してください："
        login = gets.chomp.to_i
        password =1234
          if login == password
            @login_status = true
            puts "ログインしました"
            puts " "
          else
            puts "パスワードが間違っています"
          end
        end
      else
        puts "ログアウトしますか？（YES / NO）"
        logout = gets.chomp.to_s
        if logout == "YES"
          @login_status = nil
          puts "ログアウトしました"
        else
          puts "次の機能を選んでください"
        end
    end
  end

end
