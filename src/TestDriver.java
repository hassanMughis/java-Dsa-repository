class testDriver {
    int max;
    int[] data;
    int top;

    testDriver(int max) {
        this.max = max;
        this.data = new int[max];
        this.top = -1;
    }

    public void push(int val) {
        if (isfull()) {
            System.out.println("Full");
        } else {
            top++;
            data[top] = val;
            System.out.println("Pushed: " + val);
        }
    }

    public void pop() {
        if (isempty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Popped: " + data[top]);
            top--;
        }
    }

    public boolean isempty() {
        return top == -1;
    }

    public boolean isfull() {
        return top == max - 1;
    }

    public int peek() {
        if (isempty()) {
            System.out.println("Empty");
            return -1;
        }
        return data[top];
    }

    public int find(int val) {
        for (int i = top; i >= 0; i--) {
            if (data[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static String flip(String str) {
        testDriver stack = new testDriver(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        char[] flipped = new char[str.length()];
        int idx = 0;
        while (!stack.isempty()) {
            flipped[idx++] = (char) stack.data[stack.top];
            stack.pop();
        }

        return new String(flipped);
    }

    public static int flipNum(int num) {
        testDriver stack = new testDriver(10);
        while (num > 0) {
            stack.push(num % 10);
            num /= 10;
        }

        int rev = 0;
        int place = 1;
        while (!stack.isempty()) {
            rev += stack.data[stack.top] * place;
            stack.pop();
            place *= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        testDriver stack = new testDriver(7);

        stack.pop();
        stack.push(10);
        stack.pop();

        String txt = "Hello";
        System.out.println("Original: " + txt);
        System.out.println("Flipped: " + flip(txt));

        int num = 12345;
        System.out.println("Original: " + num);
        System.out.println("Flipped: " + flipNum(num));

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Found 20 at: " + stack.find(20));
        System.out.println("Found 40 at: " + stack.find(40));

        System.out.println("Top: " + stack.peek());
    }
}

