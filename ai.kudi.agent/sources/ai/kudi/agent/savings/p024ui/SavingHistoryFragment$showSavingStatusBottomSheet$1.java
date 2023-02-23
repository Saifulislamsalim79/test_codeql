package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.bottomSheets.models.C0757a;
import android.content.res.Resources;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13715n;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SavingHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingHistoryFragment$showSavingStatusBottomSheet$1 */
/* loaded from: classes.dex */
public final class SavingHistoryFragment$showSavingStatusBottomSheet$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ SavingHistoryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SavingHistoryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.STATUS, "", "<anonymous parameter 1>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.SavingHistoryFragment$showSavingStatusBottomSheet$1$1 */
    /* loaded from: classes.dex */
    public static final class C04721 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ SavingHistoryFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04721(SavingHistoryFragment savingHistoryFragment) {
            super(2);
            this.this$0 = savingHistoryFragment;
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
        /* JADX WARN: Incorrect condition in loop: B:7:0x0066 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(java.lang.String r17, int r18) {
            /*
                r16 = this;
                java.lang.String r1 = "status"
                r0 = r17
                kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
                r0 = r16
                ai.kudi.agent.savings.ui.SavingHistoryFragment r2 = r0.this$0
                r0 = r17
                java.lang.String r3 = ai.kudi.agent.savings.p024ui.SavingHistoryFragment.access$statusMapper(r2, r0)
                r0 = r16
                ai.kudi.agent.savings.ui.SavingHistoryFragment r2 = r0.this$0
                android.content.res.Resources r4 = r2.getResources()
                int r18 = ai.kudi.agent.savings.C0456R.array.saving_status
                r0 = r18
                java.lang.String[] r5 = r4.getStringArray(r0)
                java.lang.String r1 = "resources.getStringArray(R.array.saving_status)"
                kotlin.p483e0.p485d.Log_OC.loadImage(r5, r1)
                java.lang.Object r6 = kotlin.p557z.C13706j.m4076w(r5)
                boolean r7 = kotlin.p483e0.p485d.Log_OC.append(r3, r6)
                if (r7 == 0) goto L49
                r0 = r16
                ai.kudi.agent.savings.ui.SavingHistoryFragment r2 = r0.this$0
                ai.kudi.agent.savings.adapter.SavingsPlanAdapter r8 = ai.kudi.agent.savings.p024ui.SavingHistoryFragment.access$getAdapter$p(r2)
                java.util.ArrayList r9 = new java.util.ArrayList
                r0 = r16
                ai.kudi.agent.savings.ui.SavingHistoryFragment r2 = r0.this$0
                java.util.List r10 = ai.kudi.agent.savings.p024ui.SavingHistoryFragment.access$getHistory$p(r2)
                r9.<init>(r10)
                r8.submitList(r9)
                goto L86
            L49:
                r0 = r16
                ai.kudi.agent.savings.ui.SavingHistoryFragment r2 = r0.this$0
                ai.kudi.agent.savings.adapter.SavingsPlanAdapter r8 = ai.kudi.agent.savings.p024ui.SavingHistoryFragment.access$getAdapter$p(r2)
                r0 = r16
                ai.kudi.agent.savings.ui.SavingHistoryFragment r2 = r0.this$0
                java.util.List r10 = ai.kudi.agent.savings.p024ui.SavingHistoryFragment.access$getHistory$p(r2)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r11 = r10.iterator()
            L62:
                boolean r7 = r11.hasNext()
                if (r7 == 0) goto L7e
                java.lang.Object r6 = r11.next()
                r13 = r6
                ai.kudi.agent.savings.data.model.SavingResponse r13 = (ai.kudi.agent.savings.data.model.SavingResponse) r13
                r12 = r13
                java.lang.String r14 = r12.getStatus()
                boolean r7 = kotlin.p483e0.p485d.Log_OC.append(r14, r3)
                if (r7 == 0) goto L62
                r9.add(r6)
                goto L62
            L7e:
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>(r9)
                r8.submitList(r15)
            L86:
                r0 = r16
                ai.kudi.agent.savings.ui.SavingHistoryFragment r2 = r0.this$0
                r0 = r17
                ai.kudi.agent.savings.p024ui.SavingHistoryFragment.access$setSelectedDuration$p(r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.p024ui.SavingHistoryFragment$showSavingStatusBottomSheet$1.C04721.invoke(java.lang.String, int):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingHistoryFragment$showSavingStatusBottomSheet$1(SavingHistoryFragment savingHistoryFragment) {
        super(1);
        this.this$0 = savingHistoryFragment;
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
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C0757a c0757a) {
        List $r5;
        Log_OC.getArray(c0757a, "$this$$receiver");
        SavingHistoryFragment $r2 = this.this$0;
        Resources $r3 = $r2.getResources();
        int $i0 = C0456R.array.saving_status;
        String[] $r4 = $r3.getStringArray($i0);
        Log_OC.loadImage($r4, "resources.getStringArray(R.array.saving_status)");
        $r5 = C13715n.m4025Z($r4);
        c0757a.m38049e($r5);
        SavingHistoryFragment $r22 = this.this$0;
        String $r6 = $r22.selectedDuration;
        c0757a.m38048f($r6);
        SavingHistoryFragment $r23 = this.this$0;
        C04721 $r7 = new C04721($r23);
        c0757a.m38046h($r7);
    }
}
