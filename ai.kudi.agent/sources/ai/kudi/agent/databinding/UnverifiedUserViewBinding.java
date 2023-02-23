package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class UnverifiedUserViewBinding implements InterfaceC8209a {
    public final KudiTextView accountVerifyText;
    public final KudiTextView kycLevelView;
    private final ConstraintLayout rootView;
    public final KudiTextView statusView;
    public final KudiTextView verifyButton;
    public final View view10;
    public final View view11;

    private UnverifiedUserViewBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, KudiTextView kudiTextView2, KudiTextView kudiTextView3, KudiTextView kudiTextView4, View view, View view2) {
        this.rootView = constraintLayout;
        this.accountVerifyText = kudiTextView;
        this.kycLevelView = kudiTextView2;
        this.statusView = kudiTextView3;
        this.verifyButton = kudiTextView4;
        this.view10 = view;
        this.view11 = view2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UnverifiedUserViewBinding bind(View view) {
        int $i0 = C0001R.C0003id.accountVerifyText;
        View $r1 = view.findViewById(C0001R.C0003id.accountVerifyText);
        KudiTextView $r2 = (KudiTextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.kycLevelView;
            View $r12 = view.findViewById(C0001R.C0003id.kycLevelView);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.statusView;
                View $r13 = view.findViewById(C0001R.C0003id.statusView);
                KudiTextView kudiTextView = (KudiTextView) $r13;
                if (kudiTextView != null) {
                    $i0 = C0001R.C0003id.verifyButton;
                    View $r14 = view.findViewById(C0001R.C0003id.verifyButton);
                    KudiTextView kudiTextView2 = (KudiTextView) $r14;
                    if (kudiTextView2 != null) {
                        $i0 = C0001R.C0003id.view10;
                        View $r15 = view.findViewById(C0001R.C0003id.view10);
                        if ($r15 != null) {
                            $i0 = C0001R.C0003id.view11;
                            View $r6 = view.findViewById(C0001R.C0003id.view11);
                            if ($r6 != null) {
                                UnverifiedUserViewBinding $r7 = new UnverifiedUserViewBinding((ConstraintLayout) view, $r2, $r3, kudiTextView, kudiTextView2, $r15, $r6);
                                return $r7;
                            }
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
    public static UnverifiedUserViewBinding inflate(LayoutInflater layoutInflater) {
        UnverifiedUserViewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UnverifiedUserViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.unverified_user_view, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        UnverifiedUserViewBinding $r3 = bind($r2);
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
