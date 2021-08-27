package day17_overriding_interface;

public class NewFerrari extends Ferrari{
	public NewFerrari(int ye ) { super(ye); }
	public void autoSystem() {
	System.out.println("자동 운전모드를 시작합니다.");
}
	/*
	public void speed( ) {
	System.out.println(getYe()+ "년식 페라리 속도 : 500km");
	System.out.println("터보 speed 달리자~");
}
*/
}
