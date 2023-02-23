package org.org.org.org.org.util;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.io.File;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.C14248aa;
import lombok.org.asm.DynamicTableModel$b;
import lombok.org.asm.SignatureReader;
import org.org.org.org.asm.C14598f;
import org.org.org.org.asm.asm.Coin;
import org.org.org.org.asm.asm.Complex;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.Context;
import org.org.org.org.org.menu.C14712e;
import org.org.org.org.org.menu.C14714h;
/* loaded from: classes.dex */
public final class BigReal {
    public static final String ONE;
    public static final Coin ZERO;

    /* renamed from: d */
    public static final C14728c f32922d;

    /* renamed from: m */
    public final Context f32923m;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14728c $r0 = new C14728c(null);
        f32922d = $r0;
        Complex $r1 = Coin.ZERO;
        Coin $r2 = $r1.add("1.8.0-native");
        ZERO = $r2;
        StringBuilder $r3 = new StringBuilder();
        C14598f $r4 = C14598f.f32351c;
        android.content.Context $r5 = $r4.getContext();
        File $r6 = $r5.getFilesDir();
        String $r7 = $r6.toString();
        $r3.append($r7);
        C14712e $r8 = C14714h.f32857a;
        String $r72 = $r8.m574a();
        $r3.append($r72);
        $r3.append("sessions");
        String $r73 = $r3.toString();
        ONE = $r73;
    }

    public BigReal(Context context) {
        Log_OC.getArray(context, "preferences");
        this.f32923m = context;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m478a() {
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.CONSISTENCY;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r1.get($r2, false, $r3);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            String $r6 = "wipeAllSDKData() called, [logAspect: " + $r2 + ']';
            $r1.size($r2, $r3, "ConsistencyHandler", $r6);
        }
        Context $r7 = this.f32923m;
        $r7.clear();
        C14248aa $r8 = C14248aa.f31322b;
        InterfaceC11719g $r9 = DynamicTableModel$b.f31274b;
        Pair r12 = new Pair(null);
        InterfaceC11719g r13 = $r9;
        SignatureReader.m2355a($r8, r13, null, r12, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void add(String str) {
        Context $r2 = this.f32923m;
        $r2.remove(str, "LAST_KNOWN_SDK_VERSION");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Coin multiply() {
        Context $r1 = this.f32923m;
        String $r2 = $r1.toString("LAST_KNOWN_SDK_VERSION");
        if ($r2 != null) {
            Complex $r3 = Coin.ZERO;
            Coin $r4 = $r3.add($r2);
            return $r4;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add() {
        Coin $r8;
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.CONSISTENCY;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            String $r7 = "checkConsistency() called, [logAspect: " + $r3 + ']';
            $r2.size($r3, $r4, "ConsistencyHandler", $r7);
        }
        try {
            $r8 = multiply();
        } catch (Exception e) {
            $r8 = null;
        }
        System $r22 = System.f32375c;
        LogAspect $r32 = LogAspect.CONSISTENCY;
        LogSeverity $r42 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r52 = $r22.get($r32, false, $r42);
        int $i02 = $r52.ordinal();
        if ($i02 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r72 = "checkConsistency(): lastKnownVersion = " + $r8 + ' ';
            $r6.append($r72);
            $r6.append(", [logAspect: ");
            $r6.append($r32);
            $r6.append(']');
            String $r73 = $r6.toString();
            $r22.size($r32, $r42, "ConsistencyHandler", $r73);
        }
        if ($r8 != null) {
            Coin $r10 = ZERO;
            int $i03 = $r8.compareTo($r10);
            if ($i03 >= 0) {
                return;
            }
        }
        LogSeverity $r43 = LogSeverity.INFO;
        TopLevel$NativeErrors $r53 = $r22.get($r32, false, $r43);
        int $i04 = $r53.ordinal();
        if ($i04 == 0) {
            String $r74 = "checkConsistency() old version going to wipe all legacy data, [logAspect: " + $r32 + ']';
            $r22.size($r32, $r43, "ConsistencyHandler", $r74);
        }
        m478a();
        add("1.8.7-native");
    }
}
