
public class DbExcutor {
	static Database CreateDatabase(String dbname) {
		Database db = null;
		switch(dbname) {
			case "MySql" :
					db = new MySql();
					break;
			case "Oracle" :
					db = new Oracle();
					break;
		}
		return db;
	}
	public static void main(String[] args) {
			
		Database db = CreateDatabase("MySql");
		db.open();
		Database db2 = CreateDatabase("Oracle");
		db2.open();
		
	//Database db = CreateDatabase("MySql");
	//db.open();	
		
	//Database db2 = CreateDatabase("Oracle");
	//db2.open();
	}
	
}
