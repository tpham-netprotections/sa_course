package jp.co.netprotections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jp.co.netprotections.dto.UserDto;
import jp.co.netprotections.dto.UserListDto;
import jp.co.netprotections.service.impl.UserServiceImpl;

public class ArchitectureCourseApplication {


//	ミスったらimplクラスで作成する

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		UserServiceImpl UserService = new UserServiceImpl();

		UserListDto InitialUserListDto = new UserListDto();
		UserDto InitialUser = new UserDto("tz59579@gmail.com","09041309932","堤春陽", "ツツミハルヒ",1,"19930504","東京都文京区大塚");
		InitialUserListDto.addMember(InitialUser);
		InitialUserListDto.setLogin_status(0);

	while(true) {
		System.out.println("================================================");
		System.out.println("1.ユーザー登録\r\n2.ログイン/ログアウト\r\n3.会員情報検索\r\n4.会員情報変更\r\n機能を選んで下さい");

		int SelectedMehod = scanner.nextInt();

		if(1<=SelectedMehod&&SelectedMehod<=4) {
			switch(SelectedMehod) {

			case 1:
				InitialUserListDto = UserService.UserNew(InitialUserListDto);
				continue;

			case 2:
				UserService.UserLoginLogout(InitialUserListDto);
				continue;

			case 3:
				if(InitialUserListDto.getLogin_status()==0) {
					System.out.println("ログインして下さい");
					UserService.UserLoginLogout(InitialUserListDto);
				}else {
					System.out.println("検索したいユーザーのidを入力して下さい");
					int id = scanner.nextInt();
					UserService.UserSearch(InitialUserListDto,id);
				}
				continue;

			case 4:
				if(InitialUserListDto.getLogin_status()==0) {
					System.out.println("ログインして下さい。");
					UserService.UserLoginLogout(InitialUserListDto);
				}else {
//					System.out.println("編集したいユーザーのidを入力して下さい");
//					int id = scanner.nextInt();
					UserService.UserEdit(InitialUserListDto);
				}
				continue;
			}
		}
		else {
			System.out.println("入力値にエラーがあります");
		}
		scanner.close();
		}
	}
}