import java.util.Stack;

public class QueueUsingStack {
	private Stack<Integer> stk1;
	private Stack<Integer> stk2;

	public QueueUsingStack() {
		stk1 = new Stack<Integer>();
		stk2 = new Stack<Integer>();
	}

	void add(int value) {
		stk1.push(value);
	}

	int remove() {
		int value;
		if (stk2.isEmpty() == false) {
			return stk2.pop();
		}

		while (stk1.isEmpty() == false) {
			value = stk1.pop();
			stk2.push(value);
		}
		return stk2.pop();
	}

	public static void main(String[] args) {
		QueueUsingStack que = new QueueUsingStack();
        que.add(1);
        que.add(2);
        que.add(3);
        System.out.println("Queue remove : " + que.remove());
        System.out.println("Queue remove : " + que.remove());
	}
}

/*
Queue remove : 1
Queue remove : 2
*/