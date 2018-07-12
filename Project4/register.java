import java.util.Stack;

public class register {
	private Stack<Integer> registerStack=new Stack<Integer>();

	/* integer registers r0 ~ r10 are general registers */
	public register(int low,int high)
	{
		int a;

		/* set integer registers (available), r0 ~ r8 , r9 and r10 is for special use*/
		for (a=high; a>=low; a--)
			registerStack.push(a);
	}

	public int get()
	{
		return registerStack.pop();
	}

	public void set(String s)
	{
		registerStack.push(Integer.parseInt(s.substring(1)));
	}
}
