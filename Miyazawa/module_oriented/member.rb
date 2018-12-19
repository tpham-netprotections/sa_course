module Member
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


  def show
    puts "現在の会員数は" + @members.length.to_s + "名です"
    puts "会員IDは1～" + @members.length.to_s + "のうちから選択してください"
    puts "確認したい会員IDを入力してください："

    id = gets.chomp.to_i
    if id>@members.length || id < 1
      puts "そのidは存在しません"
    else
      puts "会員No" + @members[id].to_s + "の情報"
      puts "================================"
      member = @members[id]
      puts member["mail_address"]
      puts member["phone_number"]
      puts member["name_kanji"]
      puts member["name_kana"]
      puts member["sex_division"]
      puts member["birth_day"]
      puts member["address"]
    end
  end

  def change
    puts "現在の会員数は" + @members.length.to_s + "名です"
    puts "会員IDは1～" + @members.length.to_s + "のうちから選択してください"
    puts "情報を変更するユーザーIDを入力してください"
    id = gets.chomp.to_i
    if id>@members.length || id < 1
      puts "そのidは存在しません"
    else
      puts "会員No" + @members[id].to_s + "の情報"
      puts "================================"
      member = @members[id]
      puts "1:メールアドレス " + member["mail_address"]
      puts "2:電話番号      " + member["phone_number"]
      puts "3:姓           " + member["name_kanji"]
      puts "4:名           " + member["name_kana"]
      puts "5:性別         " + member["sex_division"]
      puts "6:生年月日     " + member["birth_day"]
      puts "7:住所         " + member["address"]
      puts "================================"

      puts "変更する情報を選択してください（1-7）"
      puts "変更する情報："
      change_number = gets.chomp.to_i

      if change_number == 1
        puts "メールを変更"
        new_mail = gets.chomp.to_i
        member["mail_address"] = new_mail
        puts member["mail_address"]
      elsif change_number == 2
        puts "電話番号を変更"
        new_phone = gets.chomp.to_i
        member["phone_number"] = new_mail
        puts member["phone_number"]
      elsif change_number == 3
        puts "姓を変更"
        new_kanji = gets.chomp.to_i
        member["name_kanji"] = new_kanji
        puts member["name_kanji"]
      elsif change_number == 4
        puts "名を変更"
        new_kana = gets.chomp.to_i
        member["name_kana"] = new_kana
        puts member["name_kana"]
      elsif change_number == 5
        puts "性別を変更"
        new_sex = gets.chomp.to_i
        member["sex_division"] = new_sex
        puts member["sex_division"]
      elsif change_number == 6
        puts "生年月日を変更"
        new_birthday = gets.chomp.to_i
        member["birth_day"] = new_mail
        puts member["birth_day"]
      elsif change_number == 7
        puts "住所を変更"
        new_address = gets.chomp.to_i
        member["address"] = new_address
        puts member["address"]
      else
        puts "正しい数字を入力してください"

      end
    end
  end

  def delete_user
    puts "削除したいユーザーのidを入力してください"
    id = gets.chomp.to_i
      if id>@members.length || id < 1
        puts "そのidは存在しません"
      else
        @members.delete(id)
        puts "ユーザーを削除しました"
      end
  end
end
