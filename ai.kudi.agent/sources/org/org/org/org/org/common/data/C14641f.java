package org.org.org.org.org.common.data;

import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.menu.C14572i;
import org.org.org.org.android.util.menu.EnumC14570c;
import org.org.org.org.android.util.menu.EnumC14571f;
/* renamed from: org.org.org.org.org.common.data.f */
/* loaded from: classes.dex */
public final class C14641f {

    /* renamed from: c */
    public final double[] f32528c;

    /* renamed from: r */
    public final double[] f32529r;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14641f(org.org.org.org.org.common.telemetry.Item item) {
        Log_OC.getArray(item, "record");
        C14572i $r4 = EnumC14571f.f32274l;
        EnumC14571f $r5 = item.m908a();
        EnumC14570c $r6 = $r4.m1195d($r5);
        int $i0 = item.getStatus();
        int $i1 = item.getTag();
        int $i2 = item.insert();
        int $i3 = item.length();
        double[] $r1 = new double[2];
        this.f32528c = $r1;
        double[] $r7 = new double[2];
        this.f32529r = $r7;
        EnumC14570c $r2 = EnumC14570c.f32268a;
        if ($r6 == $r2 && $i0 < $i1) {
            int $i4 = $r2.getParent();
            double $d0 = $i2;
            double $d02 = $i0;
            Double.isNaN($d0);
            Double.isNaN($d02);
            double $d03 = $d0 / $d02;
            $r1[$i4] = $d03;
            int $i22 = $r2.getParent();
            double $d04 = $i3;
            double $d1 = $i1;
            Double.isNaN($d04);
            Double.isNaN($d1);
            double $d12 = $d04 / $d1;
            $r7[$i22] = $d12;
            EnumC14570c $r22 = EnumC14570c.f32270f;
            $r1[$r22.getParent()] = $d12;
            $r7[$r22.getParent()] = $d03;
            return;
        }
        EnumC14570c $r8 = EnumC14570c.f32270f;
        if ($r6 == $r8) {
            int $i42 = $r2.getParent();
            double $d13 = $i3;
            double $d14 = $i0;
            Double.isNaN($d13);
            Double.isNaN($d14);
            double $d05 = $d13 / $d14;
            $r1[$i42] = $d05;
            int $i32 = $r2.getParent();
            double $d06 = $i2;
            double $d15 = $i1;
            Double.isNaN($d06);
            Double.isNaN($d15);
            double $d16 = $d06 / $d15;
            $r7[$i32] = $d16;
            $r1[$r8.getParent()] = $d16;
            $r7[$r8.getParent()] = $d05;
            return;
        }
        int $i43 = $r2.getParent();
        double $d17 = $i3;
        double $d18 = $i0;
        Double.isNaN($d17);
        Double.isNaN($d18);
        double $d07 = $d17 / $d18;
        $r1[$i43] = $d07;
        int $i33 = $r2.getParent();
        double $d08 = $i2;
        double $d19 = $i1;
        Double.isNaN($d08);
        Double.isNaN($d19);
        double $d110 = $d08 / $d19;
        $r7[$i33] = $d110;
        $r1[$r8.getParent()] = $d110;
        $r7[$r8.getParent()] = $d07;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final double m935a(EnumC14570c enumC14570c) {
        Log_OC.getArray(enumC14570c, "orientation");
        double[] $r2 = this.f32529r;
        int $i0 = enumC14570c.getParent();
        double $d0 = $r2[$i0];
        return $d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double add(EnumC14570c enumC14570c) {
        Log_OC.getArray(enumC14570c, "orientation");
        double[] $r2 = this.f32528c;
        int $i0 = enumC14570c.getParent();
        double $d0 = $r2[$i0];
        return $d0;
    }
}
