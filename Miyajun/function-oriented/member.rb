@members = {
  0 => { 'mail_address' => "tpham@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "Pham Thuc Hung", 'name_kana' => "ファン　トュック　フン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階" },
  1 => { 'mail_address' => "vle@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "Le van Hiep", 'name_kana' => "ファン　トュック　フン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階" },
  2 => { 'mail_address' => "ksato@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "佐藤 健太", 'name_kana' => "サトウ　ケンタ", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階" },
  3 => { 'mail_address' => "snozaki@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "野崎 才門", 'name_kana' => "ノザキ　サイモン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階" },
  4 => { 'mail_address' => "yiwata@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "岩田 結", 'name_kana' => "イワタ　ユイ", 'sex_division' => "女性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階" },
  5 => { 'mail_address' => "tnagasaki@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "長崎 太志", 'name_kana' => "ナガザキ　タイシ", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階" },
  6 => { 'mail_address' => "kfukakawa@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "深川 健太", 'name_kana' => "フカケン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階" }
}

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

def create_user
  print "情報を入力してください:\n"
  new_id = @members.to_a.last[0] + 1
  print "1. メールアドレス: "
  mail_address = gets.chomp
  print "2. 電話番号: "
  phone_number = gets.chomp
  print "3. 名前（漢字）: "
  name_kanji = gets.chomp
  print "4. 名前（カナ）: "
  name_kana = gets.chomp
  print "5. 性別: "
  sex_division = gets.chomp
  print "6. 生年月日: "
  birth_day = gets.chomp
  print "7. 住所: "
  address = gets.chomp
  @members.store(new_id, {
    "mail_address" => mail_address,
    "phone_number" => phone_number,
    "name_kanji"   => name_kanji,
    "name_kana"    => name_kana,
    "sex_division" => sex_division,
    "birth_day"    => birth_day,
    "address"      => address
  })
  print "会員登録を完了しました\n"
end

def show_info
  print "情報を表示したい会員のidを入力してください\n"
  print "id: "
  id = gets.chomp
  if @members[id.to_i]
    puts "id: #{id} の情報は以下です\n"
    print "----------------------------------------\n"
    print " 0. id : "
    puts id
    print " 1. メールアドレス : "
    puts @members[id.to_i]['mail_address']
    print " 2. 電話番号 : "
    puts @members[id.to_i]["phone_number"]
    print " 3. 名前（漢字） : "
    puts @members[id.to_i]["name_kanji"]
    print " 4. 名前（カナ） : "
    puts @members[id.to_i]["name_kana"]
    print " 5. 性別 : "
    puts @members[id.to_i]["sex_division"]
    print " 6. 生年月日 : "
    puts @members[id.to_i]["birth_day"]
    print " 7. 住所 : "
    puts @members[id.to_i]["address"]
    print "----------------------------------------\n"
  else
    puts "id : #{id} の会員は存在しません\n"
  end
end

def change_info
  print "情報を変更したい会員のidを入力してください\n"
  print "id : "
  id = gets.chomp
  if @members[id.to_i]
    print "----------------------------------------\n"
    print " 1. メールアドレス : "
    puts @members[id.to_i]['mail_address']
    print " 2. 電話番号 : "
    puts @members[id.to_i]["phone_number"]
    print " 3. 名前（漢字） : "
    puts @members[id.to_i]["name_kanji"]
    print " 4. 名前（カナ） : "
    puts @members[id.to_i]["name_kana"]
    print " 5. 性別 : "
    puts @members[id.to_i]["sex_division"]
    print " 6. 生年月日 : "
    puts @members[id.to_i]["birth_day"]
    print " 7. 住所 : "
    puts @members[id.to_i]["address"]
    print "----------------------------------------\n"
    puts "id : #{id} の変更したい情報を選択してください"
    print ": "
    choice = gets.chomp
    if choice == "1"
      print "新しい情報を入力してください: "
      @new_info                         = gets.chomp
      @members[id.to_i]['mail_address'] = @new_info
      print "情報を変更しました\n"
    end
    if choice == "2"
      print "新しい情報を入力してください: "
      @new_info                         = gets.chomp
      @members[id.to_i]['phone_number'] = @new_info
      print "情報を変更しました\n"
    end
    if choice == "3"
      print "新しい情報を入力してください: "
      @new_info                       = gets.chomp
      @members[id.to_i]['name_kanji'] = @new_info
      print " 情報を変更しました\n"
    end
    if choice == "4"
      print "新しい情報を入力してください: "
      @new_info                      = gets.chomp
      @members[id.to_i]['name_kana'] = @new_info
      print "情報を変更しました\n"
    end
    if choice == "5"
      print "新しい情報を入力してください: "
      @new_info                         = gets.chomp
      @members[id.to_i]['sex_division'] = @new_info
      print "情報を変更しました\n"
    end
    if choice == " 6 "
      print "新しい情報を入力してください: "
      @new_info                      = gets.chomp
      @members[id.to_i]['birth_day'] = @new_info
      print "情報を変更しました\n"
    end
    if choice == " 7 "
      print "新しい情報を入力してください: "
      @new_info                    = gets.chomp
      @members[id.to_i]['address'] = @new_info
      print "情報を変更しました\n"
    end
  else
    puts "id : #{id} の会員は存在しません\n"
  end
end

def menu()
  print "---会員管理サービス---------------------\n"
  print "1. 新規会員登録\n"
  print "2. ログイン／ログアウト\n"
  print "3. 会員情報検索\n"
  print "4. 会員情報変更\n"
  print "----------------------------------------\n"
  print "アクションを選択してください: "
  input = gets.chomp
  if @session
    if input == "1"
      create_user
    end
    if input == "2"
      logout
    end
    if input == "3"
      show_info
    end
    if input == "4"
      change_info
    end
  else
    if input == 2
      login
    else
      print "ログインしてください\n"
      login
    end
  end
end

while (true)
  menu()
end

