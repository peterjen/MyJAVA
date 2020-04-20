
public class Position {
	public int c;
	public int r;
	public Position(int row, int col) {
		r = row;
		c = col;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + c;
		result = prime * result + r;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (c != other.c)
			return false;
		if (r != other.r)
			return false;
		return true;
	}
}
