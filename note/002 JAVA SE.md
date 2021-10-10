# 1 常量、变量、数据类型

+ 常量：值不能改变
+ 变量：值可以改变
+ 数据类型：变量值的类型，如整数、小数、字母... ...
+ <font color='red'>基本数据类型和引用数据类型</font>
  + <font color='red'>基本数据类型：在内存中存放的是值</font>
  + <font color='red'>引用数据类型：在内存中存放的是地址</font>

## 1.1 基本数据类型

整数、小数

## 1.2 整数类型：

+ byte、short、int、long

+ 不同的整数类型大小范围不同，占用的空间也不同


| 类型  | 占用空间 | 位数 | 数值范围                                  |
| ----- | -------- | ---- | ----------------------------------------- |
| byte  | 1个字节  | 8位  | -128到127                                 |
| short | 2个字节  | 16位 | -32768 到 32767                           |
| int   | 4字节    | 32位 | -2147483648到2147483647                   |
| long  | 8字节    | 64位 | -9223372036854775808到9223372036854775807 |

### 1.2.1 long类型

+ 定义时long类型时和其他类型不同，定义时需要和int类型区分，long类型的值后需要使用l或者L的后缀做标识（建议使用L）

```java
public class long_test {
	public static void main (String[] args) {
		long a = 2888888888888888L;
		System.out.println(a);
	}
}
```

### 1.2.2 数字符号

+ 写在变量值的前面

## 1.3 小数

### 1.3.1 float

+ float占4个字节,只保留四位小数，超过后会四舍五入

+ 定义float数据类型时，需要声明类型是float（添加f或F后缀），否则默认是double类型
  + 若float类型的变量有小数点时需要添加f/F的后缀
  + 若float类型的变量没有小数点时可以不添加f/F的后缀
  + 当数值过大时，会自动使用科学计数法表示

```java
public class float_test {
	public static void main (String[] args) {
	float a = 288.8881f;
	//当存储的小数位大于4位时，后面的位
	System.out.println(a);

}
}
```

### 1.3.2 double

+ 通过float和double表示小数类型

+ double占八位，表示双精度，可表示15-16位小数

## 1.5 字符类

ASCII码表

每个国家都有自己的编码集，表示自己的编码（我国GBK2312）

Unicode 所有编码集（占用空间较大）  

Utf-8 ----编码集

## 1.6 bool值

### 1.6.1 定义bool类型变量

boolean = true/false

## 1.7 变量

+ 定义变量时必须声明变量类型
+ 变量使用前必须对变量初始化（赋值）

### 1.7.1 变量命名规范

1、变量名只能由数字、字母、下划线及$符组成

2、不能以数字开头

3、不能以Java中关键字开头

4、尽量见名知意

5、建议使用驼峰命名法

### 1.7.2 变量作用域

- 如果<font color='red'>**在当前类中都能生效的变量叫全局变量**</font>

- 如果<font color='red'>**在方法中定义的变量叫局部变量**</font>

- 若局部变量和全局变量重名，遵循就近原则

### 1.7.3 声明变量

```java
byte a;
//声明变量: 数据类型 变量名;
byte a = 1;
//声明变量并赋值: 数据类型 变量名 = 变量值;
String a = "value1", b = "value2", c = "value3";
//声明多个变量并赋值： 变量类型 变量名1 = 值1, 变量名2 = 值2, 变量名3 = 值3;
```

### 1.7.4 变量赋值

```java
a = 10;
//对变量赋值：变量名称 = 变量值;
```

### 1.7.5 变量使用

```java
		System.out.println(currentMonth);
```

### 1.7.6 变量值修改

```java
int a = 10;
a = 100;
//修改变量值
System.out.println(a);
```

## 1.8 程序的执行顺序

+ 从上到下依次执行
+ 变量没有零值，且定义后不一定要引用

```java
public class test {
	public static void main (String[] args) {
	byte a,b;
	a = 1;
	b = 1;
	System.out.println(a);
}
}
```

## 1.9 数据类型转换

+ 1、除boolean外，七种基本数据类型之间可能可以转换
+ 2、取值范围小的类型可以直接给取值范围大的类型转，构成自动类型转换，也叫隐式类型转换
+ 3、取值范围大的向取值类型小的转需要强制类型转换（可能出现精度损耗）
+ 4、对byte、short、char类型赋值时，没有超出当前数据类型取值范围时，可直接赋值
+ 5、byte、short、char进行混合运算时，先转为int类型，再进行运算
+ 6、当多种值类型（除Boolean外七种基本数据类型）进行混合运算时，结果为运算类型中大的类型

### 1.9.1 小范围数据转大范围的数据

<font color='red'>**小范围转大范围直接转换**</font>

```java
public class SmallToMax {
	public static void main (String[] args) {
	byte a = 20;
	long b = a;
	System.out.println(b);
}
}
```

### 1.9.2 大范围数据转下范围的数据

<font color='red'>**大范围转小范围需要强制转换**</font>

```java
public class MaxToSmall {
	public static void main (String[] args) {
	long a = 20L;
	byte b = (byte)a;
	System.out.println(b);
}
}
```

# 2 数据运算符

##### 一元运算符

参与运算的数据只有一个：!

##### 二元运算符

参与运算的数据有两个

& | >> <<  + - * /  += -+ *=  /+

##### 三元运算符

参与运算的数据有三个

## 2.1 算数运算符

\+ - \* / % (取余)

+ 参与运算的数据与参与运算的数据类型相同（前提：参与运算的所有数据类型要相同,<font color='red'>**且buye和short的除外，byte + byte,byte+short,short+short的结果都是int**</font>）

int + int == int

long + long == long

... ...

+ **参与运算的类型不同，结果类型为参与运算的数据类型中，大范围的值的类型相同**

+ long + byte == long

+ <font color='red'>short ，byte，char在做运算的时候会转成int，运算时需要强制转换类型</font>

```java
public class homework {
    	public static void main (String[] args) {
		short e = 128;
		System.out.println(e / 100);
		short f = (short)(e%100);
//强制转换数据类型
		System.out.println(f / 10);
}
} 
```

## 2.2 char做算数运算

### 2.2.1 直接打印int类型为字符串的变量值

+ \+ 用的较多，符号和数字用的多

+ 若<font color='red'>参加运算的类型的字符，则会用编码集进行运算</font>

```java
public class Bools {
	public static void main (String[] args) {
		int e = '1';
        //e是int类型，'1'是char类型
		System.out.println(e);
}}
```

###### 执行结果

```
PS D:\JAVA> java Bools
49
```

+ 若<font color='red'>参与运算的是一个变量，结果的类型默认是int</font>

### 2.2.2 定义字符串类型变量

```java
public class chars {
	public static void main (String[] args) {
	char a = 'L';
	System.out.println(a);
}
}
```

### 2.2.3 字符串的算数运算

+ 编程常用数据类型：int，long，double

+ 面试常问：short、byte，float、char

#### 2.2.3.1 运算的直接是字符

+ char类型的值对应ASCLL值，与数字相加，得到最终结果对应的值

```
public class chars {
	public static void main (String[] args) {
	char b = '0' + 10;
	System.out.println(b);
}
}
```

| ASCII值 | 控制字符 | ASCII值 | 控制字符 | 控制字符 | ASCII值 | 控制字符 |
| ------- | -------- | ------- | -------- | -------- | ------- | -------- |
| 16      | DLE      | 48      | 0        | P        | 112     | p        |
| 26      | SUB      | 58      | :        | Z        | 122     | z        |

###### 运行结果：

```powershell
PS D:\JAVA> java chars
:
```

#### 2.2.3.2 运算的是保存字符的变量

```java
public class chars {
	public static void main (String[] args) {
	char c = '0';
	int d = c + 1;
//不能用char类型接收，否则会提示类型不兼容
	System.out.print(d);
}
}
```

###### 运行结果：

```powershell
PS D:\JAVA> java chars
49
```

## 2.3 复合运算符

+ 若一个式子中，出现了算数运算符和符合运算符，<font color='red'>优先计算算数运算符。</font>算数运算符优先级大于复合运算符
+ 若使用符合运算符时，不会改变左侧变量数据类型，小数部分会被舍去

```java
public class test {
	public static void main (String[] args) {
		int a = 10;
		int e = 2;
		a *= e + 1;
		System.out.println(a);
}}
```

###### 运算结果：

```java
PS D:\JAVA> javac .\test.java
PS D:\JAVA> java test
30
```

## 2.4 数据运算

### 2.4.1 数字的符号

+、-可以表示数字的正负

### 2.4.2 结合变量

++、-- ，表示自增、自减，在当前变量的基础上+/-1，可以放在<font color='red'>变量前面</font>，或者<font color='red'>变量后面</font>

#### 2.4.2.1 在变量前面和后面的区别

+ <font color='red'>写在变量前面</font>，先用变量值，后加1

+ <font color='red'>写在变量后面</font>，先加1，后用变量值

```java
public class test {
	public static void main (String[] args) {
		byte a = 120 ;
		System.out.println(a++);
		System.out.println(a);
        System.out.println(a++);
}}
```

```powershell
PS D:\JAVA> java test
120
121
121
```

#### 2.4.2.2 赋值运算符：

= ： int a = 1 ;

将1赋值给int 类型的a 

+= 、-=、 *= 、/=

数字间的运算（关系运算），结果为boolean类型

表示数字间关系

<、<=、>=、<=、==、!=

+ 关系运算符一次只能比较一个式子是否成立，若来连续比较需要使用逻辑运算符

#### 2.4.2.3 数据运算：

+ 使用数字运算符和字符运算符

若使用了符合运算符，进行运算，在自己本身的基础上进行的运算，<font color='red'>**数据类型不会发生变化**</font>

```java
public class test { 
	public static void main (String[] args) {
		int a = 10;
		a += a;
		System.out.println(a);
}}
```

## 2.5 关系运算

### 2.5.1 逻辑运算符

用来连接多个关系运算表达式（a + b a + b - 1 a * b a > b）

语句结束表示完成的一句话 赋值

### 2.5.2 表达式

短路与和短路或

#### 2.5.2.1 短路与运算：

当全部结果为true时，结果为true，否则为false

+ 前面的如执行失败，整个表达式是false，后面的不会执行

#### 2.5.2.2 短路或运算：

至少有一个表达式成立，结果为true，否则为false

+ 前面的如执行成功，整个表达式是true，后面的不会执行

### 2.5.3 全路与和全路或

+ & | 是全路运算符，无论前面表达式是否可以决定整个表达式结果，都继续执行后面语句

#### 2.5.3.1 全路与

+ 取决于参与运算的数据类型

#### 2.5.3.2 运算结果

运算结果取决于全路运算符

+ 若链接的是关系表达式，无论前面的表达式是否能决定整个表达式的结果，后边都执行
+ 若连接的是数字，则对数字进行位运算

### 2.5.4 逻辑异或

+ 符号：^ 
+ 当两侧条件相同时，为true,否则为false

```java
System.out.println(true ^ true);
System.out.println(false ^ true);

]$ java text1.java
false
true

```

### 2.5.5 逻辑非

+ 符号：^ 
+ 对boolean值取反

```java
System.out.println(!true);
System.out.println(!false);

]$ java text1.java
false
true
```

### 2.5.6 移位

<<：左移 ，左移一位，值变为原来的一倍

\>>：右移，右移一位，值变为原来的一半

```
public class test1 {
	public  static void main (String[] args) {
	int a = 5;
	System.out.println(a >> 1);
	System.out.println(a << 1);
}
}
```

### 2.5.6 三目运算符

+ 格式：条件1?代码1:代码2
  + 成立执行代码1，条件不成立执行代码2

+ 参与运算的结果取决于前两个值

+ 判断前面的表达式是否成立，若成立表达式结果为值1，不成立则为值2

```java
public class test1 {
    public static void main (String[] args) {
        int a = 10;
        int b = 20;
        System.out.print(a>b?20:true);
        System.out.print(a<b?20:true);
    }
}
```

希望实现若前面的表达式成立，则执行前一部分 的代码，并把值赋给结果，否则执行第二部分的代码，赋给表达式的结果

## 2.6 字符串类型

+ String ,值需要使用“”赋值

### 2.6.1 String与字符的拼接

+ 使用+ 是字符串拼接

```java
public class test1 {
	public  static void main (String[] args) {
	String b = "a" + "b";
	System.out.print(b);
}
}
```

###### 运行结果：

```
PS D:\JAVA> java test1
ab
```

# 3 Scanner标准输入

## 3.1 以回车为标识

```java
        //Scanner 控制台输入
        Scanner input = new Scanner(System.in);
        //以回车为标识，遇到回车表示结束
        System.out.println(input.nextLine())
```

###### 运行结果

```
ab cd
ab cd
```

## 3.2 返回int数据类型

```java
        //Scanner 控制台输入
        Scanner input = new Scanner(System.in);
        //返回int数据类型
        System.out.println(input.nextInt());
```

###### 运行结果

```
11
11
```

## 3.3 String类型

```Java
    //Scanner 控制台输入
    Scanner input = new Scanner(System.in);
    //返回int数据类型
    System.out.println(input.next());
```

## 3.4 以空白标识符分割

```java
        //Scanner 控制台输入
        Scanner input = new Scanner(System.in);
        //控制台字符串接收，遇到空白标识符结束
        System.out.println(input.next());
```

###### 运行结果

```
ab a
ab
```



# 4 分支语句

## 4.1 if

### 4.1.1 一个条件

```java
if (条件 boolean类型) {
    若条件成立，执行{
        
    } 
}    
```

### 4.1.2 两个条件

```java
if (条件 boolean类型) {
    若条件成立，执行{
        
    } else {
        代码
    }
}    
```

### 4.1.3多个条件

```java
if (条件 boolean类型) {
    若条件成立，执行{
        
    } else if (条件) {
        代码
    } else {
    }
}    
```

## 4.2 switch case 

+ <font color='red'>case穿透：忘记写break会导致case一直向下执行，直到遇到break，或者switch</font>
+ 和 case 后的值比较

值只可以为byte，short，int，char，String

```java
switch (值) {
    case 值:
         代码
    break;
  }
```

+ <font color='red'>case比default优先级高</font>
+ <font color='red'>default可以放在case前，但是还是会先执行case</font>

```java
switch 变量a {
    case a == 1:
         代码
    break:
    //强制终止当前循环
    default:
    //若值都不相等，执行default代码
  }
```

# 5 循环

循环三要素:初始值、循环条件、更新初始值

## 5.1 for循环

> 1、for的三个表达式可以省略，但';'必须保留,都省略会形成死循环
>
> 2、初始值可以在循环外声明，<font color='red'>见4.1.3</font>
>
> 3、省略循环条件会形成死循环(循环条件默认值为true)
>
> 4、省略更新初始值时，会形成死循环，初始值可以在循环体内更新

### 5.1.1 循环格式

```java
for (初始值; 循环条件; 更新初始值)   {
	循环语句
	}
```

#### 5.1.2 for循环执行过程

初始化值--> 判断循环条件-->执行循环语句--->更新初始值

变量的作用域：定义变量的范围

### 5.1.3 提取i作用范围

```java
int i = 0;
for (; i < 2; i++) {}
```

## 5.2 while 循环

#### 5.2.1 循环格式

```java
while (循环条件) {
    执行的内容
    更新条件
}
```

## 5.3 do while循环

### 5.3.1 循环格式

```java
do {
    循环体
} while (循条件);
```

### 5.3.2 do while 循环特点

+ 无论条件是否满足都会执行至少执行一次

## 5.4 中断循环

> <font color='red'>continue：</font>跳过当前循环，进行下一次循环
> <font color='red'>break：</font>结束循环
> <font color='red'>return：</font>结束方法，执行后退出该方法，每个方法最后都会执行return

## 5.5 三种循环区别

+ 执行流程不同
  + for 循环和 while循环：先判断，条件成了则执行循环体
  + do while 先执行循环体，再判断循环条件
+ 使用情况不同
  + 循环次数固定时，建议使用for
  + 循环次数不固定时，建议使用while、do while
    + 先判断再执行循环体：while
    + 先执行循环体再判断：do while
+ 当初始循环条件为false时，for和while循环执行不执行循环体，do while执行一次循环体

# 6 方法

+ 方法公开化（用public修饰，代表类外面可调用）

## 6.1 方法的格式

+ 具有某种功能的代码，例如main具有程序入口方法的功能

```
public static void 方法名(数据类型 变量名)   ----- 方法的声明 {方法中具有某种功能的代码----方法体
} 
public static: 修饰符		^形参
void:返回值类型

```

+ 方法写在class文件中
+ 不能在一个方法中再写一个方法
+ 方法名是标识符

## 6.2 方法分类

### 6.2.1 是否有参数

+ 有参数

+ 无参数

### 6.2.2 是否有返回值

+ 无返回值（方法名前是void的方法没有返回值）

  + <font color='red'>无返回的方法需要使用return时，只能使用'return;'作用是结束方法</font>
  + 当switch语句中，有return时，不能出现break，否则会编译错误

  ![image-20210924153311521](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20210924153311521.png)

```java
	//定义无参无返回值得方法
	public static void classSum() {
		int a = 2;
		int b = 55;
		int sum = a + b;
		System.out.print(sum);
	}

	//定义无参带返回值的方法
class Product {
	public static int product() {
		int product = 9 * 9;
		return product;
	}
	
	public static void main(String[] args) {
		System.out.print(product());
        //当方法带有返回值类型时，若不打印返回值则不会输出返回值
	}
}

	//有参无返回值

publiv static void print(int n) {}
//参数格式 ： 参数类型 参数名，如：int n ，多个参数使用,int分隔，如：int i ,int j
```

### 6.2.3 有返回值的方法调用

+ 调用时，方法给了我们数据值，在调用时，可以使用对应的变量接收

+ 如果需要得到方法中的数据，继续做其他操作，该方法需定义成有返回值的方法
+ 有返回值（必须使用完成后，使用return返回对应类型值）
  + 当该方法只有一个返回值，可以写成带返回值的方法

+ 带返回值方法注意事项：

> 返回值类型不能使用void，需要使用返回值的类型
>
> 必须使用return 输出返回值
>
> 当方法带有返回值类型时，建议在方法调用处进行处理，否则不会输出

## 6.3 定义方法

+ 方法用

```java
    private static void sorts(int[] sorts) {
        //int[] sorts = {34,21,8,49};
        for (int j = 0; j < sorts.length-1; j++) {
            for (int i = 0; i < sorts.length - 1 - j; i++) {
                if (sorts[i] > sorts[i + 1]) {
                    int temp = sorts[i];
                    sorts[i] = sorts[i + 1];
                    sorts[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < sorts.length; i++) {
            System.out.println(sorts[i]);
        }

    }
}
<<<<<<< HEAD
```

## 6.4 调用自定义方法

+ jvm调用main方法，main方法调用自己写的代码

+ 方法调用时，观察调用的方法是不是有形参，如果有，形参是什么数据，
+ 调用当前类的方法时，可以省略类名，调用其他类中的方法需要加类名

```
 public static void main(String[] args) {
        int [] sorts1 = {20,10,0,39};
        int [] sorts2 = {20,10,0,39};
        sorts(sorts1);
        //引用方法时，要注意是否有形参，有的话需要对形参赋值，若有多个形参时，用“，”隔开
    }
```

<<<<<<< HEAD
## 6.5 方法重载

+ 在同一个类中定义多个方法，方法名相同，但是参数列表不同
+ 方法重载只要符合重载的条件就是方法重载，可以是普通的方法，也可以是构造方法
+ 可以根据传入的参数自动的选择要使用现有的方法，还会自动进行大范围的数据转换

> 1、参数个数不同
>
> 2、参数类型不同
>
> 3、类型顺序不同

# 7 包

## 7.1 什么是包

+ 包类似于文件夹，包里可以存放包或文件

## 7.2 包的好处

+ 方便查找

+ 避免重名

## 7.3 创建包

> 1、在指定目录或者src中创建
>
> 2、创建包的两种方式
>
> + a. 先创建包在创建类
>
> + b.在创建类的同时创建包，
>   + 创建类时指定的包不存在会在指定位置创建一个包
>
> 3、包名建议全小写英文
>
> 4、当一个类在指定包中存放，则该类中第一行必须是包的声明，如果没有声明必须在src中存放

![image-20210925170451674](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20210925170451674.png)

## 7.4 声明包的语法

```java
package 包名;
//包名可以是域名反写
```

# 8 面向对象

## 8.1 什么是面向对象

> 面向对象: 虚拟模拟现实生活
>
> 面向过程: 按照步骤逐步完成

## 8.2 类与对象的关系

+ 类是抽象的，对象是具体的
+ 属性：用于描述对象的特征称之为
+ 方法：对象所能实现的功能称之为方法
+ 将对象中相同的属性和方法放一起形成一个类
+ 类包含属性和方法

> 对象：具体的事物，具体的实体，具体的实例，模板下具体的产品
> 类：对对象向上抽取出像的部分，公共的部分，形成类，类是抽象的，是一个模板

## 8.3 创建类

+ 当成员变量没有赋值时，有默认值；

+ 成员变量零值

![image-20210926105402269](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20210926105402269.png)

```java
//第一步：创建类
[类修饰符] class 类名 {
    //第二步：编写属性（也叫编写成员变量）
    String name;
    int age;
    ... ...
    //编写方法，面向对象中方法修饰符暂时编写为public
    public [返回值] 方法名([参数]) {
        //方法内容
    }
}
```

## 8.4 创建对象 

### 8.4.1 创建对象

```java
Student zs = new Student();
//类名 对象名(引用名) = new 类名();
```

### 8.4.2 输出对象的属性值

![image-20210926115144615](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20210926115144615.png)

```java
        System.out.println(zs.name);
//对象名.属性值
```

### 8.4.3 对属性赋值

```java
//语法：对象名.属性名 = 值;
```

### 8.4.4 调用对象的方法

```java
//对象名.方法名();
zs.study();
```

一个类可以创建多个对象

## 8.5 局部变量和成员变量区别

> 1. 声明位置不同：
>
>    a. 局部变量：方法中声明的变量称之为局部变量
>
>    b. 成员变量：也叫属性或字段，在方法外声明的变量成为成员变量
>
> 2. 作业范围不同：
> 	a. 局部变量 : 在当前作用域内使用
> 	
> 	b. 成员变量：在类中使用，作用范围更大
> 	
> 3. 初始值不同：
>
>   a. 成员变量有初始值
>
>   b. 局部变量声明之后必须进行赋值
>
> 4. 同一类中局部变量可以与成员变量名称相同，当使用变量时遵循优先原则；<font color='red'>**若要使用成员变量，必须使用this.变量名**</font>
>
>    a. this代表当前对象，不是固定的，取决于谁调用了方法，谁调用的方法就是谁
>

## 8.6 构造方法

### 8.6.1 构造方法定义

1. 构造方法<font color='red'>用于对属性(成员变量、字段)赋值；</font>

2. 构造方法是一个**特殊的方法**

   ​	a.构造方法**必须与类名一致**

   ​	b.构造方法**必须没有返回值类型**，也就是不需要写void

3. 构造方法语法格式

```java
public 类名([参数列表]) {

}
```

### 8.6.2构造方法的执行

+ 创建对象后，调用构造方法执行

### 8.6.3 构造方法的重载

+ 在同一类中，构造方法名相同，参数列表不同

构造方法重载好处：

> 1.使用灵活

# 9 引用数据类型

## 9.1 引用数据类型赋值

+ 引用数据类型默认值是null

> 第一种：将右侧对象的内存地址赋值给左侧对象（引用名）
>
> ​	a. 例：c = new Car();
>
> 第二种：
>
> ​	a.  例：c = null（运行会报空指针异常）
>
> ​	原因：当c中存放的是null时，也就是c中没有存放地址，没有指向某个对象，则不能访问对象中的属性或方法
>
> ​	解决方法：c = new Car();
>
> <font color='red'>**注意：当创建子对象时，没有对父类中的属性赋值，则父类中属性是null，必须不能访问父类中的属性或方法，否则出现空指针异常**</font>
>
> <font color='red'>**解决方法：**</font>
>
> ​	在创建子类无参构造方法时，在子类的无参构造方法中创建一个父类的对象



![image-20210927120126088](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20210927120126088.png)

## 9.3 this 关键字

+ 表示当前这个对象，当前谁调用代表谁
+ this关键字可以访问本类中的实例变量、实例方法及本类中

### 9.3.1 this关键字作用范围

+ this关键字可以访问本类（当前类中的实例变量）

+ 什么是实例变量？
  + 当属性(成员变量或者字段)前面没有编写static关键字，称为实例变量，也就是：对象的变量
+ 实例变量什么时候存在？
  + 当创建对象时，会自动在对象中存储该实例变量
+ 当没有局部变量与实例变量同名，则可以在本类中直接使用实例变量,等价于系统默认编写this.
+ 如果局部变量与实例变量同名，不报错，但是局部变量优先，也就是：就近的优先，如果非要访问实例变量则必须使用this.

### 9.3.2 this关键字访问本类中的实例方法

+ 什么是实例方法？
  + 当方法前面没有编写static关键字称为实例方法，也就是：对象的方法
+ 在本类中实例方法之间是可以直接调用的,默认前面添加this.

### 9.3.3 this关键字可以访问本类中的其他构造方法

+ 使用this关键字调用本地构造方法
+ 当this后面的小括号中没内容，则调用本类无参构造方法
+ 当this后面的小括号中有内容，则匹配本类相匹配构造方法
+ this访问本类构造方法
  + this只能调用本类中其他构造方法
  + this只能访问本类中其他构造方法，也就是：构造方法不能调用自己会形成死循环

# 10 封装

## 10.1 什么是封装？

隐藏类的内部信息，不允许外部程序直接访问，而是通过方法完成

## 10.2 封装的操作步骤

+ 第一步：将属性编写为private修饰符，也就是：该属性只能在本类(当前类)中使用
+ 第二步：编写对应属性的方法(取值方法get和赋值方法set)
+ 根据情况适当的在set赋值方法中编写判断语句

## 10.3 封装好处

+  属性的值更安全，也就是：属性的值更合法、有意义、有效

## 10.4 带参封装好处

减少代码量，当set方法写为返回当前对象时，则再使用set方法可以进行连缀操作

![image-20210928103614630](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20210928103614630.png)

![image-20210928103625591](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20210928103625591.png)

## 10.5 参数传递

### 10.5.1 基本数据类型作为参数进行传递

+ 基本数据类型在内存中传递值

### 10.5.2 引用数据类型作为参数进行传递

+ 引用数据类型在内存中存的是地址
+ 引用数据类型作为参数进行传递时，实参传给形参的是地址
  + 也就是实参和形参内存地址相同
  + 当另一个方中的对象属性发生改变时,
+ 

# 11 继承

## 11.1 继承父类

+ 继承发生在类和类之间
+ 通过extens指定父类。若没有指定父类，默认继承Object
+ 父类

```java
package git.cncf.online.day10;

public class publicClass {
    protected String name;
    protected byte age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

+ 子类

```java
public class Student extends publicClass {
    //子类中的代码
}
```

## 11.2 方法重写

+ @override会标识方法重写

+ 类是具有相同特征和行为的一类事物 

+ 子类和父类拥有相同的方法，但方法体不同

+ 子类<font color="red">继承父类，参数列表相同，返回值相同</font>访问权限修饰符不同，<font color="red">称为方法重写</font>
+ 向上转型后，方法调用时，会进行动态绑定，都是子类特征中符合自己的特征行为，而不会执行父类的方法体（父类的方法体多余，执行不到）
+ 子类必须手动写方法才能实现重写（使用抽象方法提示子类需要方法重写）

```java
####cat
package git.cncf.online.day11;

public class Cat extends Animal {
        private String type ;
        public void run(){
                System.out.println("cat可以跑");
        }
}

####dog
import git.cncf.online.day11.Animal;

public class dog extends Animal {
    private String type ;
    public void run(){
        System.out.println("dog跑的很快");;
    }
}

####animal
package git.cncf.online.day11;

public class Animal {
    private String name;
    private int age;

    public Animal () {
    }

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run(){
        System.out.println("动物可以跑");
    }

}

####test


package git.cncf.online.day11;

public class test11 {
    public static void main(String[] args) {
        b(new Cat());
        b(new dog());
    }

    private static void b(Animal animal) {
        System.out.println("================");
        animal.run();
        System.out.println("================");

    }
}
```

###### 运行结果

```powershell
================
cat可以跑
================
================
dog跑的很快
================
```

## 11.3继承注意事项

+ 1.父类也叫做超类、基类superclass，子类也叫做派生类subclass

+ 2.子类继承父类时，不能继承父类中的构造方法

+ 3.继承满足条件：is a
  + n 比如：猫是动物，狗是动物

## 11.4 继承有两大特性

+ <font color='red'>**单根性：一个类只能继承一个直接的父类，称为单继承**</font>

+ <font color='red'>**类具有传递性**</font>

class A{

​    编写2个属性和2个方法

}

class B extends A{

​    独有属性2个和独有方法5个

}

class C extends B{

 

}

# 12 this关键字与super关键字区别

## 12.1 this关键字

### 12.1.1 this代表

+ 在Java中，代表当前这个对象，也就是说：<font color='red'>当前谁调用这个方法，则this代表的就是谁</font>

### 12.1.2 this在哪里使用

+ <font color='red'>在当前类(本类)中使用</font>

### 12.1.3 this关键字访问范围

+ 可以访问本类中的实例变量、实例方法以及本类中的其他构造方法

+ 还可以访问父类中的实例变量和实例方法

### 12.1.4 this关键字访问时顺序

Ø 先在当前类中找该实例变量或实例方法，如果没有找到则再去父类中找该实例变量或实例方法

## 12.2super关键字

### 12.2.1 super代表

+ super代表超类，也就是父类

### 12.2.2 super在哪里使用

+ 只能在子类中使用

### 12.2.3 super关键字访问范围

+ 可以访问父类中的实例变量和父类中的实例方法

+ 还可以访问父类中的构造方法

+ 如果子类构造方法中没有编写super指定调用父类哪个构造方法，则系统默认调用父类的无参构造方法，否则调用父类相匹配的构造方法

### 12.2.4 super关键字访问时，查找顺序

+ 直接去父类中找该实例变量或实例方法

+ 因此使用super.访问父类中的实例变量或实例方法，查找速度相对更快或者执行效率高

### 12.2.5 super注意事项

+ 1.当访问子类独有实例变量或实例方法时，只能编写为this.或者没有局变量同名，也可以默认不写

+ 2.当子类中重写父类的方法后，如果在方法体中再调用父类的方法时，则只能使用super.否则就出现死循环，也就是方法自己调用方法自己

## 12.3  当创建子类对象时，父类做了什么？

先执行父类构造方法，然后再执行子类相匹配的构造方法

# 13 static关键字

+ 可以<font color='red'>修饰属性、方法、代码块</font>、内部类以及实现静态导入

## 13.1 static关键字修饰属性

+ 当在类中声明的变量，称为成员变量，也叫做属性或者叫做字段，f提示
+ 当属性前面没有编写static关键字，称为实例变量，也叫做对象的变量
+ 当属性前面编写static关键字，称为静态变量，也叫做类的变量

```java
    int a;// 实例变量
    int b;//静态变量
```

### 13.1.2 静态变量特点

+ 当<font color='red'>**类加载到内存时，则就给静态变量分配空间，一直到程序结束**</font>

+ 在JDK8之前在方法区存储，JDK8及之后在静态变量在堆内存中存储
+ 静态变量在堆内存中存储

### 13.1.3 静态变量访问方式

![image-20210929102350886](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20210929102350886.png)

+ 类名.静态变量名
+ 对象名.静态变量名
  + 注意：当前这个类的所有对象都可以共享静态变量，原因：当类加载到内存时静态变量就存在，一直到程序结束

![image-20210929103152324](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20210929103152324.png)

+ 当对象名中存放null时，依然可以访问静态变量名
  + 也就是说：无论对象名中存放的是地址还是null都可以访问静态变量y

![image-20210929103947683](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20210929103947683.png)

+ <font color='red'>类优先与对象，类的生命周期比较长</font>

### 13.1.4 什么时候将属性编写为static修饰的

+ <font color='red'>**当多个对象中某个属性的值都一样时，则就可以编写为静态变量，原因：节省空间**</font>

## 13.2 static关键字修饰方法

+ <font color='red'>方法使用static关键字修饰，称为静态方法，也叫做类的方法</font>
+ <font color='red'>方法没有使用static关键字修饰，称为实例方法，也叫做对象的方法</font>

### 13.2.1 静态方法中可以访问:类的变量和类的方法

实例方法中可以访问：静态变量和静态方法，也可以访问实例变量和实例方法

### 13.2.2 其实main方法也是静态方法

### 13.2.3 什么时候将方法编写为静态方法？

+ 编写工具类中的工具方法时，建议：工具方法编写为静态方法，原因：使用比较方便，类名.
+ 当方法体中没有使用到实例变量和实例方法时，则就可以编写为静态方法

## 13.3 static关键字修饰代码块

### 13.3.1静态代码块

+ 当使用static关键字修饰代码块，称为静态代码块

```java
static{

}
```

### 13.3.2静态代码块作用

+ 完成对静态变量初始值

![image-20210929112852949](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20210929112852949.png)

### 13.3.3静态代码块怎么执行

+ 当类加载内存时，执行静态代码块，并且只执行一次

![image-20210929114607622](C:/Users/Coder/AppData/Roaming/Typora/typora-user-images/image-20210929114607622.png)

> 创建MyClass对象时，执行过程：
>    	 1.首先将MyClass.class字节码文件加载到内存中
>    	 2.然后给静态变量y和z分配空间，并且y的值为100，z的值为默认值0
>    	 3.会自动执行静态代码块，完成对静态变量z赋值为200
>    	 4.执行new时会在堆内存中创建一个对象，并且开辟空间存储实例变量x,x的值为默认值0
>    	 5.同时执行带一个参数的构造方法，完成对实例变量x赋值为111
>     	6.将右侧对象的内存地址赋给左侧的对象名

## 13.4 static关键字修饰内部类

### 13.4.1 什么是内部类

+ 
  在一个类中再编写一个类，里面的这个类，称为内部类，也可以叫做内置类，或者叫做嵌套类
  

### 13.4.2 什么时候编写内部类？

+ 内部类一般是对外部类提供服务的，如果还想对其他外部类提供服务则建议编写普通的类

### 13.4.3 静态内部类

+ 当内部类前面编写static关键字称为静态内部类

```java
public class MyClass { //称为外部类
    //编写实例方法
    public void print(){
        MyClass2 m = new MyClass2();
    }
    class MyClass2{ //称为内部类，一般是在外部类的实例方法中使用

    }

    //编写静态方法
    public static void show(){
        MyClass3 m = new MyClass3();
    }
    static class MyClass3{ //称为静态内部类，一般是在外部类的静态方法中使用

    }
}
```

## 13.5 static关键字可以实现静态导入

```java
package static1.demo5;

public class MyClass {
    static int y = 100; //静态变量
}
```

# 14 访问权限

## 14.1 类的访问权限

+ 分为公共类和非公共类

+ 如果一个类前面编写public修饰符，则该类称为公共类，也就是：该类可以在任意包中使用

+ 如果一个类前面没有编写public 修饰符，该类称为非公共类，也就是：该类只能在当前包中使用

## 14.2 成员的访问权限

+ 在类中编写的都是成员

+ 比如：类中编写的变量称为成员变量，类中编写的方法称为成员方法，类中编写的内部类称为成员内部类

| 访问权限                                         | 在本类中                              | 在当前包中                            | 在其他包的子类                        | 在任意包的任意类中                    |
| ------------------------------------------------ | ------------------------------------- | ------------------------------------- | ------------------------------------- | ------------------------------------- |
| <font color='red'>**private私有的**</font>       | <font color='red'>**可以使用**</font> | 不可以使用                            | 不可以使用                            | 不可以使用                            |
| <font color='red'>  **默认的**</font>            | <font color='red'>**可以使用**</font> | <font color='red'>**可以使用**</font> | 不可以使用                            | 不可以使用                            |
| <font color='red'>  **protected受保护的**</font> | <font color='red'>**可以使用**</font> | <font color='red'>**可以使用**</font> | <font color='red'>**可以使用**</font> | 不可以使用                            |
| <font color='red'>**public公共的**</font>        | <font color='red'>**可以使用**</font> | <font color='red'>**可以使用**</font> | <font color='red'>**可以使用**</font> | <font color='red'>**可以使用**</font> |

## 14.3 总结：

> 1.当属性没有要求时，建议：编写为默认访问权限
>
> 2.当要求使用封装完成，建议：实例变量编写为private访问权限
>
> 3.当属性要求只能在当前类和子类中使用，则建议：编写为protected访问权限
>
> 4.大多数情况下，方法编写为public访问权限

### 14.4 重写override，也叫覆盖规则

> 不能缩小访问权限
>
> 返回值类型一致 或者编写父类方法返回值类型的子类类型
>
> 方法名称必须一致
>
> 参数列表必须一致

# 15 final关键字

+ <font color='red'>表示最终的</font>

+ <font color='red'>可以修饰类、方法也可以修饰属性</font>

## 15.1 final关键字修饰类

+ 当使用final关键字修饰类，表示该类是最终的类，也就是：不能再有子类
  + 比如：String 、Scanner.......都是使用final关键字修饰的类

## 15.2 final关键字修饰方法

+ 当使用final关键字修饰的方法，则该方法为最终的方法，也就是：不能再被重写

## 15.3 final关键字修饰属性

### 15.3.1 常量

+ 当使用final关键字修饰属性，称为常量
+ 常量：存放数据的，但是存放的数据是不可以发生改变

### 15.3.2 常量赋值

+ 第一种:在声明同时完成赋值

+ 第二种:通过构造方法完成赋值

15.3.4 常量命名

+ 常量名全部大写，如果有多个单词之间使用下划线隔开
  + 如：数学中的π值为3.14，则再Java中一般使用PI表示

16 多态

## 16.1  **多态的语法格式**

```java
父类类型 对象名 = new 子类();
```

## 16.2  什么是多态

+ 多种不同的形态(结果)
  + 在Java中，多个对象调用同一个方法，得到多个不一样的结果，原因：优先调用子类重写以后的方法

## 16.3 满足多态的条件

+ 子类必须继承父类
+ 子类必须重写父类的方法
+ 父类类型 对象名 = new 子类();

### 16.4 多态的好处

+ 减少代码的冗余性

![image-20211008190659664](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20211008190659664.png)

![image-20211008190717187](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20211008190717187.png)

#### 16.5 多态中的类型转换

### 16.5.1 向上转型

> 当构成多态时，则也就是向上转型或者叫做自动类型转换
>
> 比如：Person p = new Student();
>
> 其实由子到父
>
> 当构成多态，也就是向上转型或者叫做自动类型转换，对象名是父类类型，只能访问父类中公共的属性和公共的方法，但是优先访问子类重写以后的方法

### 16.5.2 向下转型

![image-20211008190849742](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20211008190849742.png)

# 17 抽象类和抽象方法

## 17.1 抽象类

+ 什么时候编写为抽象类？
  + 一般会将父类编写为抽象类

### 17.1.1 抽象类特点

> 抽象类使用abstract关键字，其中abstract表示抽象
>
> 抽象类不能创建对象，也就是：抽象类也是多态的一种形式

## 17.2 抽象方法

+ 什么时候编写为抽象方法？
  + 当父类的方法体使用不到时，则就可以将父类的方法编写为抽象方法

### 17.2.1 抽象方法特点

> 抽象方法使用abstract关键字
>
> 抽象方法必须没有方法体，也就是：不需要编写大括号，直接以英文分号作为结尾
>
> 抽象方法必须在抽象类
>
> 当子类继承抽象类时，子类必须重写抽象类中所有的抽象方法，否则子类也是抽象类
>
> 大多数情况下，子类都重写抽象类中的所有抽象方法
>
> 抽象类不能创建对象，也就是：抽象类也是多态的一种形式

# 18 接口

## 18.1 接口的定义

+ 抽象类中只有抽象方法，则就可以使用接口完成

```java
public abstract class Pet{
	public abstract void eat();
}
```

+ 接口使用interface关键字

+ 接口中抽象方法默认有public abstract

```java
public interface Pet{
	void eat();
}
```

## 18.2 类与接口

+ 类与类之间是继承extends，也就是：<font color='red'>子类继承父类</font>，并且<font color='red'>是单继承</font>

+ 类与接口之间是实现implements,也就是：<font color='red'>实现类实现接口</font>，<font color='red'>并且是多实现</font>

+ 实现类实现接口时，必须要重写接口中所有的抽象方法，否则实现类也是抽象类
+ 大多数情况下实现类都会重写接口中的抽象方法
+ 接口不能创建对象，也就是：接口也是多态的一种形式
+ 接口属于引用数据类型，在内存中存放的是地址

## 18.3 接口注意事项

### 18.3.1 接口注意事项

+ 接口是对功能的封装

+ 比如：软件工程师既会编写代码，也会讲业务

+ <font color='red'>类与类之间是继承，并且是单继承</font>
+ <font color='red'>接口与接口之间是继承，并且是多继承</font>
+ <font color='red'>类与接口之间是实现，并且是多实现</font>
+ <font color='red'>但是接口不能继承类</font>

+ JDK8.0中，接口中包含：抽象方法(默认有public abstract)、公有静态常量(默认有public static final)、public static修饰的方法、public default修饰的方法
+ 当一个类既有继承，也有实现，则继承必须位于实现的前面

```java
public class SE extends Object implements IBusiness,ICode {

}
```

# 19 抽象类与接口异同点

## 19.1  相同点

+ 都可以编写抽象方法

+ 都不能创建对象，也就是说:抽象类和接口都是多态的一种形式

+ 子类或者实现类要重写抽象方法，否则子类或者实现类必须是抽象类

## 19.2 不同点

### 19.2.1 抽象类

+ 使用abstract关键字

+ 抽象类中包括：普通类中编写的所有内容，还可以包含抽象方法
+ 子类继承抽象类，并且是单继承

### 19.2.2 接口

+ 使用interface关键字

+ <font color='red'>在JDK8.0中，接口中包含：抽象方法(默认有public abstract关键字)、公有静态常量(默认有public static final)、public static修饰的方法、public default修饰的方法</font>
+ 实现类实现接口，并且是多实现

# 20 内部类

## 20.1 什么是内部类

一个类中再编写一个类，里面的这个类，称为内部类，也叫做内置类或者叫做嵌套类

```java
class A{ //称为外部类
	class B{ //称为内部类
	}
}
```

## 20.2 什么时候编写为内部类

+ 内部类一般是对外部类提供服务的，如果内部类还想对其他外部类提供服务，则不建议编写为内部类

+ 当一个大的数据结构中包含若干个小的数据结构，则就可以将这些小的数据结构编写为内部类

## 20.3 内部类的分类

+ 成员内部类

```Java
class Inner{ //称为内部类，也叫做成员内部类，一般在外部类的实例方法中使用

}
```

+ 静态内部类

```Java
static class Inner2{ //称为静态内部类，一般在外部类的静态方法中使用

}
```

+ 局部内部类

```java
public void print3(){
    class Innner3{ //称为局部内部类

    }
}
```

+ <font color='red'>匿名内部类</font>
  + 匿名也就是没有名字
+ 1.什么时候编写为匿名内部类？
  + 当只创建一次对象时，也可以编写为匿名内部类
+ 2.其实匿名内部类就是对内部类的简写形式
+ 3.编写匿名内部类前提：必须继承父类或者实现接口

```java
p = new Pet() {
    @Override
    public void eat() {
        System.out.println("正在吃.....");
    }
};
p.eat();


        //注意：1.如果只创建一次对象，则也可以编写为匿名内部类完成
new Pet(){
	@Override
	public void eat() {
		System.out.println("正在吃Xxxxxx");
	}
}.eat();

public class Test3 {
    public static void main(String[] args) {
        Master m = new Master();
        m.feed(new Dog());
        m.feed(new Pet() {
            @Override
            public void eat() {
                System.out.println("正在吃......");
            }
        });
    }
}

package demo7;

public class Master {
    public void feed(Pet p){
        p.eat();
    }
}
```

# 21 Object类

## 21.1 Object类说明

+ 1.在Java中，Object类是所有类的父类也叫做超类，要么直接继承Object类，要么间接继承Object类

+ 2.当一个类没有使用extends指定继承哪个父类时，则系统默认继承Object类，也就是：当继承Object父类时，extends Object是可有可无的

+ 3.在Java中，所有类都继承Object类中的方法

## 20.2 toString

### 20.2.1 默认输出

默认情况下，只输出对象名c时，则输出：demo8.Computer@4554617c
完整类名@十六进制的值

+ 原因：
  默认情况下，只输出对象名c时，其实系统默认调用toString()方法，也就是:输出c等价于编写为c.toString()
    当前对象名c是Computer类型，在调用toString方法时，先在Computer类中找该方法toString()，如果没有找到，则再去父类Object中找该方法toString()

  ```java
  public String toString() {
      return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }
  ```

### 20.2.2 equals(Object obj)

```java
package demo9;

import java.util.Objects;

public class Person {
    //编写实例变量
    String name;
    int age;
    char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
} 



package demo9;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 19, '男');
        Person p2 = new Person("张三", 19, '男');
        System.out.println(p1.equals(p2));
    }
}
```

运行结果：

```powershell
false
```

<font color='red'>原因：在默认情况下，调用equals方法，其实执行的是父类Object中的equals方法，依然方法体比较的两个对象的地址是否一致</font>

![image-20211008201615491](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20211008201615491.png)

解决方法: 

+ 重新equals

![image-20211008201950108](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20211008201950108.png)

# 22 [类与类之间的关系](https://www.cnblogs.com/shijingjing07/p/6228417.html)

## 22.1 依赖

依赖关系是类与类之间的联接。一个类依赖于另一个类的定义。如，一个人(Person)可以买车(Car)和房子(House),Person类依赖于Car和House的定义，因为Person引入了Car和House。与关联不同的是，Person类中没有Car和House的属性，Car和House的实例是以参量的方式传入到buy()方法中的。一般而言，依赖关系在Java语言中体现为局部变量，方法形参，或者对静态方法的调用。

![image-20211008202440566](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20211008202440566.png)

## 22.2 关联

关联是类与类之间的联接，使一个类知道另一个类的属性和方法。关联可以是双向，也可以是单向的。一般使用成员变量来实现。

![image-20211008202510101](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20211008202510101.png)

## 22.3 聚合

聚合是一种强的关联关系。是整体和个体之间的关系。例如，汽车类与引擎类，轮胎类之间的关系就是整体与个体之间的关系。与关联关系一样，聚合关系也是通过实例变量实现的。但是关联关系涉及的两个类在同一层次，而聚合关系中两个类处在不平等的层次上，一个代表整体，一个代表部分。

![img](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/300946-20161228101335851-1483683152.png)

## 22.4 组合

组合也是关联关系的一种，一种比聚合关系强的关系。组合关系中的部分类不能独立于整体类存在。整体类和部分类有相同的生命周期。如Person类和Leg类。

![image-20211008202610053](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20211008202610053.png)

## 22.5 继承/泛化

泛化和继承其实是一个逆过程 泛化就是有子类抽象出一个父类 而继承就是由父类具体化一个子类 例如足球比联赛跟什么西甲 意甲 英超之间就是泛化/继承的关系

![image-20211008202620909](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20211008202620909.png)

## 22.6 组合和聚合的区别

组合和聚合都属于关联，所以它们之间难免有相似之处，区别举例来说明：
程老师的《大话》里举大那个大雁的例子很贴切 在此我就借用一下 大雁喜欢热闹害怕孤独 所以它们一直过着群居的生活 这样就有了雁群 每一只大雁都有自己的雁群 每个雁群都有好多大雁 大雁与雁群的这种关系就可以称之为聚合 另外每只大雁都有两只翅膀 大雁与雁翅的关系就叫做组合 有此可见 聚合的关系明显没有组合紧密 大雁不会因为它们的群主将雁群解散而无法生存 而雁翅就无法脱离大雁而单独生存——组合关系的类具有相同的生命周期
聚合关系图：

![img](https://images2015.cnblogs.com/blog/300946/201612/300946-20161228101435898-1130053478.png)

聚合关系图：

![image-20211008202703308](https://raw.githubusercontent.com/chfanyang/scrNot/main/img/image-20211008202703308.png)

雁群类：

```JAVA
public class GooseGroup
{
    publi Goose goose;
    public GooseGroup(Goose goose){
        this.goose=goose;
    }
}
```

大雁类：

```JAVA
public class Goose{
    public Wings wings;
    public Goose()
    {
        wings=new Wings();
    }
}    
```



从构造函数来看，GooseGroup的构造函数要用到Goose作为参数把值传进来，Goose可以脱离GooseGroup独立存在。
组合关系中整体类含有部分类的实例化，Goose在实例化之前，一定要先实例化Wings，两个类紧密耦合在一起，它们有相同的生命周期，Wings不能独立于Goose存在。

从信息封装来看，聚合关系中，客户端同时了解GooseGroup和Goose，因为它们是独立的。
而在组合关系中，客户端只认识大雁类，根本不知道翅膀类的存在，因为翅膀类被严密封装在大雁类中。

# 23 数组

## 23.1 数组的定义

```java
数据类型 [] 数组名 = new 数据类型[长度];
或者:
数据类型  数组名 [] = new 数据类型[长度];
```

## 23.2 访问数组元素

```java
通过索引值(下标)来访问数组元素:
数组名[索引值];
```

### 23.2.1数组元素赋值

```java
把某个值赋值给数组元素,如:
data[0] = 123;
```

### 23.2.2 数组静态初始化

+ 在定义数组的同时就给数组的元素赋值,这叫数组的静态初始化.在数组静态初始化时,不需要指定数组的长度,数组的长度由初始化数组元素的个数决定.

```java
int [] data3 = new int[] {1,2,3,4,5,6};
数组的静态初始化可以简化为:
int [] data4 = {1,2,3,4,5,6};
```

### 23.2.3 foreach 遍历数组

+ foreach循环只能用于遍历数组元素，无法修改数组元素

```java
for( 数组元素类型  变量名 : 数组名 ){
	循环体
}

for( int xx : data2 ){
	System.out.println( xx );
}
```

## 23.3 数组参数

数组是一种引用数据类型,可以作为方法参数,也可以作为方法的返回值类型.当方法需要处理某个数组时就可以通过参数来接收一个数组, 当方法的返回值是一个数组时,则方法的返回值类型为数组类型.如定义方法把整数数组中元素连接成一个字符串,需要通过参数来接收一个整数数组

```java
	//定义方法,从键盘上读取n个整数,存储到数组中,并把该数组返回:
    public static int[] getData(int n ){
        	//先定义一个数组,存储n个整数
        int[] data = new int[n];
        //从键盘上读取n个整数,把读取到 整数存储到数组中
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < n; i++){
            System.out.println("请输入第" + i + "个整数");
            data[i] = sc.nextInt();     //把键盘上读取的整数保存到数组元素中
        }
        return data;        //返回数组
    }

```



23. 





























































































































































































































































=======
# 

>>>>>>> 7origin/master

==与equals区别

+ == 比较的是两个值，内存中地址是否相同
+ equals是比较的两个值是否相同

+ 值比较

```Java
    //比较基本数据类型和引用数据类型的地址
    System.out.println(i1 == i2);
    //比较值是否相同
    System.out.println(i1.equals(i2));
```

switch case 

