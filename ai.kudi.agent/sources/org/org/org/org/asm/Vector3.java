package org.org.org.org.asm;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import org.org.org.org.asm.asm.Text;
/* loaded from: classes.dex */
public final class Vector3 {

    /* renamed from: z */
    public static final Vector3 f32313z;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Vector3 $r0 = new Vector3();
        f32313z = $r0;
    }

    private Vector3() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(List list, Text text) {
        Log_OC.getArray(list, AttributeType.LIST);
        Log_OC.getArray(text, "toAdd");
        boolean $z0 = list.isEmpty();
        if (!$z0) {
            Object $r3 = C13722p.m3943c0(list);
            Text $r4 = (Text) $r3;
            Object $r32 = $r4.add();
            Object $r5 = text.add();
            boolean $z02 = Log_OC.append($r32, $r5);
            if (!(!$z02)) {
                return;
            }
        }
        list.add(text);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List parse(List $r1, long j) {
        List $r12;
        Log_OC.getArray($r1, AttributeType.LIST);
        boolean $z0 = $r1.isEmpty();
        if (!$z0) {
            Object $r2 = C13722p.m3943c0($r1);
            Text $r3 = (Text) $r2;
            Text[] $r4 = {$r3.add(j)};
            $r12 = C13726r.m3885k($r4);
            return $r12;
        }
        return $r1;
    }
}
