package org.org.org.org.xml.core;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.xml.core.util.Label;
/* loaded from: classes.dex */
public final class Attribute extends Segment {

    /* renamed from: b */
    public final Label f32947b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Attribute(Label label) {
        super(null);
        Log_OC.getArray(label, TransactionBreakDownItemType.DATA);
        this.f32947b = label;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Label m450a() {
        Label r1 = this.f32947b;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Attribute;
            if ($z0) {
                Attribute $r2 = (Attribute) obj;
                Label $r3 = this.f32947b;
                Label $r4 = $r2.f32947b;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        Label $r1 = this.f32947b;
        if ($r1 != null) {
            int $i0 = $r1.hashCode();
            return $i0;
        }
        return 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("UploadRecord(data=");
        Label $r3 = this.f32947b;
        $r2.append($r3);
        $r2.append(")");
        String $r1 = $r2.toString();
        return $r1;
    }
}
