package lombok.org.libs.org.objectweb.asm.asm.signature;

import java.io.File;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: lombok.org.libs.org.objectweb.asm.asm.signature.d */
/* loaded from: classes.dex */
public final class C14330d extends AbstractC14331h {

    /* renamed from: b */
    public final String f31589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14330d(String str, String str2) {
        super(str);
        Log_OC.getArray(str, "name");
        Log_OC.getArray(str2, "body");
        this.f31589b = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h
    /* renamed from: a */
    public long mo2112a() {
        String $r1 = this.f31589b;
        int $i0 = $r1.length();
        long $l1 = $i0;
        return $l1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h
    /* renamed from: b */
    public String mo2111b() {
        String r1 = this.f31589b;
        return r1;
    }

    @Override // lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h
    /* renamed from: c */
    public boolean mo2110c() {
        return false;
    }

    @Override // lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h
    /* renamed from: f */
    public File mo2108f() {
        return null;
    }

    @Override // lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h
    public String getValue() {
        return null;
    }

    @Override // lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h
    public boolean isEnabled() {
        return true;
    }
}
