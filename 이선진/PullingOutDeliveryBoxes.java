package ing;

public class PullingOutDeliveryBoxes {
    public static void main(String[] args) {

        int n = 13;
        int w = 3;
        int num = 4;
        int answer = 0;

        int hop1 = (w*2+1)-2*(num%w);
        if (hop1 == (w*2+1)) hop1 = 1;
        System.out.println("hop1 은 "+hop1);
        int hop2 = 2*w-hop1;
        System.out.println("hop2 는 "+hop2);

        int sum = num;
        int a = 1;
        while(sum<n) {
            if (a%2 == 1) {
                sum+= hop1;
                System.out.println("sum은 "+sum);
                answer++;
                a++;
            } else {
                sum+= hop2;
                System.out.println("sum은 "+sum);
                answer++;
                a++;
            }
        }
        if (sum == n) answer++;

        System.out.println(answer);

    }
}
