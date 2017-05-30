package DesignPattern;
/**
 * 单例模式：确保一个类只有一个实例，并提供一个全局访问点
 */
/**
 * 单例模式的简单实现
 * @author ccding
 *
 */
public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton(){}
	public static Singleton getInstance(){
		return instance;
	}
}
/**
 * 单利模式延迟加载实现
 * @author ccding
 *
 */
class SingletonII {
	private static SingletonII instance = null;
	
	private SingletonII(){}
	public static SingletonII getInstance(){
		if(instance == null)
			instance = new SingletonII();
		return instance;
	}
}

/**
 * 单例模式线程同步
 * @author ccding
 *
 */
class SingletonIII {
	private static volatile SingletonIII instance = null;
	private SingletonIII(){}
	public static SingletonIII getInstance(){
		if(instance == null){
			synchronized(SingletonIII.class){
				if(instance == null)
					instance = new SingletonIII();
			}
		}
		return instance;
	}
}

/**
 * 单例模式线程同步
 * @author ccding
 *
 */
class SingletonVI {
	private static SingletonVI instance = null;
	private SingletonVI(){}
	public static synchronized SingletonVI getInstance(){
		if(instance == null){
			instance = new SingletonVI();
		}
		return instance;
	}
}

/**
 * 单例模式内部类
 * @author ccding
 *
 */
class SingletonV {
	private SingletonV(){}
	
	public static SingletonV getInstance(){
		return Holder.instance;
	}
	
	private static class Holder{
		private static SingletonV instance = new SingletonV();
	}
}
