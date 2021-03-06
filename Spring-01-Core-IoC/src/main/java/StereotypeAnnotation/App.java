package StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);

        Agile ag = context.getBean(Agile.class);
        ag.getTeachingHours();

        context.getBean(Java.class).getTeachingHours();

    }
}
