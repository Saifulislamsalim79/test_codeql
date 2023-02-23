package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.login.setup.presenters.AccountVerificationPresenter;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import android.location.Location;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountVerificationHolderActivity.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.setup.ui.AccountVerificationHolderActivity$toPerformLoginView$1 */
/* loaded from: classes.dex */
public final class AccountVerificationHolderActivity$toPerformLoginView$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ AccountVerificationHolderActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountVerificationHolderActivity$toPerformLoginView$1(AccountVerificationHolderActivity accountVerificationHolderActivity, String str) {
        super(1);
        this.this$0 = accountVerificationHolderActivity;
        this.$phoneNumber = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Location location) {
        Location $r2 = location;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Location location) {
        OtpVerificationModel $r4;
        if (location == null || ($r4 = this.this$0.getOtpVerificationModel()) == null) {
            return;
        }
        AccountVerificationHolderActivity $r2 = this.this$0;
        String $r3 = this.$phoneNumber;
        AccountVerificationPresenter $r5 = $r2.getThisPresenter();
        String $r6 = $r4.getPin();
        String $r7 = $r4.getDeviceName();
        String $r8 = $r4.getDeviceId();
        String $r9 = $r4.getImeiId();
        String $r10 = $r2.type;
        double $d0 = location.getLatitude();
        double $d1 = location.getLongitude();
        $r5.performLogin($r3, $r6, $r7, $r8, $r9, $r10, $d0, $d1);
    }
}
