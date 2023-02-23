package ai.kudi.agent.savings.p024ui;

import android.view.View;
import com.google.android.material.bottomsheet.DialogC4547a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SavingsMenuBottomSheet.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsMenuBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "context", "Landroid/content/Context;", "hideWithdrawOption", "", "listener", "Lai/kudi/agent/savings/ui/SavingsMenuBottomSheet$SavingMenuItemClicked;", "(Landroid/content/Context;ZLai/kudi/agent/savings/ui/SavingsMenuBottomSheet$SavingMenuItemClicked;)V", "SavingMenuItemClicked", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingsMenuBottomSheet */
/* loaded from: classes.dex */
public final class SavingsMenuBottomSheet extends DialogC4547a {

    /* compiled from: SavingsMenuBottomSheet.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsMenuBottomSheet$SavingMenuItemClicked;", "", "onDeactivatePlanClicked", "", "onWithDrawClicked", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.SavingsMenuBottomSheet$SavingMenuItemClicked */
    /* loaded from: classes.dex */
    public interface SavingMenuItemClicked {
        void onDeactivatePlanClicked();

        void onWithDrawClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SavingsMenuBottomSheet(android.content.Context r25, boolean r26, final ai.kudi.agent.savings.p024ui.SavingsMenuBottomSheet.SavingMenuItemClicked r27) {
        /*
            r24 = this;
            java.lang.String r3 = "context"
            r0 = r25
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r3)
            java.lang.String r3 = "listener"
            r0 = r27
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r3)
            int r4 = ai.kudi.agent.savings.C0456R.style.FilterListDialog
            r0 = r24
            r1 = r25
            r0.<init>(r1, r4)
            r6 = r24
            android.app.Dialog r6 = (android.app.Dialog) r6
            r5 = r6
            android.view.LayoutInflater r7 = r5.getLayoutInflater()
            r9 = 0
            r10 = 0
            ai.kudi.agent.savings.databinding.SheetSavingsMenuBinding r8 = ai.kudi.agent.savings.databinding.SheetSavingsMenuBinding.inflate(r7, r9, r10)
            java.lang.String r3 = "inflate(layoutInflater, null, false)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r8, r3)
            android.widget.LinearLayout r11 = r8.getRoot()
            r0 = r24
            r0.setContentView(r11)
            androidx.appcompat.widget.AppCompatTextView r12 = r8.tvDeactivate
            ai.kudi.agent.savings.ui.e r13 = new ai.kudi.agent.savings.ui.e
            r0 = r27
            r1 = r24
            r13.<init>()
            r15 = r12
            android.widget.TextView r15 = (android.widget.TextView) r15
            r14 = r15
            r14.setOnClickListener(r13)
            if (r26 == 0) goto L78
            android.view.View r0 = r8.view2
            r16 = r0
            java.lang.String r3 = "bottomView.view2"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r3)
            r10 = 0
            r17 = 1
            r9 = 0
            r0 = r16
            r1 = r17
            ai.kudi.agent.core.util.ViewExtKt.hide$default(r0, r10, r1, r9)
            androidx.appcompat.widget.AppCompatTextView r12 = r8.tvWithdraw
            java.lang.String r3 = "bottomView.tvWithdraw"
            kotlin.p483e0.p485d.Log_OC.loadImage(r12, r3)
            r18 = r12
            android.view.View r18 = (android.view.View) r18
            r16 = r18
            r10 = 0
            r17 = 1
            r9 = 0
            r0 = r16
            r1 = r17
            ai.kudi.agent.core.util.ViewExtKt.hide$default(r0, r10, r1, r9)
        L78:
            androidx.appcompat.widget.AppCompatTextView r12 = r8.tvWithdraw
            ai.kudi.agent.savings.ui.NumberPicker r19 = new ai.kudi.agent.savings.ui.NumberPicker
            r0 = r19
            r1 = r27
            r2 = r24
            r0.<init>()
            r20 = r12
            android.widget.TextView r20 = (android.widget.TextView) r20
            r14 = r20
            r0 = r19
            r14.setOnClickListener(r0)
            android.widget.ImageView r0 = r8.close
            r21 = r0
            ai.kudi.agent.savings.ui.DashboardFragment$1 r22 = new ai.kudi.agent.savings.ui.DashboardFragment$1
            r0 = r22
            r1 = r24
            r0.<init>()
            r0 = r21
            r1 = r22
            r0.setOnClickListener(r1)
            androidx.appcompat.widget.AppCompatTextView r12 = r8.tvViewHistory
            java.lang.String r3 = "bottomView.tvViewHistory"
            kotlin.p483e0.p485d.Log_OC.loadImage(r12, r3)
            r23 = r12
            android.view.View r23 = (android.view.View) r23
            r16 = r23
            r10 = 0
            r17 = 1
            r9 = 0
            r0 = r16
            r1 = r17
            ai.kudi.agent.core.util.ViewExtKt.hide$default(r0, r10, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.p024ui.SavingsMenuBottomSheet.<init>(android.content.Context, boolean, ai.kudi.agent.savings.ui.SavingsMenuBottomSheet$SavingMenuItemClicked):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-0 */
    public static final void m40545_init_$lambda0(SavingMenuItemClicked savingMenuItemClicked, SavingsMenuBottomSheet savingsMenuBottomSheet, View view) {
        Log_OC.getArray(savingMenuItemClicked, "$listener");
        Log_OC.getArray(savingsMenuBottomSheet, "this$0");
        savingMenuItemClicked.onDeactivatePlanClicked();
        SavingsMenuBottomSheet r3 = savingsMenuBottomSheet;
        r3.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-1 */
    public static final void m40546_init_$lambda1(SavingMenuItemClicked savingMenuItemClicked, SavingsMenuBottomSheet savingsMenuBottomSheet, View view) {
        Log_OC.getArray(savingMenuItemClicked, "$listener");
        Log_OC.getArray(savingsMenuBottomSheet, "this$0");
        savingMenuItemClicked.onWithDrawClicked();
        SavingsMenuBottomSheet r3 = savingsMenuBottomSheet;
        r3.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-2 */
    public static final void m40547_init_$lambda2(SavingsMenuBottomSheet savingsMenuBottomSheet, View view) {
        Log_OC.getArray(savingsMenuBottomSheet, "this$0");
        SavingsMenuBottomSheet r2 = savingsMenuBottomSheet;
        r2.dismiss();
    }

    /* renamed from: b */
    public static /* synthetic */ void m38488b(SavingMenuItemClicked savingMenuItemClicked, SavingsMenuBottomSheet savingsMenuBottomSheet, View view) {
        m40546_init_$lambda1(savingMenuItemClicked, savingsMenuBottomSheet, view);
    }
}
