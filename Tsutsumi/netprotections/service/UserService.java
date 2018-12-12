package jp.co.netprotections.service;

import jp.co.netprotections.dto.UserListDto;

public interface UserService {

	public void UserNew(UserListDto InitialUserList);
	public void UserSearch(UserListDto InitialUserListDto,int id);
	public void UserLoginLogout(UserListDto InitialUserListDto);
	public void UserEdit(UserListDto InitialUserListDto);

}
