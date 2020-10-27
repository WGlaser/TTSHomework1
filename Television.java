public class Television {
    private String brand;
    private int size;
    private double cost;

    public Television(){
    }

    public Television(String b, int s){
        brand =b;
        size = s;
    }
    public Television(String b, int s, double c){
        brand =b;
        size = s;
        cost =c;
    }

    public String getBrand(){
        return brand;
    }
    public int getSize(){
        return size;
    }
    public double getCost(){
        return cost;
    }
    public void setBrand(String s){
        brand = s;
    }
    public void setSize(int i){
        size = i;
    }
    public void setCost(double c){
        cost = c;
    }

    public Boolean isBig(){
        if(this.getSize()>55){
            return true;
        }
        else{
            return false;
        }
    }
    public String shouldIBuyIt(){
        if(this.getCost()>500){
            return "Nope. too expensive";
        }
        else{
            return "Sure, you can afford it!";
        }
    }

}
