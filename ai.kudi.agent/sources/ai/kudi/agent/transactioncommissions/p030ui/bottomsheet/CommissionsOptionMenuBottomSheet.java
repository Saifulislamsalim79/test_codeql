package ai.kudi.agent.transactioncommissions.p030ui.bottomsheet;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.databinding.BottomSheetCommissionsOptionMenuBinding;
import ai.kudi.agent.transactioncommissions.p030ui.bottomsheet.CommissionsOptionMenuBottomSheet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.DialogC4547a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CommissionsOptionMenuBottomSheet.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/ui/bottomsheet/CommissionsOptionMenuBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "context", "Landroid/content/Context;", "listener", "Lai/kudi/agent/transactioncommissions/ui/bottomsheet/CommissionsOptionMenuBottomSheet$OnActionListener;", "(Landroid/content/Context;Lai/kudi/agent/transactioncommissions/ui/bottomsheet/CommissionsOptionMenuBottomSheet$OnActionListener;)V", "OnActionListener", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactioncommissions.ui.bottomsheet.CommissionsOptionMenuBottomSheet */
/* loaded from: classes.dex */
public final class CommissionsOptionMenuBottomSheet extends DialogC4547a {

    /* compiled from: CommissionsOptionMenuBottomSheet.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/ui/bottomsheet/CommissionsOptionMenuBottomSheet$OnActionListener;", "", "onCashout", "", "onFilter", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactioncommissions.ui.bottomsheet.CommissionsOptionMenuBottomSheet$OnActionListener */
    /* loaded from: classes.dex */
    public interface OnActionListener {
        void onCashout();

        void onFilter();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CommissionsOptionMenuBottomSheet(Context context, final OnActionListener onActionListener) {
        super(context, C0001R.style.FilterListDialog);
        Log_OC.getArray(context, "context");
        Log_OC.getArray(onActionListener, "listener");
        CommissionsOptionMenuBottomSheet r11 = this;
        LayoutInflater $r3 = r11.getLayoutInflater();
        BottomSheetCommissionsOptionMenuBinding $r4 = BottomSheetCommissionsOptionMenuBinding.inflate($r3, null, false);
        Log_OC.loadImage($r4, "inflate(layoutInflater, null, false)");
        LinearLayout $r5 = $r4.getRoot();
        setContentView($r5);
        TextView $r6 = $r4.filterTransactionsView;
        TextView r12 = $r6;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactioncommissions.ui.bottomsheet.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommissionsOptionMenuBottomSheet.OnActionListener $r2 = CommissionsOptionMenuBottomSheet.OnActionListener.this;
                CommissionsOptionMenuBottomSheet $r32 = this;
                CommissionsOptionMenuBottomSheet.m40993_init_$lambda0($r2, $r32, view);
            }
        });
        TextView $r62 = $r4.cashoutCommissionsView;
        TextView r122 = $r62;
        r122.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactioncommissions.ui.bottomsheet.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommissionsOptionMenuBottomSheet.OnActionListener $r2 = CommissionsOptionMenuBottomSheet.OnActionListener.this;
                CommissionsOptionMenuBottomSheet $r32 = this;
                CommissionsOptionMenuBottomSheet.m40994_init_$lambda1($r2, $r32, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m40993_init_$lambda0(OnActionListener onActionListener, CommissionsOptionMenuBottomSheet commissionsOptionMenuBottomSheet, View view) {
        Log_OC.getArray(onActionListener, "$listener");
        Log_OC.getArray(commissionsOptionMenuBottomSheet, "this$0");
        onActionListener.onFilter();
        CommissionsOptionMenuBottomSheet r3 = commissionsOptionMenuBottomSheet;
        r3.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-1  reason: not valid java name */
    public static final void m40994_init_$lambda1(OnActionListener onActionListener, CommissionsOptionMenuBottomSheet commissionsOptionMenuBottomSheet, View view) {
        Log_OC.getArray(onActionListener, "$listener");
        Log_OC.getArray(commissionsOptionMenuBottomSheet, "this$0");
        onActionListener.onCashout();
        CommissionsOptionMenuBottomSheet r3 = commissionsOptionMenuBottomSheet;
        r3.dismiss();
    }
}
