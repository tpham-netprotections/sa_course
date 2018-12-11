package jp.co.netprotections.dto;

import java.util.List;

public class UserListDto {
	private List<UserDto> members;
	private int login_status;
	/**
	 *login_status
	 *0:logout
	 *1:login
	 */

	/**
	 * @return login_status
	 */
	public int getLogin_status() {
		return login_status;
	}

	/**
	 * @param login_status セットする login_status
	 */
	public void setLogin_status(int login_status) {
		this.login_status = login_status;
	}

	/**
	 * @return members
	 */
	public List<UserDto> getMembers() {
		return members;
	}

	/**
	 * @param members セットする members
	 */
	public void setMembers(List<UserDto> members) {
		this.members = members;
	}

	public void addMember(UserDto members) {
		this.members.add(member);
	}

}