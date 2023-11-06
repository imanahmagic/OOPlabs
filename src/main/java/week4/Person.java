package week4;

class Person {
    private String name;
    private String address;
    private int age;
    private String country;


    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public Person(int age, String country){
        this.age = age;
        this.country = country;
    }


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }


    public String toString(){
        return this.name + "\n" + this.address;
    }

}




