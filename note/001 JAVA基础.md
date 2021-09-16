# 1 JDK、JRE和JVM三者之间关系

## 1.1 分别是什么

JDK（Java Development Kit）是针对Java开发员的产品，是整个Java的核心，包括了Java运行环境JRE、Java工具和Java基础类库。
Java Runtime Environment（JRE）是运行JAVA程序所必须的环境的集合，包含JVM标准实现及Java核心类库。
JVM是Java Virtual Machine（Java虚拟机）的缩写，是整个java实现跨平台的最核心的部分，能够运行以Java语言写作的软件程序。

## 1.2 JDK、JRE和JVM

### JDK

JDK是java开发工具包，在其安装目录下面有六个文件夹、一些描述文件、一个src压缩文件。bin、include、lib、 jre这四个文件夹起作用，demo、sample是一些例子。可以看出来JDK包含JRE，而JRE包含JVM。
bin:最主要的是编译器(javac.exe)
include:java和JVM交互用的头文件
lib：类库
jre:java运行环境（注意：这里的bin、lib文件夹和jre里的bin、lib是不同的）
总的来说JDK是用于java程序的开发,而jre则是只能运行class而没有编译的功能。 
JDK是提供给Java开发人员使用的，其中包含了java的开发工具，也包括了JRE。所以安装了JDK，就不用在单独安装JRE了。 其中的开发工具包括编译工具(javac.exe)打包工具(jar.exe)等

### JRE


JRE是指java运行环境。光有JVM还不能成class的执行，因为在解释class的时候JVM需要调用解释所需要的类库lib。在JDK的安装目录里你可以找到jre目录，里面有两个文件夹bin和lib,在这里可以认为bin里的就是jvm，lib中则是jvm工作所需要的类库，而jvm和 lib和起来就称为jre。所以，在你写完java程序编译成.class之后，你可以把这个.class文件和jre一起打包发给朋友，这样你的朋友就可以运行你写程序了。 包括Java虚拟机(JVM Java Virtual Machine)和Java程序所需的核心类库等， 如果想要运行一个开发好的Java程序，计算机中只需要安装JRE即可。 

###  JVM

JVM就是我们常说的java虚拟机，它是整个java实现跨平台的最核心的部分，所有的java程序会首先被编译为.class的类文件，这种类文件可以在虚拟机上执行，也就是说class并不直接与机器的操作系统相对应，而是经过虚拟机间接与操作系统交互，由虚拟机将程序解释给本地系统执行。 
可以理解为是一个虚拟出来的计算机，具备着计算机的基本运算方式，它主要负责将java程序生成的字节码文件解释成具体系统平台上的机器指令。让具体平台如window运行这些Java程序。 


简单而言：使用JDK开发完成的java程序，交给JRE去运行。 

## 1.3 三者之间关系 

JDK 包含JRE,JRE包含JVM。

JVM:将字节码文件转成具体系统平台的机器指令。 
JRE:JVM+Java语言的核心类库。 
JDK:JRE+Java的开发工具。 

## 1.4 JAVA运行步骤


我们开发的实际情况是：我们利用JDK（调用JAVA API）开发了属于我们自己的JAVA程序后，通过JDK中的编译程序（javac）将我们的文本java文件编译成JAVA字节码，在JRE上运行这些JAVA字节码，JVM解析这些字节码，映射到CPU指令集或OS的系统调用。

![image-20210915171652444](D:/JAVA/note/001%20JAVA%E5%9F%BA%E7%A1%80.assets/image-20210915171652444.png)

# 2 编写和运行JAVA程序

## 2.1 代码书写规范

+ 使用命令行的方式执行的时候，cmd的默认编码格式是GBK，因此在输入中文的时候需要设置文件的编码格式位ANSI，不会出现乱码错误

+ 注意：

  > 1、java文件的名称必须跟public class的名称保持一致
  >
  > 2、一个java文件中可以包含多个class,凡是public class只能有1个
  >
  > 3、public static void main(String[] args)是所有java程序的入口，如果向执行对应的java代码，则必须要添加如下方法，且格式是固定
  >
  > 4、main方法中参数列表可以支持多种写法：String[] args,String [] args,String args[]
  >
  > 5、main方法中参数的名称无所谓，但是一般写成args
  >
  > 6、java代码在编写的时候，每行结尾的时候需要使用;结束
  >
  > 7、java代码的代码块需要使用{}括起来，前后匹配
  >
  > 8、同一个类中最多有一个main方法

+ java 注释
  java中的注释分为三类

  + 单行注释： // <注释内容>

  + 多行注释:   /* <注释内容>*/

  + 文档注释：

    + > /**
      >
      > \* <注释内容>
      >
      > */



## 2.2 编写JAVA文件

+ 创建后缀名是.java的文件
+ 写java代码

```java
public class hello {
//public class 文件名
    //写代码内容，声明manin函数
	public static void main(String[]  args){
    //java程序的入口地址,java虚拟机运行程序的时候首先找的就是main方法
		System.out.println("hello world");
	}
}
```

## 2.3 编译

+ 通过java自己的编译方式进行文件编译 
  + javac  java文件名.java （新的文件 字节码文件  .class）

```powershell
PS D:\JAVA> javac hello.java
```

## 2.4 解释执行

+ java 文件名 

```powershell
PS D:\JAVA> java hello
hello world
```

## 3 public class和class的区别

### 3.1 Java中定义类的两种方式 

- public class定义类
- class 定义类

#### 3.1.1 public class定义的类必须和文件名一致

```java
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

#### 3.1.2 一个java文件中只能定义一个puclic class,可以定义多个class

```java
public class Rumen{
	public static void main(String[] arg){
		System.out.print("hello\n");	
	}
}
class A{}
class B{}
```

#### 3.1.3 编译 javac Rumen.java 有3个class，所以将生成3个.class 文件

- Rumen.class
- A.class
- B.class

### 3.2 public class的访问权限 

+ 没有public声明的class在同一包中是相互可见，可以相互引用的
+ 没有public声明的class在不同包中不可见。不能被引用

