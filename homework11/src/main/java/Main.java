import java.io.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("-------------------------TASK1");
        File dir = new File( "My dir");
        dir.mkdir(); //create folder My dir
        if (dir.exists()) {
            System.out.println("My dir exists");
        } else {
            System.out.println("My dir does not exist");
            return;
        }
        File file1 = new File(dir, "file1.txt");
        File file2 = new File(dir, "file2.txt");
        try {
            file1.createNewFile();
            if (file1.exists()) {
                System.out.println("File1 was created and exists");
            } else {
                System.out.println("File1 was not created and does not exist");
                return;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            file2.createNewFile();
            if (file2.exists()) {
                System.out.println("File2 was created and exists");
            } else {
                System.out.println("File2 was not created and does not exist");
                return;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // write text in File1
        String text = "Java world";
        try (FileOutputStream fos = new FileOutputStream(file1))
        {
            byte[] b = text.getBytes();
            fos.write(b, 0, b.length);
            System.out.println("Text was written in file 1");
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
        // read info from File1
        String str = "";
        try (FileInputStream fis = new FileInputStream(file1))
        {
            int c;
            while ((c = fis.read()) != -1) {
                str += (char)c;
                System.out.println(str);
            }
            System.out.println("Text was read from file1");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        // write info to File2
        try (FileOutputStream fos = new FileOutputStream(file2))
        {
            byte[] b = str.getBytes();
            fos.write(b, 0, b.length);
            System.out.println("Text was written from file1 to file2");
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
        // delete everything
        if (file1.delete()) {
            System.out.println("file 1 was deleted");
        }
        if (file2.delete()) {
            System.out.println("file 2 was deleted");
        }
        if (dir.delete()) {
            System.out.println("dir was deleted");
        }
    }
    public static void task2() {
        System.out.println("-------------------------TASK2");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mycat.dat")))
        {
            Cat mycat = new Cat("Barsik", 5, 6);
            oos.writeObject(mycat);
            System.out.println("Cat was written in mycat file");
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mycat.dat")))
        {
            Cat mycat = (Cat)ois.readObject();
            System.out.println("Cat was read from mycat file:" + mycat); // weight
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void task3() {
        System.out.println("-------------------------TASK3");
        MathCalc sum = (int x, int y) -> x + y;
        MathCalc div = (int x, int y) -> x / y;
        MathCalc mult = (int x, int y) -> x * y;
        MathCalc sub = (int x, int y) -> x - y;
        System.out.println(sum.calculate(20, 10)); //30
        System.out.println(div.calculate(20, 10)); //2
        System.out.println(mult.calculate(20, 10)); //200
        System.out.println(sub.calculate(20, 10)); //10
    }
}
