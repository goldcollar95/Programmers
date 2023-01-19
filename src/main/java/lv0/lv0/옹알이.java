package lv0.lv0;

public class 옹알이 {
    public int solution(String[] babbling) {
        String[] original = {"aya","ye","ma","woo"};   //제한사항 체크
        String[] repeat = {"ayaaya", "yeye", "mama", "woowoo"}; //반복사항 체크
        int answer = 0;

        for(String twokind : babbling){     // String 안에 타입이름 : 매개변수 동시 삽입
            for(String rbab : repeat){
                twokind = twokind.replace(rbab, "X");
            }

            for(String orab : original){

                twokind = twokind.replace(orab, "?");
            }

            int number = 0;
            for(int i = 0; i < twokind.length(); i++){
                if(!twokind.subSequence(i, i+1).equals("?")){
                    number = 1;
                    break;
                }
            }
            if(number == 0){
                answer++;
            }
        }
        return answer;
    }


    //subSequence에 대한 개념과 replace에 대한 이해
    /*  public CharSequence subSequence(int beginIndex, int endIndex) {
        return this.substring(beginIndex, endIndex);
    }*/

}
