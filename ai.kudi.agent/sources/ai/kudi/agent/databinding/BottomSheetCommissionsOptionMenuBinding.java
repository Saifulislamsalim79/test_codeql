package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class BottomSheetCommissionsOptionMenuBinding implements InterfaceC8209a {
    public final AppCompatTextView cashoutCommissionsView;
    public final AppCompatTextView filterTransactionsView;
    public final CardView notch;
    private final LinearLayout rootView;

    private BottomSheetCommissionsOptionMenuBinding(LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, CardView cardView) {
        this.rootView = linearLayout;
        this.cashoutCommissionsView = appCompatTextView;
        this.filterTransactionsView = appCompatTextView2;
        this.notch = cardView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetCommissionsOptionMenuBinding bind(View view) {
        int $i0 = C0001R.C0003id.cashout_commissions_view;
        View $r1 = view.findViewById(C0001R.C0003id.cashout_commissions_view);
        AppCompatTextView $r2 = (AppCompatTextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.filter_transactions_view;
            View $r12 = view.findViewById(C0001R.C0003id.filter_transactions_view);
            AppCompatTextView $r3 = (AppCompatTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.notch;
                View $r13 = view.findViewById(C0001R.C0003id.notch);
                CardView $r4 = (CardView) $r13;
                if ($r4 != null) {
                    LinearLayout $r6 = (LinearLayout) view;
                    BottomSheetCommissionsOptionMenuBinding $r5 = new BottomSheetCommissionsOptionMenuBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetCommissionsOptionMenuBinding inflate(LayoutInflater layoutInflater) {
        BottomSheetCommissionsOptionMenuBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetCommissionsOptionMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.bottom_sheet_commissions_option_menu, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        BottomSheetCommissionsOptionMenuBinding $r3 = bind($r2);
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
