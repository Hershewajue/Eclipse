import java.util.Scanner;
public class PizzaDeliveryPayment {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			// a. Get inputs from the user
			System.out.print("Enter the time taken (in minutes): ");
			int timeTaken = input.nextInt();
			System.out.print("Enter the size of the pizza (small, medium or large): ");
			String pizzaSize = input.next();

			// Calculate the payment for transportation based on the algorithm
			System.out.println("The time taken for the delivery: " + timeTaken);
			System.out.println("The size of the pizza: " + pizzaSize);
			System.out.println("Is the delivery time within the threshold: " + isWithinthreshold(timeTaken));
			System.out.println("The transport delivery payment: " + transportDeliveryPayment(timeTaken));
			System.out.println("The size delivery payment: " + sizeDeliveryPayment(pizzaSize));
			System.out.printf("The overall payment for transporting a %s pizza in %d minutes is £%.2f.\n", pizzaSize, timeTaken, overallDeliveryPayment(timeTaken, pizzaSize));
		}
	}

	// b. Method to check and calculate if the delivery time is within the threshold
	static boolean isWithinthreshold(int timeTaken) {
		boolean threshold = true;
		if (timeTaken <= 30) {
			threshold = true;
		} else {
			threshold = false;
		}
		return threshold;
	}

	// c. Method to calculate transportation delivery payment
	static double transportDeliveryPayment(int timeTaken) {
		double transportPayment = 0;
		if (timeTaken <= 30) {
			transportPayment = 5 + (30 - timeTaken) * 0.5;
		} else {
			transportPayment = (30 - timeTaken) * 0.5;
		}
		return transportPayment;
	}

	// d. Method to calculate size delivery payment
	static double sizeDeliveryPayment(String pizzaSize) {
		double pizzaCost = 0;
		switch (pizzaSize) {
		case "small":
			return pizzaCost = 4;
		case "medium":
			return pizzaCost = 8;
		case "large":
			return pizzaCost = 12;
		default:
			System.out.println("Invalid pizza size.");
			return pizzaCost;
		}
	}

	// e. Method that will calculate the total delivery payment
	static double overallDeliveryPayment(int timeTaken, String pizzaSize) {
		double overallPayment = transportDeliveryPayment(timeTaken) + sizeDeliveryPayment(pizzaSize);
		return overallPayment;
	}
}
