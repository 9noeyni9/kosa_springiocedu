package sample9;

public class UserShow {
	private User user;

	public UserShow() {		
		super();
		System.out.println("UserShow 객체 생성(no-args)");
	}
	public UserShow(User user) {
		super();
		this.user = user;
		System.out.println("UserShow 객체 생성(User 객체 전달)");
	}
	
	public void setUser(User user1) {/*argument로 찾는 거 아니고 setUser의 User와 같은 이름을 찾는 것*/
		System.out.println("UserShow 객체의 setUser() 호출(User 객체 전달)");
		this.user = user1;
	}

	@Override
	public String toString() {
		return "UserShow [user=" + user + "]";
	}

}
