package lv0.lv0;

public class 양꼬치 {
        public int solution(int n, int k) {
            int answer = 0;
            int yangggo = 12000;
            int drinking = 2000;
            int servicedrink = 0;

            for(int i = 0; i < n; i++){
                for(int j = 0; j < k; j++){
                    if(servicedrink % 10 == 0){
                        servicedrink++;
                    }
                    answer = (n * yangggo) + ((k-(n/10)) * drinking);
                    //음료수 값은 먹은 음료수에서 (먹은 꼬치 수 / 10)를 빼야하기 때문에
                    //먹은 꼬치 수 n에 12000을 곱한 값에 (먹은 음료수 - (먹은 꼬치 수 / 10))에 2000원을 곱한값을 더해준다.

                }
            }
            return answer;
        }



    //subSequence에 대한 개념과 replace에 대한 이해
    /*  public CharSequence subSequence(int beginIndex, int endIndex) {
        return this.substring(beginIndex, endIndex);
    }*/

}
