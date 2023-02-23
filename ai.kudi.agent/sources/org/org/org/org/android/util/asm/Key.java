package org.org.org.org.android.util.asm;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14607f;
import org.org.org.org.asm.menu.Object;
/* loaded from: classes.dex */
public final class Key implements Object {

    /* renamed from: a */
    public int f32123a;

    /* renamed from: h */
    public int f32124h;
    public long type;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        int $i0 = this.f32124h;
        $r1.put("x", $i0);
        int $i02 = this.f32123a;
        $r1.put("y", $i02);
        long $l1 = this.type;
        $r1.put(TransactionField.TIME, $l1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Key;
            if ($z0) {
                Key $r2 = (Key) obj;
                int $i1 = this.f32124h;
                int $i2 = $r2.f32124h;
                if ($i1 == $i2) {
                    int $i12 = this.f32123a;
                    int $i22 = $r2.f32123a;
                    if ($i12 == $i22) {
                        long $l3 = this.type;
                        long $l0 = $r2.type;
                        return $l3 == $l0;
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
    public final int getHeight() {
        int i0 = this.f32124h;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getX() {
        int i0 = this.f32123a;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        int $i0 = this.f32124h;
        int $i1 = this.f32123a;
        int $i12 = (($i0 * 31) + $i1) * 31;
        long $l2 = this.type;
        int $i02 = Version$BuildAwareOrder.compare($l2);
        return $i12 + $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        C14607f $r1 = C14607f.f32363c;
        JSONObject $r2 = equals();
        String $r3 = $r1.getTime($r2);
        return $r3 != null ? $r3 : "undefined";
    }
}
