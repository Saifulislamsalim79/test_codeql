package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.databinding.FragmentPendingKycFormBinding;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.PendingKycViewModel;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.location.Location;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: PendingKycFormFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.PendingKycFormFragment$onSubmitIdClicked$1$1 */
/* loaded from: classes.dex */
final class PendingKycFormFragment$onSubmitIdClicked$1$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ String $idType;
    final /* synthetic */ FragmentPendingKycFormBinding $this_apply;
    final /* synthetic */ PendingKycFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingKycFormFragment$onSubmitIdClicked$1$1(PendingKycFormFragment pendingKycFormFragment, String str, FragmentPendingKycFormBinding fragmentPendingKycFormBinding) {
        super(1);
        this.this$0 = pendingKycFormFragment;
        this.$idType = str;
        this.$this_apply = fragmentPendingKycFormBinding;
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
        if (location != null) {
            PendingKycFormFragment $r3 = this.this$0;
            PendingKycViewModel $r4 = $r3.getPendingKycViewModel();
            String $r2 = this.$idType;
            FragmentPendingKycFormBinding $r5 = this.$this_apply;
            KudiInputField $r6 = $r5.idCardNumberView;
            String $r7 = $r6.getText();
            FragmentPendingKycFormBinding $r52 = this.$this_apply;
            KudiInputField $r62 = $r52.emailAddressView;
            String $r8 = $r62.getText();
            PendingKycFormFragment $r32 = this.this$0;
            RegistrationInfo $r9 = $r32.getRegistrationInfo();
            double $d0 = location.getLatitude();
            double $d1 = location.getLongitude();
            $r4.verifyId($r2, $r7, $r8, $r9, $d0, $d1);
        }
    }
}
