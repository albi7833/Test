package com.project.oops;

public class tester2 {
	public static void main(String[] args) {
		ipl IPL = new ipl();
		IPL.name();
		System.out.println("******************");
		csk CSK = new csk();
		CSK.Cap_name="MS DHONI";
		CSK.team_color="YELLOW";
		CSK.ranking = 1;
		CSK.team1();
		System.out.println("******************");
		rcb RCB =new rcb();
		RCB.Cap_name="VIRAT KOHLI";
		RCB.team_color="RED";
		RCB.ranking=3;
		RCB.team2();
		System.out.println("******************");
		rr RR = new rr();
		RR.Cap_name="SANJU SAMSON";
		RR.team_color="PINK";
		RR.ranking=2;
		RR.team3();
		
		
	}

}
