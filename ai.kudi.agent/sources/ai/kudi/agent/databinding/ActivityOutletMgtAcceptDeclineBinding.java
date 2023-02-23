package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityOutletMgtAcceptDeclineBinding implements InterfaceC8209a {
    public final KudiButton acceptRequestButton;
    public final ImageView backButton;
    public final TextView cancelRequestButton;
    public final ImageView imageView14;
    public final KudiTextView requestTextView;
    private final ConstraintLayout rootView;
    public final KudiTextView textView28;

    private ActivityOutletMgtAcceptDeclineBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, ImageView imageView, TextView textView, ImageView imageView2, KudiTextView kudiTextView, KudiTextView kudiTextView2) {
        this.rootView = constraintLayout;
        this.acceptRequestButton = kudiButton;
        this.backButton = imageView;
        this.cancelRequestButton = textView;
        this.imageView14 = imageView2;
        this.requestTextView = kudiTextView;
        this.textView28 = kudiTextView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityOutletMgtAcceptDeclineBinding bind(View view) {
        int $i0 = C0001R.C0003id.acceptRequestButton;
        View $r1 = view.findViewById(C0001R.C0003id.acceptRequestButton);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.backButton;
            View $r12 = view.findViewById(C0001R.C0003id.backButton);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.cancelRequestButton;
                View $r13 = view.findViewById(C0001R.C0003id.cancelRequestButton);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0001R.C0003id.imageView14;
                    View $r14 = view.findViewById(C0001R.C0003id.imageView14);
                    ImageView imageView = (ImageView) $r14;
                    if (imageView != null) {
                        $i0 = C0001R.C0003id.requestTextView;
                        View $r15 = view.findViewById(C0001R.C0003id.requestTextView);
                        KudiTextView kudiTextView = (KudiTextView) $r15;
                        if (kudiTextView != null) {
                            $i0 = C0001R.C0003id.textView28;
                            View $r16 = view.findViewById(C0001R.C0003id.textView28);
                            KudiTextView kudiTextView2 = (KudiTextView) $r16;
                            if (kudiTextView2 != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                ActivityOutletMgtAcceptDeclineBinding $r8 = new ActivityOutletMgtAcceptDeclineBinding($r9, $r2, $r3, textView, imageView, kudiTextView, kudiTextView2);
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
    public static ActivityOutletMgtAcceptDeclineBinding inflate(LayoutInflater layoutInflater) {
        ActivityOutletMgtAcceptDeclineBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityOutletMgtAcceptDeclineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_outlet_mgt_accept_decline, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityOutletMgtAcceptDeclineBinding $r3 = bind($r2);
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
