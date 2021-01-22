package middle.lesson2;

public class Polimorphism {

	public static void main(String args[]) {
		Parent father = new Parent("Adam");
		ChildOne doughter = new ChildOne("Adam", "Ewa");
		ChildTwo son = new ChildTwo("Adam", "Marek");
		doughter.showAge("30");
		
		doughter.showName();
		son.showName();
		son.showParentName();
		
		Parent doughterFromFather = new ChildOne("Adam", "Ewa");
		doughterFromFather.showName();
		doughterFromFather.showAge(50);
//		doughterFromFather.showAge("30");
		
		Parent sonFromFather = new ChildTwo("Adam", "Marek");
		sonFromFather.showName();
		
		if (father instanceof Parent) {
			father.showName();
		} 
		
		ChildOne notAllowed = (ChildOne) new Parent("Adam"); 
		notAllowed.showName();
	}
}
