package org.org.org.org.org.data.asm;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
/* loaded from: classes.dex */
public final class Label implements Object {

    /* renamed from: d */
    public static final C14696i f32738d;

    /* renamed from: b */
    public final String f32739b;

    /* renamed from: c */
    public final String f32740c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14696i $r0 = new C14696i(null);
        f32738d = $r0;
    }

    public Label(String str, String str2) {
        Log_OC.getArray(str, "writerHost");
        Log_OC.getArray(str2, "storeGroup");
        this.f32740c = str;
        this.f32739b = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m718a() {
        String r1 = this.f32739b;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32740c;
        $r1.put("writerHost", $r2);
        String $r22 = this.f32739b;
        $r1.put("storeGroup", $r22);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Label;
            if ($z0) {
                Label $r3 = (Label) obj;
                String $r4 = this.f32740c;
                String $r1 = $r3.f32740c;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    String $r12 = this.f32739b;
                    String $r42 = $r3.f32739b;
                    boolean $z03 = Log_OC.append($r12, $r42);
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
        String r1 = this.f32740c;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        String $r1 = this.f32740c;
        int $i1 = $r1 != null ? $r1.hashCode() : 0;
        int $i12 = $i1 * 31;
        String $r12 = this.f32739b;
        int $i0 = $r12 != null ? $r12.hashCode() : 0;
        return $i12 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("SetupConfiguration(writerHost=");
        String $r1 = this.f32740c;
        $r2.append($r1);
        $r2.append(", storeGroup=");
        String $r12 = this.f32739b;
        $r2.append($r12);
        $r2.append(")");
        String $r13 = $r2.toString();
        return $r13;
    }
}
