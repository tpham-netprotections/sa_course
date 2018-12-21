require('./member_module.rb')
#include MemberModule
require('./authentication_module.rb')
require('./data.rb')

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
  MemberModule.member_register(@members)
elsif @menu == 2
  AuthenticaionModule.login_logout(@login_status)
  p @login_status
elsif @menu == 3
  MemberModule.member_search(@login_status,@members)
elsif @menu == 4
  MemberModule.member_edit
else
 exit
end
end

while true do
  menu
end
