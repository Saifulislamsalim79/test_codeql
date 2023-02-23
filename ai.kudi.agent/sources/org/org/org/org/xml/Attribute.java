package org.org.org.org.xml;

import android.content.Context;
import android.os.Build;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.C14605i;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.xml.asm.ByteVector;
import org.org.org.org.xml.asm.C14731f;
import org.org.org.org.xml.asm.ClassWriter;
import org.org.org.org.xml.asm.Label;
import org.org.org.org.xml.core.Segment;
/* loaded from: classes.dex */
public final class Attribute implements Node {

    /* renamed from: a */
    public Label f32924a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [org.org.org.org.xml.asm.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.org.org.org.xml.asm.ClassWriter] */
    public Attribute(Context context, FastMap fastMap, ByteVector byteVector) {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(fastMap, "sessionRecordIdStorage");
        Log_OC.getArray(byteVector, "oldUploadWorker");
        C14605i $r4 = C14605i.f32360l;
        boolean $z0 = $r4.add(false);
        if ($z0) {
            byteVector = r4;
            ?? c14731f = new C14731f(context, fastMap);
        } else {
            int $i0 = Build.VERSION.SDK_INT;
            if ($i0 >= 21) {
                byteVector = r6;
                ?? classWriter = new ClassWriter(context, fastMap);
            }
        }
        this.f32924a = byteVector;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.xml.Node
    public void write(Segment segment) {
        Log_OC.getArray(segment, "jobType");
        System $r4 = System.f32375c;
        LogAspect $r2 = LogAspect.RECORD;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r2, true, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("scheduleJob(): called with: jobType = ");
            String $r8 = Log.get(segment, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r4.size($r2, $r3, "JobManager", $r83);
        } else if ($i0 == 1) {
            $r4.size($r2, $r3, "JobManager", "scheduleJob(): called");
        }
        Label $r9 = this.f32924a;
        $r9.mo468a(segment);
    }
}
