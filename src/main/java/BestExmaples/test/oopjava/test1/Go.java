package BestExmaples.test.oopjava.test1;


 public  class Go extends A {
        public static  void main(String[] args)  {
            new Go().start();
        }

        private void start() {
            check(new A(), new Go());
            check((Go)new A(), new Go());
        }

        private void check(A a, A a1) {
            Go go = (Go) a;  // 1
            A a2 = (A) a1;   //  2
        }
    }

    class A{

    }

