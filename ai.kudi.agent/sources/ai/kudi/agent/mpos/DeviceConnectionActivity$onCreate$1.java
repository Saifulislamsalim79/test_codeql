package ai.kudi.agent.mpos;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import androidx.appcompat.app.DialogInterfaceC0936d;
import com.paypad.controllers.PinpadManager;
import java.io.IOException;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: DeviceConnectionActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class DeviceConnectionActivity$onCreate$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ BluetoothDevice $paypadDevice;
    final /* synthetic */ DeviceConnectionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceConnectionActivity$onCreate$1(DeviceConnectionActivity deviceConnectionActivity, BluetoothDevice bluetoothDevice) {
        super(0);
        this.this$0 = deviceConnectionActivity;
        this.$paypadDevice = bluetoothDevice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m39814invoke$lambda0(DeviceConnectionActivity deviceConnectionActivity) {
        Log_OC.getArray(deviceConnectionActivity, "this$0");
        deviceConnectionActivity.setResult(-1);
        deviceConnectionActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke$lambda-2  reason: not valid java name */
    public static final void m39815invoke$lambda2(final DeviceConnectionActivity deviceConnectionActivity) {
        Log_OC.getArray(deviceConnectionActivity, "this$0");
        DialogInterfaceC0936d.C0937a $r1 = new DialogInterfaceC0936d.C0937a(deviceConnectionActivity);
        $r1.setTitle("Could not connect to Paypad").setMessage("Please ensure the paypad device is on and within vicinity. Also if you have more than one Paypad device pairs, please delete the other paired devices and try again.").setNeutralButton("Close", new DialogInterface.OnClickListener() { // from class: ai.kudi.agent.mpos.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceConnectionActivity $r2 = DeviceConnectionActivity.this;
                DeviceConnectionActivity$onCreate$1.m39816invoke$lambda2$lambda1($r2, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39816invoke$lambda2$lambda1(DeviceConnectionActivity deviceConnectionActivity, DialogInterface dialogInterface, int i) {
        Log_OC.getArray(deviceConnectionActivity, "this$0");
        deviceConnectionActivity.setResult(10);
        deviceConnectionActivity.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        invoke2();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        try {
            PinpadManager $r3 = PinpadManager.getInstance(this.this$0);
            BluetoothDevice $r4 = this.$paypadDevice;
            String $r5 = $r4.getAddress();
            $r3.connect($r5);
            DeviceConnectionActivity $r2 = this.this$0;
            final DeviceConnectionActivity $r6 = this.this$0;
            $r2.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.mpos.AsyncHttpClient$7
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceConnectionActivity $r1 = DeviceConnectionActivity.this;
                    DeviceConnectionActivity$onCreate$1.m39814invoke$lambda0($r1);
                }
            });
        } catch (IOException $r7) {
            CrashlyticsReport.logException($r7);
            final DeviceConnectionActivity $r22 = this.this$0;
            $r22.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.mpos.Runner
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceConnectionActivity $r1 = DeviceConnectionActivity.this;
                    DeviceConnectionActivity$onCreate$1.m39815invoke$lambda2($r1);
                }
            });
        }
    }
}
