package DependencyInjection.Database.Providers;

import DependencyInjection.Database.Provider;

public class PostgreSQL implements Provider {
    
    public void connect() {
        System.err.println("Connect in PostgreSQL.");
    }
    
}
