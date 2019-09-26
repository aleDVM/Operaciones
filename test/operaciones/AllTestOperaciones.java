package operaciones;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

TestSumar.class, TestMultiplicar.class, TestDividir.class, TestRestar.class

})
public class AllTestOperaciones {

    public AllTestOperaciones() {
    }
    
}
