package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class BottomSheetCashInsuranceOptionMenuBinding implements InterfaceC8209a {
    public final AppCompatTextView deactivateInsuranceView;
    private final LinearLayout rootView;

    private BottomSheetCashInsuranceOptionMenuBinding(LinearLayout linearLayout, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.deactivateInsuranceView = appCompatTextView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetCashInsuranceOptionMenuBinding bind(View view) {
        View $r1 = view.findViewById(C0001R.C0003id.deactivate_insurance_view);
        AppCompatTextView $r2 = (AppCompatTextView) $r1;
        if ($r2 != null) {
            LinearLayout $r4 = (LinearLayout) view;
            BottomSheetCashInsuranceOptionMenuBinding $r3 = new BottomSheetCashInsuranceOptionMenuBinding($r4, $r2);
            return $r3;
        }
        Resources $r5 = view.getResources();
        String $r6 = $r5.getResourceName(C0001R.C0003id.deactivate_insurance_view);
        NullPointerException $r7 = new NullPointerException("Missing required view with ID: ".concat($r6));
        throw $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetCashInsuranceOptionMenuBinding inflate(LayoutInflater layoutInflater) {
        BottomSheetCashInsuranceOptionMenuBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetCashInsuranceOptionMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.bottom_sheet_cash_insurance_option_menu, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        BottomSheetCashInsuranceOptionMenuBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
