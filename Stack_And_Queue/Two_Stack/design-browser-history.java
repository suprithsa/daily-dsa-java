
import java.util.Stack;

class BrowserHistory {
    Stack<String> backStack = new Stack<>();
    Stack<String> forwardStack = new Stack<>();
    String current;

    public BrowserHistory(String homepage) {
        current = homepage;
    }

    public void visit(String url) {
        backStack.push(current);
        current = url;
        forwardStack.clear();
    }

    public String back(int steps) {
        while (steps > 0 && !backStack.isEmpty()) {
            forwardStack.push(current);
            current = backStack.pop();
            steps--;
        }
        return current;
    }

    public String forward(int steps) {
        while (steps > 0 && !forwardStack.isEmpty()) {
            backStack.push(current);
            current = forwardStack.pop();
            steps--;
        }
        return current;
    }
}


/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */