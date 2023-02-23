package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutBottomButtonBinding implements InterfaceC8209a {
    private final RelativeLayout rootView;
    public final KudiButton tvProceedBtn;

    private LayoutBottomButtonBinding(RelativeLayout relativeLayout, KudiButton kudiButton) {
        this.rootView = relativeLayout;
        this.tvProceedBtn = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutBottomButtonBinding bind(View view) {
        int $i0 = R$id.tv_proceed_btn;
        View $r1 = view.findViewById($i0);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            RelativeLayout $r4 = (RelativeLayout) view;
            LayoutBottomButtonBinding $r3 = new LayoutBottomButtonBinding($r4, $r2);
            return $r3;
        }
        Resources $r5 = view.getResources();
        String $r6 = $r5.getResourceName($i0);
        NullPointerException $r7 = new NullPointerException("Missing required view with ID: ".concat($r6));
        throw $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutBottomButtonBinding inflate(LayoutInflater layoutInflater) {
        LayoutBottomButtonBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutBottomButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.layout_bottom_button;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutBottomButtonBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        RelativeLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public RelativeLayout getRoot() {
        RelativeLayout r1 = this.rootView;
        return r1;
    }
}
