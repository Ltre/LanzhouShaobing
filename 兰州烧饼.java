import java.util.Random;
class 傻逼类型 extends Object{
	boolean 是否傻逼;
	public 傻逼类型(){
		是否傻逼 = true;
	}
	public 傻逼类型(boolean 傻逼值){
		this.是否傻逼 = 傻逼值;
	}
	public boolean get傻逼(){
		return 是否傻逼;
	}
	public void set傻逼(boolean 傻逼值){
		是否傻逼 = 傻逼值;
	}
}
interface 傻逼的把柄{
	public String 傻逼行为 = "默认傻逼行为";
	public String 傻逼言论  = "我是傻逼";
	public boolean 是否有傻逼行为();
	public boolean 是否有傻逼言论();
}
public class 兰州烧饼 extends 傻逼类型 implements 傻逼的把柄{

	public 兰州烧饼(){
		super();
	}
	public 兰州烧饼(boolean 傻逼值){
		super(傻逼值);
	}
	
	public boolean 是否有傻逼行为() {
		return new Random().nextBoolean();
	}
	
	public boolean 是否有傻逼言论() {
		return new Random().nextBoolean();
	}
	public boolean get傻逼(){
		return 是否有傻逼行为()||是否有傻逼言论() ? true : false;
	}
	public String toString(){
		String 结论一 = 是否有傻逼行为() ? "有傻逼行为\n" : "没有傻逼行为";
		String 结论二 = 是否有傻逼言论() ? "有傻逼言论\n" : "没有傻逼言论";
		String 结论三 = String.valueOf(get傻逼()) + "\n";
		return 结论一 + 结论二 + 结论三;
	}
	//测试楼主是不是傻逼
	public static void main(String[] args){
		兰州烧饼 楼主 = new 兰州烧饼(true);
		System.out.println(楼主.toString());
	}
}
