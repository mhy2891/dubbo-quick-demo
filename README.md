# dubbo-demo
本demo实现简单的dubbo调用，主要采用gradle自动化建构工具构建此项目。
* dubbo-demo-facade.jar 暴露给消费者的接口

###1、生产者启动(dubbo-demo-provider)
 com.me.ProviderMain.java
 ```java
   public class ProviderMain {
     public static void main(String[] args) throws Exception {
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application-context-provider-main.xml"});
         context.start();
         System.in.read();
     }
 }
```
###2、消费者启动(dubbo-demo-consumer)
 com.me.ConsumerMain.java
 ```java
   public class ConsumerMain {
       public static void main(String[] args) {
           ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer.xml");
           classPathXmlApplicationContext.start();
           HelloService helloService = (HelloService) classPathXmlApplicationContext.getBean("helloService");
           String world = helloService.hello("World");
           System.out.println(world);
           StudentService studentService = (StudentService) classPathXmlApplicationContext.getBean("studentService");
           List<Book> books = studentService.getBooks();
           System.out.println(books);
       }
   }
```
