import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task_1.FruitOrVegetable;

public class FruitOrVegetableTest {
//    public String[] products = {"banana", "apple", "kiwi", "cherry", "lemon", "grapes",
//    "tomato", "cucumber", "pepper", "carrot"};

    @Test
    void isReturnInCorrectProductType(){
        FruitOrVegetable fruitOrVegetable = new FruitOrVegetable();

        Assertions.assertNotEquals("unknown", fruitOrVegetable.isFruitOrVegetableOrUnknown("banana"),
                "Not correct product type! ");

        Assertions.assertNotEquals("vegetable", fruitOrVegetable.isFruitOrVegetableOrUnknown("banana"),
                "Not correct product type! ");

        Assertions.assertNotEquals("fruit", fruitOrVegetable.isFruitOrVegetableOrUnknown("tomato"),
                "Not correct product type! ");
    }
    @Test
    void isReturnCorrectProductType(){
        FruitOrVegetable fruitOrVegetable = new FruitOrVegetable();

        Assertions.assertEquals("fruit", fruitOrVegetable.isFruitOrVegetableOrUnknown("banana"),
                "Not correct product type! ");
        Assertions.assertEquals("fruit", fruitOrVegetable.isFruitOrVegetableOrUnknown("apple"),
                "Not correct product type! ");
        Assertions.assertEquals("fruit", fruitOrVegetable.isFruitOrVegetableOrUnknown("kiwi"),
                "Not correct product type! ");
        Assertions.assertEquals("fruit", fruitOrVegetable.isFruitOrVegetableOrUnknown("cherry"),
                "Not correct product type! ");
        Assertions.assertEquals("fruit", fruitOrVegetable.isFruitOrVegetableOrUnknown("lemon"),
                "Not correct product type! ");
        Assertions.assertEquals("fruit", fruitOrVegetable.isFruitOrVegetableOrUnknown("grapes"),
                "Not correct product type! ");
        Assertions.assertEquals("vegetable", fruitOrVegetable.isFruitOrVegetableOrUnknown("tomato"),
                "Not correct product type! ");
        Assertions.assertEquals("vegetable", fruitOrVegetable.isFruitOrVegetableOrUnknown("cucumber"),
                "Not correct product type! ");
        Assertions.assertEquals("vegetable", fruitOrVegetable.isFruitOrVegetableOrUnknown("pepper"),
                "Not correct product type! ");
        Assertions.assertEquals("vegetable", fruitOrVegetable.isFruitOrVegetableOrUnknown("carrot"),
                "Not correct product type! ");
    }
}
