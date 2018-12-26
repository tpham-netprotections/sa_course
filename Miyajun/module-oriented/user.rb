require './authorication_module'
require './data'

@service_usages = [
  [false, false, false],
  [false, false, false],
  [false, false, false],
  [false, false, false],
  [false, false, false],
  [false, false, false],
  [false, false, false]
]
def menu()
  print "---NP会員サービス---------------------\n"
  print "1. ログイン／ログアウト\n"
  print "2. サービス利用登録/停止\n"
  print "----------------------------------------\n"
  print "アクションを選択してください: "
  @input = gets.chomp
  if @input == "1"
    if @session
      logout
    else
      login
    end
  elsif @input == "2"
    if @session == nil
      login
    end
    print "会員idを入力してください\n"
    print "id: "
    id = gets.chomp
    print "----------------------------------------\n"
    print "0. フフルル\n"
    print "1. NP後払い\n"
    print "2. atone\n"
    print "----------------------------------------\n"
    print "サービスidを選択してください\n"
    print "id: "
    service = gets.chomp
    if @service_usages[id.to_i][service.to_i] == false
      @service_usages[id.to_i][service.to_i] = true
      print "サービスの利用登録をしました\n"
    elsif @service_usages[id.to_i][service.to_i] == true
      @service_usages[id.to_i][service.to_i] = false
      print "サービスの利用を停止しました\n"
    else
    end
  end
end

while (true)
  menu()
end
