package middle.lesson27;

public class Container {
	private final int id = 1;
	private String name = "default";
	
	public Container() {
		this.name = new AnotherContainer("test").getName();
	}
	
	public void write () {
		System.out.println(new ContainerHelper().write());
	}
	
	private class ContainerHelper {
		String description = "helper class name is";
		
		String write() {
			return description + ": " + ContainerHelper.class.getName() + ", id: " + id + ", name: " + name; 
		}
	}
	
}

class AnotherContainer {
	private final String name;
	
	public AnotherContainer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}