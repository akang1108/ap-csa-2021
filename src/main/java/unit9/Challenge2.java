package unit9;

import java.util.ArrayList;

public class Challenge2 {
    public static void main(String[] args) {
        // create objects
        ShoppingCart cart = new ShoppingCart();

        // add items to ArrayList cart
        cart.add(new Item("bread", 3.25));
        cart.add(new Item("milk", 2.50));

        // uncomment next 2 lines
        // challenge #5 create DiscountedItem object & add to cart ArrayList
        //cart.add(new DiscountedItem("ice cream", 4.50, 1.50));
        //cart.add(new DiscountedItem("apples", 1.35, 0.25));

        // display order
        cart.printOrder();
    } // main()

    public static class DiscountedItem extends Item {
        // add an instance variable for the discount

        // Add constructors that call the super constructor

        // Add get/set methods for discount
        public double getDiscount() {
            return 0.0; // return discount here instead of 0
        } // getDiscount()

        // Add a toString() method that returns a call to the super toString
        // and then the discount in parentheses using the super.valueToString() method

    } // DiscountedItem extends Item

    public static class Item {

        // instance variables
        private String name;
        private double price;

        // constructor no arguments
        public Item() {
            this.name = "";
            this.price = 0.0;
        }

        // constructor 2 arguments
        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        } // getPrice()

        public String valueToString(double value) {
            String result = "" + Math.abs(value);
            if(result.indexOf(".") == result.length() - 2) {
                result += "0";
            }
            result = "$" + result;
            return result;
        } // valueToString()

        public String toString() {
            return name + " " + valueToString(price);
        } // toString()

    } // Item

    public static class ShoppingCart {

        // instance variables
        private ArrayList<Item> order;
        private double total;
        private double internalDiscount;

        // constructor no arguments
        public ShoppingCart() {
            order = new ArrayList<Item>();
            total = 0.0;
            internalDiscount = 0.0;
        }

        public void add(Item i) {
            order.add(i);
            total += i.getPrice();
            if (i instanceof DiscountedItem)
                internalDiscount += ((DiscountedItem) i).getDiscount();
        } // add()

        /** printOrder() will call toString() to print */
        public void printOrder() {
            System.out.println(this);
        } // printOrder()

        public String toString() {
            return discountToString();
        } // toString()

        public String discountToString() {
            return orderToString() + "\nSub-total: " + valueToString(total) + "\nDiscount: " + valueToString(internalDiscount) + "\nTotal: " + valueToString(total - internalDiscount);
        } // discountToString()

        private String valueToString(double value) {
            value = Math.rint(value * 100) / 100.0;
            String result = "" + Math.abs(value);
            if(result.indexOf(".") == result.length() - 2) {
                result += "0";
            }
            result = "$" + result;
            return result;
        } // valueToString()

        public String orderToString() {
            String build = "\nOrder Items:\n";
            for(int i = 0; i < order.size(); i++) {
                build += "   " + order.get(i);
                if(i != order.size() - 1) {
                    build += "\n";
                } // if
            } // for
            return build;
        } // orderToString()

    } // ShoppingCart
}
