class Normal {
    void task1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task1: " + i);
        }
    }

    void task2() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task2: " + i);
        }
    }

    public static void main(String[] args) {
        Normal n = new Normal();
        n.task1();
        n.task2();
    }
}