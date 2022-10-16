public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);

        worker.start();
    }


    static class Worker{

        private OnTaskDoneListener callBack;



        public Worker(OnTaskDoneListener callBack){
            this.callBack = callBack;
        }

        public void start() {
            for (int i = 0; i < 100; i++) {
                callBack.onDone("Task " + i + " is done");
            }
        }

    }

    @FunctionalInterface
    public interface OnTaskDoneListener {


        void onDone(String value);
    }


}