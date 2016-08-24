package DependencyInjection.Database.Providers;

import DependencyInjection.Database.Provider;

public class MySQL implements Provider {
    
    public void connect() {
        System.err.println("Connect in MySQL.");
    }
    
}
