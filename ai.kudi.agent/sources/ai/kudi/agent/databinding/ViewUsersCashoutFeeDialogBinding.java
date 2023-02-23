package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewUsersCashoutFeeDialogBinding implements InterfaceC8209a {
    public final TextView feesTextView;
    public final TextView instructionTextView;
    public final ProgressBar loadingProgressBar;
    public final Button proceedButton;
    private final ConstraintLayout rootView;

    private ViewUsersCashoutFeeDialogBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ProgressBar progressBar, Button button) {
        this.rootView = constraintLayout;
        this.feesTextView = textView;
        this.instructionTextView = textView2;
        this.loadingProgressBar = progressBar;
        this.proceedButton = button;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewUsersCashoutFeeDialogBinding bind(View view) {
        int $i0 = C0001R.C0003id.feesTextView;
        View $r1 = view.findViewById(C0001R.C0003id.feesTextView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.instructionTextView;
            View $r12 = view.findViewById(C0001R.C0003id.instructionTextView);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.loadingProgressBar;
                View $r13 = view.findViewById(C0001R.C0003id.loadingProgressBar);
                ProgressBar $r4 = (ProgressBar) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.proceedButton;
                    View $r14 = view.findViewById(C0001R.C0003id.proceedButton);
                    Button button = (Button) $r14;
                    if (button != null) {
                        ViewUsersCashoutFeeDialogBinding $r6 = new ViewUsersCashoutFeeDialogBinding((ConstraintLayout) view, $r2, $r3, $r4, button);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewUsersCashoutFeeDialogBinding inflate(LayoutInflater layoutInflater) {
        ViewUsersCashoutFeeDialogBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewUsersCashoutFeeDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_users_cashout_fee_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewUsersCashoutFeeDialogBinding $r3 = bind($r2);
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
