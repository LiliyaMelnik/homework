public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("-------------------------TASK1");
        OuterA.InnerB i = new OuterA.InnerB();
        System.out.println(i.hello());
    }
    public static void task2() {
        System.out.println("-------------------------TASK2");
        Time eatTime = Time.LUNCH;
        System.out.println(eatTime.getS());
        switch(eatTime) {
            case BREAKFAST:
                System.out.println("breakfast");
                break;
            case LUNCH:
                System.out.println("lunch");
                break;
            case DINNER:
                System.out.println("dinner");
                break;
        }
    }
    public static void task3() {
        System.out.println("-------------------------TASK3");
        System.out.println(Calc.SUM.action(2,2));
        System.out.println(Calc.SUB.action(2,2));
        System.out.println(Calc.MULT.action(2,2));
        System.out.println(Calc.DIV.action(2,2));
        System.out.println(Calc.POW.action(2,2));
    }
}
