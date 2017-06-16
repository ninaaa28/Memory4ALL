package memory;

import javax.swing.Icon;

public class SpielStein {

	private Icon front, back;
	private int index;

	public SpielStein(Icon front, Icon back, int index) {
		this.front = front;
		this.back = back;
		this.index = index;
	}

	

	public Icon getFront() {
		return front;
	}

	public void setFront(Icon front) {
		this.front = front;
	}

	public Icon getBack() {
		return back;
	}

	public void setBack(Icon back) {
		this.back = back;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}