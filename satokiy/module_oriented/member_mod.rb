module Member


  def search(members)
    puts '検索する会員IDを入力してください'
    number = gets.chomp.to_i
    puts members[number]

  end

  module_function :search

  def change(members)
    puts '変更する会員IDを入力してください'
    number = gets.chomp.to_i
    puts members[number]
    index = 0
    members[number].each do |member|

      puts "#{index}.#{member}"
      index += 1
    end

    puts '変更する項目を選んでください'
    m = gets.chomp.to_i
    puts '変更する内容を入力してください'
    member_info = ['mail_address', 'phone_number', 'name_kanji', 'name_kana', 'sex_division', 'birth_day', 'address']
    string = gets.chomp
    members[number][member_info[m]] = string
    puts '会員情報を変更しました！'
  end

  module_function :change

  def register(members)
    puts '会員情報を入力してください'
    puts 'mail_address:'
    mail_address = gets.chomp
    puts 'phone_number:'
    phone_number = gets.chomp
    puts 'name_kanji:'
    name_kanji = gets.chomp
    puts 'name_kana:'
    name_kana = gets.chomp
    puts 'address:'
    address = gets.chomp
    puts 'sex_division:'
    sex_division = gets.chomp
    puts 'birth_day:'
    birth_day = gets.chomp

    puts '会員登録が完了しました！'
    puts "mail_address: #{mail_address}"
    puts "phone_number:#{phone_number}"
    puts "name_kanji:#{name_kanji}"
    puts "name_kana:#{name_kana}"
    puts "address:#{address}"

    members[members.length] = {
        'mail_address' => mail_address,
        'phone_number' => phone_number,
        'name_kanji' => name_kanji,
        'name_kana' => name_kana,
        'sex_division' => sex_division,
        'birth_day' => birth_day,
        'address' => address
    }

  end

  module_function :register

end
