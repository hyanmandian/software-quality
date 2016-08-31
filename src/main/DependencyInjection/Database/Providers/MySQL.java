package DependencyInjection.Database.Providers;

import DependencyInjection.Database.Provider;

public class MySQL implements Provider {
    
    public String connect() {
        return "Connect in MySQL.";
    }
    
}
