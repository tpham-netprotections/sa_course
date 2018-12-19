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
@pass = "1234"




def register
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
  @members[@members.size] = member

end

def login
  if @login_status == false
    puts("====================================")
    puts "ログインパスワードをどうぞ？"
    get_pass = gets.chomp
    if get_pass == @pass #パスワードあってる時
      @login_status = true
      puts "ログイン成功です。"
    else
      puts "パスワードちがいます。"
    end
  else
    #ログイン状態からログアウト状態に変える
    @login_status = false
    puts "ログアウトしました。"
  end
end




def search
  if @login_status == false
    puts("====================================")
    puts "ログインしてからやりなおしてください。"
    #2.ログイン/ログアウトにジャンプ

  else @login_status == true
    puts "探したいユーザーIDは？"
    user_id = gets.chomp
    puts @members[user_id.to_i]
  end
end



def change
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
      @members[user_id]['mail_address'] = mail_address

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
      @members[user_id]['sex_division'] = sex_division

      elsif change_input == 6
      puts "誕生日？"
      birth_day = gets.chomp
      @members[user_id]['birth_day'] = birth_day

      elsif change_input == 7
      puts "住所？"
      address = gets.chomp
      @members[user_id]['address'] = address
      end
  end
end




def stop_use
  puts("====================================")
  puts "使用停止"

end


while true do

  puts "=========会員管理サービス=========
１．会員登録
２．ログイン/ログアウト
３．会員情報検索
４．会員情報変更
５．サービス利用登録/停止
０．終了
機能を選んでください："

  input = gets.chomp


  if input == "1" then
    register

  elsif input == "2" then
    login

  elsif input == "3" then
    search

  elsif input == "4" then
    change

  elsif input == "5" then
    stop_use


  else input == "0"
    quit

  end
end








