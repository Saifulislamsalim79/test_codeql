package ai.kudi.agent.settings.insurance.p026ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.databinding.BottomSheetCashInsuranceOptionMenuBinding;
import ai.kudi.agent.settings.insurance.p026ui.CashInsuranceOptionMenuBottomSheet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.DialogC4547a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CashInsuranceOptionMenuBottomSheet.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/ui/CashInsuranceOptionMenuBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "context", "Landroid/content/Context;", "listener", "Lai/kudi/agent/settings/insurance/ui/CashInsuranceOptionMenuBottomSheet$OnActionListener;", "(Landroid/content/Context;Lai/kudi/agent/settings/insurance/ui/CashInsuranceOptionMenuBottomSheet$OnActionListener;)V", "OnActionListener", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.insurance.ui.CashInsuranceOptionMenuBottomSheet */
/* loaded from: classes.dex */
public final class CashInsuranceOptionMenuBottomSheet extends DialogC4547a {

    /* compiled from: CashInsuranceOptionMenuBottomSheet.kt */
    @Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/ui/CashInsuranceOptionMenuBottomSheet$OnActionListener;", "", "onDeactivateInsurance", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.insurance.ui.CashInsuranceOptionMenuBottomSheet$OnActionListener */
    /* loaded from: classes.dex */
    public interface OnActionListener {
        void onDeactivateInsurance();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CashInsuranceOptionMenuBottomSheet(Context context, final OnActionListener onActionListener) {
        super(context, C0001R.style.FilterListDialog);
        Log_OC.getArray(context, "context");
        Log_OC.getArray(onActionListener, "listener");
        CashInsuranceOptionMenuBottomSheet r9 = this;
        LayoutInflater $r3 = r9.getLayoutInflater();
        BottomSheetCashInsuranceOptionMenuBinding $r4 = BottomSheetCashInsuranceOptionMenuBinding.inflate($r3, null, false);
        Log_OC.loadImage($r4, "inflate(layoutInflater, null, false)");
        LinearLayout $r5 = $r4.getRoot();
        setContentView($r5);
        TextView $r6 = $r4.deactivateInsuranceView;
        TextView r10 = $r6;
        r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.insurance.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashInsuranceOptionMenuBottomSheet.OnActionListener $r2 = CashInsuranceOptionMenuBottomSheet.OnActionListener.this;
                CashInsuranceOptionMenuBottomSheet $r32 = this;
                CashInsuranceOptionMenuBottomSheet.m40787_init_$lambda0($r2, $r32, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m40787_init_$lambda0(OnActionListener onActionListener, CashInsuranceOptionMenuBottomSheet cashInsuranceOptionMenuBottomSheet, View view) {
        Log_OC.getArray(onActionListener, "$listener");
        Log_OC.getArray(cashInsuranceOptionMenuBottomSheet, "this$0");
        onActionListener.onDeactivateInsurance();
        CashInsuranceOptionMenuBottomSheet r3 = cashInsuranceOptionMenuBottomSheet;
        r3.dismiss();
    }
}
