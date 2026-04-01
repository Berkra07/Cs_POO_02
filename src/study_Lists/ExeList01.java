package study_Lists;

import java.util.ArrayList;
import java.util.List;

public class ExeList01 {
    static void main(String[] ignoredArgs) {

        List<Integer> list = new ArrayList<>();

        list.add(1000);
        list.add(3000);
        list.add(4000);
        list.add(5000);
        list.add(0, 2000);

        list.remove(1);

        for (Integer test: list){
            System.out.println(test);

        }
    }
}
