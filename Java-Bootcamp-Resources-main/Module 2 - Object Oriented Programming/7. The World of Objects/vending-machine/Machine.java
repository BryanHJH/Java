import java.util.Arrays;

public class Machine {
    private Item[][] items;
    
    //Constructors
    public Machine(Item[][] items) {
        this.items = new Item[items.length][items[0].length];

        for (int k = 0; k < items.length; k++) {
            for (int j2 = 0; j2 < items[k].length; j2++) {
                if (items[k][j2] == null) {
                    continue;
                } else {
                    this.items[k][j2] = new Item(items[k][j2]);
                }
            }
        }
    }

    //Getters
    public Item getItem(int row, int spot) {
        return new Item(this.items[row][spot]);
    }

    //Setter
    public void setItem(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }

    //toString method
    public String toString() {
        String message = "";

        for (int k = 0; k < items.length; k++) {
            for (int j2 = 0; j2 < items.length; j2++) {
                if (this.items[k][j2] == null) {
                    message += "Sold out\t";
                } else {
                    message +="\t" + this.items[k][j2].toString() + " ";
                }
            }

            message += "\n";
        }

        return message;
    }
    
    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */
    public boolean dispense(int row, int spot) {
        boolean result = false;

        if (this.items[row][spot].getQuantity() > 0) {
            this.items[row][spot].setQuantity(this.items[row][spot].getQuantity() - 1);
            result = true;
        }

        return result;
    }
}
