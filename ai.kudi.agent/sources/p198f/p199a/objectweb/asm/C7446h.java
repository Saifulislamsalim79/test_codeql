package p198f.p199a.objectweb.asm;

import android.content.pm.PackageInfo;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: VersionInfo.kt */
/* renamed from: f.a.objectweb.asm.h */
/* loaded from: classes.dex */
public final class C7446h {
    private C7446h() {
    }

    public /* synthetic */ C7446h(DBUtils$1 dBUtils$1) {
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
    public final Label show(PackageInfo packageInfo) {
        Log_OC.getArray(packageInfo, "packageInfo");
        int $i0 = packageInfo.versionCode;
        String $r3 = packageInfo.versionName;
        Log_OC.loadImage($r3, "packageInfo.versionName");
        Label $r2 = new Label($i0, $r3);
        return $r2;
    }
}
