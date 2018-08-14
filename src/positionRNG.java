import java.util.Random;

public class positionRNG {
	
	private Random spawnPositionX = new Random();
	private Random spawnPositionY = new Random();
	
	public int snakeSpawnX() {
		int positionX= 1+spawnPositionX.nextInt(25);
		return positionX;
	}

	public int snakeSpawnY() {
		int positionY= 1+spawnPositionY.nextInt(25);
		return positionY;
	}
	
	
}
