package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentLoanApplicationSubmittedBinding implements InterfaceC8209a {
    public final KudiButton checkStatusButton;
    public final AppCompatImageButton closeButton;
    public final AppCompatImageView iconSuccess;
    private final ConstraintLayout rootView;
    public final TextView titleMsg;
    public final TextView titleText;

    private FragmentLoanApplicationSubmittedBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, AppCompatImageButton appCompatImageButton, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.checkStatusButton = kudiButton;
        this.closeButton = appCompatImageButton;
        this.iconSuccess = appCompatImageView;
        this.titleMsg = textView;
        this.titleText = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoanApplicationSubmittedBinding bind(View view) {
        int $i0 = C0220R.C0222id.check_status_button;
        View $r1 = view.findViewById($i0);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.close_button;
            View $r12 = view.findViewById($i0);
            AppCompatImageButton $r3 = (AppCompatImageButton) $r12;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.icon_success;
                View $r13 = view.findViewById($i0);
                AppCompatImageView $r4 = (AppCompatImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0220R.C0222id.title_msg;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0220R.C0222id.title_text;
                        View $r15 = view.findViewById($i0);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            FragmentLoanApplicationSubmittedBinding $r7 = new FragmentLoanApplicationSubmittedBinding((ConstraintLayout) view, $r2, $r3, $r4, textView, textView2);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoanApplicationSubmittedBinding inflate(LayoutInflater layoutInflater) {
        FragmentLoanApplicationSubmittedBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoanApplicationSubmittedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_loan_application_submitted;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentLoanApplicationSubmittedBinding $r3 = bind($r2);
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
