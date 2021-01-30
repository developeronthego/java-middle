package middle.lesson15;

import java.util.Objects;

public class MyHashKey {
	private String key;
	
	public MyHashKey(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		return Objects.hash(key);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof MyHashKey))
			return false;
		MyHashKey other = (MyHashKey) obj;
		return Objects.equals(key, other.key);
	}


}
