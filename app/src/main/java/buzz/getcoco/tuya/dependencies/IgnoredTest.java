package buzz.getcoco.tuya.dependencies;

import android.util.Log;

public interface IgnoredTest {

  String TAG = "IgnoredTest";

  default void hello(String world) {
    Log.d(TAG, "hello: " + world);
  }
}
