package org.org.org.org.android.util.lib.app;

import android.view.Menu;
import android.view.Window;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class Fragment extends AbstractC11802m implements InterfaceC11756a<Boolean> {
    public final /* synthetic */ int featureId;
    public final /* synthetic */ FragmentActivity mActivity;
    public final /* synthetic */ Menu menu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fragment(FragmentActivity fragmentActivity, int i, Menu menu) {
        super(0);
        this.mActivity = fragmentActivity;
        this.featureId = i;
        this.menu = menu;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Boolean invoke() {
        boolean $z0 = preparePanel();
        Boolean $r1 = Boolean.valueOf($z0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean preparePanel() {
        FragmentActivity $r2 = this.mActivity;
        Window.Callback $r3 = $r2.f32254r;
        if ($r3 != null) {
            int $i0 = this.featureId;
            Menu $r1 = this.menu;
            boolean $z0 = $r3.onCreatePanelMenu($i0, $r1);
            return $z0;
        }
        return false;
    }
}
