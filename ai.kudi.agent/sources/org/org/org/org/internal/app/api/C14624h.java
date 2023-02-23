package org.org.org.org.internal.app.api;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
/* renamed from: org.org.org.org.internal.app.api.h */
/* loaded from: classes.dex */
public final class C14624h implements Object {

    /* renamed from: m */
    public static final b$c$a f32426m;

    /* renamed from: a */
    public final long f32427a;

    /* renamed from: b */
    public final boolean f32428b;

    /* renamed from: c */
    public final String f32429c;

    /* renamed from: d */
    public final String f32430d;

    /* renamed from: e */
    public final int f32431e;

    /* renamed from: f */
    public final boolean f32432f;

    /* renamed from: g */
    public final long f32433g;

    /* renamed from: h */
    public final boolean f32434h;

    /* renamed from: j */
    public final int f32435j;

    /* renamed from: k */
    public final boolean f32436k;

    /* renamed from: q */
    public final String f32437q;

    /* renamed from: r */
    public final boolean f32438r;
    public final long type;

    /* renamed from: w */
    public final long f32439w;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        b$c$a $r0 = new b$c$a(null);
        f32426m = $r0;
    }

    public C14624h(boolean z, boolean z2, String str, String str2, int i, int i2, long j, boolean z3, long j2, long j3, String str3, boolean z4, long j4, boolean z5) {
        Log_OC.getArray(str, "writerHost");
        Log_OC.getArray(str2, "storeGroup");
        Log_OC.getArray(str3, "mobileRenderingMode");
        this.f32428b = z;
        this.f32436k = z2;
        this.f32429c = str;
        this.f32430d = str2;
        this.f32435j = i;
        this.f32431e = i2;
        this.f32433g = j;
        this.f32434h = z3;
        this.type = j2;
        this.f32439w = j3;
        this.f32437q = str3;
        this.f32432f = z4;
        this.f32427a = j4;
        this.f32438r = z5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m1008a() {
        boolean z0 = this.f32434h;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final int m1007b() {
        int i0 = this.f32435j;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final String m1006c() {
        String r1 = this.f32429c;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final String m1005d() {
        String r1 = this.f32437q;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m1004e() {
        String r1 = this.f32430d;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        boolean $z0 = this.f32428b;
        $r1.put("sensitive", $z0);
        boolean $z02 = this.f32436k;
        $r1.put("analytics", $z02);
        String $r2 = this.f32429c;
        $r1.put("writerHost", $r2);
        String $r22 = this.f32430d;
        $r1.put("storeGroup", $r22);
        int $i0 = this.f32435j;
        $r1.put("mobileBitrate", $i0);
        int $i02 = this.f32431e;
        $r1.put("mobileFramerate", $i02);
        long $l1 = this.f32433g;
        $r1.put("mobileTargetHeight", $l1);
        boolean $z03 = this.f32434h;
        $r1.put("mobileData", $z03);
        long $l12 = this.type;
        $r1.put("maxRecordDuration", $l12);
        long $l13 = this.f32439w;
        $r1.put("maxSessionDuration", $l13);
        String $r23 = this.f32437q;
        $r1.put("mobileRenderingMode", $r23);
        boolean $z04 = this.f32432f;
        $r1.put("canSwitchRenderingMode", $z04);
        long $l14 = this.f32427a;
        $r1.put("sessionTimeout", $l14);
        boolean $z05 = this.f32438r;
        $r1.put("recordNetwork", $z05);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof C14624h;
            if ($z0) {
                C14624h $r2 = (C14624h) obj;
                boolean $z02 = this.f32428b;
                boolean $z1 = $r2.f32428b;
                if ($z02 == $z1) {
                    boolean $z03 = this.f32436k;
                    boolean $z12 = $r2.f32436k;
                    if ($z03 == $z12) {
                        String $r3 = this.f32429c;
                        String $r4 = $r2.f32429c;
                        boolean $z04 = Log_OC.append($r3, $r4);
                        if ($z04) {
                            String $r32 = this.f32430d;
                            String $r42 = $r2.f32430d;
                            boolean $z05 = Log_OC.append($r32, $r42);
                            if ($z05) {
                                int $i0 = this.f32435j;
                                int $i1 = $r2.f32435j;
                                if ($i0 == $i1) {
                                    int $i02 = this.f32431e;
                                    int $i12 = $r2.f32431e;
                                    if ($i02 == $i12) {
                                        long $l2 = this.f32433g;
                                        long $l3 = $r2.f32433g;
                                        if ($l2 == $l3) {
                                            boolean $z06 = this.f32434h;
                                            boolean $z13 = $r2.f32434h;
                                            if ($z06 == $z13) {
                                                long $l22 = this.type;
                                                long $l32 = $r2.type;
                                                if ($l22 == $l32) {
                                                    long $l23 = this.f32439w;
                                                    long $l33 = $r2.f32439w;
                                                    if ($l23 == $l33) {
                                                        String $r33 = this.f32437q;
                                                        String $r43 = $r2.f32437q;
                                                        boolean $z07 = Log_OC.append($r33, $r43);
                                                        if ($z07) {
                                                            boolean $z08 = this.f32432f;
                                                            boolean $z14 = $r2.f32432f;
                                                            if ($z08 == $z14) {
                                                                long $l24 = this.f32427a;
                                                                long $l34 = $r2.f32427a;
                                                                if ($l24 == $l34) {
                                                                    boolean $z09 = this.f32438r;
                                                                    boolean $z15 = $r2.f32438r;
                                                                    return $z09 == $z15;
                                                                }
                                                                return false;
                                                            }
                                                            return false;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final boolean m1003f() {
        boolean z0 = this.f32432f;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long getCount() {
        long l0 = this.f32427a;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getGroupId() {
        int i0 = this.f32431e;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long getItemId() {
        long l0 = this.type;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getValue() {
        boolean z0 = this.f32428b;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean $z0 = this.f32428b;
        if ($z0) {
            $z0 = true;
        }
        int $i0 = $z0 ? 1 : 0;
        int $i02 = $i0 * 31;
        boolean $z02 = this.f32436k;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i1 = i;
        int $i12 = ($i02 + $i1) * 31;
        String $r1 = this.f32429c;
        int $i2 = $r1 != null ? $r1.hashCode() : 0;
        int $i13 = ($i12 + $i2) * 31;
        String $r12 = this.f32430d;
        int $i22 = $r12 != null ? $r12.hashCode() : 0;
        int $i23 = this.f32435j;
        int $i24 = this.f32431e;
        long $l3 = this.f32433g;
        int $i25 = Version$BuildAwareOrder.compare($l3);
        int $i14 = ((((((($i13 + $i22) * 31) + $i23) * 31) + $i24) * 31) + $i25) * 31;
        boolean $z03 = this.f32434h;
        int i2 = $z03;
        if ($z03 != 0) {
            i2 = 1;
        }
        int $i26 = i2;
        long $l32 = this.type;
        int $i27 = Version$BuildAwareOrder.compare($l32);
        long $l33 = this.f32439w;
        int $i28 = Version$BuildAwareOrder.compare($l33);
        int $i15 = ((((($i14 + $i26) * 31) + $i27) * 31) + $i28) * 31;
        String $r13 = this.f32437q;
        int $i03 = $r13 != null ? $r13.hashCode() : 0;
        int $i04 = ($i15 + $i03) * 31;
        boolean $z04 = this.f32432f;
        int i3 = $z04;
        if ($z04 != 0) {
            i3 = 1;
        }
        int $i16 = i3;
        long $l34 = this.f32427a;
        int $i17 = Version$BuildAwareOrder.compare($l34);
        int $i05 = ((($i04 + $i16) * 31) + $i17) * 31;
        boolean $z05 = this.f32438r;
        int $i18 = $z05 ? 1 : $z05 ? 1 : 0;
        return $i05 + $i18;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final boolean m1002i() {
        boolean z0 = this.f32436k;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: l */
    public final long m1001l() {
        long l0 = this.f32439w;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: m */
    public final boolean m1000m() {
        boolean z0 = this.f32438r;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("RecordingSettings(sensitive=");
        boolean $z0 = this.f32428b;
        $r2.append($z0);
        $r2.append(", analytics=");
        boolean $z02 = this.f32436k;
        $r2.append($z02);
        $r2.append(", writerHost=");
        String $r1 = this.f32429c;
        $r2.append($r1);
        $r2.append(", storeGroup=");
        String $r12 = this.f32430d;
        $r2.append($r12);
        $r2.append(", mobileBitrate=");
        int $i0 = this.f32435j;
        $r2.append($i0);
        $r2.append(", mobileFramerate=");
        int $i02 = this.f32431e;
        $r2.append($i02);
        $r2.append(", mobileTargetHeight=");
        long $l1 = this.f32433g;
        $r2.append($l1);
        $r2.append(", mobileData=");
        boolean $z03 = this.f32434h;
        $r2.append($z03);
        $r2.append(", maxRecordDuration=");
        long $l12 = this.type;
        $r2.append($l12);
        $r2.append(", maxSessionDuration=");
        long $l13 = this.f32439w;
        $r2.append($l13);
        $r2.append(", mobileRenderingMode=");
        String $r13 = this.f32437q;
        $r2.append($r13);
        $r2.append(", canSwitchRenderingMode=");
        boolean $z04 = this.f32432f;
        $r2.append($z04);
        $r2.append(", sessionTimeout=");
        long $l14 = this.f32427a;
        $r2.append($l14);
        $r2.append(", recordNetwork=");
        boolean $z05 = this.f32438r;
        $r2.append($z05);
        $r2.append(")");
        String $r14 = $r2.toString();
        return $r14;
    }
}
