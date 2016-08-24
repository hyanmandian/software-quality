package DependencyInjection;

import DependencyInjection.Database.Database;
import DependencyInjection.Database.DatabaseFactory;

public class Application {

    public static void main(String[] args) {
        Database databaseMysql = DatabaseFactory.createMySQL();
        databaseMysql.connect();
        
        Database databasePostgreSQL = DatabaseFactory.createPostgreSQL();
        databasePostgreSQL.connect();
    }
    
}
