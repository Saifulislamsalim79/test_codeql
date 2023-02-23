package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class SheetSavingsMenuBinding implements InterfaceC8209a {
    public final CardView cardView;
    public final ImageView close;
    private final LinearLayout rootView;
    public final AppCompatTextView tvDeactivate;
    public final AppCompatTextView tvViewHistory;
    public final AppCompatTextView tvWithdraw;
    public final View view2;
    public final View view3;

    private SheetSavingsMenuBinding(LinearLayout linearLayout, CardView cardView, ImageView imageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, View view, View view2) {
        this.rootView = linearLayout;
        this.cardView = cardView;
        this.close = imageView;
        this.tvDeactivate = appCompatTextView;
        this.tvViewHistory = appCompatTextView2;
        this.tvWithdraw = appCompatTextView3;
        this.view2 = view;
        this.view3 = view2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SheetSavingsMenuBinding bind(View view) {
        View $r1;
        View $r7;
        int $i0 = C0456R.C0458id.cardView;
        View $r12 = view.findViewById($i0);
        CardView $r2 = (CardView) $r12;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.close;
            View $r13 = view.findViewById($i0);
            ImageView $r3 = (ImageView) $r13;
            if ($r3 != null) {
                $i0 = C0456R.C0458id.tvDeactivate;
                View $r14 = view.findViewById($i0);
                AppCompatTextView appCompatTextView = (AppCompatTextView) $r14;
                if (appCompatTextView != null) {
                    $i0 = C0456R.C0458id.tvViewHistory;
                    View $r15 = view.findViewById($i0);
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) $r15;
                    if (appCompatTextView2 != null) {
                        $i0 = C0456R.C0458id.tvWithdraw;
                        View $r16 = view.findViewById($i0);
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) $r16;
                        if (appCompatTextView3 != null && ($r1 = view.findViewById(($i0 = C0456R.C0458id.view2))) != null && ($r7 = view.findViewById(($i0 = C0456R.C0458id.view3))) != null) {
                            LinearLayout $r9 = (LinearLayout) view;
                            SheetSavingsMenuBinding $r8 = new SheetSavingsMenuBinding($r9, $r2, $r3, appCompatTextView, appCompatTextView2, appCompatTextView3, $r1, $r7);
                            return $r8;
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SheetSavingsMenuBinding inflate(LayoutInflater layoutInflater) {
        SheetSavingsMenuBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SheetSavingsMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.sheet_savings_menu;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        SheetSavingsMenuBinding $r3 = bind($r2);
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
