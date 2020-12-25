package swjd.OcrPng;

import java.awt.Image;
import java.awt.image.*;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.imageio.ImageIO;

    public class Jgp {

        public static void main(String[] args) {
            //
            changeSize(160,160,"C:\\Users\\asdfsa\\Desktop\\studyJava");
        }

        /**
         * 改变图片的尺寸
         *
         * @param newWidth,
         *            newHeight, path
         * @return boolean
         */
        public static void changeSize(int newWidth, int newHeight, String path) {
            // 放一个目录过去，遍历里面的图片
            BufferedInputStream in = null;

            //把所有的图片放入files数组
            File[] files = new File(path).listFiles();


            for (int i = 0; i < files.length; i++) {

                //把后缀名切换成无，变成普通文件，如果切换成功就向下进入
                if (files[i].getName().replaceAll("(.jpg|.png|.bmp|.gif)+", "").length() != files[i].getName().length()) {

                    try {
                        //为什么要用缓冲流，第一，线程是单线程是安全的，第二，为了效率使用缓冲流是安全的
                        in = new BufferedInputStream(new FileInputStream(files[i]));

                        // 当前，字节流转图片对象
                        Image bi = ImageIO.read(in);

                        // 构建图片流，也就是创建一个
                        BufferedImage tag = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);

                        // 绘制改变尺寸后的图，（原型并不是要获得的图，bi才是）
                        tag.getGraphics().drawImage(bi, 0, 0, newWidth, newHeight, null);
                        // 输出流
                        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(files[i]));
                        ImageIO.write(tag, "PNG", out);
                        in.close();
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

