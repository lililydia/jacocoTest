package com.jacocoTest.jacocoTest;

/**
 * 使用jacoco检测测试用例的代码覆盖率
 * 
 * @author lydia
 */
public class JacocoCoverage {

	public static String name = "forTest";

	public static JacocoCoverage instance = new JacocoCoverage();

	/**
	 * 使用try catch捕获异常
	 */
	public void catchSomeThing() {
		try {
			System.out.println("你觉得我会抛错吗？");
			// throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("出异常了。");
			e.printStackTrace();
		}
	}

	/**
	 * 随便打印
	 */
	public void doSomeThing() {
		System.out.println("这是一个方法 名字叫doSomeThing");
	}

}

