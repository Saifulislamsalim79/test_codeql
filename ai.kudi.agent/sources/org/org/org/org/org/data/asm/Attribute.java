package org.org.org.org.org.data.asm;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
/* loaded from: classes.dex */
public final class Attribute implements Object {

    /* renamed from: b */
    public static final C14695h f32734b;

    /* renamed from: a */
    public final boolean f32735a;

    /* renamed from: c */
    public final Label f32736c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14695h $r0 = new C14695h(null);
        f32734b = $r0;
    }

    public Attribute(boolean z, Label label) {
        this.f32735a = z;
        this.f32736c = label;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ Attribute m720a(Attribute attribute, boolean $z0, Label $r1, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = attribute.f32735a;
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r1 = attribute.f32736c;
        }
        Attribute $r0 = attribute.m719a($z0, $r1);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Attribute m719a(boolean z, Label label) {
        Attribute $r0 = new Attribute(z, label);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Label m721a() {
        Label r1 = this.f32736c;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        boolean $z0 = this.f32735a;
        $r1.put("allowedRecording", $z0);
        Label $r3 = this.f32736c;
        JSONObject $r2 = $r3 != null ? $r3.equals() : null;
        $r1.put("setupConfiguration", $r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Attribute;
            if ($z0) {
                Attribute $r2 = (Attribute) obj;
                boolean $z1 = this.f32735a;
                boolean $z02 = $r2.f32735a;
                if ($z1 == $z02) {
                    Label $r3 = this.f32736c;
                    Label $r4 = $r2.f32736c;
                    boolean $z03 = Log_OC.append($r3, $r4);
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
    public final boolean getValue() {
        boolean z0 = this.f32735a;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        boolean $z0 = this.f32735a;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i12 = $i1 * 31;
        Label $r1 = this.f32736c;
        int $i0 = $r1 != null ? $r1.hashCode() : 0;
        return $i12 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("SessionConfiguration(allowedRecording=");
        boolean $z0 = this.f32735a;
        $r2.append($z0);
        $r2.append(", setupConfiguration=");
        Label $r3 = this.f32736c;
        $r2.append($r3);
        $r2.append(")");
        String $r1 = $r2.toString();
        return $r1;
    }
}
