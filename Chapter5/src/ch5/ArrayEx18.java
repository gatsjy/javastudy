package ch5;

/**
 * @author Gatsjy
 * @since 2021-03-24
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score= {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };
        int sum = 0;

        for (int i = 0; i < score.length; i++){
            for(int j=0; j < score[i].length; j++){
                System.out.println(score[i][j]);
            }
        }
    }
}
