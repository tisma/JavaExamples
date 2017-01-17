import com.sun.jna.*;

public class Test {
	public static void main(String[] args) {
		System.out.println(Lib.INSTANCE.signum(10));

		final Pointer p = new Memory(5 * Native.getNativeSize(Integer.TYPE));
		for (int i = 0; i < 5; i++) {
			p.setInt(i * Native.getNativeSize(Integer.TYPE), i);
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(p.getInt(i * Native.getNativeSize(Integer.TYPE)) + " ");
		}
		System.out.println();

		Lib.INSTANCE.sum_array(p, 5);
		
		for (int i = 0; i < 5; i++) {
			System.out.print(p.getInt(i * Native.getNativeSize(Integer.TYPE)) + " ");
		}
		System.out.println();
	}
}