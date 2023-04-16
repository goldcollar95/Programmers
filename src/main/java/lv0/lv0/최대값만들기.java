package lv0.lv0;

import java.util.ArrayList;
import java.util.Collections;

public class 최대값만들기 {
    public int solution(int[] numbers){
        ArrayList<Integer> ArrNum = new ArrayList<>();
        for(int num : numbers){
            ArrNum.add(num);
        }
        Collections.sort(ArrNum);
        return ArrNum.get(ArrNum.size()-1)* ArrNum.get(ArrNum.size()-2);
    }
}
