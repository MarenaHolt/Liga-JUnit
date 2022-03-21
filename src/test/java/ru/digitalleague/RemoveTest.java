package ru.digitalleague;

import org.junit.*;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class RemoveTest {


    @Test
    public void delAddObject() {
        Storage.addObject("peach", 2);
        Storage.removeObject("peach");
        assertFalse(Storage.isInStock("peach"));
    }


    @Test
    public void delNotAddObject(){
        Storage.removeObject("pine");
        assertFalse(Storage.isInStock("pine"));
    }

}
