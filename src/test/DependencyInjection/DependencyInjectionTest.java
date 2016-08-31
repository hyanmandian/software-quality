package DependencyInjection;

import DependencyInjection.Database.DatabaseFactory;
import DependencyInjection.Database.Provider;
import DependencyInjection.Database.Providers.MySQL;
import DependencyInjection.Database.Providers.PostgreSQL;
import org.junit.Test;
import static org.junit.Assert.*;

public class DependencyInjectionTest {
    
    @Test
    public void shouldReturnMySQLDatabase() {
        String expected = "Connect in MySQL.";
        String actual = DatabaseFactory.createMySQL().connect();
        assertEquals(expected, actual);
    }
    
    @Test
    public void shouldReturnPostgreSQLDatabase() {
        String expected = "Connect in PostgreSQL.";
        String actual = DatabaseFactory.createPostgreSQL().connect();
        assertEquals(expected, actual);
    }
    
}
