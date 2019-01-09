module User_authentication
  @pass = "1234"

  def self.login(login_status)
    if login_status == false
      puts("====================================")
      puts "ログインパスワードをどうぞ？"
      get_pass = gets.chomp
      if get_pass == @pass #パスワードあってる時
        login_status = true
        puts "ログイン成功です。"
      else
        puts "パスワードちがいます。"
      end
    else
      #ログイン状態からログアウト状態に変える
      login_status = false
      puts "ログアウトしました。"
    end
    return login_status
  end

  def self.search(login_status, members)
    if login_status == false
      puts("====================================")
      puts "ログインしてからやりなおしてください。"
      #2.ログイン/ログアウトにジャンプ

    else login_status == true
    puts "探したいユーザーIDは？"
    user_id = gets.chomp
    puts members[user_id.to_i]
    end
  end



  def self.change
    if #ログインしていない時
    puts("====================================")
      puts "ログインしてからやりなおしてください。"
      #2.ログイン/ログアウトにジャンプ

    else #ログインしている時
      puts "どの会員変更するか？"
      user_id = gets.chomp
      puts @members[user_id.to_i]
      puts "何を変更しますか。
            １．メールアドレス
            ２．電話番号
            ３．名前漢字
            ４．名前かな
            ５．性別
            ６．誕生日
            ７. 住所"
      change_input == gets.chomp

      if change_input == 1
        puts "メールアドレス？"
        mail_address = gets.chomp
        @@members[user_id]['mail_address'] = mail_address

      elsif change_input == 2
        puts "電話番号？"
        phone_number = gets.chomp
        @members[user_id]['phone_number'] = phone_number

      elsif change_input == 3
        puts "名前漢字？"
        name_kanji = gets.chomp
        @members[user_id]['name_kanji'] = name_kanji

      elsif change_input == 4
        puts "名前かな？"
        name_kana = gets.chomp
        @members[user_id]['name_kana'] = name_kana

      elsif change_input == 5
        puts "性別？"
        sex_division = gets.chomp
        @@members[user_id]['sex_division'] = sex_division

      elsif change_input == 6
        puts "誕生日？"
        birth_day = gets.chomp
        @@members[user_id]['birth_day'] = birth_day

      elsif change_input == 7
        puts "住所？"
        address = gets.chomp
        @members[user_id]['address'] = address
      end
    end
  end
end







