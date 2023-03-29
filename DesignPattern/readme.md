---
[toc]

---

### 1.设计模式三大分类
设计模式分为三种类型，共23类。
* 创建型模式(Creational Patterns)5类(对象怎么来)：
  * 单例模式(Singleton)★★★`M` `S`
  * 工厂模式(Factory)★★`M` `S`    √
  * 抽象工厂模式(Abstract Factory)  √
  * 建造者模式(Builder)★`M` `SS`
  * 原型模式(Prototype)`S`

* 结构型模式(Structural Patterns)7类(对象和谁有关)：
  * 适配器模式(Adapter)★`C` `IO` `M` `S` `SS`
  * 组合模式(Composite)`M` `SM`
  * 装饰器模式(Decorator)★`IO` `M` `S` `SS`
  * 代理模式(Proxy)★★`M` `S` `SS`  √
  * 享元模式(Flyweight)
  * 外观模式(Facade)`N` `T`
  * 桥接模式(Bridge)

* 行为型模式(Behavioral Patterns)11类(对象与对象之间通信)：
  * 迭代器模式(Iterator)★`C` `M`
  * 模版模式(Template)★`M` `S` `SS`
  * 策略模式(Strategy)★`S` `SM` `SS`
  * 命令模式(Command)`T`
  * 状态模式(State)
  * 责任链模式(Chain of Responsibility)★`N` `T` `SS`
  * 备忘录模式(Memento)
  * 观察者模式(Observer)★`N` `T` `S` `SM` `SS`
  * 访问者模式(Visitor)
  * 中介者模式(Mediator)
  * 解释器模式(Interpreter)

### 2.设计模式六大原则
* 1、开闭原则(Open Close Principle) 
  * 开闭原则的意思是：对扩展开放，对修改关闭。实现热插拔，提高扩展性。
* 2、里氏代换原则(Liskov Substitution Principle)
  * 实现抽象的规范，实现子父类互相替换。
  * 里氏代换原则是对开闭原则的补充。
* 3、依赖倒转原则(Dependence Inversion Principle)
  * 针对接口编程，实现开闭原则的基础，依赖于抽象而不依赖于具体。 
* 4、接口隔离原则(Interface Segregation Principle)
  * 使用多个隔离的接口，比使用单个接口要好。 
  * 降低耦合度，接口单独设计，互相隔离。
* 5、迪米特法则，又称最少知道原则(Demeter Principle)
  * 一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。
* 6、合成复用原则(Composite Reuse Principle)
  * 尽量使用合成/聚合的方式，而不是使用继承。

### 3.主流框架的设计模式
#### 3.0 集合类设计模式(2种)`C`
#### 3.1 IO设计模式(2种)`IO`
#### 3.2 Netty设计模式(4种)`N`
#### 3.3 Tomcat设计模式(4种)`T`
#### 3.4 Mybatis的设计模式(9种)`M`
#### 3.5 Spring设计模式(9种)`S`
#### 3.6 SpringMVC设计模式(3种)`SM`
#### 3.7 SpringBoot设计模式(种)`SB`
#### 3.8 SpringSecurity设计模式(8种)`SS`


* 创建型模式(3类)
  * 单例模式
    * ErrorContext
    * LogFactory
  * 工厂模式
    * SqlSessionFactory
    * ObjectFactory
    * MapperProxyFactory
  * 建造者模式
    * SqlSessionFactoryBuilder
    * XMLConfigBuilder
    * XMLMapperBuilder
    * XMLStatementBuilder
    * CacheBuilder
* 结构型模式(4类)
  * 适配器模式
    * Log的Mybatis接口和它对jdbc、log4j等各种日志框架的适配实现
  * 组合模式
    * SqlNode和各个子类ChooseSqlNode等
  * 装饰者模式
    * Cache包中的cache.decorators子包中等各个装饰者的实现；
  * 代理模式
    * Mybatis实现的核心
    * MapperProxy
    * ConnectionLogger用的jdk的动态代理
    * 还有executor.loader包使用了cglib或者javassist达到延迟加载的效果；
* 行为型模式(2类)
  * 迭代器模式
    * 迭代器模式PropertyTokenizer；
  * 模板方法模式
    * 例如BaseExecutor
    * SimpleExecutor
    * BaseTypeHandler和所有的子类例如IntegerTypeHandler
