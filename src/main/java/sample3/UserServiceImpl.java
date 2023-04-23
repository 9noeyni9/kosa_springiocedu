package sample3;

public class UserServiceImpl implements UserService{
	public UserServiceImpl() {
		super();
		System.out.println("UserService Constructor Call");
	}

	@Override
	public void addUser(UserVo vo) {/*오버라이딩*/
		System.out.println("UserService : addUser() Method Call");
		System.out.println("NAME : " + vo.getUserName());
	}
}
