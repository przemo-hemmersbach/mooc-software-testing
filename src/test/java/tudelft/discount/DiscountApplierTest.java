package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class DiscountApplierTest {
    @Test
    void productsOtherThenHomeOrBusinessKeepTheirPrice() {
        Product a = new Product("a", 1, "");
        Product b = new Product("b", 1, "B");
        Product c = new Product("c", 1, "C");
        Product d = new Product("d", 1, "AHOME");
        Product e = new Product("e", 1, "BUSINESS2");
        List<Product> list = Arrays.asList(a, b, c, d, e);

        applyDiscountsTo(list);

        Assertions.assertTrue(list.stream().allMatch(product -> product.getPrice() == 1.0));
    }

    @Test
    void homeProductsGetTenPercentDiscount() {
        Product b = new Product("b", 1, "HOME");
        List<Product> list = Arrays.asList(b);

        applyDiscountsTo(list);

        Assertions.assertEquals(0.9, b.getPrice());
    }

    @Test
    void businessProductsGetToPercentOverhead() {
        Product b = new Product("b", 1, "BUSINESS");
        List<Product> list = Arrays.asList(b);

        applyDiscountsTo(list);

        Assertions.assertEquals(1.1, b.getPrice());
    }

    private void applyDiscountsTo(List<Product> list) {
        ProductDao products = Mockito.mock(ProductDao.class);
        Mockito.when(products.all()).thenReturn(list);

        DiscountApplier discountApplier = new DiscountApplier(products);
        discountApplier.setNewPrices();
    }

}
