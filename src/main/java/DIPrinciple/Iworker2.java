package DIPrinciple;

interface Iworker2 {
    // Dependency Inversion Principle - Good example
    interface IWorker {
        public void work();
    }

    class Worker implements Iworker2{
        public void work() {
            // ....working
        }
    }

    class SuperWorker  implements Iworker2{
        public void work() {
            //.... working much more
        }
    }

    class Manager {
        Iworker2 worker;

        public void setWorker(Iworker2 w) {
            worker = w;
        }

        public void manage() {
           // worker.work();
        }
    }

}
////DIP bad example
class Worker {

    public Worker() {

        //...working
    }


}
class Manager {

    Worker worker;



    public void setWorker(Worker w) {
        worker = w;
    }

    public void manage() {
        //worker.work();
    }
}

class SuperWorker {
    public void work() {
        //.... working much more
    }
}


