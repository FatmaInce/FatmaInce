package tests;

public class Test {

//        static int count=0;
//        int i =0;
//        public void modify()
//        {
//            while(i<5)
//            {
//                i++;
//                count++;
//            }
//        }
//        public static void main(String[] args)
//        {
//            Test t1 = new Test();
//            Test t2 = new Test();
//            t1.modify();
//            t2.modify();
//            System.out.println(t1.count+".."+t2.count);
//        }

    private char ch;
    public static void main(String[] args)
    {
        char ch1='a';
        char ch2=ch1;
        ch2='e';

        Test obj1= new Test();
        Test obj2=obj1;
        obj1.ch='i';
        obj2.ch='o';

        System.out.println(ch1+":"+ch2);
        System.out.println(obj1.ch+":"+obj2.ch);
    }

    }
