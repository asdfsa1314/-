package swjd.Game;

public class Test {
    public static void main(String[] args) {
        ZhanJianYouXi zjgame = new ZhanJianYouXi();
        while (true){
            try{

                zjgame.userControl();
            } catch (InputAbnormal inputAbnormal) {
                System.out.println(inputAbnormal.getMessage());
            }
            zjgame.ifHit();
        }
    }
}
