package org.org.org.org.android.util.lib.app;

import android.view.MenuItem;
import android.view.Window;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class MainActivity extends AbstractC11802m implements InterfaceC11756a<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ int f32255a;

    /* renamed from: b */
    public final /* synthetic */ MenuItem f32256b;

    /* renamed from: c */
    public final /* synthetic */ FragmentActivity f32257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity(FragmentActivity fragmentActivity, int i, MenuItem menuItem) {
        super(0);
        this.f32257c = fragmentActivity;
        this.f32255a = i;
        this.f32256b = menuItem;
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
        boolean $z0 = onOptionsItemSelected();
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
    public final boolean onOptionsItemSelected() {
        FragmentActivity $r2 = this.f32257c;
        Window.Callback $r3 = $r2.f32254r;
        if ($r3 != null) {
            int $i0 = this.f32255a;
            MenuItem $r1 = this.f32256b;
            boolean $z0 = $r3.onMenuItemSelected($i0, $r1);
            return $z0;
        }
        return false;
    }
}
