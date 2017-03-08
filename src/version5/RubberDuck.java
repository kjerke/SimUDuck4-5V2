package version5;

public class RubberDuck implements QuackGroup {
	private QuackBehavior quackBehavior;
        
	public RubberDuck(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;	
	}
        
        @Override
        public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
        
        @Override
        public void performQuack() {
            quackBehavior.quack();
        }
	
        @Override
	public void display() {
		System.out.println("I'm a Rubber Duck");
	}
	

}
