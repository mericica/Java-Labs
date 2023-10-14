package Problem4;

public class ElectronicShopTest {
    int[] keyboards = new int[]{55, 30, 40, 12, 93, 22};
    int[] usbs = new int[]{10, 2, 43, 33, 25};

    ElectronicShop e1 = new ElectronicShop(keyboards, usbs);
    public void cheapestKeyboardTest(){
        assert e1.cheapestKeyboard() == 12;
    }

    public void mostExpensiveTest(){
        assert e1.mostExpensive() == 93;
    }

    public void buyMaxTest(){
        assert e1.buyMax(45) == 43;
    }

    public void buyTest(){assert e1.buy(23) == 22;}

    //unexpected tests
    public void buyTestUnexpected(){assert e1.buy(2) == -1;}

    public void buyMaxTestUnexpected(){assert e1.buyMax(1) == -1;}

    int[] emptyK = {};
    int[] emptyUSB = {};
    ElectronicShop e2 = new ElectronicShop(emptyK, emptyUSB);

    public void mostExpensiveUnexpected(){assert e2.mostExpensive() == -1;}

    public void cheapestKeyboardUnexpected(){assert e2.cheapestKeyboard() == -1;}

    //wrong tests - THESE WILL GIVE AN ASSERTION ERROR IF RUN;
    public void cheapestKeyboardTestWrong(){
        assert e1.cheapestKeyboard() == 9;
    }

    public void mostExpensiveTestWrong(){
        assert e1.mostExpensive() == 3;
    }

    public void buyMaxTestWrong(){
        assert e1.buyMax(45) == 22;
    }

    public void buyTestWrong(){assert e1.buy(23) == 12;}





}
