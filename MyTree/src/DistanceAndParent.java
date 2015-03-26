import java.util.List;

public class DistanceAndParent {

	List<String> path;
	int totalDistance;

	public String toString() {
		String ret = " Distance: " + totalDistance;
		for (String comp : path) {
			ret += ", ";
			ret += comp;
		}
		return ret;
	}

}
