import com.sun.jna.*;

public interface Lib extends Library {
	Lib INSTANCE = (Lib) Native.loadLibrary("library", Lib.class);

	public int signum(int input);
	public void sum_array(Pointer array, int length);
}