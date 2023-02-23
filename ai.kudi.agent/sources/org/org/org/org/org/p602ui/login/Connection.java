package org.org.org.org.org.p602ui.login;

import com.smartlook.sdk.smartlook.core.renderingdata.annotation.WebGLRecordingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p485d.DBUtils$1;
/* renamed from: org.org.org.org.org.ui.login.Connection */
/* loaded from: classes.dex */
public final class Connection {
    private Connection() {
    }

    public /* synthetic */ Connection(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final State getState(WebGLRecordingMode webGLRecordingMode) {
        if (webGLRecordingMode == null) {
            State r3 = State.Failed;
            return r3;
        }
        WebGLRecordingMode r5 = webGLRecordingMode;
        int $i0 = r5.ordinal();
        if ($i0 == 0) {
            State r32 = State.state;
            return r32;
        } else if ($i0 == 1) {
            State r33 = State.state;
            return r33;
        } else {
            Throwable r4 = new NoWhenBranchMatchedException();
            Throwable r6 = r4;
            throw r6;
        }
    }
}
