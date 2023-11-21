import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BeanFactory beanFactory = (BeanFactory) appContext;

        IOTDevice myInstructionBean = (IOTDevice) beanFactory.getBean("myIOTDeviceBean");

        // we can also cast BeanFactory to appContext instead of assigning to a variable of its type
        // IOTDevice myInstructionBean = (IOTDevice) ((BeanFactory) appContext).getBean("myIOTDeviceBean");

        System.out.println("ApplicationContext with BeanFactory container:\n" + myInstructionBean);

    }
}