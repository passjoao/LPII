public class Main{
	public static void main(String[] args) {
		MailServer servidor = new MailServer();
		String user = "Joao";
		MailClient cliente = new MailClient(servidor, user);
		String user2 = "Maria";
		MailClient cliente2 = new MailClient(servidor, user2);
		MailItem msg = new MailItem("Joao", "Maria", "Sobre batatas", "Batatas Assadas São boas");

		servidor.post(msg);
		System.out.println(servidor.howManyMailItems("Maria"));
		cliente2.printNextMailItem();
     }
}
