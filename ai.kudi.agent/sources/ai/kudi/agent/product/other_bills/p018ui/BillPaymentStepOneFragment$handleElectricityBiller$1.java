package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.bills.data.Product;
import ai.kudi.agent.collections.databinding.FragmentBillPaymentStepOneBinding;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.bottomSheets.models.C0757a;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.view.View;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillPaymentStepOneFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment$handleElectricityBiller$1 */
/* loaded from: classes.dex */
public final class BillPaymentStepOneFragment$handleElectricityBiller$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ Product $product;
    final /* synthetic */ BillPaymentStepOneFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BillPaymentStepOneFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.STATUS, "", "<anonymous parameter 1>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment$handleElectricityBiller$1$2 */
    /* loaded from: classes.dex */
    public static final class C04002 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ Product $product;
        final /* synthetic */ BillPaymentStepOneFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04002(BillPaymentStepOneFragment billPaymentStepOneFragment, Product product) {
            super(2);
            this.this$0 = billPaymentStepOneFragment;
            this.$product = product;
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
            FragmentBillPaymentStepOneBinding $r3 = $r2.requireBinding();
            KudiInputField $r4 = $r3.selectPlanView;
            $r4.setText(str);
            BillPaymentStepOneFragment $r22 = this.this$0;
            FragmentBillPaymentStepOneBinding $r32 = $r22.requireBinding();
            View $r5 = $r32.continueToNextPage;
            Log_OC.loadImage($r5, "requireBinding().continueToNextPage");
            View r10 = $r5;
            ViewExtKt.show(r10);
            BillPaymentStepOneFragment $r23 = this.this$0;
            $r23.lastSelectedStatus = str;
            BillPaymentStepOneFragment $r24 = this.this$0;
            BillsData $r6 = $r24.getBillsData();
            if ($r6 != null) {
                Product $r7 = this.$product;
                Integer $r8 = $r7.getAmount();
                int $i0 = $r8 == null ? 0 : $r8.intValue();
                $r6.setAmount($i0);
            }
            BillPaymentStepOneFragment $r25 = this.this$0;
            BillsData $r62 = $r25.getBillsData();
            if ($r62 != null) {
                Product $r72 = this.$product;
                String $r9 = $r72.getId();
                $r62.setId($r9);
            }
            BillPaymentStepOneFragment $r26 = this.this$0;
            BillsData $r63 = $r26.getBillsData();
            if ($r63 != null) {
                Product $r73 = this.$product;
                String $r92 = $r73.getType();
                $r63.setType($r92);
            }
            BillPaymentStepOneFragment $r27 = this.this$0;
            BillsData $r64 = $r27.getBillsData();
            if ($r64 == null) {
                return;
            }
            $r64.setSelectedMeterType(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillPaymentStepOneFragment$handleElectricityBiller$1(Product product, BillPaymentStepOneFragment billPaymentStepOneFragment) {
        super(1);
        this.$product = product;
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
    /* JADX WARN: Incorrect condition in loop: B:4:0x0026 */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(ai.kudi.dip.library.bottomSheets.models.C0757a r21) {
        /*
            r20 = this;
            java.lang.String r2 = "$this$$receiver"
            r0 = r21
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            r0 = r20
            ai.kudi.agent.bills.data.Product r3 = r0.$product
            java.util.List r4 = r3.getTypes()
            java.util.List r4 = kotlin.p557z.C13722p.m3970D0(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r6 = kotlin.p557z.C13722p.m3921o(r4, r7)
            r5.<init>(r6)
            java.util.Iterator r8 = r4.iterator()
        L22:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L8a
            java.lang.Object r10 = r8.next()
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
            r11 = r12
            int r6 = r11.length()
            if (r6 <= 0) goto L38
            r9 = 1
            goto L39
        L38:
            r9 = 0
        L39:
            if (r9 == 0) goto L86
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r7 = 0
            char r14 = r11.charAt(r7)
            boolean r9 = java.lang.Character.isLowerCase(r14)
            if (r9 == 0) goto L59
            java.util.Locale r15 = java.util.Locale.getDefault()
            java.lang.String r2 = "getDefault()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r15, r2)
            java.lang.String r16 = kotlin.p549l0.C13251a.m5551d(r14, r15)
            goto L5d
        L59:
            java.lang.String r16 = java.lang.String.valueOf(r14)
        L5d:
            r0 = r16
            java.lang.String r16 = r0.toString()
            r0 = r16
            r13.append(r0)
            if (r11 == 0) goto L7c
            r7 = 1
            java.lang.String r11 = r11.substring(r7)
            java.lang.String r2 = "(this as java.lang.String).substring(startIndex)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r11, r2)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            goto L86
        L7c:
            java.lang.NullPointerException r17 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r0 = r17
            r0.<init>(r2)
            throw r17
        L86:
            r5.add(r11)
            goto L22
        L8a:
            r0 = r21
            r0.m38049e(r5)
            r0 = r20
            ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment r0 = r0.this$0
            r18 = r0
            java.lang.String r11 = ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment.access$getLastSelectedStatus$p(r0)
            r0 = r21
            r0.m38048f(r11)
            ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment$handleElectricityBiller$1$2 r19 = new ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment$handleElectricityBiller$1$2
            r0 = r20
            ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment r0 = r0.this$0
            r18 = r0
            r0 = r20
            ai.kudi.agent.bills.data.Product r3 = r0.$product
            r0 = r19
            r1 = r18
            r0.<init>(r1, r3)
            r0 = r21
            r1 = r19
            r0.m38046h(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment$handleElectricityBiller$1.invoke2(ai.kudi.dip.library.bottomSheets.models.a):void");
    }
}
