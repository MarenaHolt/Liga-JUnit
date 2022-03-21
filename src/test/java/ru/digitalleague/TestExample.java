package ru.digitalleague;

import org.junit.*;
import org.junit.runners.MethodSorters;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//Задание по JUnit
//
//Необходимо покрыть тестами все методы, которые возвращают значения у класса Storage,
// который можно найти по ссылке https://github.com/AKorostelyov/Lesson4_Collections
//Как минимум должно быть два теста на метод (один позитивный и один негативный), но лучше больше
//Небольшое описание работы класса можно увидеть в файлике README.md в репозитории
//Также я туда добавил примерчик простого теста
//
//Примеры рассмотренные на лекции:
//https://github.com/AKorostelyov/junit_example

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestExample {

    @Before
    public void setUp(){
        Storage.addObject("apple", 3);
        Storage.addObject("pear", 7);
    }

    @Test
    public void simpleTest() {
        Storage.removeObject("pear");
        assertFalse(Storage.isInStock("pear"));
    }




}