package org.org.org.org.android.http.util;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
/* loaded from: classes.dex */
public final class Element implements Object {
    public static final C14534h object;

    /* renamed from: b */
    public final String f32084b;

    /* renamed from: d */
    public final String f32085d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14534h $r0 = new C14534h(null);
        object = $r0;
    }

    public Element(String str, String str2) {
        Log_OC.getArray(str, "name");
        Log_OC.getArray(str2, "value");
        this.f32084b = str;
        this.f32085d = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32084b;
        $r1.put("name", $r2);
        String $r22 = this.f32085d;
        $r1.put("value", $r22);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Element;
            if ($z0) {
                Element $r3 = (Element) obj;
                String $r4 = this.f32084b;
                String $r1 = $r3.f32084b;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    String $r12 = this.f32085d;
                    String $r42 = $r3.f32085d;
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
    public int hashCode() {
        String $r1 = this.f32084b;
        int $i1 = $r1 != null ? $r1.hashCode() : 0;
        int $i12 = $i1 * 31;
        String $r12 = this.f32085d;
        int $i0 = $r12 != null ? $r12.hashCode() : 0;
        return $i12 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("InterceptedHeader(name=");
        String $r1 = this.f32084b;
        $r2.append($r1);
        $r2.append(", value=");
        String $r12 = this.f32085d;
        $r2.append($r12);
        $r2.append(")");
        String $r13 = $r2.toString();
        return $r13;
    }
}
