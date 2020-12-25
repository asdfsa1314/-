package HomeWork.Day12_25;

import java.util.ArrayList;
import java.util.List;

public class Goods {

    List<Object> list = null;



    public Goods(Object[] objects) {
        list = new ArrayList<>();
    }

    public void addObject(Object o){
        list.add(o);
        System.out.println(o.toString()+":货物装载完毕");
    }

    public void subObject(Object o){
        list.remove(o);
        System.out.println(o.toString()+":货物已经被删除了");
    }

    public void showAll(){
        for (int i= list.size(); i > 0; i--){
            list.get(i).toString();
        }
    }

}
