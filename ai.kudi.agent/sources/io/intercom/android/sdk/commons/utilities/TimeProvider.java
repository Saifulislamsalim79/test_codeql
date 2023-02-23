package io.intercom.android.sdk.commons.utilities;
/* loaded from: classes.dex */
public interface TimeProvider {
    public static final TimeProvider SYSTEM = new TimeProvider() { // from class: io.intercom.android.sdk.commons.utilities.TimeProvider.1
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.commons.utilities.TimeProvider
        public long currentTimeMillis() {
            long $l0 = System.currentTimeMillis();
            return $l0;
        }
    };

    long currentTimeMillis();
}
