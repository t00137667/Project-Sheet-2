public class Animal {
    private String type;
    private String[] continents;
    private float weight;
    private int age;

    public Animal(){
        setType("No Type Specified");
        setContinents(null);
        setWeight(0.0f);
        setAge(0);
    }

    public Animal(String type,String[] continents,float weight,int age){
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }

    @Override
    public String toString() {
        String array = "";
        if (continents==null){
            array = "null";
        }
        else {
            for (int i = 0;i<continents.length;i++)
            {
                array += continents[i];
            }
        }

        String s = String.format("Type: %s\nContinents: %s\nWeight: %.1f\nAge: %d",type,array,weight,age);
        return s;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setContinents(String[] continents){
        this.continents = continents;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getType(){
        return type;
    }
    public String[] getContinents(){
        return continents;
    }
    public float getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }
}
