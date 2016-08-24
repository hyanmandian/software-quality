package DependencyInjection.Database;

import DependencyInjection.Database.Providers.MySQL;
import DependencyInjection.Database.Providers.PostgreSQL;

public class DatabaseFactory {
    
    static private Database create(Provider provider) {
        return new Database(provider);
    }
    
    static public Database createMySQL() {
        return DatabaseFactory.create(new MySQL());
    }
    
    static public Database createPostgreSQL() {
        return DatabaseFactory.create(new PostgreSQL());
    }
    
}
