public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet(){
    }

    public Pet(String n, int i, String l, String t){
        name = n;
        age = i;
        location = l;
        type = t;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String type(){
        return type;
    }

    public void setName(String str){
        name = str;
    }
    public void setAge(int i){
        age = i;
    }
    public void setLocation(String str){
        location = str;
    }
}
