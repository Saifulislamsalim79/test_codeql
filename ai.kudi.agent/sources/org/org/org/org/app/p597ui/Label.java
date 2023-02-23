package org.org.org.org.app.p597ui;

import com.segment.analytics.Middleware;
import com.smartlook.sdk.smartlook.integration.segment.SegmentMiddlewareOption;
import java.util.List;
import kotlin.C13218k;
/* renamed from: org.org.org.org.app.ui.Label */
/* loaded from: classes.dex */
public final class Label {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Label() {
        C14583b $r1 = C14583b.f32300a;
        C13218k.m5625b($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte read(java.util.List r9) {
        /*
            r8 = this;
            r1 = 0
            byte r0 = (byte) r1
            java.util.Iterator r2 = r9.iterator()
        L6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1b
            java.lang.Object r4 = r2.next()
            r6 = r4
            com.smartlook.sdk.smartlook.integration.segment.SegmentMiddlewareOption r6 = (com.smartlook.sdk.smartlook.integration.segment.SegmentMiddlewareOption) r6
            r5 = r6
            byte r7 = r5.getCode()
            r0 = r0 | r7
            byte r0 = (byte) r0
            goto L6
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.app.p597ui.Label.read(java.util.List):byte");
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
    public final Middleware m1169a(List list) {
        if (list != null) {
            read(list);
        } else {
            SegmentMiddlewareOption $r2 = SegmentMiddlewareOption.ENABLE_DEFAULT;
            $r2.getCode();
        }
        Type $r3 = new Type(this);
        return $r3;
    }
}
