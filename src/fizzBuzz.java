public class fizzBuzz {

    public String test() {
        return "working";
    }

    public String run(int[] num) {
        String result = "";
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 15 == 0) {
                result+= "FizzBuzz ";
            } else if (num[i] % 5 == 0) {
                result+= "Fizz ";
            } else if (num[i] % 3 == 0) {
                result+= "Buzz ";
            } else {
                result+= num[i] + " ";
            }
        }
        return result.trim();
    }
    public static void main(String[] args) {
        fizzBuzz x = new fizzBuzz();
        int[] numbers = new int[100];
        for(int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }
        String fizzBuzzedNumbers = x.run(numbers);
        System.out.println(fizzBuzzedNumbers);
    }
}

