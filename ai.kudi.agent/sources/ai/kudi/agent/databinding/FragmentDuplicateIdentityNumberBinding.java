package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.BottomLoginViewBinding;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentDuplicateIdentityNumberBinding implements InterfaceC8209a {
    public final BottomLoginViewBinding bottomView;
    public final ConstraintLayout constraintLayout6;
    public final KudiButton loginButton;
    public final TextView retryButton;
    private final ConstraintLayout rootView;
    public final TextView textView49;
    public final TextView textView54;
    public final TextView textView59;
    public final TextView textView60;

    private FragmentDuplicateIdentityNumberBinding(ConstraintLayout constraintLayout, BottomLoginViewBinding bottomLoginViewBinding, ConstraintLayout constraintLayout2, KudiButton kudiButton, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.bottomView = bottomLoginViewBinding;
        this.constraintLayout6 = constraintLayout2;
        this.loginButton = kudiButton;
        this.retryButton = textView;
        this.textView49 = textView2;
        this.textView54 = textView3;
        this.textView59 = textView4;
        this.textView60 = textView5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDuplicateIdentityNumberBinding bind(View view) {
        int $i0 = C0001R.C0003id.bottomView;
        View $r1 = view.findViewById(C0001R.C0003id.bottomView);
        if ($r1 != null) {
            BottomLoginViewBinding $r2 = BottomLoginViewBinding.bind($r1);
            $i0 = C0001R.C0003id.constraintLayout6;
            ConstraintLayout $r3 = (ConstraintLayout) view.findViewById(C0001R.C0003id.constraintLayout6);
            if ($r3 != null) {
                $i0 = C0001R.C0003id.loginButton;
                KudiButton kudiButton = (KudiButton) view.findViewById(C0001R.C0003id.loginButton);
                if (kudiButton != null) {
                    $i0 = C0001R.C0003id.retry_button;
                    TextView textView = (TextView) view.findViewById(C0001R.C0003id.retry_button);
                    if (textView != null) {
                        $i0 = C0001R.C0003id.textView49;
                        TextView textView2 = (TextView) view.findViewById(C0001R.C0003id.textView49);
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.textView54;
                            TextView textView3 = (TextView) view.findViewById(C0001R.C0003id.textView54);
                            if (textView3 != null) {
                                $i0 = C0001R.C0003id.textView59;
                                TextView $r8 = (TextView) view.findViewById(C0001R.C0003id.textView59);
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.textView60;
                                    TextView $r9 = (TextView) view.findViewById(C0001R.C0003id.textView60);
                                    if ($r9 != null) {
                                        ConstraintLayout $r11 = (ConstraintLayout) view;
                                        FragmentDuplicateIdentityNumberBinding $r10 = new FragmentDuplicateIdentityNumberBinding($r11, $r2, $r3, kudiButton, textView, textView2, textView3, $r8, $r9);
                                        return $r10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r12 = view.getResources();
        String $r13 = $r12.getResourceName($i0);
        NullPointerException $r14 = new NullPointerException("Missing required view with ID: ".concat($r13));
        throw $r14;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDuplicateIdentityNumberBinding inflate(LayoutInflater layoutInflater) {
        FragmentDuplicateIdentityNumberBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDuplicateIdentityNumberBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_duplicate_identity_number, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentDuplicateIdentityNumberBinding $r3 = bind($r2);
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
