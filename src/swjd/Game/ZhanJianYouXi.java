package swjd.Game;

import java.util.Scanner;

public class ZhanJianYouXi {
    Scanner s = null;
    int[] x = new int[3];
    int[] y = new int[3];
    int index = 0, x1, y1;
    boolean[][] arr;

    public ZhanJianYouXi() {
        arr = new boolean[7][7];
        //创建三个船，停在目标上
        for (int j = 0; j < 3; j++) {

            //创建x坐标
            x[j] = (int) (Math.random() * 7);
            //创建y坐标
            y[j] = (int) (Math.random() * 7);
            //防止出现重复的船
            if (arr[x[j]][y[j]]) {
                j--;
            }
            this.arr[x[j]][y[j]] = true;
        }

    }

    public void userControl() throws InputAbnormal {
        s = new Scanner(System.in);

        System.out.println("请输入地址,例如：A3");
        String user = s.next();
        //获取用户输入地址上的坐标
        if (user.length() >1) {
            char flag1 = user.charAt(0);
            char flag2 = user.charAt(1);
            int x1 = flag1 - 65;
            int y1 = flag2 - 48;
            //不能有小于0或者大于6的可能性
            if (x1 < 0 || x1 > 6 || y1 < 0 || y1 > 6) {
                throw new InputAbnormal("输入了错误的字符");
            } else {
                this.y1 = y1;
                this.x1 = x1;
            }
        }else {
            System.out.println("输入了错误的字符");
        }
    }

    public void ifHit(){
        boolean flag = false;

        //用于判断代码
           if (arr[x[0]][y[0]] ) {}
           else if(arr[x[1]][y[1]] ){}
           else if (arr[x[2]][y[2]] ){}
           else{ System.out.println("游戏结束");
            flag = true;}


        if (flag){
            this.Score();
            System.exit(0);
        }

        if (arr[x1][y1]){
            System.out.println("命中成功");
            arr[x1][y1] = false;
        }else {
            System.out.println("命中失败");
            index++;
        }

    }

    public void Score(){
        switch (index/10){
            case 0:
                System.out.println("你是神");
                break;
            case 1:
            case 2:
                System.out.println("你是教官");
                break;
            case 3:
                System.out.println("你是noob");
                break;
            default :
                System.out.println("别来当船长了，丢人");
                break;
        }
    }
}
