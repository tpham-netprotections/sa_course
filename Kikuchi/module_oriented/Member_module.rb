module Member_module
  def self.register(members)
    puts("====================================")
    puts "登録します"
    puts "メールアドレス？"
    mail_address = gets.chomp
    puts "電話番号？"
    phone_number = gets.chomp
    puts "名前漢字？"
    name_kanji = gets.chomp
    puts "名前かな？"
    name_kana = gets.chomp
    puts "性別？"
    sex_division = gets.chomp
    puts "誕生日？"
    birth_day = gets.chomp
    puts "住所？"
    address = gets.chomp
    member = {'mail_address' => mail_address, 'phone_number' => phone_number, 'name_kanji' => name_kanji, 'name_kana' => name_kana, 'sex_division' => sex_division, 'birth_day' => birth_day, 'address' => address}
    members[members.size] = member
  end
end


