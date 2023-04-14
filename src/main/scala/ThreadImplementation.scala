import java.util.concurrent.{Executors, ThreadPoolExecutor}

object ThreadImplementation extends App{
  private val myThread = new MyThread
  myThread.start()
  private val myRunnable = new MyRunnable
  myRunnable.run()
  private val counter = new Counter
  val thread1 = new Thread(){
    override def run(): Unit = {
      println(counter.increment(2))
      println(counter.increment((5)))
    }
  }

  val thread2 = new Thread(){
    override def run(): Unit = {
      println(counter.decrement(5))
      println(counter.decrement(7))
    }
  }
  thread1.start()
  thread1.join()    // when thread1 is complete then the other thread2 will be executed
  thread2.start()
  //thread1.join()
  //thread2.join()

}

class MyThread extends Thread{
  override def run(): Unit = {
    println("Hello Thread")
  }
}

class MyRunnable extends Runnable{
  override  def run(): Unit = {
    println("Hello runnable")
  }
}

class Counter {
  def increment(value: Int): Int = synchronized({
    value + 1
  })

  def decrement(value: Int): Int = {
    value - 1
  }
}
