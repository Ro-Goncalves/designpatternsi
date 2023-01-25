package br.com.rogon.bethrobson.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    abstract void display();

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!!");
    }
}
