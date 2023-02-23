package lombok.org.asm;

import java.util.concurrent.CancellationException;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* loaded from: classes.dex */
public interface Label extends InterfaceC11719g.InterfaceC11722b {

    /* renamed from: c */
    public static final Token f31291c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Token $r0 = Token.PERCENT;
        f31291c = $r0;
    }

    /* renamed from: a */
    MenuItem mo2371a(InterfaceC14273j interfaceC14273j);

    /* renamed from: a */
    Object mo2370a(boolean z, boolean z2, InterfaceC11767l interfaceC11767l);

    /* renamed from: a */
    void mo2372a(CancellationException cancellationException);

    /* renamed from: a */
    boolean mo2373a();

    CancellationException getValue();

    boolean put();
}
