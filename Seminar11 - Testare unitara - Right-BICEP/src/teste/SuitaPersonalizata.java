package teste;

import categorii.CategorieCorrect;
import categorii.CategorieRightBicep;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AplicaDiscountTests.class,  GetVarstaTest.class})
@Categories.IncludeCategory(CategorieRightBicep.class)
@Categories.ExcludeCategory(CategorieCorrect.class)
public class SuitaPersonalizata {
}
