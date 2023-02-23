package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPendingVerificationImageCaptureBinding implements InterfaceC8209a {
    public final KudiButton btnContinue;
    public final FrameLayout container;
    private final ConstraintLayout rootView;

    private FragmentPendingVerificationImageCaptureBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.btnContinue = kudiButton;
        this.container = frameLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingVerificationImageCaptureBinding bind(View view) {
        int $i0 = C0001R.C0003id.btn_continue;
        View $r1 = view.findViewById(C0001R.C0003id.btn_continue);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.container;
            View $r12 = view.findViewById(C0001R.C0003id.container);
            FrameLayout $r3 = (FrameLayout) $r12;
            if ($r3 != null) {
                ConstraintLayout $r5 = (ConstraintLayout) view;
                FragmentPendingVerificationImageCaptureBinding $r4 = new FragmentPendingVerificationImageCaptureBinding($r5, $r2, $r3);
                return $r4;
            }
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingVerificationImageCaptureBinding inflate(LayoutInflater layoutInflater) {
        FragmentPendingVerificationImageCaptureBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingVerificationImageCaptureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_pending_verification_image_capture, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPendingVerificationImageCaptureBinding $r3 = bind($r2);
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
