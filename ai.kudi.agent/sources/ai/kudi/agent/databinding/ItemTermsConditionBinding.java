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
public final class ItemTermsConditionBinding implements InterfaceC8209a {
    public final ImageView imageView13;
    private final ConstraintLayout rootView;
    public final KudiTextView tvTermsName;
    public final View view25;

    private ItemTermsConditionBinding(ConstraintLayout constraintLayout, ImageView imageView, KudiTextView kudiTextView, View view) {
        this.rootView = constraintLayout;
        this.imageView13 = imageView;
        this.tvTermsName = kudiTextView;
        this.view25 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemTermsConditionBinding bind(View view) {
        int $i0 = C0001R.C0003id.imageView13;
        View $r1 = view.findViewById(C0001R.C0003id.imageView13);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.tvTermsName;
            View $r12 = view.findViewById(C0001R.C0003id.tvTermsName);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.view25;
                View $r13 = view.findViewById(C0001R.C0003id.view25);
                if ($r13 != null) {
                    ConstraintLayout $r5 = (ConstraintLayout) view;
                    ItemTermsConditionBinding $r4 = new ItemTermsConditionBinding($r5, $r2, $r3, $r13);
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
    public static ItemTermsConditionBinding inflate(LayoutInflater layoutInflater) {
        ItemTermsConditionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemTermsConditionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.item_terms_condition, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ItemTermsConditionBinding $r3 = bind($r2);
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
