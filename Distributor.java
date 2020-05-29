package sample;

public class Distributor {

    protected double[] cost =new double[10];
    protected double totalAmount=0;

    public double getTotal(){

        for(int i = 0; i<= cost.length; i++){

            totalAmount=totalAmount+ cost[i];
        }

        return totalAmount;
    }


}