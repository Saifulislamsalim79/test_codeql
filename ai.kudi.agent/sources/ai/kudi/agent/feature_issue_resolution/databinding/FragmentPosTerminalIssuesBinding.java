package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPosTerminalIssuesBinding implements InterfaceC8209a {
    public final TextView cancelTextView;
    public final KudiInputField deliveryAddressView;
    private final ConstraintLayout rootView;
    public final KudiButton submitIssueButton;
    public final TextView textView31;

    private FragmentPosTerminalIssuesBinding(ConstraintLayout constraintLayout, TextView textView, KudiInputField kudiInputField, KudiButton kudiButton, TextView textView2) {
        this.rootView = constraintLayout;
        this.cancelTextView = textView;
        this.deliveryAddressView = kudiInputField;
        this.submitIssueButton = kudiButton;
        this.textView31 = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosTerminalIssuesBinding bind(View view) {
        int $i0 = C0214R.C0216id.cancelTextView;
        View $r1 = view.findViewById($i0);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.deliveryAddressView;
            View $r12 = view.findViewById($i0);
            KudiInputField $r3 = (KudiInputField) $r12;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.submitIssueButton;
                View $r13 = view.findViewById($i0);
                KudiButton $r4 = (KudiButton) $r13;
                if ($r4 != null) {
                    $i0 = C0214R.C0216id.textView31;
                    View $r14 = view.findViewById($i0);
                    TextView $r5 = (TextView) $r14;
                    if ($r5 != null) {
                        FragmentPosTerminalIssuesBinding $r6 = new FragmentPosTerminalIssuesBinding((ConstraintLayout) view, $r2, $r3, $r4, $r5);
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
    public static FragmentPosTerminalIssuesBinding inflate(LayoutInflater layoutInflater) {
        FragmentPosTerminalIssuesBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosTerminalIssuesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_pos_terminal_issues;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPosTerminalIssuesBinding $r3 = bind($r2);
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
