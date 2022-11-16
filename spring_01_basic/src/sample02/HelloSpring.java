package sample02;

public class HelloSpring {
	public static void main(String[] args) {
		MessageBean bean = null;
		/*
		 * bean = new MessageBeanKorea(); display(bean);
		 */
		
		bean = new MessageBeanEnglish();
		display(bean, "spring");
	}
	public static void display(MessageBean bean, String subject) {
		//bean.sayHello("스프링");
		//bean.sayHello("spring");
		bean.sayHello(subject);
	}
}
