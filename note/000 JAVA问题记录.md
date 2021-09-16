## 1 public class和class的区别

### 1.1 Java中定义类的两种方式 

- public class定义类
- class 定义类

#### 1.1.1 public class定义的类必须和文件名一致

```
//Rumen.java
public class Hello{	
public static void main(String[] arg){
System.out.print("hello");
	
}
}
#javac Rumen.java
Rumen.java:1: 错误: 类 Hello 是公共的, 应在名为 Hello.java 的文件中声明
public class Hello{
^
1 个错误
```

#### 1.1.2 一个java文件中只能定义一个puclic class,可以定义多个class

```
public class Rumen{
public static void main(String[] arg){
System.out.print("hello\n");	
}
}
class A{}
class B{}
```

#### 1.1.3 编译 javac Rumen.java 有3个class，所以将生成3个.class 文件

- Rumen.class
- A.class
- B.class

### 1.2 public class的访问权限 

+ 没有public声明的class在同一包中是相互可见，可以相互引用的

+ 没有public声明的class在不同包中不可见。不能被引用