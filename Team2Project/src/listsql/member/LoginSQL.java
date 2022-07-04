package listsql.member;

public class LoginSQL {
	public static final String LOGIN_INSERT
	="insert into login values(member_id = ?, member_password = ?, login = ?";
	public static final String LOGIN_UPDATE
	="update login set member_id = ?, member_password where login = ?";
	public static final String LOGIN_DELETE
	="delete from login where login = ?";
	public static final String LOGIN_SELECT_BY_NO
	="select * from login where login = ?";
	public static final String LOGIN_SELECT_ALL
	="select * from login";
}
