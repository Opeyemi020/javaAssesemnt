package chapter16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example3 {


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);



        Collection<Integer> numbers = Collections.synchronizedList(nums);
    }

}
