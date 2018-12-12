@members = {
    0 => {'mail_address' => "tpham@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "Pham Thuc Hung", 'name_kana' => "繝輔ぃ繝ｳ縲繝医Η繝�繧ｯ縲繝輔Φ", 'sex_division' => "逕ｷ諤ｧ", 'birth_day' => "1991/09/16", 'address' => "譚ｱ莠ｬ驛ｽ荳ｭ螟ｮ蛹ｺ驫蠎ｧ1-10-6 驫蠎ｧ繝輔ぃ繝ｼ繧ｹ繝医ン繝ｫ4髫�"},
    1 => {'mail_address' => "vle@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "Le van Hiep", 'name_kana' => "繝輔ぃ繝ｳ縲繝医Η繝�繧ｯ縲繝輔Φ", 'sex_division' => "逕ｷ諤ｧ", 'birth_day' => "1991/09/16", 'address' => "譚ｱ莠ｬ驛ｽ荳ｭ螟ｮ蛹ｺ驫蠎ｧ1-10-6 驫蠎ｧ繝輔ぃ繝ｼ繧ｹ繝医ン繝ｫ4髫�"},
    2 => {'mail_address' => "ksato@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "菴占陸 蛛･螟ｪ", 'name_kana' => "繧ｵ繝医え縲繧ｱ繝ｳ繧ｿ", 'sex_division' => "逕ｷ諤ｧ", 'birth_day' => "1991/09/16", 'address' => "譚ｱ莠ｬ驛ｽ荳ｭ螟ｮ蛹ｺ驫蠎ｧ1-10-6 驫蠎ｧ繝輔ぃ繝ｼ繧ｹ繝医ン繝ｫ4髫�"},
    3 => {'mail_address' => "snozaki@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "驥主ｴ� 謇埼摩", 'name_kana' => "繝弱じ繧ｭ縲繧ｵ繧､繝｢繝ｳ", 'sex_division' => "逕ｷ諤ｧ", 'birth_day' => "1991/09/16", 'address' => "譚ｱ莠ｬ驛ｽ荳ｭ螟ｮ蛹ｺ驫蠎ｧ1-10-6 驫蠎ｧ繝輔ぃ繝ｼ繧ｹ繝医ン繝ｫ4髫�"},
    4 => {'mail_address' => "yiwata@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "蟯ｩ逕ｰ 邨�", 'name_kana' => "繧､繝ｯ繧ｿ縲繝ｦ繧､", 'sex_division' => "螂ｳ諤ｧ", 'birth_day' => "1991/09/16", 'address' => "譚ｱ莠ｬ驛ｽ荳ｭ螟ｮ蛹ｺ驫蠎ｧ1-10-6 驫蠎ｧ繝輔ぃ繝ｼ繧ｹ繝医ン繝ｫ4髫�"},
    5 => {'mail_address' => "tnagasaki@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "髟ｷ蟠� 螟ｪ蠢�", 'name_kana' => "繝翫ぎ繧ｶ繧ｭ縲繧ｿ繧､繧ｷ", 'sex_division' => "逕ｷ諤ｧ", 'birth_day' => "1991/09/16", 'address' => "譚ｱ莠ｬ驛ｽ荳ｭ螟ｮ蛹ｺ驫蠎ｧ1-10-6 驫蠎ｧ繝輔ぃ繝ｼ繧ｹ繝医ン繝ｫ4髫�"},
    6 => {'mail_address' => "kfukakawa@netprotections.co.jp", 'phone_number' => "01-1234-5678", 'name_kanji' => "豺ｱ蟾� 蛛･螟ｪ", 'name_kana' => "繝輔き繧ｱ繝ｳ", 'sex_division' => "逕ｷ諤ｧ", 'birth_day' => "1991/09/16", 'address' => "譚ｱ莠ｬ驛ｽ荳ｭ螟ｮ蛹ｺ驫蠎ｧ1-10-6 驫蠎ｧ繝輔ぃ繝ｼ繧ｹ繝医ン繝ｫ4髫�"}
    }

@item=['mail_address','phone_number','name_kanji','name_kana','sex_division','birth_day','address']

@login_status = false

def menu
p "---------------------"
p "1.member_register"
p "2.login/logout"
p "3.member_search"
p "4.member_edit"
p "0.end"

p "select number:"
@menu = gets.chomp.to_i
if @menu == 1
  member_register
elsif @menu == 2
  login_logout
elsif @menu == 3
  member_search
elsif @menu == 4
  member_edit
else
 exit
end
end

def member_register
  p "mail_address:"
  mail_adress = gets.chomp
  p "phone_number:"
  phone_number = gets.chomp
  p "name_kanji:"
  name_kanji = gets.chomp
  p "name_kana:"
  name_kana = gets.chomp
  p "sex_division:"
  sex_division = gets.chomp
  p "birth_day:"
  birth_day = gets.chomp
  p "adress"
  adress = gets.chomp
  @members[@members.length] = {'mail_address' => mail_adress, 'phone_number' => phone_number, 'name_kanji' => name_kanji, 'name_kana' => name_kana, 'sex_division' => sex_division, 'birth_day' => birth_day, 'address' => adress}
  p @members[@members.length-1]
end

def login_logout
  if @login_status == false
    p "you will login"
    p "password:"
    get_password = gets.chomp
    if get_password == "1234"
      p "you can login"
      @login_status = true
    else
      p "please redo"
    end
  else
    p "you will logout"
    @login_status = false
  end
end

def member_search
  if @login_status == true
    p "put member ID"
    p "member ID:"
    member_id = gets.chomp.to_i
    p @members[member_id]
  else
    p "please login"
    login_logout
    if @login_status == true
      p "you can edit information"
      member_search
    end
  end
end


def member_edit
  if @login_status == true
  p "member ID:"
  member_id = gets.chomp.to_i
  p @members[member_id]
  p "---------------------"
  p "0.mail_address"
  p "1.phone_number"
  p "2.name_kanji"
  p "3.sex_division"
  p "4.birth_day"
  p "5.address"
  p "---------------------"
  p "select item number"
  item_number = gets.chomp.to_i
  item_name = @item[item_number]
  p @members[member_id][item_name]
  p "input new"+" "+ "#{item_name}" + ":"
  @members[member_id][item_name] = gets.chomp
  p @members[member_id][item_name]
else
  p "please login"
  login_logout
  if @login_status == true
    p "you can edit information"
    member_edit
  end
end
end

while true do
  menu
end
