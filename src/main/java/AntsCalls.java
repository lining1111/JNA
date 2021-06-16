import com.sun.jna.*;
import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;


public class AntsCalls {
    public interface CLib extends Library {
//        CLib Instance = Native.load("sayhello", CLib.class);
        CLib Instance = Native.load("lib", CLib.class);
        void hello();

        int getsum(int a, int b, int[] sum);
    }

    public static void main(String[] args) {
        CLib.Instance.hello();
        int a = 10;
        int b = 3;

        int[] sum = new int [3];
        CLib.Instance.getsum(a, b, sum);


        System.out.println(sum[1]);
    }

}
