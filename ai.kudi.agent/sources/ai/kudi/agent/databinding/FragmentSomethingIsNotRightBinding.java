package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSomethingIsNotRightBinding implements InterfaceC8209a {
    public final TextView amtPayableValue;
    public final KudiTextView callSupportView;
    private final ConstraintLayout rootView;
    public final TextView textView10;
    public final TextView textView11;
    public final KudiTextView textView2;
    public final TextView textView4;
    public final KudiTextView textView5;
    public final KudiButton tryAgain;
    public final ConstraintLayout view12;
    public final ConstraintLayout view13;

    private FragmentSomethingIsNotRightBinding(ConstraintLayout constraintLayout, TextView textView, KudiTextView kudiTextView, TextView textView2, TextView textView3, KudiTextView kudiTextView2, TextView textView4, KudiTextView kudiTextView3, KudiButton kudiButton, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        this.rootView = constraintLayout;
        this.amtPayableValue = textView;
        this.callSupportView = kudiTextView;
        this.textView10 = textView2;
        this.textView11 = textView3;
        this.textView2 = kudiTextView2;
        this.textView4 = textView4;
        this.textView5 = kudiTextView3;
        this.tryAgain = kudiButton;
        this.view12 = constraintLayout2;
        this.view13 = constraintLayout3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSomethingIsNotRightBinding bind(View view) {
        int $i0 = C0001R.C0003id.amtPayableValue;
        View $r1 = view.findViewById(C0001R.C0003id.amtPayableValue);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.call_support_view;
            View $r12 = view.findViewById(C0001R.C0003id.call_support_view);
            KudiTextView kudiTextView = (KudiTextView) $r12;
            if (kudiTextView != null) {
                $i0 = C0001R.C0003id.textView10;
                View $r13 = view.findViewById(C0001R.C0003id.textView10);
                TextView textView2 = (TextView) $r13;
                if (textView2 != null) {
                    $i0 = C0001R.C0003id.textView11;
                    View $r14 = view.findViewById(C0001R.C0003id.textView11);
                    TextView textView3 = (TextView) $r14;
                    if (textView3 != null) {
                        $i0 = C0001R.C0003id.textView2;
                        View $r15 = view.findViewById(C0001R.C0003id.textView2);
                        KudiTextView kudiTextView2 = (KudiTextView) $r15;
                        if (kudiTextView2 != null) {
                            $i0 = C0001R.C0003id.textView4;
                            View $r16 = view.findViewById(C0001R.C0003id.textView4);
                            TextView textView4 = (TextView) $r16;
                            if (textView4 != null) {
                                $i0 = C0001R.C0003id.textView5;
                                View $r17 = view.findViewById(C0001R.C0003id.textView5);
                                KudiTextView $r8 = (KudiTextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.tryAgain;
                                    View $r18 = view.findViewById(C0001R.C0003id.tryAgain);
                                    KudiButton $r9 = (KudiButton) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.view12;
                                        View $r19 = view.findViewById(C0001R.C0003id.view12);
                                        ConstraintLayout $r10 = (ConstraintLayout) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.view13;
                                            View $r110 = view.findViewById(C0001R.C0003id.view13);
                                            ConstraintLayout $r11 = (ConstraintLayout) $r110;
                                            if ($r11 != null) {
                                                ConstraintLayout $r132 = (ConstraintLayout) view;
                                                FragmentSomethingIsNotRightBinding $r122 = new FragmentSomethingIsNotRightBinding($r132, textView, kudiTextView, textView2, textView3, kudiTextView2, textView4, $r8, $r9, $r10, $r11);
                                                return $r122;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r142 = view.getResources();
        String $r152 = $r142.getResourceName($i0);
        NullPointerException $r162 = new NullPointerException("Missing required view with ID: ".concat($r152));
        throw $r162;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSomethingIsNotRightBinding inflate(LayoutInflater layoutInflater) {
        FragmentSomethingIsNotRightBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSomethingIsNotRightBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_something_is_not_right, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSomethingIsNotRightBinding $r3 = bind($r2);
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
