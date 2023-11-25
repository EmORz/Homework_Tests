package task_1;
//    a. Нека проверим дали даден продукт е плод или зеленчук. Плодовете
//"fruit" са banana, apple, kiwi, cherry, lemon и grapes. Зеленчуците
//"vegetable" са tomato, cucumber, pepper и carrot. Всички останали са
//"unknown".
public class FruitOrVegetable {

    public FruitOrVegetable() {

    }

    public String[] products = {"banana", "apple", "kiwi", "cherry", "lemon", "grapes",
    "tomato", "cucumber", "pepper", "carrot"};

    public String isFruitOrVegetableOrUnknown(String ptoduct){
        for (int i = 0; i < products.length; i++) {

            if (products[i].equalsIgnoreCase(ptoduct)) {
                if (i <6) {
                    return "fruit";
                }if(i>=6&&i<=10){
                    return "vegetable";
                }
            }

        }
        return "unknown";
    }

}
