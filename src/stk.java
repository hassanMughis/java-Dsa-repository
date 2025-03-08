class stk {
    private String[] stk;
    private int top;
    private int cap;

    public stk(int size) {
        stk = new String[size];
        cap = size;
        top = -1;
    }

    public void push(String item) {
        if (top == cap - 1) {
            System.out.println("Error: stack is full");
            return;
        }
        stk[++top] = item;
    }

    public String pop() {
        if (isempty()) {
            System.out.println("Error: stack is empty");
            return null;
        }
        return stk[top--];
    }

    public String peek() {
        if (isempty()) {
            System.out.println("Error: stack is empty");
            return null;
        }
        return stk[top];
    }

    public boolean isempty() {
        return top == -1;
    }

    public static String revstr(String input) {
        stk stk = new stk(input.length());
        for (char ch : input.toCharArray()) {
            stk.push(String.valueOf(ch));
        }
        char[] rev = new char[input.length()];
        int i = 0;
        while (!stk.isempty()) {
            rev[i++] = stk.pop().charAt(0);
        }
        return new String(rev);
    }

    public static int revnum(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public int search(String elem) {
        for (int i = top; i >= 0; i--) {
            if (stk[i].equals(elem)) {
                return top - i;
            }
        }
        return -1;
    }

    public static class undo {
        private stk hist;
        private stk redo;

        public undo(int size) {
            hist = new stk(size);
            redo = new stk(size);
        }

        public void save(String state) {
            hist.push(state);
            redo = new stk(hist.cap);
        }

        public String undo() {
            if (hist.top > 0) {
                redo.push(hist.pop());
                return hist.peek();
            }
            return "no prev state";
        }

        public String redo() {
            if (!redo.isempty()) {
                hist.push(redo.pop());
                return hist.peek();
            }
            return "no redo avail";
        }
    }

    public static void main(String[] args) {
        String inputstr = "hello";
        System.out.println("rev str: " + revstr(inputstr));

        int inputnum = 12345;
        System.out.println("rev num: " + revnum(inputnum));

        stk stk = new stk(10);
        stk.push("hello");
        stk.push("world");
        stk.push("java");

        System.out.println("pos of 'world': " + stk.search("world"));
        System.out.println("top elem (peek): " + stk.peek());

        undo editor = new undo(5);
        editor.save("first ver");
        editor.save("second ver");
        editor.save("third ver");

        System.out.println("undo: " + editor.undo());
        System.out.println("undo: " + editor.undo());
        System.out.println("redo: " + editor.redo());
        System.out.println("redo: " + editor.redo());
        System.out.println("undo: " + editor.undo());
    }
}
