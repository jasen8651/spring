package sample01;

public class Hellospring {

	public static void main(String[] args) {
		//MessageBeanKorea bean = new MessageBeanKorea();
		//display(bean);
		
		MessageBeanEnglish bean = new MessageBeanEnglish();
		display(bean);

	}
	/*
	 * public static void display(MessageBeanKorea bean) { bean.sayHello("스프링"); }
	 */
	public static void display(MessageBeanEnglish bean) {
		bean.sayHello("스프링");
	}
}
