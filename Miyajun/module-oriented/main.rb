require './member_module'
require './authentication_module'
require './data'

def action_selection
  if @input == "1"
    create_user
  end
  if @input == "2"
    logout
  end
  if @input == "3"
    show_info
  end
  if @input == "4"
    change_info
  end
end

def menu()
  print "---会員管理サービス---------------------\n"
  print "1. 新規会員登録\n"
  print "2. ログイン／ログアウト\n"
  print "3. 会員情報検索\n"
  print "4. 会員情報変更\n"
  print "----------------------------------------\n"
  print "アクションを選択してください: "
  @input = gets.chomp
  authenticate
  action_selection
end

while (true)
  menu()
end
