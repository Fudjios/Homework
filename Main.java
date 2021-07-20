public class Main {

    public static void main(String[] args) {
    }

    static void TaskNumber1() {

        int[] arrayNumber_1 = {0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arrayNumber_1.length; i++) {
            if (arrayNumber_1[i] == 1) {
                arrayNumber_1[i] = arrayNumber_1[i] - 1;
            } else {
                arrayNumber_1[i] = arrayNumber_1[i] + 1;
            }
        }

    }


    static void TaskNumber2() {

        int[] Task2_arrayNumber_1 = new int[100];

        for (int i = 0, y = 1; i < Task2_arrayNumber_1.length; i++, y++) {
            Task2_arrayNumber_1[i] = y;
        }
    }


    static void TaskNumber3() {

        int[] Task3_arrayNumber_1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < Task3_arrayNumber_1.length; i++) {
            if (Task3_arrayNumber_1[i] < 6) {
                Task3_arrayNumber_1[i] = Task3_arrayNumber_1[i] * 2;
            }
        }
    }


    static void TaskNumber4() {

        int[][] Task4_arrayNumber_1 = new int[7][7];

        for (int i = 0; i < Task4_arrayNumber_1.length; i++) {
            for (int y = 0; y < Task4_arrayNumber_1.length; y++) {
                if (y == i | (Task4_arrayNumber_1.length - i) == (y + 1)) {
                    Task4_arrayNumber_1[i][y] = 1;
                }
                System.out.print(Task4_arrayNumber_1[i][y]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    static int[] TaskNumber5(int len, int initialValue) {

        int[] Task5_arrayNumber_1 = new int[len];

        for (int i = 0; i < Task5_arrayNumber_1.length; i++) {
            Task5_arrayNumber_1[i] = initialValue;
        }
        return Task5_arrayNumber_1;
    }


    static void TaskNumber6() {
        int[] Task6_arrayNumber1 = {1, 5, 7, 25, -5, 105, 1255};
        int max = Task6_arrayNumber1[0];
        int min = Task6_arrayNumber1[0];
//        System.out.println(Arrays.stream(Task6_arrayNumber1).max());
//        System.out.println(Arrays.stream(Task6_arrayNumber1).min());
        for (int i = 0; i < Task6_arrayNumber1.length; i++) {
            if (max < Task6_arrayNumber1[i]) {
                max = Task6_arrayNumber1[i];
            } else if (min > Task6_arrayNumber1[i]) {
                min = Task6_arrayNumber1[i];
            }
        }
    }


    static boolean TaskNumber7(int i) {

        int[] Task7_arrayNumber_1 = new int[i];
        int left, right, x;
        left = 0;
        x = 0;

        for(int z = 0; z < Task7_arrayNumber_1.length; z++) {
            Task7_arrayNumber_1[z] = (int) (Math.random() * 11);
        }

        for (int f = 0; f < Task7_arrayNumber_1.length; f++) {
            x = x + Task7_arrayNumber_1[f];
        }

        right = x - left;

            for (int go = 0; go < Task7_arrayNumber_1.length; go++) {
                if (left != right) {
                    left = left + Task7_arrayNumber_1[go];
                    right = right - Task7_arrayNumber_1[go];
                }
            }

        if(left == right) {
            return true;
        } else {
            return false;}
    }
}



