package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.bills.data.Product;
import ai.kudi.agent.collections.databinding.FragmentBillPaymentStepOneBinding;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.bottomSheets.models.C0757a;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.view.View;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillPaymentStepOneFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment$showProducts$1 */
/* loaded from: classes.dex */
public final class BillPaymentStepOneFragment$showProducts$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ List<Product> $products;
    final /* synthetic */ BillPaymentStepOneFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BillPaymentStepOneFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.STATUS, "", "position", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment$showProducts$1$2 */
    /* loaded from: classes.dex */
    public static final class C04012 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ List<Product> $products;
        final /* synthetic */ BillPaymentStepOneFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04012(BillPaymentStepOneFragment billPaymentStepOneFragment, List list) {
            super(2);
            this.this$0 = billPaymentStepOneFragment;
            this.$products = list;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(String str, Integer num) {
            String $r3 = str;
            Integer $r4 = num;
            int $i0 = $r4.intValue();
            invoke($r3, $i0);
            C13666w r5 = C13666w.f30112a;
            return r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void invoke(String str, int i) {
            Log_OC.getArray(str, TransactionField.STATUS);
            BillPaymentStepOneFragment $r2 = this.this$0;
            $r2.lastSelectedStatus = str;
            List $r3 = this.$products;
            Object $r4 = $r3.get(i);
            Product $r5 = (Product) $r4;
            BillPaymentStepOneFragment $r22 = this.this$0;
            FragmentBillPaymentStepOneBinding $r6 = $r22.requireBinding();
            KudiInputField $r7 = $r6.selectPlanView;
            String $r1 = $r5.getName();
            $r7.setText($r1);
            BillPaymentStepOneFragment $r23 = this.this$0;
            FragmentBillPaymentStepOneBinding $r62 = $r23.requireBinding();
            View $r8 = $r62.continueToNextPage;
            Log_OC.loadImage($r8, "requireBinding().continueToNextPage");
            View r11 = $r8;
            ViewExtKt.show(r11);
            BillPaymentStepOneFragment $r24 = this.this$0;
            BillsData $r9 = $r24.getBillsData();
            if ($r9 != null) {
                Integer $r10 = $r5.getAmount();
                Log_OC.append($r10);
                int $i0 = $r10.intValue();
                $r9.setAmount($i0);
            }
            BillPaymentStepOneFragment $r25 = this.this$0;
            BillsData $r92 = $r25.getBillsData();
            if ($r92 != null) {
                String $r12 = $r5.getId();
                $r92.setId($r12);
            }
            BillPaymentStepOneFragment $r26 = this.this$0;
            BillsData $r93 = $r26.getBillsData();
            if ($r93 == null) {
                return;
            }
            String $r13 = $r5.getType();
            $r93.setType($r13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillPaymentStepOneFragment$showProducts$1(List list, BillPaymentStepOneFragment billPaymentStepOneFragment) {
        super(1);
        this.$products = list;
        this.this$0 = billPaymentStepOneFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(C0757a c0757a) {
        C0757a $r2 = c0757a;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0023 */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(ai.kudi.dip.library.bottomSheets.models.C0757a r23) {
        /*
            r22 = this;
            java.lang.String r2 = "$this$$receiver"
            r0 = r23
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            r0 = r22
            java.util.List<ai.kudi.agent.bills.data.Product> r3 = r0.$products
            r0 = r22
            ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment r4 = r0.this$0
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = r5
            r8 = 10
            int r7 = kotlin.p557z.C13722p.m3921o(r3, r8)
            r5.<init>(r7)
            java.util.Iterator r9 = r3.iterator()
        L1f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L6d
            java.lang.Object r11 = r9.next()
            r13 = r11
            ai.kudi.agent.bills.data.Product r13 = (ai.kudi.agent.bills.data.Product) r13
            r12 = r13
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r15 = r14
            r14.<init>()
            java.lang.String r16 = r12.getName()
            r0 = r16
            r15.append(r0)
            java.lang.String r2 = " - "
            r15.append(r2)
            r18 = r4
            androidx.fragment.app.Fragment r18 = (androidx.fragment.app.Fragment) r18
            r17 = r18
            r0 = r17
            android.content.res.Resources r19 = r0.getResources()
            int r7 = ai.kudi.agent.collections.R$string.naira_symbol
            r0 = r19
            java.lang.String r16 = r0.getString(r7)
            r0 = r16
            r15.append(r0)
            java.lang.Integer r20 = r12.getAmount()
            r0 = r20
            r15.append(r0)
            java.lang.String r16 = r15.toString()
            r0 = r16
            r6.add(r0)
            goto L1f
        L6d:
            r0 = r23
            r0.m38049e(r6)
            r0 = r22
            ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment r4 = r0.this$0
            java.lang.String r16 = ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment.access$getLastSelectedStatus$p(r4)
            r0 = r23
            r1 = r16
            r0.m38048f(r1)
            ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment$showProducts$1$2 r21 = new ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment$showProducts$1$2
            r0 = r22
            ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment r4 = r0.this$0
            r0 = r22
            java.util.List<ai.kudi.agent.bills.data.Product> r3 = r0.$products
            r0 = r21
            r0.<init>(r4, r3)
            r0 = r23
            r1 = r21
            r0.m38046h(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment$showProducts$1.invoke2(ai.kudi.dip.library.bottomSheets.models.a):void");
    }
}
