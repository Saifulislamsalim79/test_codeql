package ai.kudi.agent.core.usecases;

import java.io.File;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p565l.AbstractC14120b0;
import p565l.C14235v;
import p565l.C14236w;
/* compiled from: MultiPartFileHandling.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/core/usecases/MultiPartFileHandling;", "", "()V", "prepareFilePart", "Lokhttp3/MultipartBody$Part;", "filePath", "", "pathName", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MultiPartFileHandling {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final C14236w.C14238b prepareFilePart(String str, String str2) {
        Log_OC.getArray(str, "filePath");
        Log_OC.getArray(str2, "pathName");
        File $r3 = new File(str);
        C14235v $r4 = C14235v.m2474d("multipart/form-data");
        AbstractC14120b0 $r5 = AbstractC14120b0.create($r4, $r3);
        String $r1 = $r3.getName();
        C14236w.C14238b $r6 = C14236w.C14238b.m2465b(str2, $r1, $r5);
        Log_OC.loadImage($r6, "createFormData(pathName, file.name, requestFile)");
        return $r6;
    }
}
