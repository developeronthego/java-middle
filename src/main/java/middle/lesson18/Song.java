package middle.lesson18;

public class Song {
	private String name;
	private String author;
	private double duration;
	
	public Song(String name, String author, double duration) {
		this.name = name;
		this.author = author;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", author=" + author + ", duration=" + duration + "]";
	}
	
}
