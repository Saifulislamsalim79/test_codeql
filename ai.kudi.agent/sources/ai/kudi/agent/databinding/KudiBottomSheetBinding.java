package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.custom.views.CustomBgTextview;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class KudiBottomSheetBinding implements InterfaceC8209a {
    public final ImageView close;
    public final LinearLayout content;
    public final CustomBgTextview notch;
    private final ConstraintLayout rootView;

    private KudiBottomSheetBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, CustomBgTextview customBgTextview) {
        this.rootView = constraintLayout;
        this.close = imageView;
        this.content = linearLayout;
        this.notch = customBgTextview;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KudiBottomSheetBinding bind(View view) {
        int $i0 = C0001R.C0003id.close;
        View $r1 = view.findViewById(C0001R.C0003id.close);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.content;
            View $r12 = view.findViewById(C0001R.C0003id.content);
            LinearLayout $r3 = (LinearLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.notch;
                View $r13 = view.findViewById(C0001R.C0003id.notch);
                CustomBgTextview $r4 = (CustomBgTextview) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    KudiBottomSheetBinding $r5 = new KudiBottomSheetBinding($r6, $r2, $r3, $r4);
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
    public static KudiBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        KudiBottomSheetBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KudiBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.kudi_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        KudiBottomSheetBinding $r3 = bind($r2);
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
