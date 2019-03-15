package LSPrincipal;

/*violeted by ostritch bcz it can not se wings to fly but for something else!!
public class Bird {
    public void fly(){}
}

class Duck extends Bird{}
class Ostrich extends Bird{}
*/

//Good example of LSP
public class Bird{
}
class FlyingBirds extends Bird{
    public void fly(){}
}
class Duck extends FlyingBirds{}
class Ostrich extends Bird{}



