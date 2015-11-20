package mil.nga.geopackage.tiles;

/**
 * Tile grid with x and y ranges
 * 
 * @author osbornb
 */
public class TileGrid {

	/**
	 * Min x
	 */
	private long minX;

	/**
	 * Max x
	 */
	private long maxX;

	/**
	 * Min y
	 */
	private long minY;

	/**
	 * Max y
	 */
	private long maxY;

	/**
	 * Constructor
	 * 
	 * @param minX
	 * @param maxX
	 * @param minY
	 * @param maxY
	 * @param width
	 * @param height
	 */
	public TileGrid(long minX, long maxX, long minY, long maxY) {
		this.minX = minX;
		this.maxX = maxX;
		this.minY = minY;
		this.maxY = maxY;
	}

	public long getMinX() {
		return minX;
	}

	public void setMinX(long minX) {
		this.minX = minX;
	}

	public long getMaxX() {
		return maxX;
	}

	public void setMaxX(long maxX) {
		this.maxX = maxX;
	}

	public long getMinY() {
		return minY;
	}

	public void setMinY(long minY) {
		this.minY = minY;
	}

	public long getMaxY() {
		return maxY;
	}

	public void setMaxY(long maxY) {
		this.maxY = maxY;
	}

	/**
	 * Get the count of tiles in the grid
	 * 
	 * @return
	 */
	public long count() {
		return ((maxX + 1) - minX) * ((maxY + 1) - minY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (maxX ^ (maxX >>> 32));
		result = prime * result + (int) (maxY ^ (maxY >>> 32));
		result = prime * result + (int) (minX ^ (minX >>> 32));
		result = prime * result + (int) (minY ^ (minY >>> 32));
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TileGrid other = (TileGrid) obj;
		if (maxX != other.maxX)
			return false;
		if (maxY != other.maxY)
			return false;
		if (minX != other.minX)
			return false;
		if (minY != other.minY)
			return false;
		return true;
	}

}
