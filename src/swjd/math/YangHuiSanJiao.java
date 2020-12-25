package swjd.math;

import java.util.ArrayList;
import java.util.List;

public class YangHuiSanJiao {
    public static void main(String[] args) {

    }



    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            // 第0层
            if (i == 0) {
                list.add(1);
            } else {
                // 每层元素个数为层数+1（此处层数从0开始）
                for (int j = 0; j < i + 1; j++) {
                    // 上一层
                    List<Integer> upList = res.get(i - 1);
                    // 左上角值
                    int upLeft = 0;
                    if (j - 1 >= 0) {
                        upLeft = upList.get(j - 1);
                    }
                    // 右上角值
                    int upRight = 0;
                    if (upList.size() >= j + 1) {
                        upRight = upList.get(j);
                    }
                    list.add(upLeft + upRight);
                }
            }
            res.add(list);
        }
        return res;
    }




}
