import java.util.Stack;

class CustomStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> inc = new Stack<>();
    int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (stack.size() < maxSize) {
            stack.push(x);
            inc.push(0);
        }
    }

    public int pop() {
        if (stack.empty()) {
            return -1;
        }

        int i = stack.size() - 1;
        int add = inc.pop();
        int value = stack.pop();

        if (!inc.empty()) {
            inc.set(i - 1, inc.get(i - 1) + add);
        }

        return value + add;
    }

    public void increment(int k, int val) {
        int i = Math.min(k, stack.size()) - 1;

        if (i >= 0) {
            inc.set(i, inc.get(i) + val);
        }
    }
}
/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */