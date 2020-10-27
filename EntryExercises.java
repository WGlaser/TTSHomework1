import java.util.*;


public class EntryExercises {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for(int i = 1; i<6;i++){
            System.out.println("Please enter number " + i +": ");
            Integer x = reader.nextInt();
            myList.add(x);
        }
        System.out.println("The sum of your numbers is:" + getSum(myList));
        System.out.println("The product of your numbers is:" + getProd(myList));
        System.out.println("The max of your numbers is:" + findMax(myList));
        System.out.println("The min of your numbers is:" + findMin(myList));

        //HASHMAP SECTION (key,value), in this case (model, make)
        HashMap<String, String> vehicles = new HashMap<>();
        vehicles.put("Lumina","Chevrolet");
        vehicles.put("CRV", "Honda");
        vehicles.put("CX5", "Mazda");
        vehicles.put("Ion", "Saturn");
        vehicles.put("Passport","Honda");
        System.out.println("Welcome to the car dealership!");
        reader.nextLine();
        System.out.println("Please enter the model you are looking for?");
        String x = reader.nextLine();
        if(vehicles.containsKey(x)){
            System.out.println("Oh, you're looking for a " + x + "? Our " + vehicles.get(x)+ " selection is right this way!");
        }
        else{
            System.out.println("Sorry, we don't have any" + x + "s");

        }




    }
    //List Helper Methods
    public static int getSum(ArrayList<Integer> x){
        int sum = 0;
        for (Integer i : x) {
            sum +=i;
        }
        return sum;
    }
    public static int getProd(ArrayList<Integer> x){
        int prod = 1;
        for(Integer i:x){
            prod*=i;
        }
        return prod;
    }
    public static int findMax(ArrayList<Integer>x){
        int currentMax = x.get(0);
        for(int i = 1; i<x.size();i++){
            if(x.get(i)>currentMax){
                currentMax = x.get(i);
            }
        }
        return currentMax;
    }
    public static int findMin(ArrayList<Integer>x){
        int currentMin = x.get(0);
        for(int i = 1; i<x.size();i++){
            if(x.get(i)<currentMin){
                currentMin = x.get(i);
            }
        }
        return currentMin;
    } 
}
