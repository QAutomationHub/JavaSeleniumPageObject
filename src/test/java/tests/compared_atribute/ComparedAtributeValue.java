package tests.compared_atribute;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.util.ArrayList;

import static constants.Constant.CssProperties.BORDER_BOTTOM_COLOR;
import static constants.Constant.Urls.SINSAY_HOME_PAGE;


public class ComparedAtributeValue extends BaseTest {

    private final String deCart = "//a[@class='cart'][@data-lang='/de/de/']";
    private final String colorNoActiveCart = "rgba(255, 255, 255, 1)";
    ArrayList<String> list = new ArrayList<>();



    @Test
    public void comparedColorCartToMouseMovie() {
        basePage.open(SINSAY_HOME_PAGE);
        methods.compareAtribute(list, BORDER_BOTTOM_COLOR, colorNoActiveCart);
//        sinsayHomePage.movieCursorToCart();
//        methods.compareAtribute(deCart, BORDER_BOTTOM_COLOR, "rgba(238, 198, 252, 1)");

    }
}
