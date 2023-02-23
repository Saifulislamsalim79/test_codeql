package org.org.org.org.org.menu;

import android.content.Context;
import android.os.StatFs;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.io.File;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.ByteVector;
import org.org.org.org.asm.C14598f;
import org.org.org.org.asm.Level;
import org.org.org.org.asm.menu.C14608i;
import org.org.org.org.asm.parser.Attribute;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.common.telemetry.C14648h;
import org.org.org.org.org.common.telemetry.Item;
/* renamed from: org.org.org.org.org.menu.h */
/* loaded from: classes.dex */
public final class C14714h implements InterfaceC14715i {

    /* renamed from: a */
    public static final C14712e f32857a;

    /* renamed from: c */
    public static final String f32858c;

    /* renamed from: e */
    public static final String f32859e;

    /* renamed from: i */
    public static final String f32860i;

    /* renamed from: s */
    public static final String f32861s;

    /* renamed from: b */
    public C14713f f32862b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14712e $r0 = new C14712e(null);
        f32857a = $r0;
        String $r1 = File.separator;
        Log_OC.loadImage($r1, "File.separator");
        f32859e = $r1;
        C14598f $r2 = C14598f.f32351c;
        Context $r3 = $r2.getContext();
        File $r4 = $r3.getFilesDir();
        String $r5 = $r4.toString();
        Log_OC.loadImage($r5, "ContextExtractorUtil.app…ext().filesDir.toString()");
        f32858c = $r5;
        String $r52 = $r5 + $r1 + "smartlook" + $r1 + "1.8.0-native";
        String $r7 = $r52 + $r1 + "sessions";
        f32860i = $r7;
        f32861s = $r52 + $r1 + "identification";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String m565a() {
        /*
            r20 = this;
            java.io.File r1 = new java.io.File
            java.lang.String r2 = org.org.org.org.org.menu.C14714h.f32860i
            r1.<init>(r2)     // Catch: java.lang.Exception -> L60
            java.io.File[] r3 = r1.listFiles()     // Catch: java.lang.Exception -> L60
            if (r3 == 0) goto L39
            int r4 = r3.length
            if (r4 != 0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = 0
        L13:
            if (r5 == 0) goto L16
            goto L39
        L16:
            r7 = 0
            r6 = r3[r7]
            int r4 = kotlin.p557z.C13706j.m4074z(r3)     // Catch: java.lang.Exception -> L60
            if (r4 != 0) goto L20
            goto L3a
        L20:
            long r8 = r6.lastModified()     // Catch: java.lang.Exception -> L60
            r7 = 1
            if (r7 > r4) goto L3a
            r10 = 1
        L28:
            r1 = r3[r10]
            long r11 = r1.lastModified()     // Catch: java.lang.Exception -> L60
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 <= 0) goto L34
            r6 = r1
            r8 = r11
        L34:
            if (r10 == r4) goto L3a
            int r10 = r10 + 1
            goto L28
        L39:
            r6 = 0
        L3a:
            if (r6 == 0) goto L61
            org.org.org.org.org.initializer.f r14 = org.org.org.org.org.initializer.C14708f.f32807a
            org.org.org.org.org.common.Buffer r15 = r14.get()     // Catch: java.lang.Exception -> L60
            java.lang.String r2 = r15.add()     // Catch: java.lang.Exception -> L60
            java.lang.String r16 = r6.getName()     // Catch: java.lang.Exception -> L60
            r0 = r16
            boolean r5 = kotlin.p483e0.p485d.Log_OC.append(r2, r0)     // Catch: java.lang.Exception -> L60
            r7 = 1
            r5 = r5 ^ r7
            if (r5 == 0) goto L61
            org.org.org.org.asm.ByteVector r17 = org.org.org.org.asm.ByteVector.f32302a
            r0 = r17
            r0.get(r6)     // Catch: java.lang.Exception -> L60
            java.lang.String r2 = r6.getName()     // Catch: java.lang.Exception -> L60
            return r2
        L60:
            r18 = move-exception
        L61:
            r19 = 0
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.menu.C14714h.m565a():java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public File m563a(boolean z, String str, int i) {
        Log_OC.getArray(str, "sessionKey");
        String[] $r2 = {"config.txt"};
        File $r3 = mo552a(false, z, str, i, $r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: a */
    public File mo552a(boolean z, boolean z2, String str, int i, String... strArr) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(strArr, "suffixes");
        ByteVector $r4 = ByteVector.f32302a;
        String $r2 = f32860i;
        Integer $r6 = Integer.valueOf(i);
        Object[] $r5 = {str, "video_images", $r6, strArr};
        File $r7 = $r4.m1161a($r2, z, z2, $r5);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public File m562a(boolean z, boolean z2, String... strArr) {
        Log_OC.getArray(strArr, "suffixes");
        ByteVector $r4 = ByteVector.f32302a;
        String $r2 = f32861s;
        Object[] $r5 = {strArr};
        File $r3 = $r4.m1161a($r2, z, z2, $r5);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public String m564a(String $r4, int i) {
        Log_OC.getArray($r4, "sessionId");
        File $r5 = m560c(false, $r4, i);
        String $r6 = ByteVector.m1165a($r5);
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.STORAGE;
        LogSeverity $r3 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r7 = $r1.get($r2, true, $r3);
        int $i1 = $r7.ordinal();
        if ($i1 == 0) {
            StringBuilder $r8 = new StringBuilder();
            $r8.append("readVideoConfigRaw() called with: sessionId = " + $r4 + ", recordIndex = " + i + ", file = " + Log.get($r5, false, 2, null));
            $r8.append(", [logAspect: ");
            $r8.append($r2);
            $r8.append(']');
            $r1.size($r2, $r3, "SDKStorageHandler", $r8.toString());
        } else if ($i1 != 1) {
            return $r6;
        } else {
            String $r42 = "readVideoConfigRaw() called with: sessionId = " + $r4 + ", recordIndex = " + i;
            if ($r42 != null) {
                $r1.size($r2, $r3, "SDKStorageHandler", $r42);
                return $r6;
            }
        }
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: a */
    public void mo553a(Item item, String $r5) {
        Log_OC.getArray(item, "record");
        Log_OC.getArray($r5, "sessionId");
        File $r6 = m558d(true, $r5, item.getType());
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.STORAGE;
        LogSeverity $r4 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r7 = $r2.get($r3, true, $r4);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            StringBuilder $r8 = new StringBuilder();
            String str = "writeRecord(): sessionId = " + $r5 + ", recordIndex = " + item.getType() + ", ";
            $r8.append("record = " + Log.get(item, false, 2, null) + ", file = " + Log.get($r6, false, 2, null));
            $r8.append(", [logAspect: ");
            $r8.append($r3);
            $r8.append(']');
            $r2.size($r3, $r4, "SDKStorageHandler", $r8.toString());
        } else if ($i0 == 1) {
            String str2 = "writeRecord() called with: sessionId = " + $r5 + ", ";
            String $r52 = "record = " + Log.get(item, true);
            if ($r52 != null) {
                $r2.size($r3, $r4, "SDKStorageHandler", $r52);
            }
        }
        ByteVector $r10 = ByteVector.f32302a;
        $r10.m1163a(item, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: a */
    public boolean mo554a(String str) {
        Log_OC.getArray(str, "sessionId");
        ByteVector $r3 = ByteVector.f32302a;
        String[] $r1 = new String[0];
        File $r4 = m556d(true, false, str, $r1);
        boolean $z0 = $r3.add($r4);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    public File add(boolean z, String str, int i) {
        Log_OC.getArray(str, "sessionKey");
        String[] $r2 = {"session_record.mp4"};
        File $r3 = mo552a(false, z, str, i, $r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: b */
    public String mo551b(String $r4, int i) {
        Log_OC.getArray($r4, "sessionId");
        File $r5 = m558d(false, $r4, i);
        String $r6 = ByteVector.m1165a($r5);
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.STORAGE;
        LogSeverity $r3 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r7 = $r1.get($r2, true, $r3);
        int $i1 = $r7.ordinal();
        if ($i1 == 0) {
            StringBuilder $r8 = new StringBuilder();
            $r8.append("readRecordJson() called with: sessionId = " + $r4 + ", recordIndex = " + i + ", record = " + Log.get($r6, false, 2, null) + ", file = " + Log.get($r5, false, 2, null));
            $r8.append(", [logAspect: ");
            $r8.append($r2);
            $r8.append(']');
            $r1.size($r2, $r3, "SDKStorageHandler", $r8.toString());
        } else if ($i1 != 1) {
            return $r6;
        } else {
            String $r42 = "readRecordJson() called with: sessionId = " + $r4 + ", record = " + Log.get($r6, true);
            if ($r42 != null) {
                $r1.size($r2, $r3, "SDKStorageHandler", $r42);
                return $r6;
            }
        }
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public File m560c(boolean z, String str, int i) {
        Log_OC.getArray(str, "sessionKey");
        String[] $r2 = {"config_raw.txt"};
        File $r3 = mo552a(false, z, str, i, $r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: c */
    public C14648h mo550c(String $r2) {
        Log_OC.getArray($r2, "visitorId");
        File $r3 = m559d(false, $r2);
        C14608i $r4 = C14608i.f32364b;
        File $r5 = m559d(false, $r2);
        String $r6 = ByteVector.m1165a($r5);
        org.org.org.org.org.common.telemetry.ClassWriter $r7 = C14648h.f32578b;
        Object $r8 = $r4.m1083a($r6, $r7);
        C14648h $r9 = (C14648h) $r8;
        System $r10 = System.f32375c;
        LogAspect $r11 = LogAspect.STORAGE;
        LogSeverity $r1 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r12 = $r10.get($r11, true, $r1);
        int $i0 = $r12.ordinal();
        if ($i0 == 0) {
            StringBuilder $r13 = new StringBuilder();
            $r13.append("readIdentification() called with: visitorId = " + $r2 + ", identification = " + Log.get($r9, false, 2, null) + ", file = " + Log.get($r3, false, 2, null));
            $r13.append(", [logAspect: ");
            $r13.append($r11);
            $r13.append(']');
            $r10.size($r11, $r1, "SDKStorageHandler", $r13.toString());
        } else if ($i0 != 1) {
            return $r9;
        } else {
            String $r22 = "readIdentification() called with: visitorId = " + $r2;
            if ($r22 != null) {
                $r10.size($r11, $r1, "SDKStorageHandler", $r22);
                return $r9;
            }
        }
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public File m559d(boolean z, String str) {
        Log_OC.getArray(str, "visitorId");
        String[] $r3 = {str, "identification.txt"};
        File $r2 = m562a(false, z, $r3);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public File m558d(boolean z, String str, int i) {
        Log_OC.getArray(str, "sessionKey");
        String[] $r2 = {"record_metadata.txt"};
        File $r3 = m557d(false, z, str, i, $r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public File m557d(boolean z, boolean z2, String str, int i, String... strArr) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(strArr, "suffixes");
        ByteVector $r4 = ByteVector.f32302a;
        String $r2 = f32860i;
        Integer $r6 = Integer.valueOf(i);
        Object[] $r5 = {str, "records", $r6, strArr};
        File $r7 = $r4.m1161a($r2, z, z2, $r5);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public File m556d(boolean z, boolean z2, String str, String... strArr) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(strArr, "suffixes");
        ByteVector $r5 = ByteVector.f32302a;
        String $r3 = f32860i;
        Object[] $r6 = {str, "video_images", strArr};
        File $r4 = $r5.m1161a($r3, z, z2, $r6);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public File m555d(boolean z, boolean z2, String... strArr) {
        Log_OC.getArray(strArr, "suffixes");
        ByteVector $r4 = ByteVector.f32302a;
        String $r2 = f32860i;
        Object[] $r5 = {strArr};
        File $r3 = $r4.m1161a($r2, z, z2, $r5);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.org.org.org.org.menu.ListPopupWindow$ForwardingListener mo549d() {
        /*
            r28 = this;
            r0 = r28
            org.org.org.org.org.menu.f r4 = r0.f32862b
            if (r4 == 0) goto L7
            goto Le
        L7:
            org.org.org.org.org.menu.f r4 = new org.org.org.org.org.menu.f
            java.lang.String r5 = org.org.org.org.org.menu.C14714h.f32860i
            r4.<init>(r5)
        Le:
            r0 = r28
            r0.f32862b = r4
            kotlin.p483e0.p485d.Log_OC.append(r4)
            long r6 = r4.m569b()
            r0 = r28
            long r8 = r0.write()
            double r10 = (double) r8
            java.lang.Double.isNaN(r10)
            r12 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r10 = r10 * r12
            int r14 = (int) r10
            r15 = 200000000(0xbebc200, float:9.0810606E-32)
            int r14 = java.lang.Math.min(r15, r14)
            long r0 = (long) r14
            r16 = r0
            int r18 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r18 > 0) goto L44
            r15 = 50000000(0x2faf080, float:3.6872239E-37)
            long r6 = (long) r15
            int r18 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r18 >= 0) goto L41
            goto L44
        L41:
            org.org.org.org.org.menu.b r19 = org.org.org.org.org.menu.C14710b.f32850c
            goto L58
        L44:
            r0 = r28
            java.lang.String r5 = r0.m565a()
            if (r5 == 0) goto L56
            org.org.org.org.org.menu.Handle r20 = new org.org.org.org.org.menu.Handle
            r0 = r20
            r0.<init>(r5)
            r19 = r20
            goto L58
        L56:
            org.org.org.org.org.menu.ClassWriter r19 = org.org.org.org.org.menu.ClassWriter.f32848b
        L58:
            org.org.org.org.asm.parser.System r21 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r22 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.STORAGE
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r23 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r15 = 1
            r0 = r21
            r1 = r22
            r2 = r23
            org.org.org.org.asm.parser.TopLevel$NativeErrors r24 = r0.get(r1, r15, r2)
            r0 = r24
            int r14 = r0.ordinal()
            if (r14 == 0) goto L72
            return r19
        L72:
            java.lang.StringBuilder r25 = new java.lang.StringBuilder
            r0 = r25
            r0.<init>()
            java.lang.StringBuilder r26 = new java.lang.StringBuilder
            r0 = r26
            r0.<init>()
            java.lang.String r27 = "tryToFreeSpaceForWrite() processed: success=["
            r0 = r26
            r1 = r27
            r0.append(r1)
            r0 = r26
            r1 = r19
            r0.append(r1)
            r15 = 93
            r0 = r26
            r0.append(r15)
            r0 = r26
            java.lang.String r5 = r0.toString()
            r0 = r25
            r0.append(r5)
            java.lang.String r27 = ", [logAspect: "
            r0 = r25
            r1 = r27
            r0.append(r1)
            r0 = r25
            r1 = r22
            r0.append(r1)
            r15 = 93
            r0 = r25
            r0.append(r15)
            r0 = r25
            java.lang.String r5 = r0.toString()
            java.lang.String r27 = "SDKStorageHandler"
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r27
            r0.size(r1, r2, r3, r5)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.menu.C14714h.mo549d():org.org.org.org.org.menu.ListPopupWindow$ForwardingListener");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: d */
    public void mo548d(String $r4) {
        Log_OC.getArray($r4, "sessionId");
        String[] $r5 = {$r4};
        File $r6 = m555d(true, false, $r5);
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.STORAGE;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r1.get($r2, true, $r3);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            StringBuilder $r8 = new StringBuilder();
            $r8.append("deleteAllSessionData() called with: sessionId = " + $r4 + ", folder = " + Log.get($r6, false, 2, null));
            $r8.append(", [logAspect: ");
            $r8.append($r2);
            $r8.append(']');
            $r1.size($r2, $r3, "SDKStorageHandler", $r8.toString());
        } else if ($i0 == 1) {
            String $r42 = "deleteAllSessionData() called with: sessionId = " + $r4;
            if ($r42 != null) {
                $r1.size($r2, $r3, "SDKStorageHandler", $r42);
            }
        }
        ByteVector $r10 = ByteVector.f32302a;
        $r10.get($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: d */
    public void mo547d(String $r1, int i) {
        Log_OC.getArray($r1, "sessionId");
        String[] $r2 = new String[0];
        File $r3 = mo552a(true, false, $r1, i, $r2);
        String[] $r22 = new String[0];
        File $r4 = m557d(true, false, $r1, i, $r22);
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.STORAGE;
        LogSeverity $r7 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r8 = $r5.get($r6, true, $r7);
        int $i1 = $r8.ordinal();
        if ($i1 == 0) {
            StringBuilder $r9 = new StringBuilder();
            $r9.append("deleteAllRecordData() called with: sessionId = " + $r1 + ", recordIndex = " + i + ",folder = " + Log.get($r3, false, 2, null) + ", folder = " + Log.get($r4, false, 2, null));
            $r9.append(", [logAspect: ");
            $r9.append($r6);
            $r9.append(']');
            $r5.size($r6, $r7, "SDKStorageHandler", $r9.toString());
        } else if ($i1 == 1) {
            String $r12 = "deleteAllRecordData() called with: sessionId = " + $r1 + ", recordIndex = " + i;
            if ($r12 != null) {
                $r5.size($r6, $r7, "SDKStorageHandler", $r12);
            }
        }
        ByteVector $r11 = ByteVector.f32302a;
        $r11.get($r3);
        $r11.get($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: d */
    public void mo546d(String str, String $r5, int i) {
        Log_OC.getArray(str, "config");
        Log_OC.getArray($r5, "sessionId");
        File $r6 = m563a(true, $r5, i);
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.STORAGE;
        LogSeverity $r4 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r7 = $r2.get($r3, true, $r4);
        int $i1 = $r7.ordinal();
        if ($i1 == 0) {
            StringBuilder $r8 = new StringBuilder();
            $r8.append("writeVideoConfig() called with: config = " + str + ", sessionId = " + $r5 + ", recordIndex = " + i + ", file = " + Log.get($r6, false, 2, null));
            $r8.append(", [logAspect: ");
            $r8.append($r3);
            $r8.append(']');
            $r2.size($r3, $r4, "SDKStorageHandler", $r8.toString());
        } else if ($i1 == 1) {
            String $r52 = "writeVideoConfig() called with: sessionId = " + $r5 + ", recordIndex = " + i;
            if ($r52 != null) {
                $r2.size($r3, $r4, "SDKStorageHandler", $r52);
            }
        }
        ByteVector.write(str, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: d */
    public void mo545d(List list, String $r2, int i) {
        Log_OC.getArray(list, "rawConfig");
        Log_OC.getArray($r2, "sessionId");
        File $r6 = m560c(true, $r2, i);
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.STORAGE;
        LogSeverity $r5 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r7 = $r3.get($r4, true, $r5);
        int $i1 = $r7.ordinal();
        if ($i1 == 0) {
            StringBuilder $r8 = new StringBuilder();
            StringBuilder $r9 = new StringBuilder();
            $r9.append("writeConfigRaw() called with: ");
            $r9.append("rawConfig = ");
            String $r10 = Log.toString(list, false, false, 6, (Object) null);
            $r9.append($r10);
            $r9.append(", ");
            $r9.append("sessionId = ");
            $r9.append($r2);
            $r9.append(", ");
            $r9.append("recordIndex = ");
            $r9.append(i);
            $r9.append(", ");
            $r9.append("file = ");
            $r9.append(Log.get($r6, false, 2, null));
            $r8.append($r9.toString());
            $r8.append(", [logAspect: ");
            $r8.append($r4);
            $r8.append(']');
            $r3.size($r4, $r5, "SDKStorageHandler", $r8.toString());
        } else if ($i1 == 1) {
            String $r22 = "writeConfigRaw() called with: sessionId = " + $r2 + ", recordIndex = " + i;
            if ($r22 != null) {
                $r3.size($r4, $r5, "SDKStorageHandler", $r22);
            }
        }
        ByteVector $r11 = ByteVector.f32302a;
        $r11.m1163a(list, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: d */
    public void mo544d(C14648h c14648h, String $r2) {
        Log_OC.getArray(c14648h, "identification");
        Log_OC.getArray($r2, "visitorId");
        File $r6 = m559d(true, $r2);
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.STORAGE;
        LogSeverity $r5 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r7 = $r3.get($r4, true, $r5);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            StringBuilder $r8 = new StringBuilder();
            $r8.append("writeIdentification(): visitorId = " + $r2 + ", identification = " + Log.get(c14648h, false, 2, null) + ", file = " + Log.get($r6, false, 2, null));
            $r8.append(", [logAspect: ");
            $r8.append($r4);
            $r8.append(']');
            $r3.size($r4, $r5, "SDKStorageHandler", $r8.toString());
        } else if ($i0 == 1) {
            StringBuilder $r82 = new StringBuilder();
            $r82.append("writeIdentification() called with: ");
            $r82.append("identification = ");
            String $r9 = Log.get(c14648h, false, 2, null);
            $r82.append($r9);
            $r82.append(", ");
            $r82.append("visitorId = ");
            $r82.append($r2);
            String $r22 = $r82.toString();
            if ($r22 != null) {
                $r3.size($r4, $r5, "SDKStorageHandler", $r22);
            }
        }
        ByteVector $r11 = ByteVector.f32302a;
        $r11.m1163a(c14648h, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: e */
    public void mo543e(String $r4) {
        Log_OC.getArray($r4, "sessionId");
        String[] $r5 = new String[0];
        File $r6 = m556d(true, false, $r4, $r5);
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.STORAGE;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r1.get($r2, true, $r3);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            StringBuilder $r8 = new StringBuilder();
            $r8.append("deleteVideoSessionData() called with: sessionId = " + $r4 + ", folder = " + Log.get($r6, false, 2, null));
            $r8.append(", [logAspect: ");
            $r8.append($r2);
            $r8.append(']');
            $r1.size($r2, $r3, "SDKStorageHandler", $r8.toString());
        } else if ($i0 == 1) {
            String $r42 = "deleteVideoSessionData() called with: sessionId = " + $r4;
            if ($r42 != null) {
                $r1.size($r2, $r3, "SDKStorageHandler", $r42);
            }
        }
        ByteVector $r10 = ByteVector.f32302a;
        $r10.get($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    public List get() {
        ByteVector $r1 = ByteVector.f32302a;
        String[] $r2 = new String[0];
        File $r3 = m555d(true, false, $r2);
        List $r4 = ByteVector.get($r1, $r3, false, 2, null);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /* renamed from: i */
    public void mo542i(String $r4) {
        Log_OC.getArray($r4, "visitorId");
        String[] $r5 = {$r4};
        File $r6 = m562a(true, false, $r5);
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.STORAGE;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r1.get($r2, true, $r3);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            StringBuilder $r8 = new StringBuilder();
            $r8.append("deleteIdentification() called with: visitorId = " + $r4 + ", folder = " + Log.get($r6, false, 2, null));
            $r8.append(", [logAspect: ");
            $r8.append($r2);
            $r8.append(']');
            $r1.size($r2, $r3, "SDKStorageHandler", $r8.toString());
        } else if ($i0 == 1) {
            String $r42 = "deleteIdentification() called with: visitorId = " + $r4;
            if ($r42 != null) {
                $r1.size($r2, $r3, "SDKStorageHandler", $r42);
            }
        }
        ByteVector $r10 = ByteVector.f32302a;
        $r10.get($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0030 */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List read(java.lang.String r18) {
        /*
            r17 = this;
            java.lang.String r2 = "sessionId"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            org.org.org.org.asm.ByteVector r3 = org.org.org.org.asm.ByteVector.f32302a
            r5 = 0
            java.lang.String[] r4 = new java.lang.String[r5]
            r5 = 1
            r7 = 0
            r0 = r17
            r1 = r18
            java.io.File r6 = r0.m556d(r5, r7, r1, r4)
            r5 = 0
            r7 = 2
            r9 = 0
            java.util.List r8 = org.org.org.org.asm.ByteVector.get(r3, r6, r5, r7, r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r5 = 10
            int r11 = kotlin.p557z.C13722p.m3921o(r8, r5)
            r10.<init>(r11)
            java.util.Iterator r12 = r8.iterator()
        L2c:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L4b
            java.lang.Object r14 = r12.next()
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            r18 = r15
            r0 = r18
            int r11 = java.lang.Integer.parseInt(r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            r0 = r16
            r10.add(r0)
            goto L2c
        L4b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.menu.C14714h.read(java.lang.String):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.menu.InterfaceC14715i
    public long write() {
        String $r5 = f32858c;
        StatFs $r4 = new StatFs($r5);
        Level $r6 = Level.f32310F;
        long $l0 = $r6.insert($r4);
        long $l1 = $r6.update($r4);
        long $l02 = $l0 * $l1;
        System $r7 = System.f32375c;
        LogAspect $r8 = LogAspect.STORAGE;
        LogSeverity $r1 = LogSeverity.INFO;
        TopLevel$NativeErrors $r9 = $r7.get($r8, true, $r1);
        int $i2 = $r9.ordinal();
        if ($i2 != 0) {
            return $l02;
        }
        StringBuilder $r2 = new StringBuilder();
        StringBuilder $r3 = new StringBuilder();
        $r3.append("getFreeMemory() memory obtained: ");
        $r3.append("freeMemory = ");
        Attribute $r10 = Attribute.f32368a;
        String $r52 = Attribute.m1072a($r10, $l02, false, 2, null);
        $r3.append($r52);
        String $r53 = $r3.toString();
        $r2.append($r53);
        $r2.append(", [logAspect: ");
        $r2.append($r8);
        $r2.append(']');
        String $r54 = $r2.toString();
        $r7.size($r8, $r1, "Memory", $r54);
        return $l02;
    }
}
