package lombok.org.asm;

import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class Item {

    /* renamed from: a */
    public static final boolean f31287a;

    /* renamed from: b */
    public static final boolean f31288b;

    /* renamed from: c */
    public static final boolean f31289c;

    /* renamed from: d */
    public static final AtomicLong f31290d;

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
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r7 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r3.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        if (r3.equals("") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        r2 = true;
     */
    static {
        /*
            java.lang.Class<a.a.a.s> r0 = a.a.a.s.class
            boolean r1 = r0.desiredAssertionStatus()
            r2 = r1
            lombok.org.asm.Item.f31289c = r1
            java.lang.String r4 = "com.smartlook.coroutines.debug"
            java.lang.String r3 = lombok.org.asm.asm.ByteVector.get(r4)
            r1 = 0
            if (r3 != 0) goto L13
            goto L4c
        L13:
            int r5 = r3.hashCode()
            if (r5 == 0) goto L43
            r6 = 3551(0xddf, float:4.976E-42)
            if (r5 == r6) goto L3a
            r6 = 109935(0x1ad6f, float:1.54052E-40)
            if (r5 == r6) goto L30
            r6 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r5 != r6) goto L66
            java.lang.String r4 = "auto"
            boolean r7 = r3.equals(r4)
            if (r7 == 0) goto L66
            goto L4c
        L30:
            java.lang.String r4 = "off"
            boolean r2 = r3.equals(r4)
            if (r2 == 0) goto L66
            r2 = 0
            goto L4c
        L3a:
            java.lang.String r4 = "on"
            boolean r2 = r3.equals(r4)
            if (r2 == 0) goto L66
            goto L4b
        L43:
            java.lang.String r4 = ""
            boolean r2 = r3.equals(r4)
            if (r2 == 0) goto L66
        L4b:
            r2 = 1
        L4c:
            lombok.org.asm.Item.f31287a = r2
            if (r2 == 0) goto L5a
            java.lang.String r4 = "com.smartlook.coroutines.stacktrace.recovery"
            r6 = 1
            boolean r2 = lombok.org.asm.asm.AnnotationWriter.put(r4, r6)
            if (r2 == 0) goto L5a
            r1 = 1
        L5a:
            lombok.org.asm.Item.f31288b = r1
            java.util.concurrent.atomic.AtomicLong r8 = new java.util.concurrent.atomic.AtomicLong
            r9 = 0
            r8.<init>(r9)
            lombok.org.asm.Item.f31290d = r8
            return
        L66:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r4 = "System property 'com.smartlook.coroutines.debug' has unrecognized value '"
            r11.append(r4)
            r11.append(r3)
            r6 = 39
            r11.append(r6)
            java.lang.String r3 = r11.toString()
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r12.<init>(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.Item.<clinit>():void");
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
    public static final boolean m2375a() {
        boolean z0 = f31289c;
        return z0;
    }
}
