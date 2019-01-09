package jp.co.netprotections.membersList;

import java.util.List;

public class MembersList {

	  public static List<MembersList> memberList;
	  public int id;
	  public String mail_address;
	  public String phone_number;
	  public String name_kanji;
	  public String name_kana;
	  public String sex_division;
	  public String birth_day;
	  public String address;
	  public boolean fufululuStatus;
	  public boolean atobaraiStatus;
	  public boolean atoneStatus;

	  /**
	   *コンストラクタ.
	   * @param id2
	   * @param mail_address2
	   * @param phone_number2
	   * @param name_kanji2
	   * @param name_kana2
	   * @param sex_division2
	   * @param birth_day2
	   * @param address2
	   */
	  public MembersList(
	      int id2,
	      String mail_address2,
	      String phone_number2,
	      String name_kanji2,
	      String name_kana2,
	      String sex_division2,
	      String  birth_day2,
	      String  address2,
	      boolean fufululuStatus2,
	      boolean atobaraiStatus2,
	      boolean atoneStatus2
	  ) {
	    this.id = id2;
	    this.mail_address = mail_address2;
	    this.phone_number = phone_number2;
	    this.name_kanji = name_kanji2;
	    this.name_kana = name_kana2;
	    this.sex_division = sex_division2;
	    this. birth_day =  birth_day2;
	    this. address =  address2;
	    this.fufululuStatus = fufululuStatus2;
	    this.atobaraiStatus = atobaraiStatus2;
	    this.atoneStatus = atoneStatus2;
	  }

	  public MembersList() {
	    this.id = 7;
	  }


}
