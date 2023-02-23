package org.org.org.org.android.util.lib.app;

import android.view.MotionEvent;
import android.view.Window;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class ActionBarWrapper extends AbstractC11802m implements InterfaceC11756a<Boolean> {
    public final /* synthetic */ MotionEvent mActionBar;
    public final /* synthetic */ FragmentActivity mActivity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionBarWrapper(FragmentActivity fragmentActivity, MotionEvent motionEvent) {
        super(0);
        this.mActivity = fragmentActivity;
        this.mActionBar = motionEvent;
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
        boolean $z0 = show();
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
    public final boolean show() {
        FragmentActivity $r2 = this.mActivity;
        Window.Callback $r3 = $r2.f32254r;
        if ($r3 != null) {
            MotionEvent $r1 = this.mActionBar;
            boolean $z0 = $r3.dispatchTrackballEvent($r1);
            return $z0;
        }
        return false;
    }
}
