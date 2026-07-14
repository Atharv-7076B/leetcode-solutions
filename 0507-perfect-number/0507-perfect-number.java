class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
// ArrayList<Integer> list = new ArrayList<>();
// int sum = 0;

// for (int i = 1; i < num; i++) {
//     if (num % i == 0) {
//         list.add(i);
//     }
// }

// for (int s : list) {
//     sum += s;
// }

// if (sum == num)
//     return true;

// return false;
