package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentNonAgentSignOnBinding implements InterfaceC8209a {
    public final KudiButton continueButton;
    public final LinearLayout list;
    public final TextView otpHeaderText;
    public final ConstraintLayout otpRootView;
    public final TextView otpSubHeaderText;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;

    private FragmentNonAgentSignOnBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, LinearLayout linearLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, ScrollView scrollView) {
        this.rootView = constraintLayout;
        this.continueButton = kudiButton;
        this.list = linearLayout;
        this.otpHeaderText = textView;
        this.otpRootView = constraintLayout2;
        this.otpSubHeaderText = textView2;
        this.scrollView = scrollView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentNonAgentSignOnBinding bind(View view) {
        int $i0 = C0001R.C0003id.continueButton;
        View $r1 = view.findViewById(C0001R.C0003id.continueButton);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.list;
            View $r12 = view.findViewById(C0001R.C0003id.list);
            LinearLayout $r3 = (LinearLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.otpHeaderText;
                View $r13 = view.findViewById(C0001R.C0003id.otpHeaderText);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    $i0 = C0001R.C0003id.otpSubHeaderText;
                    View $r14 = view.findViewById(C0001R.C0003id.otpSubHeaderText);
                    TextView textView2 = (TextView) $r14;
                    if (textView2 != null) {
                        $i0 = C0001R.C0003id.scroll_view;
                        View $r15 = view.findViewById(C0001R.C0003id.scroll_view);
                        ScrollView scrollView = (ScrollView) $r15;
                        if (scrollView != null) {
                            FragmentNonAgentSignOnBinding $r8 = new FragmentNonAgentSignOnBinding(constraintLayout, $r2, $r3, textView, constraintLayout, textView2, scrollView);
                            return $r8;
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
    public static FragmentNonAgentSignOnBinding inflate(LayoutInflater layoutInflater) {
        FragmentNonAgentSignOnBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentNonAgentSignOnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_non_agent_sign_on, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentNonAgentSignOnBinding $r3 = bind($r2);
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
