package jp.co.netprotections.service.impl;

import java.util.Scanner;

import jp.co.netprotections.dto.UserDto;
import jp.co.netprotections.dto.UserListDto;
import jp.co.netprotections.service.UserService;

public class UserServiceImpl implements UserService {

@Override
	public void UserNew(UserListDto initialUserListDto){

		Scanner sccaner = new Scanner(System.in);

		UserDto NewUser = new UserDto();

		System.out.println("メールアドレスを入力して下さい");
		String mail_address  = sccaner.next();
		NewUser.setMail_address(mail_address);

		System.out.println("電話番号を入力して下さい");
		String phone_number  = sccaner.next();
		NewUser.setPhone_number(phone_number);

		System.out.println("名前(漢字)を入力して下さい");
		String name_kanji  = sccaner.next();
		NewUser.setName_kanji(name_kanji);

		System.out.println("名前(カナ)で入力して下さい");
		String name_kana  = sccaner.next();
		NewUser.setName_kana(name_kana);

		System.out.println("性別を選んで下さい\r\n1:男性\r\n2:女性\r\n3:その他");
		int sex_division  = sccaner.nextInt();
		NewUser.setSex_division(sex_division);

		System.out.println("誕生日を入力して下さい");
		String birth_day  = sccaner.next();
		NewUser.setBirth_day(birth_day);

		System.out.println("住所を入力して下さい");
		String address  = sccaner.next();
		NewUser.setAddress(address);
		initialUserListDto.getMembers().add(NewUser);
		System.out.println("ユーザーを登録しました");
	}
@Override
	public void UserSearch(UserListDto InitialUserListDto,int id) {
		UserDto SearchResultUser= InitialUserListDto.getMembers().get(id);
		System.out.println("メールアドレス:"+SearchResultUser.getMail_address());
		System.out.println("電話番号:"+SearchResultUser.getPhone_number());
		System.out.println("名前（漢字）:"+SearchResultUser.getName_kanji());
		System.out.println("名前（カナ）:"+SearchResultUser.getName_kana());
		System.out.println("性別:"+SearchResultUser.getSex_division());
		System.out.println("生年月日:"+SearchResultUser.getBirth_day());
		System.out.println("住所:"+SearchResultUser.getAddress());
	}
@Override
	public void UserLoginLogout(UserListDto InitialUserListDto){
		Scanner scanner = new Scanner(System.in);

		if(InitialUserListDto.getLogin_status() == 0){

			System.out.println("パスワードを入力して下さい\r\n1000.メニューに戻る");
			int inputPassword = scanner.nextInt();
			if(inputPassword==1234) {
				InitialUserListDto.setLogin_status(1);
				System.out.println("ログインに成功しました");
			}else {
				System.out.println("パスワードがまちがっています");
			}
		}else {
			InitialUserListDto.setLogin_status(1);
			System.out.println("ログアウトしました");
		}
	}

	public void UserEdit(UserListDto InitialUserListDto){
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("変更したいユーザーのidを入力して下さい\r\n1000.メニューに戻る");

			int editUserId = scanner.nextInt();

			if(editUserId==1000) {
				break;
			}else {
				UserDto editUser = InitialUserListDto.getMembers().get(editUserId);

				while(true) {
					System.out.println("1.メールアドレス:"+editUser.getMail_address());
					System.out.println("2.電話番号:"+editUser.getPhone_number());
					System.out.println("3.名前（漢字）:"+editUser.getName_kanji());
					System.out.println("4.名前（カナ）:"+editUser.getName_kana());
					System.out.println("5.性別:"+editUser.getSex_division());
					System.out.println("6.生年月日:"+editUser.getBirth_day());
					System.out.println("7.住所:"+editUser.getAddress());
					System.out.println("8.終了");

					System.out.println("変更したい項目を選択して下さい");

					int editField = scanner.nextInt();

					switch(editField) {
					case 1:
						System.out.println("変更後のメールアドレスを入力して下さい");
						String changeMail_address = scanner.next();
						editUser.setMail_address(changeMail_address);
						System.out.println("メールアドレスを変更しました");
						continue;

					case 2:
						System.out.println("変更後の電話番号を入力して下さい");
						String changePhone_number = scanner.next();
						editUser.setPhone_number(changePhone_number);
						System.out.println("電話番号を変更しました");
						continue;

					case 3:
						System.out.println("変更後の名前(漢字)を入力して下さい");
						String changeName_kanji = scanner.next();
						editUser.setName_kanji(changeName_kanji);
						System.out.println("名前(漢字)を変更しました");
						continue;

					case 4:
						System.out.println("変更後の名前(カナ)を入力して下さい");
						String changeName_kana = scanner.next();
						editUser.setName_kana(changeName_kana);
						System.out.println("名前(カナ)を変更しました");
						continue;

					case 5:
						System.out.println("変更後の性別を入力して下さい");
						int changeSex_division = scanner.nextInt();
						editUser.setSex_division(changeSex_division);
						System.out.println("性別を変更しました");
						continue;

					case 6:
						System.out.println("変更後の生年月日を入力して下さい");
						String changeBirth_day = scanner.next();
						editUser.setBirth_day(changeBirth_day);
						System.out.println("生年月日を変更しました");
						continue;

					case 7:
						System.out.println("変更後の住所を入力して下さい");
						String changeAddress = scanner.next();
						editUser.setAddress(changeAddress);
						System.out.println("住所を変更しました");
						continue;

					case 8:
						System.out.println("終了しました");
						break;
					}break;
				}
			}
		}
	}
}