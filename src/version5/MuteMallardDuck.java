package version5;

public class MuteMallardDuck implements FlyGroup {
    private FlyBehavior flyBehavior;
     
    
    public MuteMallardDuck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
	
    @Override
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    
    
    public void display() {
		System.out.println("Muted Mallard Duck");
	}

}
