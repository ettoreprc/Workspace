package mainpackage.esempiodidattico;

public class CommandList implements Command {

	private Receiver receiver = null;

	public CommandList(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.list();
	}
}
