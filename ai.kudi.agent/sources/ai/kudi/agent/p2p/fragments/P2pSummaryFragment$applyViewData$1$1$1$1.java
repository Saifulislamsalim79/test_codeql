package ai.kudi.agent.p2p.fragments;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.kshock.data.domain.fht.TransactionResponse;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: P2pSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class P2pSummaryFragment$applyViewData$1$1$1$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ TransactionResponse index;
    final /* synthetic */ P2pSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: P2pSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.p2p.fragments.P2pSummaryFragment$applyViewData$1$1$1$1$1 */
    /* loaded from: classes.dex */
    public static final class C03571 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
        final /* synthetic */ TransactionResponse index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03571(TransactionResponse transactionResponse) {
            super(1);
            this.index = transactionResponse;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Bundle bundle) {
            Bundle $r2 = bundle;
            invoke2($r2);
            C13666w r3 = C13666w.f30112a;
            return r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Bundle bundle) {
            Log_OC.getArray(bundle, "$this$launchActivity");
            TransactionResponse $r3 = this.index;
            String $r2 = $r3.getReference();
            bundle.putString("transaction_details_extra_reference", $r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2pSummaryFragment$applyViewData$1$1$1$1(TransactionResponse transactionResponse, P2pSummaryFragment p2pSummaryFragment) {
        super(0);
        this.index = transactionResponse;
        this.this$0 = p2pSummaryFragment;
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
        TransactionResponse $r1 = this.index;
        String $r2 = $r1.getReference();
        if ($r2 == null) {
            P2pSummaryFragment $r3 = this.this$0;
            FragmentActivity $r4 = $r3.requireActivity();
            Log_OC.loadImage($r4, "requireActivity()");
            ContextExtKt.launchActivity$default((Context) $r4, false, TransferActivity.class, (InterfaceC11767l) null, 5, (Object) null);
            return;
        }
        P2pSummaryFragment $r32 = this.this$0;
        FragmentActivity $r42 = $r32.requireActivity();
        Log_OC.loadImage($r42, "requireActivity()");
        TransactionResponse $r12 = this.index;
        C03571 $r5 = new C03571($r12);
        ContextExtKt.launchActivity$default((Context) $r42, false, TransactionDetailsActivity.class, (InterfaceC11767l) $r5, 1, (Object) null);
        P2pSummaryFragment $r33 = this.this$0;
        $r33.requireActivity().finish();
    }
}
