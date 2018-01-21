This repo is for the learning of java.

# Generate package
1. Construct the folder directory
2. Compile the code to class: javac -d class/ src/test/mytest/*.java
3. Write the manifest file in the class path
4. Test: Run the code: java class/test/mytest/test(main function)
5. Generate the jar package: jar -cvmf manifest.txt Package/my.jar test(the top directory of the package)
6. Run the package: java -jar test.jar

# Import the package
如果使用Intellij:
1. 在idea的project view中直接选中包右键 add as library
2. 打开设置，选中library，点击添加jar包，选中jar包的路径
3. 如果源代码(不是包)都在src的目录下面，可以直接根据源代码的路径去import，类似于python


# 配置
在Intelij中添加Package下面的selenium以及TestNG的package

Selenium 模拟对浏览器的操作：http://www.seleniumhq.org/
TestNG作为测试框架： http://testng.org/doc/documentation-main.html#introduction

使用Maven作为包管理工具：

