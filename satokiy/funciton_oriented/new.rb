@members = {
    0 => {'mail_address' => "tpham@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "Pham Thuc Hung", 'name_kana' => "ファン　トュック　フン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    1 => {'mail_address' => "vle@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "Le van Hiep", 'name_kana' => "ファン　トュック　フン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    2 => {'mail_address' => "ksato@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "佐藤 健太", 'name_kana' => "サトウ　ケンタ", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    3 => {'mail_address' => "snozaki@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "野崎 才門", 'name_kana' => "ノザキ　サイモン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    4 => {'mail_address' => "yiwata@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "岩田 結", 'name_kana' => "イワタ　ユイ", 'sex_division' => "女性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    5 => {'mail_address' => "tnagasaki@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "長崎 太志", 'name_kana' => "ナガザキ　タイシ", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    6 => {'mail_address' => "kfukakawa@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "深川 健太", 'name_kana' => "フカケン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"}
}

@login_status = false
@login_password = "1234"

def login
  if @login_status == true
    puts 'logoutしました'
    @login_status = false
  else
    puts 'パスワードを入力してください'
    puts 'password:'
    password = gets.chomp
    if password == "1234"
      @login_status = true
      puts 'loginしました！'
    else
      puts 'パスワードが間違っています。'
    end
  end
end

def register
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

  @members[@members.length] = {
      'mail_address' => mail_address,
      'phone_number' => phone_number,
      'name_kanji' => name_kanji,
      'name_kana' => name_kana,
      'sex_division' => sex_division,
      'birth_day' => birth_day,
      'address' => address
  }
  menus
end


def search
  puts '検索する会員IDを入力してください'
  number = gets.chomp.to_i
  puts @members[number]

end

def change
  puts '変更する会員IDを入力してください'
  number = gets.chomp.to_i
  puts @members[number]
  index = 0
  @members[number].each do |member|

    puts "#{index}.#{member}"
    index += 1
  end

  puts '変更する項目を選んでください'
  m = gets.chomp.to_i
  puts '変更する内容を入力してください'
  member_info = ['mail_address', 'phone_number', 'name_kanji', 'name_kana', 'sex_division', 'birth_day', 'address']
  string = gets.chomp
  @members[number][member_info[m]] = string
  puts '会員情報を変更しました！'
end

def menus
      puts '-------------------会員登録サービス---------------------'
      puts '使用する機能を選んでください'
      menus = ['終了', '新規会員登録', 'ログイン/ログアウト', '会員情報検索', '会員情報変更', 'サービス利用登録/停止']

      index = 0
      menus.each do |menu|

        puts "#{index}.#{menu}"
        index += 1
      end

      @order = gets.chomp.to_i
      selected_menu = menus[@order]


      puts "------------------#{selected_menu}----------------------"
      if @order == 1
        register
      end

      if @order == 2
        login
      end

      if @order == 3
        if @login_status == true
          search
        else
      puts 'ログインしてください'
      login
    end
  end

  if @order == 4
    if @login_status == true
      change
    else
      puts 'ログインしてください'
      login
    end
  end

  if @order == 0
    exit
  end
end

while true do
  menus
end





