package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;

public class Main {


    public static void max() {


            int[] numbers= { 1 , 2 , 3 };

            int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;






            for(int i = 0; i<numbers.length; i++) {
                if(numbers[i]<smallest)
                    smallest = numbers[i];
                else if(numbers[i]>largest)
                    largest = numbers[i];
            }

            System.out.println("Max is "+largest);
            System.out.println("Min is "+smallest);
        }







public static void Stringlength(String length){

    String str1 = new String();
    System.out.println("String Length :" +str1.length());

}

public static void countElement (String[] count){

    for (int i=0;i<=count.length;i+=2){
        System.out.println(count[i]);
    }

}
    public static void intToChar (int conv){

    char a = Integer.toString(conv).charAt(0);
        System.out.println(a);


    }

    public static void myArrayList (int n) {
        ArrayList list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(i);


                }
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }


        public static void download(String url){
            URL link = null;
            try {
                link = new URL(url);

            BufferedImage img = ImageIO.read(link);
            File file = new File("F:\\downloaded.jpg");
            ImageIO.write(img, "jpg", file);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    public static void MyThreads(){


      Runnable run  = new Runnable() {
          @Override
          public void run() {
         for (int i=0;i<=10;i++){
             System.out.println(i);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }


          }
      };

        Runnable run2  = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=30;i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        };

        Runnable run3  = new Runnable() {
            @Override
            public void run() {

                for (int i=0;i<=20;i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        };
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run2);
        Thread thread3 = new Thread(run3);
        thread1.start();
        thread2.start();
        thread3.start();
        }


    public static void writeToFile(){
        String path = "F:\\hello.txt";
        String hello = "hello File";

            File file = new File(path);
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);

        if(file.exists()) {
                    fw.write("Hello File ");
                    fw.close();
                }else{
                    file.createNewFile();
                    fw.write("Hello File ");
                    fw.close();
                }
             } catch (IOException e) {
              e.printStackTrace();
    }

            }

public static void htmlDownload (String url){

    try {
       URL link = new URL(url );

    BufferedReader reader = new BufferedReader(new InputStreamReader(link.openStream()));
    BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\data.html"));
    String line;

    while ((line = reader.readLine()) != null) {
        System.out.println(line);
        writer.write(line);
        writer.newLine();
    }
    reader.close();
    writer.close();
}    catch (MalformedURLException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}





    public static void main(String[] args) {
	// write your code here

      //  max(5,15,3);
      //  Stringlength("Hello ");
       // String[] str = new String[]{"1242412","1242124","125451512","15125125","65858"};
      //  countElement(str);
     //   intToChar(5);
      //  myArrayList(15);
     //   download("http://i.5sfer.com/post/postImage/8ipwnn.jpg");
     //   MyThreads();
            Animal.cat.hello();
            Animal.human.hello();
            Animal.dog.hello();
            writeToFile();
            Singleton.getInstance();
            htmlDownload("http://www.google.com");
            max();
}
}
