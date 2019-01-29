package data;

import java.util.ArrayList;
import java.util.List;

import member.Member;

public class Data {

    public List<Member> members;

    public List<Member> defaultMember() {
        members = new ArrayList<Member>();
        members.add(new Member("tpham@netprotections.co.jp", "01-1234-5678", "Pham Thuc Hung",
                "ファン　トュック　フン", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階"));
        members.add(new Member("vle@netprotections.co.jp", "01-1234-5678", "Le van Hiep",
                "レ　ヴァン　ヒェップ", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階"));
        members.add(new Member("ksato@netprotections.co.jp", "01-1234-5678", "佐藤 健太",
                "さとう　けんた", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階"));
        members.add(new Member("snozaki@netprotections.co.jp", "01-1234-5678", "野崎 才門",
                "のざき　さいもん", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階"));
        members.add(new Member("yiwata@netprotections.co.jp", "01-1234-5678", "岩田 結",
                "いわた　ゆい", "女性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階"));
        members.add(new Member("tnagasaki@netprotections.co.jp", "01-1234-5678", "長崎 太志",
                "ながさき　たいし", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階"));
        members.add(new Member("khukagawa@netprotections.co.jp", "01-1234-5678", "深川 健太",
                "ふかがわ　けんた", "男性", "1991/09/16", "東京都中央区銀座1-10-6 銀座ファーストビル4階"));

        return members;
    }

    public void setServiceStatus() {
        members.get(0).atobaraiStatus = false;
        members.get(0).atoneStatus = false;
        members.get(0).huhululuStatus = false;

        members.get(1).atobaraiStatus = false;
        members.get(1).atoneStatus = false;
        members.get(1).huhululuStatus = false;

        members.get(2).atobaraiStatus = false;
        members.get(2).atoneStatus = false;
        members.get(2).huhululuStatus = false;

        members.get(3).atobaraiStatus = false;
        members.get(3).atoneStatus = false;
        members.get(3).huhululuStatus = false;

        members.get(4).atobaraiStatus = false;
        members.get(4).atoneStatus = false;
        members.get(4).huhululuStatus = false;

        members.get(5).atobaraiStatus = false;
        members.get(5).atoneStatus = false;
        members.get(5).huhululuStatus = false;

        members.get(6).atobaraiStatus = false;
        members.get(6).atoneStatus = false;
        members.get(6).huhululuStatus = false;
    }


}
