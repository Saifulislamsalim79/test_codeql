package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentLoginSuspendedBinding implements InterfaceC8209a {
    public final KudiButton loginSuspendedCallSupportButton;
    private final ConstraintLayout rootView;
    public final TextView textView37;
    public final TextView textView38;

    private FragmentLoginSuspendedBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.loginSuspendedCallSupportButton = kudiButton;
        this.textView37 = textView;
        this.textView38 = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoginSuspendedBinding bind(View view) {
        int $i0 = C0001R.C0003id.loginSuspendedCallSupportButton;
        View $r1 = view.findViewById(C0001R.C0003id.loginSuspendedCallSupportButton);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.textView37;
            View $r12 = view.findViewById(C0001R.C0003id.textView37);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.textView38;
                View $r13 = view.findViewById(C0001R.C0003id.textView38);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    FragmentLoginSuspendedBinding $r5 = new FragmentLoginSuspendedBinding($r6, $r2, $r3, $r4);
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
    public static FragmentLoginSuspendedBinding inflate(LayoutInflater layoutInflater) {
        FragmentLoginSuspendedBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoginSuspendedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_login_suspended, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentLoginSuspendedBinding $r3 = bind($r2);
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
