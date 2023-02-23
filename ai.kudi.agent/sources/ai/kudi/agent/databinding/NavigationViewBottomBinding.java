package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class NavigationViewBottomBinding implements InterfaceC8209a {
    public final ConstraintLayout exitLinearLayout;
    public final TextView menuLogout;
    private final ConstraintLayout rootView;

    private NavigationViewBottomBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.exitLinearLayout = constraintLayout2;
        this.menuLogout = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NavigationViewBottomBinding bind(View view) {
        ConstraintLayout $r1 = (ConstraintLayout) view;
        View $r2 = view.findViewById(C0001R.C0003id.menu_logout);
        TextView $r3 = (TextView) $r2;
        if ($r3 != null) {
            NavigationViewBottomBinding $r4 = new NavigationViewBottomBinding($r1, $r1, $r3);
            return $r4;
        }
        Resources $r5 = view.getResources();
        String $r6 = $r5.getResourceName(C0001R.C0003id.menu_logout);
        NullPointerException $r7 = new NullPointerException("Missing required view with ID: ".concat($r6));
        throw $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NavigationViewBottomBinding inflate(LayoutInflater layoutInflater) {
        NavigationViewBottomBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NavigationViewBottomBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.navigation_view_bottom, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        NavigationViewBottomBinding $r3 = bind($r2);
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
