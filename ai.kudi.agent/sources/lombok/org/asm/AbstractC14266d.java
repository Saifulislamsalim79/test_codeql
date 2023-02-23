package lombok.org.asm;

import kotlin.C11709c;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: lombok.org.asm.d */
/* loaded from: classes.dex */
public abstract class AbstractC14266d<T> extends a.a.a.q.h {

    /* renamed from: c */
    public int f31384c;

    public AbstractC14266d(int i) {
        this.f31384c = i;
    }

    /* renamed from: a */
    public java.lang.Object m2310a(java.lang.Object obj) {
        return obj;
    }

    /* renamed from: a */
    public void m2309a(java.lang.Object obj, Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public final void m2308a(Throwable $r1, Throwable th) {
        if ($r1 == null && th == null) {
            return;
        }
        if ($r1 != null && th != null) {
            C11709c.m10411a($r1, th);
        }
        if ($r1 == null) {
            $r1 = th;
        }
        String $r5 = "Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
        Log_OC.append($r1);
        MethodVisitor $r3 = new MethodVisitor($r5, $r1);
        InterfaceC11714d $r6 = m2305g();
        InterfaceC11719g $r7 = $r6.getContext();
        ClassReader.m2380a($r7, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: b */
    public Throwable m2307b(java.lang.Object $r1) {
        boolean $z0 = $r1 instanceof C14264b;
        if (!$z0) {
            $r1 = null;
        }
        C14264b $r2 = (C14264b) $r1;
        if ($r2 != null) {
            Throwable r3 = $r2.f31379a;
            return r3;
        }
        return null;
    }

    /* renamed from: c */
    public abstract java.lang.Object m2306c();

    /* renamed from: g */
    public abstract InterfaceC11714d m2305g();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Can't wrap try/catch for region: R(11:15|16|(2:18|(8:20|(2:22|(10:24|25|26|(2:28|(2:30|31))|32|33|34|35|36|37))|(1:42)(1:43)|33|34|35|36|37))|44|(0)|(0)(0)|33|34|35|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
        r12 = kotlin.C13291q.m5358a(r14);
        r13 = r12;
        kotlin.C13288p.m5362a(r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: Throwable -> 0x00cd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Throwable -> 0x00e0, blocks: (B:13:0x001c, B:15:0x0024, B:41:0x00b7, B:49:0x00d2, B:51:0x00d6, B:52:0x00df, B:16:0x003a, B:18:0x0042, B:20:0x004c, B:24:0x005d, B:26:0x0065, B:28:0x006d, B:30:0x0078, B:33:0x007d, B:35:0x008d, B:38:0x00a0, B:40:0x00ab), top: B:62:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0 A[Catch: Throwable -> 0x00cd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Throwable -> 0x00e0, blocks: (B:13:0x001c, B:15:0x0024, B:41:0x00b7, B:49:0x00d2, B:51:0x00d6, B:52:0x00df, B:16:0x003a, B:18:0x0042, B:20:0x004c, B:24:0x005d, B:26:0x0065, B:28:0x006d, B:30:0x0078, B:33:0x007d, B:35:0x008d, B:38:0x00a0, B:40:0x00ab), top: B:62:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab A[Catch: Throwable -> 0x00cd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Throwable -> 0x00e0, blocks: (B:13:0x001c, B:15:0x0024, B:41:0x00b7, B:49:0x00d2, B:51:0x00d6, B:52:0x00df, B:16:0x003a, B:18:0x0042, B:20:0x004c, B:24:0x005d, B:26:0x0065, B:28:0x006d, B:30:0x0078, B:33:0x007d, B:35:0x008d, B:38:0x00a0, B:40:0x00ab), top: B:62:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.AbstractC14266d.run():void");
    }
}
