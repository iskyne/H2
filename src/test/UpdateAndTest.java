package test;

public class UpdateAndTest extends TestBase {
	public static void main(String[] args) throws Exception {
		new UpdateAndTest().start();
	}

	@Override
	public void startInternal() throws Exception {
		//stmt.executeUpdate("drop table IF EXISTS ValueDateTest");
		//stmt.executeUpdate("create table IF NOT EXISTS ValueDateTest(id int, status int)");
		//stmt.executeUpdate("create table user(id int,name char(3))");
		//stmt.executeUpdate("drop table IF EXISTS user");
		//executeQuery();

		//stmt.executeUpdate("insert into ValueDateTest(id, status) values(1,2)");
		//stmt.executeUpdate("insert into ValueDateTest(id, status) values(3,4)");

		sql = "select * from ValueDateTest";
		executeQuery(sql);
		
		//stmt.executeUpdate("update ValueDateTest set status=1 and id=0");
		
		//sql = "select * from ValueDateTest";
		//executeQuery(sql);
	}
}
