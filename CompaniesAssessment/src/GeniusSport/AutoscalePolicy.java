package GeniusSport;

import java.util.Arrays;
import java.util.List;

public class AutoscalePolicy {
    public static int finalInstances(int instances, List<Integer> averageUtil) {
        int i = 0;
        double max = 2*Math.pow(10,8);
        while(i < averageUtil.size()) {
            if (averageUtil.get(i) > 60) {
                if (instances < max) {
                    instances *= 2;
                    i += 11; //increase i by 10 and move i++ outside else
                } else
                    i++;
            }
            else if (averageUtil.get(i) < 25) {
                if (instances > 1) {
                    instances = (int)Math.ceil((float)instances / 2);
                    i += 11;//increase i by 10 and move i++ outside else
                } else
                    i++;
            } else if(25 <= averageUtil.get(i) && averageUtil.get(i) <= 60)
                i++;
        }

        return instances;
    }

    public static void main(String[] args) {
        System.out.println(finalInstances(1, Arrays.asList(5,10,80)));
    }
}
