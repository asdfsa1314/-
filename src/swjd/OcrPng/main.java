package swjd.OcrPng;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import static java.awt.image.BufferedImage.TYPE_INT_RGB;

public class main {
    public void RevPng(int newHeight, int newWidth, String path){
        //采用缓冲数组，in
        BufferedInputStream in =null;
        BufferedOutputStream out = null;
        //使用listFile方法，把所有文件装载进去
        File[] files = new File(path).listFiles();

        for (int i = 0; i < files.length; i++){
            //用if来进行判断，并且把图片格式清除转换为文件格式
            //如果长度不相等，则就跳过
            if (files[i].getName().replaceAll("(.jpg|.png|.bmp|.gif)+", "").length() != files[i].getName().length()){
                //缓冲流获得文件路径
                try {
                    in = new BufferedInputStream(new FileInputStream(files[i]));//File这个类的toString是返回的当前文件对象的绝对路径

                    //创建一个图片对象
                    Image bi = ImageIO.read(in);

                    //还需要创建一个图片对象
                    BufferedImage src = new BufferedImage(newWidth,newHeight,TYPE_INT_RGB );

                    src.getGraphics().drawImage(bi,0,0,newWidth,newHeight,null);//不开启观察者模式

                    out = new BufferedOutputStream(new FileOutputStream(files[i]));

                    ImageIO.write(src, "PNG", out);


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    //用于检测并且关闭流 呵呵
                    if (in!=null){
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    if (out!=null){
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
