package ListenerExercise;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 生死监听
 * 可以在这个监听器中插入启动服务器时就想要完成的代码
 */
public class AListener implements ServletContextListener {
    /**
     *出生后调用
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("出生了");
    }

    /**
     * 死亡前调用
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("要死了");
    }
}
