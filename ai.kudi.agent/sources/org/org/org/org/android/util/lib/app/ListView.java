package org.org.org.org.android.util.lib.app;

import android.view.ActionMode;
import android.view.Window;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class ListView extends AbstractC11802m implements InterfaceC11756a<ActionMode> {
    public final /* synthetic */ FragmentActivity mActivity;
    public final /* synthetic */ ActionMode.Callback mCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListView(FragmentActivity fragmentActivity, ActionMode.Callback callback) {
        super(0);
        this.mActivity = fragmentActivity;
        this.mCallback = callback;
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
    public /* bridge */ /* synthetic */ ActionMode invoke() {
        ActionMode $r1 = startActionMode();
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
    public final ActionMode startActionMode() {
        FragmentActivity $r2 = this.mActivity;
        Window.Callback $r3 = $r2.f32254r;
        if ($r3 != null) {
            ActionMode.Callback $r1 = this.mCallback;
            ActionMode $r4 = $r3.onWindowStartingActionMode($r1);
            return $r4;
        }
        return null;
    }
}
