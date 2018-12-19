package jp.co.netprotections;

public class Members {

  private int id;
  private String mail_address;
  private String phone_number;
  private String name_kanji;
  private String name_kana;
  private String sex_division;
  private String birth_day;
  private String address;

  public Members() {

  }

  public Members(
      int id,
      String mail_address,
      String phone_number,
      String name_kanji,
      String name_kana,
      String sex_division,
      String  birth_day,
      String  address
  ) {
    this.id = id;
    this.mail_address = mail_address;
    this.phone_number = phone_number;
    this.name_kanji = name_kanji;
    this.name_kana = name_kana;
    this.sex_division = sex_division;
    this. birth_day =  birth_day;
    this. address =  address;

  }

  public void setId(int id) {
    this.id = id;
  }

  public void setMail_address(String mail_address) {
    this.mail_address = mail_address;
  }

  public void setPhone_number(String phone_number) {
    this.phone_number = phone_number;
  }

  public void setName_kanji(String name_kanji) {
    this.name_kanji = name_kanji;
  }

  public void setName_kana(String name_kana) {
    this.name_kana = name_kana;
  }

  public void setSex_division(String sex_division) {
    this.sex_division = sex_division;
  }

  public void setBirth_day(String  birth_day) {
    this. birth_day =  birth_day;
  }

  public void setAddress(String  address) {
    this. address =  address;
  }

  public String execute() {
    return "success";
  }

  public int getId() {
    return id;
  }

  public String getMail_address() {
    return mail_address;
  }

  public String getPhone_number() {
    return phone_number;
  }

  public String getName_kanji() {
	    return name_kanji;
	  }

  public String getName_kana() {
	    return name_kana;
	  }

  public String getSex_division() {
	    return sex_division;
	  }

  public String getBirth_day() {
	    return birth_day;
	  }

  public String getAddress() {
	    return address;
	  }

}

