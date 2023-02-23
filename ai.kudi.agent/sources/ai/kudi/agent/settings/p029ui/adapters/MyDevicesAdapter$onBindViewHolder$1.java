package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.settings.domain.dto.MyDevice;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MyDevicesAdapter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/settings/domain/dto/MyDevice;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.MyDevicesAdapter$onBindViewHolder$1 */
/* loaded from: classes.dex */
final class MyDevicesAdapter$onBindViewHolder$1 extends AbstractC11802m implements InterfaceC11767l<MyDevice, C13666w> {
    final /* synthetic */ int $position;
    final /* synthetic */ MyDevicesAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyDevicesAdapter$onBindViewHolder$1(MyDevicesAdapter myDevicesAdapter, int i) {
        super(1);
        this.this$0 = myDevicesAdapter;
        this.$position = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(MyDevice myDevice) {
        ai.kudi.agent.settings.domain.package_4.MyDevice $r2 = (ai.kudi.agent.settings.domain.package_4.MyDevice) myDevice;
        invoke($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(ai.kudi.agent.settings.domain.package_4.MyDevice myDevice) {
        Log_OC.getArray(myDevice, "it");
        MyDevicesAdapter $r2 = this.this$0;
        InterfaceC11771p $r3 = $r2.getOnDeleteClickListener();
        if ($r3 == null) {
            return;
        }
        int $i0 = this.$position;
        Integer $r4 = Integer.valueOf($i0);
        $r3.invoke(myDevice, $r4);
    }
}
