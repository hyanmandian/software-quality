package DependencyInjection.Database;

public class Database {
    
    private Provider database;
    
    public Database(Provider database) {
        this.database = database;
    }
    
    public void connect() {
        this.database.connect();
    }
    
}
