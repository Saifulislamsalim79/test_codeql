package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.settings.domain.dto.MyDevice;
import ai.kudi.agent.settings.security.p028ui.viewModels.MyDevicesViewModel;
import android.os.Bundle;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MyDevicesFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "myDevice", "Lai/kudi/agent/settings/domain/dto/MyDevice;", "position", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.MyDevicesFragment$onViewCreated$1 */
/* loaded from: classes.dex */
final class MyDevicesFragment$onViewCreated$1 extends AbstractC11802m implements InterfaceC11771p<MyDevice, Integer, C13666w> {
    final /* synthetic */ MyDevicesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyDevicesFragment$onViewCreated$1(MyDevicesFragment myDevicesFragment) {
        super(2);
        this.this$0 = myDevicesFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m40871invoke$lambda0(MyDevicesFragment myDevicesFragment, ai.kudi.agent.settings.domain.package_4.MyDevice myDevice, int i, String str, Bundle bundle) {
        Log_OC.getArray(myDevicesFragment, "this$0");
        Log_OC.getArray(myDevice, "$myDevice");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "$noName_1");
        MyDevicesViewModel $r4 = myDevicesFragment.getMyDevicesViewModel();
        String $r3 = myDevice.getId();
        $r4.deleteDevice($r3, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(MyDevice myDevice, Integer num) {
        ai.kudi.agent.settings.domain.package_4.MyDevice $r3 = (ai.kudi.agent.settings.domain.package_4.MyDevice) myDevice;
        Integer $r4 = num;
        int $i0 = $r4.intValue();
        invoke($r3, $i0);
        C13666w r5 = C13666w.f30112a;
        return r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(final ai.kudi.agent.settings.domain.package_4.MyDevice myDevice, final int i) {
        Log_OC.getArray(myDevice, "myDevice");
        MyDevicesFragment $r1 = this.this$0;
        FragmentManager $r5 = $r1.getChildFragmentManager();
        MyDevicesFragment $r12 = this.this$0;
        PreferenceActivity $r6 = $r12.getViewLifecycleOwner();
        final MyDevicesFragment $r13 = this.this$0;
        $r5.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r6, new InterfaceC1523w() { // from class: ai.kudi.agent.settings.security.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38371b(String str, Bundle bundle) {
                MyDevicesFragment $r3 = MyDevicesFragment.this;
                ai.kudi.agent.settings.domain.package_4.MyDevice $r4 = myDevice;
                int $i0 = i;
                MyDevicesFragment$onViewCreated$1.m40871invoke$lambda0($r3, $r4, $i0, str, bundle);
            }
        });
        KudiPin.Companion $r3 = KudiPin.Companion;
        KudiPin $r7 = KudiPin.Companion.newInstance$default($r3, null, null, false, 7, null);
        MyDevicesFragment $r14 = this.this$0;
        FragmentManager $r52 = $r14.getChildFragmentManager();
        Chapter r9 = (Chapter) $r7;
        r9.show($r52, ".AuthDialog.Dialog");
    }
}
