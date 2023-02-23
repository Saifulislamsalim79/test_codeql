package ai.kudi.agent.login.setup.presenters;

import ai.kudi.agent.login.setup.views.AccountVerificationView;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountVerificationPresenter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AccountVerificationPresenter$verifyOtpForDeviceVerification$1$2 extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {
    final /* synthetic */ AccountVerificationView $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountVerificationPresenter$verifyOtpForDeviceVerification$1$2(AccountVerificationView accountVerificationView) {
        super(1);
        this.$view = accountVerificationView;
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
        AccountVerificationView $r2 = this.$view;
        $r2.toggleAuthState(false);
        AccountVerificationView $r22 = this.$view;
        $r22.hideProgress();
        AccountVerificationView $r23 = this.$view;
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Object $r4 = $r3.invoke(th);
        String $r5 = (String) $r4;
        $r23.showMsg($r5);
    }
}
