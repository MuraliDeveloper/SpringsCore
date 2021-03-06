package Ex4ConstrInject;

/**
AccountService is a bean class.
AccountService has dbName as dependency.
spring has to create the obj for AccountService and set the data for dbName.
since we are using constr injection we need to write the constructor in AccountService
and write bean tag for AccountService with constructor-arg tag.
 */
public class AccountService {

	private String dbName;

	public AccountService(String dbName) {
		super();
		this.dbName = dbName;
	}

	public void connect(){
		System.out.println("connecting db with user:"+dbName);
	}
	
	public void save(){
		System.out.println("account- save using"+dbName);
	}
}
