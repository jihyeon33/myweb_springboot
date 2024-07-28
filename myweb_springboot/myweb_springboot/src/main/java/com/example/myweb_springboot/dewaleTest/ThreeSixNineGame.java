package com.example.myweb_springboot.dewaleTest;

public class ThreeSixNineGame {
    /**
     number 에 3,6,9가 포함되면 "clap", 아니면 입력받은 숫자를 String으로 리턴
     do369(16) -> "clap"
     do369(12) -> "12"
     do369(33) -> "clap", 3이 두번나왔지만 clap은 한번
     */


    //
    public String do369(int number) {
        //숫자에 3/6/9포함되어 있으면 "clap" 반환
        String str_num = number + "";

        for (int i = 0, n = str_num.length(); i < n; i++) {
            char c = str_num.charAt(i);
            if (c =='3'|| c=='6'||c=='9'){
                return "clap";
            }
        }

//기존 메소드 구현을 유지


        return str_num;
    }

    /**
     게임에 참가하는 플레이어의 이름 배열을 받아서 게임을 진행.
     결과를 System.out.println 메소드로 화면에 출력해주세요.
     정확히 100회의 게임이 진행 되도록 해주세요.
     예제. "영수", "광수", "영철", "상철" 이 입력된경우
     영수: 1
     광수: 2
     영철: clap
     상철: 4
     ..중략..
     상철: 100
     */
    public void playGame(Player[] players) {
        String[] temp_players = new String[100];
        int k =0;
        for(int i=0;i<100;i++){
            if(k >=4){
                k=k-4;
            }
            temp_players[i]=players[k];
            k++;
        }
        for(int i=0;i<100;i++){
            String person = temp_players[i];
            String result = do369(i+1);
            System.out.println(person +": "+result);
        }



        //게임에 참가하는 플레이어의 배열을 받아서 게임을 진행하게 변경
        //오답이 나올때까지 무한히 수행되도록 변경
        //각 플레이어는 독립확율로 매 순서마다 오답율에 의거 오답을 얘기하고 오답을 얘기한경우는 게임종료
    }

    public static void main(String[] args) {
/*        String[] players = {"ys", "ks", "yc", "sc"};
        new ThreeSixNineGame().playGame(players);*/


        String[] players_tmp = {"ys", "ks", "yc", "sc"};
        Player[] players = new Player[4]; //플레이어 생성부분
        for( String player : players_tmp){
            Player ply = new Player();
            ply.setName();
        }
        new ThreeSixNineGame().playGame(players);


    }
}