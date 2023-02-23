package org.org.org.org.org.menu;

import android.graphics.Bitmap;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.io.File;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.ByteVector;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
/* renamed from: org.org.org.org.org.menu.c */
/* loaded from: classes.dex */
public final class C14711c {

    /* renamed from: a */
    public final InterfaceC14715i f32851a;

    public C14711c(InterfaceC14715i interfaceC14715i) {
        Log_OC.getArray(interfaceC14715i, "sdkStorageHandler");
        this.f32851a = interfaceC14715i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final File m576a(boolean z, String str, int i, int i2) {
        Log_OC.getArray(str, "sessionKey");
        InterfaceC14715i $r2 = this.f32851a;
        String $r5 = i2 + ".jpg";
        String[] $r3 = {$r5};
        File $r6 = $r2.mo552a(false, z, str, i, $r3);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, int i, int i2, Bitmap bitmap, int i3) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(bitmap, "frame");
        File $r7 = m576a(true, str, i, i2);
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.STORAGE;
        LogSeverity $r4 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r8 = $r2.get($r3, true, $r4);
        int $i3 = $r8.ordinal();
        if ($i3 == 0) {
            StringBuilder $r9 = new StringBuilder();
            StringBuilder $r5 = new StringBuilder();
            $r5.append("writeFrame(): ");
            $r5.append("sessionId = ");
            $r5.append(str);
            $r5.append(", ");
            $r5.append("recordIndex = ");
            $r5.append(i);
            $r5.append(", ");
            $r5.append("frameNumber = ");
            $r5.append(i2);
            $r5.append(", ");
            $r5.append("frame = ");
            String $r6 = Log.get(bitmap, false, 2, null);
            $r5.append($r6);
            $r5.append(", ");
            $r5.append("imageQuality = ");
            $r5.append(i3);
            $r5.append(", ");
            $r5.append("imageFile = ");
            String $r62 = Log.get($r7, false, 2, null);
            $r5.append($r62);
            String $r63 = $r5.toString();
            $r9.append($r63);
            $r9.append(", [logAspect: ");
            $r9.append($r3);
            $r9.append(']');
            String $r64 = $r9.toString();
            $r2.size($r3, $r4, "FrameStorageHandler", $r64);
        }
        ByteVector $r10 = ByteVector.f32302a;
        $r10.put(bitmap, 100, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m575d(String str, int i) {
        Log_OC.getArray(str, "sessionId");
        System $r5 = System.f32375c;
        LogAspect $r1 = LogAspect.STORAGE;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r5.get($r1, true, $r2);
        int $i1 = $r6.ordinal();
        if ($i1 == 0) {
            StringBuilder $r7 = new StringBuilder();
            String $r9 = "deleteAllFrames() called with: sessionId = " + str + ", recordIndex = " + i;
            $r7.append($r9);
            $r7.append(", [logAspect: ");
            $r7.append($r1);
            $r7.append(']');
            String $r92 = $r7.toString();
            $r5.size($r1, $r2, "FrameStorageHandler", $r92);
        }
        InterfaceC14715i $r10 = this.f32851a;
        String[] $r3 = new String[0];
        File $r11 = $r10.mo552a(true, true, str, i, $r3);
        ByteVector $r12 = ByteVector.f32302a;
        $r12.m1164a($r11, ".jpg");
    }
}
