package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentBvnNinBinding implements InterfaceC8209a {
    public final KudiInputField bvnInputField;
    public final TextView bvnView;
    public final KudiButton continueButton;
    public final TextView learnMore;
    public final TextView phoneNoView;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;

    private FragmentBvnNinBinding(ConstraintLayout constraintLayout, KudiInputField kudiInputField, TextView textView, KudiButton kudiButton, TextView textView2, TextView textView3, ScrollView scrollView) {
        this.rootView = constraintLayout;
        this.bvnInputField = kudiInputField;
        this.bvnView = textView;
        this.continueButton = kudiButton;
        this.learnMore = textView2;
        this.phoneNoView = textView3;
        this.scrollView = scrollView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBvnNinBinding bind(View view) {
        int $i0 = C0001R.C0003id.bvnInputField;
        View $r1 = view.findViewById(C0001R.C0003id.bvnInputField);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.bvnView;
            View $r12 = view.findViewById(C0001R.C0003id.bvnView);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.continueButton;
                View $r13 = view.findViewById(C0001R.C0003id.continueButton);
                KudiButton kudiButton = (KudiButton) $r13;
                if (kudiButton != null) {
                    $i0 = C0001R.C0003id.learnMore;
                    View $r14 = view.findViewById(C0001R.C0003id.learnMore);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.phoneNoView;
                        View $r15 = view.findViewById(C0001R.C0003id.phoneNoView);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.scroll_view;
                            View $r16 = view.findViewById(C0001R.C0003id.scroll_view);
                            ScrollView scrollView = (ScrollView) $r16;
                            if (scrollView != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                FragmentBvnNinBinding $r8 = new FragmentBvnNinBinding($r9, $r2, $r3, kudiButton, textView, textView2, scrollView);
                                return $r8;
                            }
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
    public static FragmentBvnNinBinding inflate(LayoutInflater layoutInflater) {
        FragmentBvnNinBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBvnNinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_bvn_nin, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentBvnNinBinding $r3 = bind($r2);
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
