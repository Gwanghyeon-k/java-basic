package class6.problem1;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max){
        this.max = max;
        this.count=0;
    }

    class increment() {
        if(max<count){
            count += 1;
        } else{
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    class getCount(count){
        return count;
    }
}
