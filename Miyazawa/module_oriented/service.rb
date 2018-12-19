module Service
    def sign_up
    a={}
    puts "メールアドレスを入力してください"
    mail_adress = gets.chomp
    a['mail_address'] = mail_adress
    puts "電話番号を入力してください"
    phone_number = gets.chomp
    a['phone_number'] = mail_adress

    puts "名字を入力してください"
    name_kanji = gets.chomp
    a['name_kanji'] = mail_adress

    puts "名前を入力してください"
    name_kana = gets.chomp
    a['name_kana'] = mail_adress

    puts "性別を選択してください 男性or女性"
    sex_division = gets.chomp
    a['sex_division'] = mail_adress

    puts "生年月日を入力してください"
    birth_day = gets.chomp
    a['birth_day'] = mail_adress
    @members[@members.length] = a
    puts "会員登録が完了しました"
  end

  def exit
    puts "サービスを終了します"
  end
end
