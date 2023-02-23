package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivitySetupAgentAccountBinding implements InterfaceC8209a {
    public final TextView errorTextView;
    public final ProgressBar progressBar;
    public final KudiButton retryButton;
    private final ConstraintLayout rootView;
    public final TextView statusTextView;

    private ActivitySetupAgentAccountBinding(ConstraintLayout constraintLayout, TextView textView, ProgressBar progressBar, KudiButton kudiButton, TextView textView2) {
        this.rootView = constraintLayout;
        this.errorTextView = textView;
        this.progressBar = progressBar;
        this.retryButton = kudiButton;
        this.statusTextView = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivitySetupAgentAccountBinding bind(View view) {
        int $i0 = C0001R.C0003id.errorTextView;
        View $r1 = view.findViewById(C0001R.C0003id.errorTextView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.progressBar;
            View $r12 = view.findViewById(C0001R.C0003id.progressBar);
            ProgressBar $r3 = (ProgressBar) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.retryButton;
                View $r13 = view.findViewById(C0001R.C0003id.retryButton);
                KudiButton $r4 = (KudiButton) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.statusTextView;
                    View $r14 = view.findViewById(C0001R.C0003id.statusTextView);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        ActivitySetupAgentAccountBinding $r6 = new ActivitySetupAgentAccountBinding((ConstraintLayout) view, $r2, $r3, $r4, textView);
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
    public static ActivitySetupAgentAccountBinding inflate(LayoutInflater layoutInflater) {
        ActivitySetupAgentAccountBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivitySetupAgentAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_setup_agent_account, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivitySetupAgentAccountBinding $r3 = bind($r2);
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
