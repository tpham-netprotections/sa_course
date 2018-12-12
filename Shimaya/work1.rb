@members = {
      0 => {'mail_address' => "tpham@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "Pham Thuc Hung", 'name_kana' => "ファン　トュック　フン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
      1 => {'mail_address' => "vle@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "Le van Hiep", 'name_kana' => "ファン　トュック　フン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
      2 => {'mail_address' => "ksato@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "佐藤 健太", 'name_kana' => "サトウ　ケンタ", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
      3 => {'mail_address' => "snozaki@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "野崎 才門", 'name_kana' => "ノザキ　サイモン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
      4 => {'mail_address' => "yiwata@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "岩田 結", 'name_kana' => "イワタ　ユイ", 'sex_division' => "女性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
      5 => {'mail_address' => "tnagasaki@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "長崎 太志", 'name_kana' => "ナガザキ　タイシ", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
      6 => {'mail_address' => "kfukakawa@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "深川 健太", 'name_kana' => "フカケン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"}
      }

@login == nil
# そのセッションの間だけ@にはいっていればいい
# この配列に記録される必要はない
# 無限ループで対応する

def signup
  a = {}
  puts "新規会員登録に必要な情報を入力してください。"
  puts "mail_address?"
    mail_address = gets.chomp
    a['mail_address'] = mail_address
  puts "phone_number?"
    phone_number = gets.chomp
    a['phone_number'] = phone_number
  puts "name_kanji?"
    name_kanji = gets.chomp
    a['name_kanji'] = name_kanji
  puts "name_kana?"
    name_kana = gets.chomp
    a['name_kana'] = name_kana
  puts "sex_division?"
    sex_division = gets.chomp
    a['sex_division'] = sex_division
  puts "birth_day?"
    birth_day = gets.chomp
    a['birth_day'] = birth_day
  puts "address?"
    address =  gets.chomp
    a['address'] = address
  @members[@members.length] = a
  puts "会員登録を完了しました。"
end

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

def search
  if @login == nil
    puts "you need to login."
    login()
    search()
  else
    puts "Enter memberID"
    @id = gets.chomp
    @member = @members[@id.to_i]
    puts @member['mail_address']
    puts @member['phone_number']
    puts @member['name_kanji']
    puts @member['name_kana']
    puts @member['birth_day']
    puts @member['address']
  end
end

def edit
  if @login == nil
    puts "you need to login."
    login()
    edit()
  else
    puts "Enter memberID"
    @id = gets.chomp
    @member = @members[@id.to_i]
    puts @member['mail_address']
    puts "=>1"
    puts @member['phone_number']
    puts "=>2"
    puts @member['name_kanji']
    puts "=>3"
    puts @member['name_kana']
    puts "=>4"
    puts @member['birth_day']
    puts "=>5"
    puts @member['address']
    puts "=>6"

    puts "Which to edit? Enter the number."
    @number = gets.chomp
    puts "Enter new content. "
    if @number == "1"
        puts "Enter new mail_address. "
        @content = gets.chomp
        @member['mail_address'] = @content
      else
      if @number == "2"
          puts "Enter new phone_number. "
          @content = gets.chomp
          @member['phone_number'] = @content
        else
        if @number == "3"
            puts "Enter new name_kanji. "
            @content = gets.chomp
            @member['name_kanji'] = @content
          else
          if @number == "4"
              puts "Enter new name_kana. "
              @content = gets.chomp
              @member['name_kana'] = @content
          else
            if @number == "5"
                puts "Enter new birth_day. "
                @content = gets.chomp
                @member['birth_day'] = @content
            else
              if @number == "6"
                  puts "Enter new address. "
                  @content = gets.chomp
                  @member['address'] = @content
              end
            end
          end
        end
      end
    end
    puts "completed."
    puts @member['mail_address']
    puts @member['phone_number']
    puts @member['name_kanji']
    puts @member['name_kana']
    puts @member['birth_day']
    puts @member['address']

  end

end


while true
  puts "=========会員管理サービス=========
  １．会員登録
  ２．ログイン/ログアウト
  ３．会員情報検索
  ４．会員情報変更
  ５．サービス利用登録/停止
  ０．終了
  機能を選んでください~~："
  imput = gets.chomp

  if imput == "1"
    signup()
  else
    if imput == "2"
      login()
    else
      if imput == "3"
        search()
      else
        if imput == "4"
          edit()
        else
          if imput == "5"
            startstop()
          else
            if imput == "0"
              break
            end
          end
        end
      end
    end
  end

end
