package org.org.org.org.asm.asm;

import java.util.List;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13262h;
import kotlin.p549l0.InterfaceC13257f;
/* loaded from: classes.dex */
public final class Complex {
    private Complex() {
    }

    public /* synthetic */ Complex(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Coin add(String $r1) {
        int $i0;
        int $i1;
        int $i2;
        String $r12;
        String $r8;
        Log_OC.getArray($r1, "version");
        C13262h $r2 = new C13262h("(0|[1-9]\\d*)?(?:\\.)?(0|[1-9]\\d*)?(?:\\.)?(0|[1-9]\\d*)?(?:-([\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*))?(?:\\+([\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*))?");
        InterfaceC13257f $r3 = $r2.m5523d($r1);
        if ($r3 == null) {
            IllegalArgumentException $r9 = new IllegalArgumentException("Invalid version string [" + $r1 + ']');
            throw $r9;
        }
        List $r5 = $r3.mo5533b();
        Object $r6 = $r5.get(1);
        CharSequence $r7 = (CharSequence) $r6;
        int $i02 = $r7.length();
        if ($i02 == 0) {
            $i0 = 0;
        } else {
            List $r52 = $r3.mo5533b();
            Object $r62 = $r52.get(1);
            $i0 = Integer.parseInt((String) $r62);
        }
        List $r53 = $r3.mo5533b();
        Object $r63 = $r53.get(2);
        CharSequence $r72 = (CharSequence) $r63;
        int $i12 = $r72.length();
        if ($i12 == 0) {
            $i1 = 0;
        } else {
            List $r54 = $r3.mo5533b();
            Object $r64 = $r54.get(2);
            $i1 = Integer.parseInt((String) $r64);
        }
        List $r55 = $r3.mo5533b();
        Object $r65 = $r55.get(3);
        CharSequence $r73 = (CharSequence) $r65;
        int $i22 = $r73.length();
        if ($i22 == 0) {
            $i2 = 0;
        } else {
            List $r56 = $r3.mo5533b();
            Object $r66 = $r56.get(3);
            $i2 = Integer.parseInt((String) $r66);
        }
        List $r57 = $r3.mo5533b();
        Object $r67 = $r57.get(4);
        CharSequence $r74 = (CharSequence) $r67;
        int $i3 = $r74.length();
        if ($i3 == 0) {
            $r12 = null;
        } else {
            List $r58 = $r3.mo5533b();
            Object $r68 = $r58.get(4);
            $r12 = (String) $r68;
        }
        List $r59 = $r3.mo5533b();
        Object $r69 = $r59.get(5);
        CharSequence $r75 = (CharSequence) $r69;
        int $i32 = $r75.length();
        boolean $z0 = $i32 == 0;
        if ($z0) {
            $r8 = null;
        } else {
            List $r510 = $r3.mo5533b();
            Object $r610 = $r510.get(5);
            $r8 = (String) $r610;
        }
        Coin $r4 = new Coin($i0, $i1, $i2, $r12, $r8);
        return $r4;
    }
}
