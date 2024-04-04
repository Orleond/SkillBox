package Module3.Cat;
public class Cat {
    public static final int EYE_COUNT = 2;
    public static final double MIN_WIGHT = 1000;
    public static final double MAX_WIGHT = 9000;
    private double originWeight;
    private double weight;
    private double food;
    public static int count = 0;

    private CatColors catColor;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        food = 0.;
        count += 1;
    }

    public Cat(int weight) {
        this();
        this.weight = weight;
        originWeight = weight;
    }

    public Cat(Cat cat) {
        this.weight = cat.getWeight();
        this.catColor = cat.getCatColor();
    }
    public CatColors getCatColor() {
        return catColor;
    }

    public void setCatColor(CatColors catColor) {
        this.catColor = catColor;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        food += amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WIGHT) {
            count -= 1;
            return "Dead";
        }
        else if(weight > MAX_WIGHT) {
            count -= 1;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public double getFoodWeight() { return food; }

    public void piss() {
        weight -= 50;
        System.out.println("Котик сходил по-маленькому");
    }

    public static int getCount() { return count; }

    public Cat copyCat() {
        Cat cat = new Cat();
        cat.setCatColor(this.catColor);
        cat.originWeight = this.originWeight;
        cat.weight = this.getWeight();
        cat.food = this.food;
        return cat;
    }
}