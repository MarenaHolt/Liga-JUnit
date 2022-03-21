package ru.digitalleague;

import org.junit.runners.Suite;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;


@RunWith(Categories.class)
@Suite.SuiteClasses({
        AddTest.class,
        RemoveTest.class,
        ShowAllTest.class
})
public class StorageSuiteTests {
}
