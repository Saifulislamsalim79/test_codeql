package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityPendingKycBinding implements InterfaceC8209a {
    public final TextView amtPayableValue;
    public final AppBarLayout appBarLayout;
    public final KudiTextView callSupportView;
    public final ImageView cancelButton;
    public final FrameLayout pendingKycFrame;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;
    public final ConstraintLayout view13;

    private ActivityPendingKycBinding(ConstraintLayout constraintLayout, TextView textView, AppBarLayout appBarLayout, KudiTextView kudiTextView, ImageView imageView, FrameLayout frameLayout, Toolbar toolbar, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.amtPayableValue = textView;
        this.appBarLayout = appBarLayout;
        this.callSupportView = kudiTextView;
        this.cancelButton = imageView;
        this.pendingKycFrame = frameLayout;
        this.toolbar = toolbar;
        this.view13 = constraintLayout2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPendingKycBinding bind(View view) {
        int $i0 = C0001R.C0003id.amtPayableValue;
        View $r1 = view.findViewById(C0001R.C0003id.amtPayableValue);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.app_bar_layout;
            View $r12 = view.findViewById(C0001R.C0003id.app_bar_layout);
            AppBarLayout $r3 = (AppBarLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.call_support_view;
                View $r13 = view.findViewById(C0001R.C0003id.call_support_view);
                KudiTextView kudiTextView = (KudiTextView) $r13;
                if (kudiTextView != null) {
                    $i0 = C0001R.C0003id.cancelButton;
                    View $r14 = view.findViewById(C0001R.C0003id.cancelButton);
                    ImageView imageView = (ImageView) $r14;
                    if (imageView != null) {
                        $i0 = C0001R.C0003id.pendingKycFrame;
                        View $r15 = view.findViewById(C0001R.C0003id.pendingKycFrame);
                        FrameLayout frameLayout = (FrameLayout) $r15;
                        if (frameLayout != null) {
                            $i0 = C0001R.C0003id.toolbar;
                            View $r16 = view.findViewById(C0001R.C0003id.toolbar);
                            Toolbar toolbar = (Toolbar) $r16;
                            if (toolbar != null) {
                                $i0 = C0001R.C0003id.view13;
                                View $r17 = view.findViewById(C0001R.C0003id.view13);
                                ConstraintLayout $r8 = (ConstraintLayout) $r17;
                                if ($r8 != null) {
                                    ConstraintLayout $r10 = (ConstraintLayout) view;
                                    ActivityPendingKycBinding $r9 = new ActivityPendingKycBinding($r10, $r2, $r3, kudiTextView, imageView, frameLayout, toolbar, $r8);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPendingKycBinding inflate(LayoutInflater layoutInflater) {
        ActivityPendingKycBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPendingKycBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_pending_kyc, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityPendingKycBinding $r3 = bind($r2);
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
