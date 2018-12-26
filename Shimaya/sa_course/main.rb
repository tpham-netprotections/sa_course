@login == nil

while true
  puts "=========会員管理サービス=========
  １．会員登録
  ２．ログイン/ログアウト
  ３．会員情報検索
  ４．会員情報変更
  ５．サービス利用登録/停止
  ０．終了
  機能を選んでください~~："
  imput = gets.chomp

  if imput == "1"
    signup()
  else
    if imput == "2"
      login()
    else
      if imput == "3"
        search()
      else
        if imput == "4"
          edit()
        else
          if imput == "5"
            startstop()
          else
            if imput == "0"
              break
            end
          end
        end
      end
    end
  end

end
