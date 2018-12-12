package jp.co.netprotections.dto;

public class UserDto {

//	private int id;

	private String mail_address;

	private String phone_number;

	private String name_kanji;

	private String name_kana;

	private int sex_division;

	private String birth_day;

	private String address;


	public UserDto() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	/**
//	 * @param id
	 * @param mail_address
	 * @param phone_number
	 * @param name_kanji
	 * @param name_kana
	 * @param sex_division
	 * @param birth_day
	 * @param address
	 */
	public UserDto(String mail_address, String phone_number, String name_kanji, String name_kana,
			int sex_division, String birth_day, String address) {
		super();
		this.mail_address = mail_address;
		this.phone_number = phone_number;
		this.name_kanji = name_kanji;
		this.name_kana = name_kana;
		this.sex_division = sex_division;
		this.birth_day = birth_day;
		this.address = address;
	}
	/**
	 * sex_division
	 * 1:男
	 * 2:女
	 * 3:その他
	 */




	/**
	 * @return mail_address
	 */
	public String getMail_address() {
		return mail_address;
	}

	/**
	 * @param mail_address セットする mail_address
	 */
	public void setMail_address(String mail_address) {
		this.mail_address = mail_address;
	}

	/**
	 * @return phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}

	/**
	 * @param phone_number セットする phone_number
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	/**
	 * @return name_kanji
	 */
	public String getName_kanji() {
		return name_kanji;
	}

	/**
	 * @param name_kanji セットする name_kanji
	 */
	public void setName_kanji(String name_kanji) {
		this.name_kanji = name_kanji;
	}

	/**
	 * @return name_kana
	 */
	public String getName_kana() {
		return name_kana;
	}

	/**
	 * @param name_kana セットする name_kana
	 */
	public void setName_kana(String name_kana) {
		this.name_kana = name_kana;
	}

	/**
	 * @return sex_division
	 */
	public String getSex_division() {
		String StringSex_division = new String();
		switch(this.sex_division){
		case 1:
		StringSex_division="男";
		break;
		case 2:
		StringSex_division="女";
		break;
		case 3:
		StringSex_division="その他";
		break;
		}
		return 	StringSex_division;
}

	/**
	 * @param sex_division セットする sex_division
	 */
	public void setSex_division(int sex_division) {
		this.sex_division = sex_division;
	}

	/**
	 * @return birth_day
	 */
	public String getBirth_day() {
		return birth_day;
	}

	/**
	 * @param birth_day セットする birth_day
	 */
	public void setBirth_day(String birth_day) {
		this.birth_day = birth_day;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address セットする address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
