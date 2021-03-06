package DependencyInjection;

import DependencyInjection.Database.DatabaseFactory;
import org.junit.Test;
import static org.junit.Assert.*;

public class DependencyInjectionTest {
    
    @Test
    public void shouldMySQLWhenConnect() {
        String expected = "Connect in MySQL.";
        String actual = DatabaseFactory.createMySQL().connect();
        assertEquals(expected, actual);
    }
    
    @Test
    public void shouldPostgreSQLWhenConnect() {
        String expected = "Connect in PostgreSQL.";
        String actual = DatabaseFactory.createPostgreSQL().connect();
        assertEquals(expected, actual);
    }
    
}
