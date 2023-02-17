package maventest2;

public class PojoBean {
    String name;        // имя
    int age;            // возраст

    public String getName(){
        return name;
    }
    public  String setName(){
        return name;
    }
    public  int getAge(){
        return age;
    }
    public  int setAge(){
        return age;
    }

   public PojoBean(String nName, int aAge){
        name=nName;
        age=aAge;
    }

    public String toString(){
        return ("[Name: " + name + ", Age: " + age + "]");
    }
}
