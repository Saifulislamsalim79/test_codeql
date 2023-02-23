package ai.kudi.agent.mpos;

import com.paypad.impl.Paypad;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p475b0.C11707a;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MPOSActivity.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "activationCode", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class MPOSActivity$requestActivationCode$1 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ MPOSActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MPOSActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.mpos.MPOSActivity$requestActivationCode$1$1 */
    /* loaded from: classes.dex */
    public static final class C03281 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
        final /* synthetic */ String $activationCode;
        final /* synthetic */ MPOSActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03281(MPOSActivity mPOSActivity, String str) {
            super(0);
            this.this$0 = mPOSActivity;
            this.$activationCode = str;
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
            MPOSActivity $r3 = this.this$0;
            Paypad $r2 = $r3.getPaypad();
            String $r1 = this.$activationCode;
            $r2.activate($r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPOSActivity$requestActivationCode$1(MPOSActivity mPOSActivity) {
        super(1);
        this.this$0 = mPOSActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(String str) {
        String $r2 = str;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        Log_OC.getArray(str, "activationCode");
        MPOSActivity $r3 = this.this$0;
        C03281 $r2 = new C03281($r3, str);
        C11707a.m10413a((r12 & 1) != 0, (r12 & 2) != 0 ? false : false, (r12 & 4) != 0 ? null : null, (r12 & 8) != 0 ? null : null, (r12 & 16) != 0 ? -1 : 0, $r2);
    }
}
