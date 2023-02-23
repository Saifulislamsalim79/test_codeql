package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletSecurityViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.STATUS;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OutletMgtSecurityFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtSecurityFragment$showAlertDialog$1$2 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ DialogInterfaceC0936d $alertDialog;
    final /* synthetic */ OutletMgtSecurityFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutletMgtSecurityFragment$showAlertDialog$1$2(OutletMgtSecurityFragment outletMgtSecurityFragment, DialogInterfaceC0936d dialogInterfaceC0936d) {
        super(0);
        this.this$0 = outletMgtSecurityFragment;
        this.$alertDialog = dialogInterfaceC0936d;
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
        OutletMgtSecurityFragment $r1 = this.this$0;
        FragmentActivity $r2 = $r1.getActivity();
        if ($r2 != null) {
            ContextExtKt.toast$default($r2, "Outlet Unsuspended", 0, 2, (Object) null);
        }
        OutletMgtSecurityFragment $r12 = this.this$0;
        STATUS $r3 = STATUS.APPROVED;
        String $r4 = $r3.name();
        $r12.outletApprovalStatus = $r4;
        OutletMgtSecurityFragment $r13 = this.this$0;
        OutletSecurityViewModel $r5 = $r13.getOutletMgtSecurityViewModel();
        STATUS $r32 = STATUS.APPROVED;
        String $r42 = $r32.name();
        $r5.publishOutletSuspensionStatus($r42);
        DialogInterfaceC0936d $r6 = this.$alertDialog;
        $r6.dismiss();
    }
}
