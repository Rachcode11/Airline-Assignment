package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirlineTest {
    Airline group3;

    @BeforeEach
    void startAllTestWith(){
        group3 = new Airline(10,2);
    }
    @Test
    void checkAirlineExist(){
        assertNotNull(group3);
    }
    @Test
    void checkForFirstClassSection(){
        group3.setFirstClassSeats();
        int min = 5;
        assertTrue( min <= group3.getFirstClass());
    }
    @Test
    void checkForEconomyClassSection(){
        group3.economyClassSeats();
        int max = 6;
        assertTrue(max >= group3.economySeats());
    }
    @Test
    void bookSeats(){
        group3.firstClassSeat();
        group3.seteconomySeats();
        assertEquals(1, group3.getFirstClassSeat());
        assertEquals(2, group3.geteconomySeats());
    }




}
