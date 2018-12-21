module MemberModule
require('./authentication_module.rb')
  def member_register(members)
    p "mail_address:"

    mail_address = gets.chomp
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
    p "address"
    address = gets.chomp
    members[members.length] = {
      'mail_address' => mail_address,
      'phone_number' => phone_number,
      'name_kanji' => name_kanji,
      'name_kana' => name_kana,
      'sex_division' => sex_division,
      'birth_day' => birth_day,
      'address' => address
    }
    p members[members.length-1]
  end

  def member_search(login_status,members)
    if login_status == true
      p "put member ID"
      p "member ID:"
      member_id = gets.chomp.to_i
      p members[member_id]
    else
      p "please login"
      AuthenticaionModule.login_logout(login_status)
      if login_status == true
        p "you can search a member"
        MemberModule.member_search()
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

  module_function :member_register,:member_search,:member_edit
end
