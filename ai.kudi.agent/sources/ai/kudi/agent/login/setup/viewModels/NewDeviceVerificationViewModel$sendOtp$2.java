package ai.kudi.agent.login.setup.viewModels;

import ai.kudi.agent.login.setup.viewModels.data.NewDeviceVerificationViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDeviceVerificationViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NewDeviceVerificationViewModel$sendOtp$2 extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {
    final /* synthetic */ NewDeviceVerificationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDeviceVerificationViewModel$sendOtp$2(NewDeviceVerificationViewModel newDeviceVerificationViewModel) {
        super(1);
        this.this$0 = newDeviceVerificationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        Throwable $r2 = th;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        Log_OC.getArray(th, "it");
        NewDeviceVerificationViewModel $r2 = this.this$0;
        NewDeviceVerificationViewData $r3 = NewDeviceVerificationViewModel.access$getState($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Object $r5 = $r4.invoke(th);
        $r2.publish(NewDeviceVerificationViewData.copy$default($r3, false, null, (String) $r5, 2, null));
    }
}