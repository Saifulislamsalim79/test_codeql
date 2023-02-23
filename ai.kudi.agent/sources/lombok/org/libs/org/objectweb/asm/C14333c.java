package lombok.org.libs.org.objectweb.asm;

import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: lombok.org.libs.org.objectweb.asm.c */
/* loaded from: classes.dex */
public final class C14333c {

    /* renamed from: f */
    public final OutputStream f31592f;

    public C14333c(OutputStream outputStream) {
        Log_OC.getArray(outputStream, "outputStream");
        this.f31592f = outputStream;
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
    public final void m2101a() {
        OutputStream $r1 = this.f31592f;
        $r1.close();
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
    public final void m2100a(String str) {
        if (str != null) {
            OutputStream $r1 = this.f31592f;
            Charset $r3 = Charset.forName("UTF-8");
            Log_OC.loadImage($r3, "Charset.forName(\"UTF-8\")");
            byte[] $r4 = str.getBytes($r3);
            Log_OC.loadImage($r4, "(this as java.lang.String).getBytes(charset)");
            $r1.write($r4);
        }
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
    public final void m2099a(byte[] bArr) {
        if (bArr != null) {
            OutputStream $r2 = this.f31592f;
            $r2.write(bArr);
        }
    }
}
