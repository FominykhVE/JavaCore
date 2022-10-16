class Worker{

    private OnTaskDoneListener callBack;
    private OnTaskErrorListener missCall;


    public Worker(OnTaskDoneListener callBack, OnTaskErrorListener missCall){

        this.callBack = callBack;
        this.missCall = missCall;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if(i == 33){
                missCall.onError("Task " + i + " is failed");
                continue;
            }
            callBack.onDone("Task " + i + " is done");
        }
    }

}





