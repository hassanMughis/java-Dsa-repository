class TextNode {
    String cmd;
    int sev;

    TextNode(String cmd, int sev) {
        this.cmd = cmd;
        this.sev = sev;
    }
}

class TxtFmtQ {
    private TextNode[] q;
    private int front;
    private int rear;
    private int size;
    private int cap;

    public TxtFmtQ(int cap) {
        this.cap = cap;
        q = new TextNode[cap];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(String cmd, int sev) {
        if (size == cap) {
            System.out.println("Error: queue is full");
            return;
        }
        rear = (rear + 1) % cap;
        q[rear] = new TextNode(cmd, sev);
        size++;
    }

    public TextNode dequeue() {
        if (isEmpty()) {
            System.out.println("Error: queue is empty");
            return null;
        }
        TextNode item = q[front];
        front = (front + 1) % cap;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void reverseFirstK(int k) {
        if (k > size) {
            k = size;
        }

        TextNode[] stack = new TextNode[k];

        for (int i = 0; i < k; i++) {
            stack[i] = dequeue();
        }

        for (int i = k - 1; i >= 0; i--) {
            enqueue(stack[i].cmd, stack[i].sev);
        }

        int remaining = size - k;
        for (int i = 0; i < remaining; i++) {
            TextNode temp = dequeue();
            enqueue(temp.cmd, temp.sev);
        }
    }


    public Integer getMin() {
        if (isEmpty()) {
            return null;
        }

        int minSev = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            int index = (front + i) % cap;
            if (q[index].sev < minSev) {
                minSev = q[index].sev;
            }
        }
        return minSev;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            int index = (front + i) % cap;
            System.out.println("cmd: " + q[index].cmd + ", sev: " + q[index].sev);
        }
    }

    public static void main(String[] args) {
        TxtFmtQ tfq = new TxtFmtQ(10);
        tfq.enqueue("bold", 3);
        tfq.enqueue("italics", 2);
        tfq.enqueue("underline", 5);
        tfq.enqueue("strikethrough", 1);

        System.out.println("Initial queue:");
        tfq.display();

        tfq.reverseFirstK(2);
        System.out.println("After reversing first 2 commands:");
        tfq.display();

        Integer minSev = tfq.getMin();
        System.out.println("Minimum : " + minSev);
    }
}
