package ListenerExercise;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class DListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("您向application中添加了一个名为"+servletContextAttributeEvent.getName()+"值为"+servletContextAttributeEvent.getValue()+"的属性");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("您删除了"+servletContextAttributeEvent.getName()+"="+servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println(servletContextAttributeEvent.getName()+"="+servletContextAttributeEvent.getValue()+" , "+servletContextAttributeEvent.getServletContext().getAttribute(servletContextAttributeEvent.getName()));
    }
}
