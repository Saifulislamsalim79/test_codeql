package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class BottomLoginViewBinding implements InterfaceC8209a {
    public final TextView buttomViewHeader;
    public final ConstraintLayout constraintLayout4;
    public final TextView loginButton;
    private final ConstraintLayout rootView;

    private BottomLoginViewBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2) {
        this.rootView = constraintLayout;
        this.buttomViewHeader = textView;
        this.constraintLayout4 = constraintLayout2;
        this.loginButton = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomLoginViewBinding bind(View view) {
        int $i0 = C0038R.C0040id.buttomViewHeader;
        View $r1 = view.findViewById($i0);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            ConstraintLayout $r3 = (ConstraintLayout) view;
            $i0 = C0038R.C0040id.loginButton;
            View $r12 = view.findViewById($i0);
            TextView $r4 = (TextView) $r12;
            if ($r4 != null) {
                BottomLoginViewBinding $r5 = new BottomLoginViewBinding($r3, $r2, $r3, $r4);
                return $r5;
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
    public static BottomLoginViewBinding inflate(LayoutInflater layoutInflater) {
        BottomLoginViewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomLoginViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.bottom_login_view;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        BottomLoginViewBinding $r3 = bind($r2);
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
