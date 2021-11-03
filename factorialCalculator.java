import javakara.JavaKaraProgram;
        
/* COMMANDS:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSORS: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */

public class factorialCalculator extends JavaKaraProgram {
	public void myProgram() {
		int leafCount = this.countLeafs();
		kara.turnRight();
		kara.move();
		kara.turnLeft();
		int factorial = this.calculateFactorial(LeafCount);
		this.row(factorial);
		kara.move();
	}

	int countLeafs() {
		kara.move();
		int count = 0;
		while(kara.onLeaf()) {
			count++;
			kara.move();
		}

		return count;
	}

	int calculateFactorial(int value) {
		int result = 1;
		while(value != 0) {
			result = result*value;
			value--;
		}

		return result;
	}

	void putLeafs(int length) {
		// Optional - seperates the leafs into blocks of ten
		int xAxis = 0;
		int yAxis = 1;
		String directionTurned = "left";

		while(length != 0) {
			// Optional - seperates the leafs into blocks of ten
			if(xAxis == 10) {
				if(directionTurned == "left") {
					kara.move();
					kara.turnRight();

					// When Kara already put 10 Rows on the y-Axis, Kara makes
					// an extra step to seperate the rows in blocks of ten
					if(yAxis == 10) {
						kara.move();
						yAxis = 0;
					}

					kara.move();
					kara.turnRight();
					directionTurned = "right";
				} else {
					kara.move();
					kara.turnLeft();

					// When Kara already put 10 Rows on the y-Axis, Kara makes
					// an extra step to seperate the rows in blocks of ten
					if(yAxis == 10) {
						kara.move();
						yAxis = 0;
					}

					kara.move();
					kara.turnLeft();
					directionTurned = "left";
				}
				xAxis = 0;
				yAxis++;
			}

			kara.move();
			kara.putLeaf();
			length--;
			
			// Optional - seperates the leafs into blocks of ten
			xAxis++;
		}
	}
}