package ai.kudi.agent.mpos;

import ai.kudi.agent.databinding.ActivityMposDeviceConnectionBinding;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.DialogInterfaceC0936d;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.p475b0.C11707a;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
/* compiled from: DeviceConnectionActivity.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/mpos/DeviceConnectionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lai/kudi/agent/databinding/ActivityMposDeviceConnectionBinding;", "getBinding", "()Lai/kudi/agent/databinding/ActivityMposDeviceConnectionBinding;", "setBinding", "(Lai/kudi/agent/databinding/ActivityMposDeviceConnectionBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DeviceConnectionActivity extends AppCompatActivity {
    public ActivityMposDeviceConnectionBinding binding;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m39813onCreate$lambda1(DeviceConnectionActivity deviceConnectionActivity, DialogInterface dialogInterface, int i) {
        Log_OC.getArray(deviceConnectionActivity, "this$0");
        deviceConnectionActivity.setResult(10);
        deviceConnectionActivity.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityMposDeviceConnectionBinding getBinding() {
        ActivityMposDeviceConnectionBinding $r1 = this.binding;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("binding");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        BluetoothDevice bluetoothDevice;
        boolean $z0;
        super.onCreate(bundle);
        LayoutInflater $r3 = getLayoutInflater();
        ActivityMposDeviceConnectionBinding $r4 = ActivityMposDeviceConnectionBinding.inflate($r3);
        Log_OC.loadImage($r4, "inflate(layoutInflater)");
        setBinding($r4);
        View $r5 = getBinding().getRoot();
        View r18 = $r5;
        setContentView(r18);
        BluetoothAdapter $r6 = BluetoothAdapter.getDefaultAdapter();
        Set $r7 = $r6.getBondedDevices();
        Log_OC.loadImage($r7, "pairedDevices");
        Iterator $r8 = $r7.iterator();
        while (true) {
            boolean $z02 = $r8.hasNext();
            if (!$z02) {
                bluetoothDevice = null;
                break;
            }
            Object $r9 = $r8.next();
            bluetoothDevice = $r9;
            String $r12 = ((BluetoothDevice) $r9).getName();
            Log_OC.loadImage($r12, "it.name");
            $z0 = C13276s.m5449C($r12, "pp", true);
            if ($z0) {
                break;
            }
        }
        BluetoothDevice $r11 = bluetoothDevice;
        if ($r11 != null) {
            DeviceConnectionActivity$onCreate$1 r15 = new DeviceConnectionActivity$onCreate$1(this, $r11);
            C11707a.m10413a((r12 & 1) != 0, (r12 & 2) != 0 ? false : false, (r12 & 4) != 0 ? null : null, (r12 & 8) != 0 ? null : null, (r12 & 16) != 0 ? -1 : 0, r15);
            return;
        }
        DialogInterfaceC0936d.C0937a r16 = new DialogInterfaceC0936d.C0937a(this);
        DialogInterfaceC0936d.C0937a $r13 = r16.setTitle("PinPad not paired");
        $r13.setMessage("Please pair your phone with the Paypad device and try again.").setNeutralButton("Close", new DialogInterface.OnClickListener() { // from class: ai.kudi.agent.mpos.TextInputDialog$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceConnectionActivity $r2 = DeviceConnectionActivity.this;
                DeviceConnectionActivity.m39813onCreate$lambda1($r2, dialogInterface, i);
            }
        }).show();
    }

    public final void setBinding(ActivityMposDeviceConnectionBinding activityMposDeviceConnectionBinding) {
        Log_OC.getArray(activityMposDeviceConnectionBinding, "<set-?>");
        this.binding = activityMposDeviceConnectionBinding;
    }
}
