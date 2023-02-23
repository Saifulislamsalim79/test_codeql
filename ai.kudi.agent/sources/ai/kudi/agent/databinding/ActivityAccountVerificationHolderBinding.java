package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityAccountVerificationHolderBinding implements InterfaceC8209a {
    public final ImageView backNav;
    public final FrameLayout container;
    public final ViewLoaderBinding loaderView;
    private final ConstraintLayout rootView;

    private ActivityAccountVerificationHolderBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, ViewLoaderBinding viewLoaderBinding) {
        this.rootView = constraintLayout;
        this.backNav = imageView;
        this.container = frameLayout;
        this.loaderView = viewLoaderBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityAccountVerificationHolderBinding bind(View view) {
        int $i0 = C0001R.C0003id.backNav;
        View $r1 = view.findViewById(C0001R.C0003id.backNav);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.container;
            View $r12 = view.findViewById(C0001R.C0003id.container);
            FrameLayout $r3 = (FrameLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.loader_view;
                View $r13 = view.findViewById(C0001R.C0003id.loader_view);
                if ($r13 != null) {
                    ViewLoaderBinding $r4 = ViewLoaderBinding.bind($r13);
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    ActivityAccountVerificationHolderBinding $r5 = new ActivityAccountVerificationHolderBinding($r6, $r2, $r3, $r4);
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
    public static ActivityAccountVerificationHolderBinding inflate(LayoutInflater layoutInflater) {
        ActivityAccountVerificationHolderBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityAccountVerificationHolderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_account_verification_holder, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityAccountVerificationHolderBinding $r3 = bind($r2);
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
