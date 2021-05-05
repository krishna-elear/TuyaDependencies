package buzz.getcoco.tuya.dependencies;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.tuya.smart.config.TuyaAPConfig;
import com.tuya.smart.config.TuyaEZConfig;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class TuyaTest {

  @Test
  public void apConfigTest() {
    Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();
    TuyaAPConfig.getInstance().startConfig(context, "ssid", "password", "token");
    assertTrue(true);
  }

  @Test
  public void ezConfigTest() {
    TuyaEZConfig.getInstance().startConfig("ssid", "password", "token");
    assertTrue(true);
  }
}
