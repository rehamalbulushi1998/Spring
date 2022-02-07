package spring.spring1;

public class C {
	private final B b;
	
	public C() {
	    this.b = new B();
	}
	 private String msg3;	

	@Override
	public String toString() {
		return msg3;
	}



	public String getMsg3() {
		return msg3;
	}

	public void setMsg3(String msg3) {
		this.msg3 = msg3;
	}

}
