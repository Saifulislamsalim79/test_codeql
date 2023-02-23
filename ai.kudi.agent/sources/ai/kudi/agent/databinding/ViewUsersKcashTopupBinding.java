package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.custom.views.SelectView;
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
public final class ViewUsersKcashTopupBinding implements InterfaceC8209a {
    public final TextView bankInstructionsTextView;
    public final SelectView bankSelectView;
    public final ProgressBar loadingProgressBar;
    private final ConstraintLayout rootView;
    public final TextView selectBankDescription;
    public final Button topupButton;

    private ViewUsersKcashTopupBinding(ConstraintLayout constraintLayout, TextView textView, SelectView selectView, ProgressBar progressBar, TextView textView2, Button button) {
        this.rootView = constraintLayout;
        this.bankInstructionsTextView = textView;
        this.bankSelectView = selectView;
        this.loadingProgressBar = progressBar;
        this.selectBankDescription = textView2;
        this.topupButton = button;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewUsersKcashTopupBinding bind(View view) {
        int $i0 = C0001R.C0003id.bankInstructionsTextView;
        View $r1 = view.findViewById(C0001R.C0003id.bankInstructionsTextView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.bankSelectView;
            View $r12 = view.findViewById(C0001R.C0003id.bankSelectView);
            SelectView $r3 = (SelectView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.loadingProgressBar;
                View $r13 = view.findViewById(C0001R.C0003id.loadingProgressBar);
                ProgressBar $r4 = (ProgressBar) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.selectBankDescription;
                    View $r14 = view.findViewById(C0001R.C0003id.selectBankDescription);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.topupButton;
                        View $r15 = view.findViewById(C0001R.C0003id.topupButton);
                        Button button = (Button) $r15;
                        if (button != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            ViewUsersKcashTopupBinding $r7 = new ViewUsersKcashTopupBinding($r8, $r2, $r3, $r4, textView, button);
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
    public static ViewUsersKcashTopupBinding inflate(LayoutInflater layoutInflater) {
        ViewUsersKcashTopupBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewUsersKcashTopupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_users__kcash_topup, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewUsersKcashTopupBinding $r3 = bind($r2);
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
