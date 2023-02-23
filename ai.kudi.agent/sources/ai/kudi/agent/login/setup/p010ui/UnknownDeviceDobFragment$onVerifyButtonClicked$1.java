package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.databinding.FragmentUnknownDeviceDobBinding;
import ai.kudi.agent.login.setup.viewModels.UnknownDeviceDobViewModel;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.location.Location;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import p201g.p270x.InterfaceC8209a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnknownDeviceDobFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "location", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.setup.ui.UnknownDeviceDobFragment$onVerifyButtonClicked$1 */
/* loaded from: classes.dex */
public final class UnknownDeviceDobFragment$onVerifyButtonClicked$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ UnknownDeviceDobFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownDeviceDobFragment$onVerifyButtonClicked$1(UnknownDeviceDobFragment unknownDeviceDobFragment) {
        super(1);
        this.this$0 = unknownDeviceDobFragment;
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
        OtpVerificationModel $r3 = this.this$0.otpVerificationModel;
        if ($r3 == null) {
            return;
        }
        UnknownDeviceDobFragment $r2 = this.this$0;
        UnknownDeviceDobViewModel $r4 = $r2.getUnknownDeviceDobViewModel();
        InterfaceC8209a $r5 = $r2.requireBinding();
        FragmentUnknownDeviceDobBinding $r6 = (FragmentUnknownDeviceDobBinding) $r5;
        KudiInputField $r7 = $r6.dobInputField;
        String $r8 = $r7.getText();
        InterfaceC8209a $r52 = $r2.requireBinding();
        FragmentUnknownDeviceDobBinding $r62 = (FragmentUnknownDeviceDobBinding) $r52;
        KudiInputField $r72 = $r62.bvnInputField;
        String $r9 = $r72.getText();
        double $d1 = location == null ? 0.0d : location.getLongitude();
        double $d0 = location != null ? location.getLatitude() : 0.0d;
        $r4.authorizeDob($r8, $r9, $r3, $d1, $d0);
    }
}
