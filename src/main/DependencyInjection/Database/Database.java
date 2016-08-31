package DependencyInjection.Database;

public class Database {
    
    private Provider database;
    
    public Database(Provider database) {
        this.database = database;
    }
    
    public String connect() {
        return this.database.connect();
    }
    
    public Provider getProvider() {
        return this.database;
    }
    
}
