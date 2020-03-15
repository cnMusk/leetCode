import java.util.concurrent.CountDownLatch;

class Foo {

    CountDownLatch latch1 = new CountDownLatch(1);

    CountDownLatch latch2 = new CountDownLatch(1);
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

//            System.out.println("first");
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            latch1.countDown();
//

    }

    public void second(Runnable printSecond) throws InterruptedException {

//        System.out.println("second");
            latch1.await();

            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            latch2.countDown();



    }

    public void third(Runnable printThird) throws InterruptedException {

//        System.out.println("third");
            latch2.await();

            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();

    }

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();


        Thread threadA = new Thread(() ->{
            try {
                foo.second(()->{
                    System.out.println("second");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadB = new Thread(() ->{
            try {
                foo.first(()->{
                    System.out.println("first");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadC = new Thread(() ->{
            try {
                foo.third(()->{
                    System.out.println("third");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();

    }


}