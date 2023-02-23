package org.org.org.org.app.tools;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.smartlook.sdk.smartlook.integration.model.Integration;
/* renamed from: org.org.org.org.app.tools.h */
/* loaded from: classes.dex */
public final class C14582h extends Integration {

    /* renamed from: d */
    public final FirebaseAnalytics f32299d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public final FirebaseAnalytics m1170a() {
        FirebaseAnalytics r1 = this.f32299d;
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
    @Override // com.smartlook.sdk.smartlook.integration.model.Integration
    public int instanceHashCode() {
        FirebaseAnalytics $r1 = this.f32299d;
        int $i0 = $r1.hashCode();
        return $i0;
    }

    @Override // com.smartlook.sdk.smartlook.integration.model.Integration
    public String name() {
        return "firebase_analytics";
    }

    @Override // com.smartlook.sdk.smartlook.integration.model.Integration
    public String printName() {
        return "Firebase analytics";
    }
}
