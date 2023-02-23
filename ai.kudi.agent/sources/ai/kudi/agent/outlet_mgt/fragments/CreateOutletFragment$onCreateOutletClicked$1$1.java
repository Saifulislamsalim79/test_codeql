package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.databinding.FragmentCreateOutletBinding;
import ai.kudi.agent.outlet_mgt.data.CreateOutletRequest;
import ai.kudi.agent.outlet_mgt.viewmodels.CreateOutletViewModel;
import ai.kudi.agent.transactionhistory.mapper.TransactionTypeMapperKt;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.location.Location;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CreateOutletFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateOutletFragment$onCreateOutletClicked$1$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ String $phoneNo;
    final /* synthetic */ FragmentCreateOutletBinding $this_apply;
    final /* synthetic */ CreateOutletFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOutletFragment$onCreateOutletClicked$1$1(CreateOutletFragment createOutletFragment, FragmentCreateOutletBinding fragmentCreateOutletBinding, String str) {
        super(1);
        this.this$0 = createOutletFragment;
        this.$this_apply = fragmentCreateOutletBinding;
        this.$phoneNo = str;
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
        Double $r2;
        if (location == null) {
            $r2 = null;
        } else {
            double $d0 = location.getLatitude();
            $r2 = Double.valueOf($d0);
        }
        if ($r2 != null) {
            CreateOutletFragment $r3 = this.this$0;
            CreateOutletViewModel $r4 = $r3.getCreateOutletViewModel();
            FragmentCreateOutletBinding $r5 = this.$this_apply;
            KudiInputField $r6 = $r5.createOutletOutletNameInputField;
            String $r7 = $r6.getText();
            FragmentCreateOutletBinding $r52 = this.$this_apply;
            KudiInputField $r62 = $r52.createOutletAddressInputField;
            String $r8 = $r62.getText();
            FragmentCreateOutletBinding $r53 = this.$this_apply;
            KudiInputField $r63 = $r53.createOutletAreaInputField;
            String $r9 = $r63.getText();
            FragmentCreateOutletBinding $r54 = this.$this_apply;
            KudiInputField $r64 = $r54.createOutletStateInputField;
            String $r10 = $r64.getText();
            FragmentCreateOutletBinding $r55 = this.$this_apply;
            KudiInputField $r65 = $r55.createOutletLgaInputField;
            String $r11 = $r65.getText();
            double $d02 = location.getLongitude();
            double $d1 = location.getLatitude();
            Double $r22 = Double.valueOf($d1);
            Double $r13 = Double.valueOf($d02);
            String $r14 = this.$phoneNo;
            CreateOutletRequest $r12 = new CreateOutletRequest($r8, $r9, $r7, null, null, $r22, $r11, $r13, $r14, null, null, TransactionTypeMapperKt.AGENCY_BANKING, $r10, 1560, null);
            $r4.submitData($r12);
        }
    }
}
