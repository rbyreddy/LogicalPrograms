package logic.programs;
import java.util.Scanner;

    /*
     * Purpose:This stopwatch program is for measuring the time that elapses between the start and end Time. ­
     **/
    public class Stopwatch {
        public long startTimer=0;
        public long stopTimer=0;
        public long elapsed;

        //to start timer
        public void start()
        {
            startTimer=System.currentTimeMillis();
            System.out.println("Start Time is: "+startTimer);
        }

        // to stop timer
        public void stop()
        {
            stopTimer=System.currentTimeMillis();
            System.out.println("Stop Time is: "+stopTimer);
        }

        public long getElapsedTime()
        {
            elapsed=stopTimer-startTimer;
            return elapsed;
        }

        public static void main(String[] args) throws Exception
        {
            Stopwatch sw=new Stopwatch();
            Scanner u=new Scanner(System.in);
            System.out.println("Press '1' to Start Time: ");
            u.nextInt();
            sw.start();

            System.out.println();
            System.out.println("Press '2' to Stop Time: ");
            u.nextInt();
            sw.stop();

            long l=sw.getElapsedTime();
            System.out.println();
            System.out.println("Total Time Elapsed(in millisec) is:"+l);
            System.out.println();
            System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
        }
    }
