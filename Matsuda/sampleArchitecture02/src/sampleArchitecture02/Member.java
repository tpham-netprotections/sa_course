package sampleArchitecture02;

public class Member {

    public String userMail;
    public String userPhoneNumber;
    public String userNameKanji;
    public String userNameKana;
    public String userSex;
    public String userBirthday;
    public String userAddress;

    public Member(String userMail, String userPhoneNumber, String userNameKanji,
            String userNameKana, String userSex, String userBirthday,
            String userAddress){
        this.userMail = userMail;
        this.userPhoneNumber = userPhoneNumber;
        this.userNameKanji = userNameKanji;
        this.userNameKana = userNameKana;
        this.userSex = userSex;
        this.userBirthday = userBirthday;
        this.userAddress = userAddress;
    }

    public void printMemberData (Member member) {
        System.out.println("1.メールアドレス：" + member.userMail);
        System.out.println("2.電話番号：" + member.userPhoneNumber);
        System.out.println("3.名前（漢字）：" + member.userNameKanji);
        System.out.println("4.名前（カナ）" + member.userNameKana);
        System.out.println("5.性別" + member.userSex);
        System.out.println("6.生年月日" + member.userBirthday);
        System.out.println("7.住所" + member.userAddress);
    }

}
