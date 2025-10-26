class VarArgs {
    void sum(int... n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        System.out.println(sum);
    }
}

public class varless {
    public static void main(String args[]) {
        VarArgs object = new VarArgs();
        object.sum(10, 20);
        object.sum(10, 20, 30, 40, 50);
        object.sum(10);
        object.sum();
    }
}
