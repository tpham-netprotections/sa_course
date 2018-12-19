# 新規登録
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

# ユーザー検索
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

# ユーザー情報変更
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
