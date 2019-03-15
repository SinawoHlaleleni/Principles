package ISPrincipal;

/* interface segregation principle - bad example
interface IWorker {
    public void work();
    public void eat();
}

class Worker1 implements IWorker{
    public void work() {
        // ....working
    }
    public void eat() {
        // ...... eating in launch break
    }
}

class SuperWorker implements IWorker{
    public void work() {
        //.... working much more
    }

    public void eat() {
        //.... eating in launch break
    }
}

class Manager {
    IWorker worker;

    public void setWorker(IWorker w) {
        worker=w;
    }

    public void manage() {
        worker.work();
    }
}*/

// interface segregation principle - good example
interface IWorker extends IFeedable, IWorkable {
}

interface IWorkable {
    public void work();
}

interface IFeedable{
    public void eat();
}

class Worker3 implements IWorkable, IFeedable{
    public void work() {
        // ....working
    }

    public void eat() {
        //.... eating in launch break
    }
}

class Robot implements IWorkable{
    public void work() {
        // ....working
    }




    public void eat() {
        //.... eating in launch break
    }
}



