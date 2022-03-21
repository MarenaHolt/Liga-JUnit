package ru.digitalleague;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class ShowAllTest {

    @Before
    public void deliteInfo(){
        if (Storage.isInStock("apple")){
            Storage.removeObject("apple");
        }
        if (Storage.isInStock("pear")){
            Storage.removeObject("pear");
        }
    }

    @Test
    public void shouldShowStorageEmpty(){
        assertNull(Storage.showAllStorage());
    }

    @Test
    public void shouldShowStorageNotEmpty(){
        Storage.addObject("qiwi", 2);
        assertNull(Storage.showAllStorage());
    }


}
