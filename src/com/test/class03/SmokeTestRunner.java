package com.test.class03;

import com.test.class02.DivTest;
import com.test.class02.ModuloTest;
import com.test.class02.MulTest;
import com.test.group.SmokeTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SmokeTest.class)
@Suite.SuiteClasses({DivTest.class, ModuloTest.class, MulTest.class})
public class SmokeTestRunner {

}
