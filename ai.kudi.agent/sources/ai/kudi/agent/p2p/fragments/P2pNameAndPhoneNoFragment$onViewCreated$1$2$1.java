package ai.kudi.agent.p2p.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.p2p.data.P2pData;
import ai.kudi.agent.p2p.fragments.P2pEnterAmtFragment;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: P2pNameAndPhoneNoFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class P2pNameAndPhoneNoFragment$onViewCreated$1$2$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ String $accountName;
    final /* synthetic */ String $narration;
    final /* synthetic */ String $phoneNo;
    final /* synthetic */ P2pNameAndPhoneNoFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2pNameAndPhoneNoFragment$onViewCreated$1$2$1(P2pNameAndPhoneNoFragment p2pNameAndPhoneNoFragment, String str, String str2, String str3) {
        super(0);
        this.this$0 = p2pNameAndPhoneNoFragment;
        this.$phoneNo = str;
        this.$narration = str2;
        this.$accountName = str3;
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
        P2pNameAndPhoneNoFragment $r2 = this.this$0;
        TransferActivity $r3 = $r2.transferActivity;
        if ($r3 == null) {
            return;
        }
        P2pEnterAmtFragment.Companion $r4 = P2pEnterAmtFragment.Companion;
        String $r5 = this.$phoneNo;
        String $r6 = this.$narration;
        String $r7 = this.$accountName;
        P2pData r9 = new P2pData($r5, $r6, $r7, null, null, null, 56, null);
        P2pEnterAmtFragment $r8 = $r4.newInstance(r9);
        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) $r3, $r8, C0001R.C0003id.transferContainerLayout, false, false, false, 28, null);
    }
}
