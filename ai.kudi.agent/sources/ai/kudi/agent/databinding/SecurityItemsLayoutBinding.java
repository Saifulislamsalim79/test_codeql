package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class SecurityItemsLayoutBinding implements InterfaceC8209a {
    public final ImageView pinResetIndicator;
    private final ConstraintLayout rootView;
    public final KudiTextView securityOptionTextView;
    public final View view10;

    private SecurityItemsLayoutBinding(ConstraintLayout constraintLayout, ImageView imageView, KudiTextView kudiTextView, View view) {
        this.rootView = constraintLayout;
        this.pinResetIndicator = imageView;
        this.securityOptionTextView = kudiTextView;
        this.view10 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SecurityItemsLayoutBinding bind(View view) {
        int $i0 = C0001R.C0003id.pinResetIndicator;
        View $r1 = view.findViewById(C0001R.C0003id.pinResetIndicator);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.securityOptionTextView;
            View $r12 = view.findViewById(C0001R.C0003id.securityOptionTextView);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.view10;
                View $r13 = view.findViewById(C0001R.C0003id.view10);
                if ($r13 != null) {
                    ConstraintLayout $r5 = (ConstraintLayout) view;
                    SecurityItemsLayoutBinding $r4 = new SecurityItemsLayoutBinding($r5, $r2, $r3, $r13);
                    return $r4;
                }
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
    public static SecurityItemsLayoutBinding inflate(LayoutInflater layoutInflater) {
        SecurityItemsLayoutBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SecurityItemsLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.security_items_layout, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        SecurityItemsLayoutBinding $r3 = bind($r2);
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
