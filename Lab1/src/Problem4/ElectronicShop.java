package Problem4;

public class ElectronicShop {
    private int[] keyboards;
    private int[] usbs;

    public ElectronicShop(int[] keyboards, int[] usbs) {
        this.keyboards = keyboards;
        this.usbs = usbs;
    }
    public int cheapestKeyboard(){
        if (keyboards.length == 0){
            return -1;
        }
        int min = keyboards[0];
        for(int i=0; i<keyboards.length; i++){
            if(keyboards[i] < min){
                min = keyboards[i];
            }
        }
        return min;
    }

    public int mostExpensive(){
        if(keyboards.length == 0 || usbs.length == 0){
            return -1;
        }
        int max = keyboards[0];
        for(int i=0; i<keyboards.length; i++){
            if(keyboards[i] > max){
                max = keyboards[i];
            }
        }
        for(int i=0; i<usbs.length; i++){
            if(usbs[i]> max){
                max = usbs[i];
            }
        }
        return max;
    }

    public int buyMax(int budget){
        int max = -1;
        for(int i=0; i<usbs.length; i++){
            if(usbs[i] <= budget && usbs[i] >max){
                max = usbs[i];
            }
        }
        return max;
    }

    public int buy(int budget){
        int max = -1;
        int keyboardPrice = 0;
        int usbPrice = 0;
        for(int i=0; i<keyboards.length; i++){
            for(int j=0; j<usbs.length; j++){
                if(usbs[j] + keyboards[i] <= budget && usbs[j] + keyboards[i] >max){
                    max = usbs[j]+keyboards[i];
                    keyboardPrice = keyboards[i];
                    usbPrice = usbs[j];
                }
            }
        }
        return max;
    }
}
