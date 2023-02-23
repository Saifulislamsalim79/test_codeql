package org.org.org.org.android.util.lib.app;

import android.view.Menu;
import android.view.Window;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* renamed from: org.org.org.org.android.util.lib.app.b */
/* loaded from: classes.dex */
public final class C14564b extends AbstractC11802m implements InterfaceC11756a<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ int f32261a;

    /* renamed from: d */
    public final /* synthetic */ FragmentActivity f32262d;

    /* renamed from: j */
    public final /* synthetic */ Menu f32263j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14564b(FragmentActivity fragmentActivity, int i, Menu menu) {
        super(0);
        this.f32262d = fragmentActivity;
        this.f32261a = i;
        this.f32263j = menu;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public final boolean m1207a() {
        FragmentActivity $r2 = this.f32262d;
        Window.Callback $r3 = $r2.f32254r;
        if ($r3 != null) {
            int $i0 = this.f32261a;
            Menu $r1 = this.f32263j;
            boolean $z0 = $r3.onMenuOpened($i0, $r1);
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
        boolean $z0 = m1207a();
        Boolean $r1 = Boolean.valueOf($z0);
        return $r1;
    }
}
