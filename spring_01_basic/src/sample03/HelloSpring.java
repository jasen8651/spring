package sample03;

public class HelloSpring {
	public static void main(String[] args) {
		MessageBean bean = null;
		//bean = MessageFactory.getInstance("ko");
		//display(bean, "스프링");
		
		bean = MessageFactory.getInstance("en");
	}
	public static void display(MessageBean bean, String subject) {
		//bean.sayHello("스프링");
		//bean.sayHello("spring");
		bean.sayHello(subject);
	}
}
