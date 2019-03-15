package SRPrincipal;

// single responsibility principle - bad example
/*
interface IEmail {
	public void setSender(String sender);
	public void setReceiver(String receiver);
	public void setContent(String content);
}

class Email implements IEmail {
	public void setSender(String sender) {
		// set sender;
	 }
	public void setReceiver(String receiver) {
		// set receiver;
		}
	public void setContent(String content) {
		// set content;
		}
}
*/
// single responsibility principle - good example
interface IEmail {
    public void setSender(String sender);
    public void setReceiver(String receiver);
    //public void setContent(IContent content);
}

class Email implements IEmail {
    public void setSender(String sender) {
        // set sender;
    }
    public void setReceiver(String receiver) {
        // set receiver;
    }
    public void setContent(String content) {
        // set content;
    }
}

