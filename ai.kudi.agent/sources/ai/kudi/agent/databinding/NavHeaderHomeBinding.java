package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class NavHeaderHomeBinding implements InterfaceC8209a {
    public final TextView accountNumberTextView;
    public final TextView bankNameTextView;
    public final TextView copyKtaButton;
    public final Guideline guideline3;
    public final TextView ktaDetailsLabel;
    public final LinearLayout linearLayout5;
    private final ConstraintLayout rootView;
    public final TextView viewAllButton;

    private NavHeaderHomeBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, Guideline guideline, TextView textView4, LinearLayout linearLayout, TextView textView5) {
        this.rootView = constraintLayout;
        this.accountNumberTextView = textView;
        this.bankNameTextView = textView2;
        this.copyKtaButton = textView3;
        this.guideline3 = guideline;
        this.ktaDetailsLabel = textView4;
        this.linearLayout5 = linearLayout;
        this.viewAllButton = textView5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NavHeaderHomeBinding bind(View view) {
        int $i0 = C0001R.C0003id.accountNumberTextView;
        View $r1 = view.findViewById(C0001R.C0003id.accountNumberTextView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.bankNameTextView;
            View $r12 = view.findViewById(C0001R.C0003id.bankNameTextView);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.copyKtaButton;
                View $r13 = view.findViewById(C0001R.C0003id.copyKtaButton);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0001R.C0003id.guideline3;
                    View $r14 = view.findViewById(C0001R.C0003id.guideline3);
                    Guideline guideline = (Guideline) $r14;
                    if (guideline != null) {
                        $i0 = C0001R.C0003id.kta_details_label;
                        View $r15 = view.findViewById(C0001R.C0003id.kta_details_label);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.linearLayout5;
                            View $r16 = view.findViewById(C0001R.C0003id.linearLayout5);
                            LinearLayout linearLayout = (LinearLayout) $r16;
                            if (linearLayout != null) {
                                $i0 = C0001R.C0003id.viewAllButton;
                                View $r17 = view.findViewById(C0001R.C0003id.viewAllButton);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    ConstraintLayout $r10 = (ConstraintLayout) view;
                                    NavHeaderHomeBinding $r9 = new NavHeaderHomeBinding($r10, $r2, $r3, textView, guideline, textView2, linearLayout, $r8);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NavHeaderHomeBinding inflate(LayoutInflater layoutInflater) {
        NavHeaderHomeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NavHeaderHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.nav_header_home, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        NavHeaderHomeBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}
