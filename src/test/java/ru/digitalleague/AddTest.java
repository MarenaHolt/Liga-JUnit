package ru.digitalleague;

import org.junit.*;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class AddTest {

    @Before
    public void setUp(){
        Storage.addObject("apple", 3);
        Storage.addObject("pear", 7);
    }



    @After
    public void deliteInfo(){
        if (Storage.isInStock("яблоко")){
            Storage.removeObject("яблоко");
        }
        if (Storage.isInStock("orange")){
            Storage.removeObject("orange");
        }
        if (Storage.isInStock("BLUEBERRY")) {
            Storage.removeObject("BLUEBERRY");
        }
    }

    @Test
    public void shouldAddObjectStorageSizeMax(){
      assertTrue(Storage.addObject("orange", 1));
    }
    //проверяем, что можем добавить третью полку для товаров

    @Test
    public void  shouldAddObjectStorageSizeMoreMax(){
        Storage.addObject("orange", 1);
        assertFalse(Storage.addObject("kiwi", 10));
    }
    //проверяем, что не может быть больше трех полок на складе

    @Test
    public void shouldAddObjectNotLatin() {
      assertFalse(Storage.addObject("яблоко", 2));
    }
    /* <h3>Формат данных:</h3>
    названия вещей сохраняются в нижнем регистре латиницы (регистр ввода не важен),
    проверяем, что нельзя добавить товар, написанный кириллицей.
    Тест падает, т.е. товар добавляется*/

    @Test
    public void shouldAddObjectUpperCase() {
     assertFalse(Storage.addObject("BLUEBERRY", 2));
    }
    //регистр ввода. тест падает, т.к. можно добавить товар в верхнем регистре

    @Test
    public void shouldAddObjectCountZero(){
        assertTrue(Storage.addObject("orange", 0));
    }
    //проверяем, что можно добавить товар в количестве 0, просто резервируя под него полку

    @Test
    public void shouldAddObjectCountNegative(){
        assertFalse(Storage.addObject("orange", -5));
    }
    //проверяем, что нельзя добавить отрицательное кол-во товара


    @Test
    public void shouldAddObjectAmountTen() {
        assertTrue(Storage.addObject("pear", 3));
    }
    //количество товаров ровно 10

    @Test
    public void shouldAddObjectAmountMoreTen() {
        assertFalse(Storage.addObject("apple", 10));
    }
    //количество товаров не может быть больше 10




    }

