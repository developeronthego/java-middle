package middle.lesson5;

public class BallMain {

	public static void main(String[] args) {
		Ball ball = new Ball("Some ball");
		System.out.println(ball.getName());
		Football football = new Football("Anna's ball", "Adidas");
		football.showBrand();
		football.showName();
		MyFootball olaBall = new MyFootball("Ola's ball", "Nike");
		olaBall.showBrand();
		olaBall.showName();
		olaBall.play("pass");
		olaBall.play("shoot");
	}
}
