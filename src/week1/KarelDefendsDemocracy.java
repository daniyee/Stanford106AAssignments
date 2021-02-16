package week1;

import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				removeHangingChad();
			}
			move();
		}
	}

	/**
	 * Remove any hanging chad from a ballot
	 */
	private void removeHangingChad() {
		turnRight();
		checkBallot();
		checkBallot();
		turnLeft();
	}

	private void checkBallot() {
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
	}
}
