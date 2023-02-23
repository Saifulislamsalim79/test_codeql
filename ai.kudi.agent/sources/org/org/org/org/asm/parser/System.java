package org.org.org.org.asm.parser;

import android.os.Build;
import com.smartlook.sdk.smartlook.SmartlookBase;
import com.smartlook.sdk.smartlook.core.api.model.LogListener;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.util.Set;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13741y0;
/* loaded from: classes.dex */
public final class System {

    /* renamed from: c */
    public static final System f32375c;
    public static LogListener full;

    /* renamed from: id */
    public static final String f32376id;
    public static Set<LogAspect> reader;

    /* renamed from: s */
    public static LogSeverity f32377s;
    public static boolean sampleRead;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Set $r6;
        System $r1 = new System();
        f32375c = $r1;
        String $r3 = SmartlookBase.class.getSimpleName();
        f32376id = $r3;
        LogSeverity $r4 = LogSeverity.VERBOSE;
        f32377s = $r4;
        LogAspect $r0 = LogAspect.MANDATORY;
        LogAspect[] $r5 = {$r0};
        $r6 = C13741y0.m3829d($r5);
        reader = $r6;
    }

    private System() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final void m1063a(LogAspect logAspect, String str, Object object) {
        Log_OC.getArray(logAspect, "aspect");
        Log_OC.getArray(str, "tag");
        Log_OC.getArray(object, "messageCallback");
        System $r4 = f32375c;
        LogSeverity $r2 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r5 = $r4.get(logAspect, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r6 = new StringBuilder();
        String $r7 = object.mo759a();
        $r6.append($r7);
        $r6.append(", [logAspect: ");
        $r6.append(logAspect);
        $r6.append(']');
        String $r72 = $r6.toString();
        $r4.size(logAspect, $r2, str, $r72);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void add(LogAspect logAspect, String str, Object object) {
        Log_OC.getArray(logAspect, "aspect");
        Log_OC.getArray(str, "tag");
        Log_OC.getArray(object, "messageCallback");
        System $r4 = f32375c;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get(logAspect, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r6 = new StringBuilder();
        String $r7 = object.mo759a();
        $r6.append($r7);
        $r6.append(", [logAspect: ");
        $r6.append(logAspect);
        $r6.append(']');
        String $r72 = $r6.toString();
        $r4.size(logAspect, $r2, str, $r72);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String execute(String $r1) {
        if ($r1 == null) {
            String $r12 = f32376id;
            Log_OC.loadImage($r12, "DEFAULT_TAG");
            return $r12;
        }
        int $i0 = $r1.length();
        if ($i0 > 23) {
            int $i02 = Build.VERSION.SDK_INT;
            if ($i02 >= 24) {
                return $r1;
            }
            String $r13 = $r1.substring(0, 23);
            Log_OC.loadImage($r13, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return $r13;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String get(String str) {
        String $r2 = "Smartlook_" + str;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void parse(LogSeverity logSeverity, String str, String str2) {
        int $i2;
        int $i22;
        if (str2.length() < 4000) {
            if (logSeverity.getCode() == 7) {
                android.util.Log.e(str, str2);
                return;
            } else {
                android.util.Log.println(logSeverity.getCode(), str, str2);
                return;
            }
        }
        int $i1 = 0;
        int $i0 = str2.length();
        while ($i1 < $i0) {
            $i2 = C13277t.m5405V(str2, '\n', $i1, false, 4, null);
            int $i3 = $i2;
            if ($i2 == -1) {
                $i3 = $i0;
            }
            while (true) {
                $i22 = Math.min($i3, $i1 + 4000);
                String $r4 = str2.substring($i1, $i22);
                Log_OC.loadImage($r4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int $i12 = logSeverity.getCode();
                if ($i12 == 7) {
                    android.util.Log.e(str, $r4);
                } else {
                    int $i13 = logSeverity.getCode();
                    android.util.Log.println($i13, str, $r4);
                }
                if ($i22 >= $i3) {
                    break;
                }
                $i1 = $i22;
            }
            $i1 = $i22 + 1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0 != false) goto L9;
     */
    /* JADX WARN: Incorrect condition in loop: B:13:0x0023 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean read(com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r8) {
        /*
            r7 = this;
            boolean r0 = org.org.org.org.asm.parser.System.sampleRead
            if (r0 != 0) goto L39
            java.util.Set<com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect> r1 = org.org.org.org.asm.parser.System.reader
            boolean r0 = r1.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L3b
            java.util.Set<com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect> r1 = org.org.org.org.asm.parser.System.reader
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L1b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1b
            goto L36
        L1b:
            java.util.Iterator r3 = r1.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r6 = (com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect) r6
            r5 = r6
            if (r5 != r8) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            if (r0 == 0) goto L1f
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            if (r0 == 0) goto L3b
        L39:
            r2 = 1
            return r2
        L3b:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.parser.System.read(com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void set(LogAspect logAspect, String str, Object object) {
        Log_OC.getArray(logAspect, "aspect");
        Log_OC.getArray(str, "tag");
        Log_OC.getArray(object, "messageCallback");
        System $r4 = f32375c;
        LogSeverity $r2 = LogSeverity.ERROR;
        TopLevel$NativeErrors $r5 = $r4.get(logAspect, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r6 = new StringBuilder();
        String $r7 = object.mo759a();
        $r6.append($r7);
        $r6.append(", [logAspect: ");
        $r6.append(logAspect);
        $r6.append(']');
        String $r72 = $r6.toString();
        $r4.size(logAspect, $r2, str, $r72);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void write(LogAspect logAspect, String str, Object object) {
        Log_OC.getArray(logAspect, "aspect");
        Log_OC.getArray(str, "tag");
        Log_OC.getArray(object, "messageCallback");
        System $r4 = f32375c;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get(logAspect, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r6 = new StringBuilder();
        String $r7 = object.mo759a();
        $r6.append($r7);
        $r6.append(", [logAspect: ");
        $r6.append(logAspect);
        $r6.append(']');
        String $r72 = $r6.toString();
        $r4.size(logAspect, $r2, str, $r72);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TopLevel$NativeErrors get(LogAspect logAspect, boolean z, LogSeverity logSeverity) {
        Log_OC.getArray(logAspect, "aspect");
        Log_OC.getArray(logSeverity, "severity");
        LogAspect $r3 = LogAspect.MANDATORY;
        if (logAspect == $r3) {
            TopLevel$NativeErrors r4 = TopLevel$NativeErrors.f32378m;
            return r4;
        }
        int $i0 = logSeverity.getCode();
        LogSeverity $r2 = f32377s;
        int $i1 = $r2.getCode();
        if ($i0 < $i1) {
            TopLevel$NativeErrors r42 = TopLevel$NativeErrors.ReferenceError;
            return r42;
        }
        boolean $z1 = read(logAspect);
        if (!$z1) {
            TopLevel$NativeErrors r43 = TopLevel$NativeErrors.ReferenceError;
            return r43;
        } else if (z) {
            TopLevel$NativeErrors r44 = TopLevel$NativeErrors.RangeError;
            return r44;
        } else {
            TopLevel$NativeErrors r45 = TopLevel$NativeErrors.f32378m;
            return r45;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1 != false) goto L5;
     */
    /* JADX WARN: Incorrect condition in loop: B:9:0x001e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void read(java.util.Set r10, com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r11) {
        /*
            r9 = this;
            java.lang.String r0 = "aspects"
            kotlin.p483e0.p485d.Log_OC.getArray(r10, r0)
            java.lang.String r0 = "minimalSeverity"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            boolean r1 = r10 instanceof java.util.Collection
            r2 = 1
            if (r1 == 0) goto L16
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L16
            goto L3a
        L16:
            java.util.Iterator r3 = r10.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r6 = (com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect) r6
            r5 = r6
            int r7 = r5.getCode()
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r5 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.ALL
            int r8 = r5.getCode()
            if (r7 != r8) goto L36
            r1 = 1
            goto L37
        L36:
            r1 = 0
        L37:
            if (r1 == 0) goto L1a
            goto L3b
        L3a:
            r2 = 0
        L3b:
            org.org.org.org.asm.parser.System.sampleRead = r2
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r5 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.MANDATORY
            r10.add(r5)
            org.org.org.org.asm.parser.System.reader = r10
            org.org.org.org.asm.parser.System.f32377s = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.parser.System.read(java.util.Set, com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity):void");
    }

    public final void remove(LogListener logListener) {
        full = logListener;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void size(LogAspect logAspect, LogSeverity logSeverity, String str, String str2) {
        Log_OC.getArray(logAspect, "aspect");
        Log_OC.getArray(logSeverity, "severity");
        Log_OC.getArray(str, "tag");
        Log_OC.getArray(str2, "logMessage");
        LogListener $r5 = full;
        if ($r5 == null) {
            String $r1 = execute(str);
            parse(logSeverity, get($r1), str2);
            return;
        }
        String $r6 = logAspect.string();
        String $r7 = logSeverity.string();
        $r5.onLog($r6, $r7, str, str2);
    }
}
