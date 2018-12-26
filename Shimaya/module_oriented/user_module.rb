module User

  def signup(members)
    a = {}
    puts "新規会員登録に必要な情報を入力してください。"
    puts "mail_address?"
      mail_address = gets.chomp
      a['mail_address'] = mail_address
    puts "phone_number?"
      phone_number = gets.chomp
      a['phone_number'] = phone_number
    puts "name_kanji?"
      name_kanji = gets.chomp
      a['name_kanji'] = name_kanji
    puts "name_kana?"
      name_kana = gets.chomp
      a['name_kana'] = name_kana
    puts "sex_division?"
      sex_division = gets.chomp
      a['sex_division'] = sex_division
    puts "birth_day?"
      birth_day = gets.chomp
      a['birth_day'] = birth_day
    puts "address?"
      address =  gets.chomp
      a['address'] = address
    members[members.length] = a
    puts "会員登録を完了しました"

    return members
  end

  def search(members)
    puts "Enter memberID"
    @id = gets.chomp
    member = members[@id.to_i]
    puts member['mail_address']
    puts member['phone_number']
    puts member['name_kanji']
    puts member['name_kana']
    puts member['birth_day']
    puts member['address']
  end

  def edit(members)
    puts "Enter memberID"
    @id = gets.chomp
    member = members[@id.to_i]
    puts member['mail_address']
    puts "=>1"
    puts member['phone_number']
    puts "=>2"
    puts member['name_kanji']
    puts "=>3"
    puts member['name_kana']
    puts "=>4"
    puts member['birth_day']
    puts "=>5"
    puts member['address']
    puts "=>6"

    puts "Which to edit? Enter the number."
    @number = gets.chomp
    puts "Enter new content. "
    if @number == "1"
        puts "Enter new mail_address. "
        @content = gets.chomp
        member['mail_address'] = @content
      else
      if @number == "2"
          puts "Enter new phone_number. "
          @content = gets.chomp
          member['phone_number'] = @content
        else
        if @number == "3"
            puts "Enter new name_kanji. "
            @content = gets.chomp
            member['name_kanji'] = @content
          else
          if @number == "4"
              puts "Enter new name_kana. "
              @content = gets.chomp
              member['name_kana'] = @content
          else
            if @number == "5"
                puts "Enter new birth_day. "
                @content = gets.chomp
                member['birth_day'] = @content
            else
              if @number == "6"
                  puts "Enter new address. "
                  @content = gets.chomp
                  member['address'] = @content
              end
            end
          end
        end
      end
    end
    puts "completed."
    puts member['mail_address']
    puts member['phone_number']
    puts member['name_kanji']
    puts member['name_kana']
    puts member['birth_day']
    puts member['address']
    return members
  end

module_function :signup
module_function :search
module_function :edit

end
