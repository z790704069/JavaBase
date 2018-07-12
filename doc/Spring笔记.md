
> Spring在IOC容器基础上，还提供了AOP框架支持以及企业级服务集成等。

# IOC基础

注入方式

* 构造方法注入
* setter方法注入
* 接口注入

职责

* 业务对象的构建管理
* 业务对象间的依赖绑定

依赖关系识别&管理

* 直接编码方式
* 配置文件方式
* 元数据方式

# Spring Ioc

> Spring IOC = IOC Service Provider + AOP + 企业服务集成 + 对象生命周期管理 + 线程管理 ...

两种容器类型：
* BeanFactory

默认采用延时初始化策略（lazy-load）。只有当客户端对象需要访问容器中的某个对象的时候，才对该受管对象进行初始化以及依赖注入操作。所以相对来说，容器启动初期速度较快，所需要的资源有限。

* ApplicationContext

ApplicationContext 在 BeanFactory 的基础上构建，是相对高级的容器实现。除了拥有 BeanFactory 的所有支持，还提供了其他高级的特性。ApplicationContext 所管理的对象，在类型容器启动之后，弄人全部初始化并绑定完成。所以相对来说需要更多的系统资源。同事，因为在启动时就完成所有初始化，容器启动时间相比 BeanFactory 会长一些。

> ApplicationContext 间接集成自 BeanFactory, 并且 ApplicationContext 还继承了其他接口。


