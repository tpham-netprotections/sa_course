module Service

  def startstop(service_usages, services, members)
    puts "Enter memberID"
    member_id = gets.chomp
    puts "Select service"
    puts "NP後払い => 1"
    puts "NPPC => 2"
    puts "atone => 3"
    service_id = gets.chomp
    service_usage = service_usages[member_id.to_i][service_id.to_i]

    if service_usage == true
      service_usage == false
      puts "stop" + services[service_id.to_i]
    else
      service_usage == true
      puts "stop" + services[service_id.to_i]
    end
    return service_usages
  end

# 二次元的に検索、trueなら
    # puts "Which to start or stop? Enter the number."
    # @number = gets.chomp
    # if @number == "1" && member['NP後払い'] == "0"
    #     member['NP後払い'] = "1"
    #     puts "start "NP後払い""
    #   else
    #   if @number == "1" && member['NP後払い'] == "1"
    #       member['NP後払い'] = "0"
    #       puts "stop "NP後払い""
    #     else
    #     if @number == "2" && member['NPPC'] == "0"
    #         member['NPPC'] = "1"
    #         puts "start "NPPC""
    #       else
    #       if @number == "2" && member['NPPC'] == "1"
    #           member['NPPC'] = "0"
    #           puts "stop "NPPC""
    #         else
    #         if @number == "3" && member['atone'] == "0"
    #             member['atone'] = "1"
    #             puts "start "atone""
    #           else
    #           if @number == "3" && member['atone'] == "1"
    #               member['atone'] = "0"
    #               puts "stop "atone""
    #           end
    #         end
    #       end
    #     end
    #   end
    # end
  module_function :startstop
end
