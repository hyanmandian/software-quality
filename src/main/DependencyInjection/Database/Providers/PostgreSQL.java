package DependencyInjection.Database.Providers;

import DependencyInjection.Database.Provider;

public class PostgreSQL implements Provider {
    
    public String connect() {
        return "Connect in PostgreSQL.";
    }
    
}
