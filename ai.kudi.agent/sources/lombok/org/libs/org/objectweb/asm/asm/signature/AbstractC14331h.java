package lombok.org.libs.org.objectweb.asm.asm.signature;

import java.io.File;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: lombok.org.libs.org.objectweb.asm.asm.signature.h */
/* loaded from: classes.dex */
public abstract class AbstractC14331h {

    /* renamed from: f */
    public final String f31590f;

    public AbstractC14331h(String str) {
        Log_OC.getArray(str, "name");
        this.f31590f = str;
    }

    /* renamed from: a */
    public abstract long mo2112a();

    /* renamed from: b */
    public abstract String mo2111b();

    /* renamed from: c */
    public abstract boolean mo2110c();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: d */
    public final String m2109d() {
        String r1 = this.f31590f;
        return r1;
    }

    /* renamed from: f */
    public abstract File mo2108f();

    public abstract String getValue();

    public abstract boolean isEnabled();
}
