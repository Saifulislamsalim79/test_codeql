package org.org.org.org.android.util.lib.app;

import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1 extends AbstractC11802m implements InterfaceC11756a<Boolean> {
    public final /* synthetic */ FragmentActivity this$0;
    public final /* synthetic */ AccessibilityEvent val$compat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1(FragmentActivity fragmentActivity, AccessibilityEvent accessibilityEvent) {
        super(0);
        this.this$0 = fragmentActivity;
        this.val$compat = accessibilityEvent;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean dispatchPopulateAccessibilityEvent() {
        FragmentActivity $r2 = this.this$0;
        Window.Callback $r3 = $r2.f32254r;
        if ($r3 != null) {
            AccessibilityEvent $r1 = this.val$compat;
            boolean $z0 = $r3.dispatchPopulateAccessibilityEvent($r1);
            return $z0;
        }
        return false;
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
        boolean $z0 = dispatchPopulateAccessibilityEvent();
        Boolean $r1 = Boolean.valueOf($z0);
        return $r1;
    }
}
