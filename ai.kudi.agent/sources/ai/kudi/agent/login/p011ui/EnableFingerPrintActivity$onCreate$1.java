package ai.kudi.agent.login.p011ui;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.register.data.CompleteRegistrationData;
import android.content.Context;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: EnableFingerPrintActivity.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/register/data/CompleteRegistrationData;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.EnableFingerPrintActivity$onCreate$1 */
/* loaded from: classes.dex */
final class EnableFingerPrintActivity$onCreate$1 extends AbstractC11802m implements InterfaceC11767l<CompleteRegistrationData, C13666w> {
    final /* synthetic */ EnableFingerPrintActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnableFingerPrintActivity$onCreate$1(EnableFingerPrintActivity enableFingerPrintActivity) {
        super(1);
        this.this$0 = enableFingerPrintActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(CompleteRegistrationData completeRegistrationData) {
        CompleteRegistrationData $r2 = completeRegistrationData;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CompleteRegistrationData completeRegistrationData) {
        EnableFingerPrintActivity $r2 = this.this$0;
        ContextExtKt.launchActivity$default((Context) $r2, false, LoginActivity.class, (InterfaceC11767l) null, 5, (Object) null);
    }
}
