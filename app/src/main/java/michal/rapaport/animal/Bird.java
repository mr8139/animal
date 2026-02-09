package michal.rapaport.animal;

public class Bird extends animal1 {
    private  String  food;
    public Bird ( String name,int age,String food)
    {
        super(name,age);
        this.food=food;
    }
    public void printy()
    {
        super.printy();
        System.out.println("my food is "+food);
    }

    public String getFood() {
        return food;
    }
    @Override
    public void makeSound()
    {
        System.out.println("the bird tweets");
    }
}
