package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutReloadContentBinding implements InterfaceC8209a {
    public final LinearLayout llNoResultFound;
    private final LinearLayout rootView;
    public final TextView tvNotFoundLabel;
    public final TextView tvNotFoundText;
    public final KudiButton tvReloadBtn;

    private LayoutReloadContentBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, KudiButton kudiButton) {
        this.rootView = linearLayout;
        this.llNoResultFound = linearLayout2;
        this.tvNotFoundLabel = textView;
        this.tvNotFoundText = textView2;
        this.tvReloadBtn = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutReloadContentBinding bind(View view) {
        LinearLayout $r1 = (LinearLayout) view;
        int $i0 = R$id.tv_not_found_label;
        View $r2 = view.findViewById($i0);
        TextView $r3 = (TextView) $r2;
        if ($r3 != null) {
            $i0 = R$id.tv_not_found_text;
            View $r22 = view.findViewById($i0);
            TextView $r4 = (TextView) $r22;
            if ($r4 != null) {
                $i0 = R$id.tv_reload_btn;
                View $r23 = view.findViewById($i0);
                KudiButton $r5 = (KudiButton) $r23;
                if ($r5 != null) {
                    LayoutReloadContentBinding $r6 = new LayoutReloadContentBinding($r1, $r1, $r3, $r4, $r5);
                    return $r6;
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
    public static LayoutReloadContentBinding inflate(LayoutInflater layoutInflater) {
        LayoutReloadContentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutReloadContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.layout_reload_content;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutReloadContentBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
