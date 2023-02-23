package ai.kudi.agent.transactionstatus.summary.p033ui;

import android.os.Bundle;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransferSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment$navigateToTransactionStatusPage$1 */
/* loaded from: classes.dex */
final class TransferSummaryFragment$navigateToTransactionStatusPage$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ String $transactionReference;
    final /* synthetic */ TransferSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransferSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment$navigateToTransactionStatusPage$1$1 */
    /* loaded from: classes.dex */
    public static final class C06441 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
        final /* synthetic */ String $transactionReference;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06441(String str) {
            super(1);
            this.$transactionReference = str;
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
            String $r2 = this.$transactionReference;
            bundle.putString("transaction_details_extra_reference", $r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferSummaryFragment$navigateToTransactionStatusPage$1(TransferSummaryFragment transferSummaryFragment, String str) {
        super(0);
        this.this$0 = transferSummaryFragment;
        this.$transactionReference = str;
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
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2() {
        /*
            r22 = this;
            r0 = r22
            ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment r6 = r0.this$0
            boolean r7 = ai.kudi.agent.transactionstatus.summary.p033ui.TransferSummaryFragment.access$isCashOutFlow$p(r6)
            if (r7 == 0) goto L22
            r0 = r22
            ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment r6 = r0.this$0
            r9 = r6
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            r8 = r9
            r10 = 1
            java.lang.Class<ai.kudi.agent.home.HomeActivity> r11 = ai.kudi.agent.home.HomeActivity.class
            r12 = 0
            r13 = 4
            r14 = 0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            ai.kudi.agent.core.util.ContextExtKt.launchActivity$default(r0, r1, r2, r3, r4, r5)
            return
        L22:
            r0 = r22
            java.lang.String r15 = r0.$transactionReference
            if (r15 == 0) goto L31
            boolean r7 = kotlin.p549l0.C13265j.m5470u(r15)
            if (r7 == 0) goto L2f
            goto L31
        L2f:
            r7 = 0
            goto L32
        L31:
            r7 = 1
        L32:
            if (r7 == 0) goto L61
            r0 = r22
            ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment r6 = r0.this$0
            r16 = r6
            androidx.fragment.app.Fragment r16 = (androidx.fragment.app.Fragment) r16
            r8 = r16
            r10 = 0
            java.lang.Class<ai.kudi.agent.transfer.ui.TransferActivity> r11 = ai.kudi.agent.transfer.p034ui.TransferActivity.class
            r12 = 0
            r13 = 5
            r14 = 0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            ai.kudi.agent.core.util.ContextExtKt.launchActivity$default(r0, r1, r2, r3, r4, r5)
            r0 = r22
            ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment r6 = r0.this$0
            r17 = r6
            androidx.fragment.app.Fragment r17 = (androidx.fragment.app.Fragment) r17
            r8 = r17
            androidx.fragment.app.FragmentActivity r18 = r8.requireActivity()
            r0 = r18
            r0.finish()
            return
        L61:
            r0 = r22
            ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment r6 = r0.this$0
            ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment$navigateToTransactionStatusPage$1$1 r19 = new ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment$navigateToTransactionStatusPage$1$1
            r0 = r22
            java.lang.String r15 = r0.$transactionReference
            r0 = r19
            r0.<init>(r15)
            r20 = r6
            androidx.fragment.app.Fragment r20 = (androidx.fragment.app.Fragment) r20
            r8 = r20
            r10 = 0
            java.lang.Class<ai.kudi.agent.transactions.ui.TransactionDetailsActivity> r11 = ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity.class
            r13 = 1
            r12 = 0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r19
            r4 = r13
            r5 = r12
            ai.kudi.agent.core.util.ContextExtKt.launchActivity$default(r0, r1, r2, r3, r4, r5)
            r0 = r22
            ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment r6 = r0.this$0
            r21 = r6
            androidx.fragment.app.Fragment r21 = (androidx.fragment.app.Fragment) r21
            r8 = r21
            androidx.fragment.app.FragmentActivity r18 = r8.requireActivity()
            r0 = r18
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionstatus.summary.p033ui.TransferSummaryFragment$navigateToTransactionStatusPage$1.invoke2():void");
    }
}
