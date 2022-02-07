package spring.spring1;

public class B {
	
	private final A a;
	 public B() {
		 this.a = new A();
	}

	private String msg2;

	public String getMsg2() {
		return msg2;
	}

	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}

	@Override
	public String toString() {
		return msg2;
	}

}
