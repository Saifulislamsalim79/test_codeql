package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewNameValuePairBinding implements InterfaceC8209a {
    public final KudiTextView nameTextView;
    public final View nameValuePairViewDivider;
    private final View rootView;
    public final KudiTextView valueTextView;

    private ViewNameValuePairBinding(View view, KudiTextView kudiTextView, View view2, KudiTextView kudiTextView2) {
        this.rootView = view;
        this.nameTextView = kudiTextView;
        this.nameValuePairViewDivider = view2;
        this.valueTextView = kudiTextView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static ViewNameValuePairBinding bind(View view) {
        int $i0 = C0001R.C0003id.name_text_view;
        KudiTextView $r2 = (KudiTextView) view.findViewById(C0001R.C0003id.name_text_view);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.name_value_pair_view_divider;
            View $r1 = view.findViewById(C0001R.C0003id.name_value_pair_view_divider);
            if ($r1 != null) {
                $i0 = C0001R.C0003id.value_text_view;
                View $r3 = view.findViewById(C0001R.C0003id.value_text_view);
                KudiTextView $r4 = (KudiTextView) $r3;
                if ($r4 != null) {
                    ViewNameValuePairBinding $r5 = new ViewNameValuePairBinding(view, $r2, $r1, $r4);
                    return $r5;
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
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static ViewNameValuePairBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            NullPointerException $r3 = new NullPointerException("parent");
            throw $r3;
        }
        layoutInflater.inflate(C0001R.C0004layout.view_name_value_pair, viewGroup);
        ViewNameValuePairBinding $r0 = bind(viewGroup);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // p201g.p270x.InterfaceC8209a
    public View getRoot() {
        View r1 = this.rootView;
        return r1;
    }
}
