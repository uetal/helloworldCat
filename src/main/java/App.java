import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(firstBean1==secondBean2);

        Cat firstCat = (Cat) applicationContext.getBean("cat");
        Cat secondCat = (Cat) applicationContext.getBean("cat");

        System.out.println(firstCat==secondCat);
    }
}