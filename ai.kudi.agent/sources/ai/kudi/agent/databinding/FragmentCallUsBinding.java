package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentCallUsBinding implements InterfaceC8209a {
    public final LayoutCallSupportBinding layoutCallSupport;
    private final ConstraintLayout rootView;
    public final TextView textView10;
    public final TextView textView11;
    public final TextView textView2;
    public final TextView textView4;
    public final KudiTextView textView5;
    public final ConstraintLayout view12;

    private FragmentCallUsBinding(ConstraintLayout constraintLayout, LayoutCallSupportBinding layoutCallSupportBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, KudiTextView kudiTextView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.layoutCallSupport = layoutCallSupportBinding;
        this.textView10 = textView;
        this.textView11 = textView2;
        this.textView2 = textView3;
        this.textView4 = textView4;
        this.textView5 = kudiTextView;
        this.view12 = constraintLayout2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCallUsBinding bind(View view) {
        int $i0 = C0001R.C0003id.layout_call_support;
        View $r1 = view.findViewById(C0001R.C0003id.layout_call_support);
        if ($r1 != null) {
            LayoutCallSupportBinding $r2 = LayoutCallSupportBinding.bind($r1);
            $i0 = C0001R.C0003id.textView10;
            TextView $r3 = (TextView) view.findViewById(C0001R.C0003id.textView10);
            if ($r3 != null) {
                $i0 = C0001R.C0003id.textView11;
                TextView textView = (TextView) view.findViewById(C0001R.C0003id.textView11);
                if (textView != null) {
                    $i0 = C0001R.C0003id.textView2;
                    TextView textView2 = (TextView) view.findViewById(C0001R.C0003id.textView2);
                    if (textView2 != null) {
                        $i0 = C0001R.C0003id.textView4;
                        TextView textView3 = (TextView) view.findViewById(C0001R.C0003id.textView4);
                        if (textView3 != null) {
                            $i0 = C0001R.C0003id.textView5;
                            KudiTextView kudiTextView = (KudiTextView) view.findViewById(C0001R.C0003id.textView5);
                            if (kudiTextView != null) {
                                $i0 = C0001R.C0003id.view12;
                                ConstraintLayout $r8 = (ConstraintLayout) view.findViewById(C0001R.C0003id.view12);
                                if ($r8 != null) {
                                    ConstraintLayout $r10 = (ConstraintLayout) view;
                                    FragmentCallUsBinding $r9 = new FragmentCallUsBinding($r10, $r2, $r3, textView, textView2, textView3, kudiTextView, $r8);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r12 = $r11.getResourceName($i0);
        NullPointerException $r13 = new NullPointerException("Missing required view with ID: ".concat($r12));
        throw $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCallUsBinding inflate(LayoutInflater layoutInflater) {
        FragmentCallUsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCallUsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_call_us, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentCallUsBinding $r3 = bind($r2);
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
