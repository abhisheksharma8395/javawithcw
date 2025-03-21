package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsack {
    public static class item{
        Integer price;
        Integer weight;
        Double ratio;
        public item(Integer price, Integer weight) {
            this.price = price;
            this.weight = weight;
            this.ratio = (double)price / weight;
        }
        public String toString(){
            return price + " " + weight + "(Ratio :" + ratio + ")";
        }
    }
    public static void FractionalKnapSack(List<Integer> itemPrice,List<Integer> itemWeight, int w) {
        List<item> items = new ArrayList<>();
        for(int i=0;i<itemPrice.size();i++){
            item temp = new item(itemPrice.get(i),itemWeight.get(i));
            items.add(temp);
        }
        items.sort(Comparator.comparingDouble((item i)-> i.ratio).reversed());
        System.out.println(items);
        double maxvalue = 0.0;
        int remainingWeight = w;
        for(item i : items){
            if(remainingWeight >= i.weight){
                maxvalue += i.price;
                remainingWeight -= i.weight;
            }
            else{
                maxvalue += remainingWeight * i.ratio;
                break;
            }
        }
        System.out.println("Maximum Value in the Knapsack is " + maxvalue);
    }
    public static void main(String[] args) {
        List<Integer> priceItem = List.of(60,100,120);
        List<Integer> weightItem = List.of(10,20,30);
        int w = 50;
        FractionalKnapSack(priceItem,weightItem,w);
    }
}
