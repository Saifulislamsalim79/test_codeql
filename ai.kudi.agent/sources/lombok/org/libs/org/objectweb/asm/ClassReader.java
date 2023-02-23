package lombok.org.libs.org.objectweb.asm;

import a.a.b.a.b.d.d.d;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.C14326a;
/* loaded from: classes.dex */
public final class ClassReader {

    /* renamed from: a */
    public final AtomicBoolean f31558a;

    /* renamed from: c */
    public final InterfaceC11767l<Exception, C13666w> f31559c;

    /* renamed from: d */
    public final InterfaceC11767l<d, C13666w> f31560d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public ClassReader(InterfaceC11767l interfaceC11767l, InterfaceC11767l interfaceC11767l2) {
        Log_OC.getArray(interfaceC11767l, "onResponse");
        Log_OC.getArray(interfaceC11767l2, "onFailure");
        this.f31560d = interfaceC11767l;
        this.f31559c = interfaceC11767l2;
        AtomicBoolean $r3 = new AtomicBoolean(false);
        this.f31558a = $r3;
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
    public final void m2129a(Exception exc) {
        Log_OC.getArray(exc, "exception");
        AtomicBoolean $r2 = this.f31558a;
        boolean $z0 = $r2.get();
        if ($z0) {
            return;
        }
        AtomicBoolean $r22 = this.f31558a;
        $r22.set(true);
        InterfaceC11767l $r3 = this.f31559c;
        $r3.invoke(exc);
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
    public final void m2128a(C14326a c14326a) {
        Log_OC.getArray(c14326a, "response");
        AtomicBoolean $r2 = this.f31558a;
        boolean $z0 = $r2.get();
        if ($z0) {
            return;
        }
        AtomicBoolean $r22 = this.f31558a;
        $r22.set(true);
        InterfaceC11767l $r3 = this.f31560d;
        $r3.invoke(c14326a);
    }
}
