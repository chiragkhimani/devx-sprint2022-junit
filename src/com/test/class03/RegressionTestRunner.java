package com.test.class03;


import com.test.class02.DivTest;
import com.test.class02.ModuloTest;
import com.test.class02.MulTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ModuloTest.class, MulTest.class, DivTest.class})
public class RegressionTestRunner {

}
