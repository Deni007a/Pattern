package разные.ForkJoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class MuJoin {
    static List<Integer> mylist= new ArrayList<>();


    public static void main(String[] args) {
        int count=0;

        for (int i = 0; i <100_000 ; i++) {
            mylist.add(i);
        }

        for (int i = 0; i <mylist.size() ; i++) {
            count+=mylist.get(i);
        }
        System.out.println(count);

            Join myJoin = new Join();

       ForkJoinPool forkJoinPool = new ForkJoinPool();

       Integer  rezz=0;

       rezz=forkJoinPool.invoke(myJoin);

        System.out.println(rezz);





    }
    static class Join extends RecursiveTask<Integer>{
        int start=0;
        int end = mylist.size();


        public Join(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public Join() {
        }


        @Override
        protected Integer compute() {
            int countZZ =0;

            if((end-start)<=10_000){

                for (int i = start; i <end ; i++) {
                    countZZ+=mylist.get(i);
                }
            }
            else {
               int midle =(start+end)/2;
                Join join1 = new Join(start,midle);
                Join join2 = new Join(midle,end);

                join1.fork();
                join2.fork();

                countZZ=join1.join()+join2.join();



            }
            return countZZ;
        }
    }

}
