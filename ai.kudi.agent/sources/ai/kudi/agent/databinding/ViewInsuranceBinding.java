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
public final class ViewInsuranceBinding implements InterfaceC8209a {
    public final View insuranceContainerDivider;
    public final TextView insuranceContainerTitle;
    public final KudiButton insuranceSignUp;
    private final ConstraintLayout rootView;
    public final ConstraintLayout signUpContainer;
    public final TextView textView26;
    public final TextView textView27;

    private ViewInsuranceBinding(ConstraintLayout constraintLayout, View view, TextView textView, KudiButton kudiButton, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.insuranceContainerDivider = view;
        this.insuranceContainerTitle = textView;
        this.insuranceSignUp = kudiButton;
        this.signUpContainer = constraintLayout2;
        this.textView26 = textView2;
        this.textView27 = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewInsuranceBinding bind(View view) {
        int $i0 = C0001R.C0003id.insuranceContainerDivider;
        View $r1 = view.findViewById(C0001R.C0003id.insuranceContainerDivider);
        if ($r1 != null) {
            $i0 = C0001R.C0003id.insuranceContainerTitle;
            View $r2 = view.findViewById(C0001R.C0003id.insuranceContainerTitle);
            TextView $r3 = (TextView) $r2;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.insuranceSignUp;
                View $r22 = view.findViewById(C0001R.C0003id.insuranceSignUp);
                KudiButton $r4 = (KudiButton) $r22;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.signUpContainer;
                    View $r23 = view.findViewById(C0001R.C0003id.signUpContainer);
                    ConstraintLayout constraintLayout = (ConstraintLayout) $r23;
                    if (constraintLayout != null) {
                        $i0 = C0001R.C0003id.textView26;
                        View $r24 = view.findViewById(C0001R.C0003id.textView26);
                        TextView textView = (TextView) $r24;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.textView27;
                            View $r25 = view.findViewById(C0001R.C0003id.textView27);
                            TextView textView2 = (TextView) $r25;
                            if (textView2 != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                ViewInsuranceBinding $r8 = new ViewInsuranceBinding($r9, $r1, $r3, $r4, constraintLayout, textView, textView2);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r12 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewInsuranceBinding inflate(LayoutInflater layoutInflater) {
        ViewInsuranceBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewInsuranceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_insurance, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewInsuranceBinding $r3 = bind($r2);
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
