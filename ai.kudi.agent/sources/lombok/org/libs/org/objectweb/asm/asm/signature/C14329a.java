package lombok.org.libs.org.objectweb.asm.asm.signature;

import java.io.File;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: lombok.org.libs.org.objectweb.asm.asm.signature.a */
/* loaded from: classes.dex */
public final class C14329a extends AbstractC14331h {

    /* renamed from: f */
    public final File f31588f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14329a(String str, File file) {
        super(str);
        Log_OC.getArray(str, "name");
        Log_OC.getArray(file, "body");
        this.f31588f = file;
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
        File $r1 = this.f31588f;
        long $l0 = $r1.length();
        return $l0;
    }

    @Override // lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h
    /* renamed from: b */
    public String mo2111b() {
        return null;
    }

    @Override // lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h
    /* renamed from: c */
    public boolean mo2110c() {
        return true;
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
    /* renamed from: f */
    public File mo2108f() {
        File r1 = this.f31588f;
        return r1;
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
    public String getValue() {
        File $r2 = this.f31588f;
        String $r1 = $r2.getName();
        return $r1;
    }

    @Override // lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h
    public boolean isEnabled() {
        return false;
    }
}
