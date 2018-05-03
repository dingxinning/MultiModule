
- 运行：
    1. 先运行 HelloWorldApplication 的 main 方法，提示了help信息
    2. Edit Configurations 中设置 Program Args：server D:\workspace\MultiModule\drop_wizard\src\main\resources\hello-world.yml
    3. 启动
    
- 运行：
    1. > mvn clean package
    2. > java -jar target/hello-world-0.0.1-SNAPSHOT.jar server hello-world.yml
    
- 访问实例
    1. http://localhost:8080/hello-world
    2. http://localhost:8080/hello-world?name=abc
    3. http://localhost:8081

- Dropwizard 已启动，8080端口提供服务，8181端口可以进行管理。
- 服务管理提供了metrics、线程和 Healthcheck资源管理。


- 参考：http://hao.jobbole.com/dropwizard/    https://blog.csdn.net/qq_23660243/article/details/54406075

