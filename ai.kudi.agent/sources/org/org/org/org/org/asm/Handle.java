package org.org.org.org.org.asm;

import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class Handle {

    /* renamed from: b */
    public final C14633d f32484b;

    /* renamed from: c */
    public final String f32485c;

    public Handle(String str, C14633d c14633d) {
        Log_OC.getArray(str, "activityName");
        Log_OC.getArray(c14633d, "customFragmentLifecycleCallback");
        this.f32485c = str;
        this.f32484b = c14633d;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C14633d m983a() {
        C14633d r1 = this.f32484b;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Handle;
            if ($z0) {
                Handle $r3 = (Handle) obj;
                String $r4 = this.f32485c;
                String $r1 = $r3.f32485c;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    C14633d $r5 = this.f32484b;
                    C14633d $r6 = $r3.f32484b;
                    boolean $z03 = Log_OC.append($r5, $r6);
                    return $z03;
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
    public final String getName() {
        String r1 = this.f32485c;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        String $r2 = this.f32485c;
        int $i1 = $r2 != null ? $r2.hashCode() : 0;
        int $i12 = $i1 * 31;
        C14633d $r1 = this.f32484b;
        int $i0 = $r1 != null ? $r1.hashCode() : 0;
        return $i12 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("CustomFragmentLifecycleCallbackBundle(activityName=");
        String $r1 = this.f32485c;
        $r2.append($r1);
        $r2.append(", customFragmentLifecycleCallback=");
        C14633d $r3 = this.f32484b;
        $r2.append($r3);
        $r2.append(")");
        String $r12 = $r2.toString();
        return $r12;
    }
}
