package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class CustomViewsSelectViewBinding implements InterfaceC8209a {
    public final RelativeLayout lockLayout;
    private final ConstraintLayout rootView;
    public final Spinner selectSpinner;

    private CustomViewsSelectViewBinding(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, Spinner spinner) {
        this.rootView = constraintLayout;
        this.lockLayout = relativeLayout;
        this.selectSpinner = spinner;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomViewsSelectViewBinding bind(View view) {
        int $i0 = C0001R.C0003id.lockLayout;
        View $r1 = view.findViewById(C0001R.C0003id.lockLayout);
        RelativeLayout $r2 = (RelativeLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.selectSpinner;
            View $r12 = view.findViewById(C0001R.C0003id.selectSpinner);
            Spinner $r3 = (Spinner) $r12;
            if ($r3 != null) {
                ConstraintLayout $r5 = (ConstraintLayout) view;
                CustomViewsSelectViewBinding $r4 = new CustomViewsSelectViewBinding($r5, $r2, $r3);
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
    public static CustomViewsSelectViewBinding inflate(LayoutInflater layoutInflater) {
        CustomViewsSelectViewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomViewsSelectViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.custom_views_select_view, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        CustomViewsSelectViewBinding $r3 = bind($r2);
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
