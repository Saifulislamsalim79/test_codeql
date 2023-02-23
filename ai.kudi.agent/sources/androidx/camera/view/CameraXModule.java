package androidx.camera.view;

import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.Service;
import androidx.lifecycle.o;
/* loaded from: classes2.dex */
final class CameraXModule {

    /* renamed from: a */
    o f3711a;

    /* renamed from: androidx.camera.view.CameraXModule$1 */
    /* loaded from: classes.dex */
    class C12421 implements Service {

        /* renamed from: t */
        final /* synthetic */ CameraXModule f3712t;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public void onDestroy(PreferenceActivity preferenceActivity) {
            CameraXModule $r1 = this.f3712t;
            PreferenceActivity $r2 = $r1.a;
            if (preferenceActivity != $r2) {
                return;
            }
            $r1.m36698a();
            NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
            throw r4;
        }
    }

    /* renamed from: a */
    void m36698a() {
        throw null;
    }
}
