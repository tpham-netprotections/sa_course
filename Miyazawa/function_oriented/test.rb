require 'C:\Users\t.miyazawa\development\Take\Miyazawa\module_oriented\member.rb'
include Member

@login_status = nil
@members = {
    0 => {'mail_address' => "tpham@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "Pham Thuc Hung", 'name_kana' => "ファン　トュック　フン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    1 => {'mail_address' => "vle@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "Le van Hiep", 'name_kana' => "ファン　トュック　フン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    2 => {'mail_address' => "ksato@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "佐藤 健太", 'name_kana' => "サトウ　ケンタ", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    3 => {'mail_address' => "snozaki@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "野崎 才門", 'name_kana' => "ノザキ　サイモン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    4 => {'mail_address' => "yiwata@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "岩田 結", 'name_kana' => "イワタ　ユイ", 'sex_division' => "女性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    5 => {'mail_address' => "tnagasaki@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "長崎 太志", 'name_kana' => "ナガザキ　タイシ", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"},
    6 => {'mail_address' => "kfukakawa@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "深川 健太", 'name_kana' => "フカケン", 'sex_division' => "男性", 'birth_day' => "1991/09/16", 'address' => "東京都中央区銀座1-10-6 銀座ファーストビル4階"}
    }

#{}

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


def sign_in
  if @login_status == nil
      while @login_status == nil
      puts "パスワードを入力してください："
      login = gets.chomp.to_i
      password =1234
        if login == password
          @login_status = true
          puts "ログインしました"
          puts " "
        else
          puts "パスワードが間違っています"
        end
      end
    else
      puts "ログアウトしますか？（YES / NO）"
      logout = gets.chomp.to_s
      if logout == "YES"
        @login_status = nil
        puts "ログアウトしました"
      else
        puts "次の機能を選んでください"
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

def exit
  puts "サービスを終了します"
end


while true
  puts "=========会員管理サービス=========
  １．会員登録
  ２．ログイン/ログアウト
  ３．会員情報検索
  ４．会員情報変更
  ５．サービス利用登録/停止
  ０．終了
  機能を選んでください：
  "
  input = gets.chomp.to_i
  # puts input.class
  if input == 1
    sign_up()

  elsif input == 2
    sign_in()

  elsif input == 3
    if @login_status == true
      show()
    else
      puts "機能を使うにはログインしてください"
      sign_in()
      show()
    end

  elsif input == 4
    if @login_status == true
      change()
    else
      puts "機能を使うにはログインしてください"
      sign_in()
      change()
    end
  elsif input == 5
    if @login_status == true
      delete_user()
    else
      puts "機能を使うにはログインしてください"
      sign_in()
      delete_user()
    end

  elsif input == 0 && @login_status == true
    exit()
    break
  end
end
# 会員登録

# array ,
# mail_address
# phone_number
# name_kanji
# name_kana
# sex_division
# birth_day
# address
#

# メンバーリスト

#   elsif input == 2 && login ==true
#
#   elsif input == 3 && login ==true
#
#   elsif input == 4 && login ==true
#
#   elsif input == 5 && login ==true
#
#   elsif iput == 0
