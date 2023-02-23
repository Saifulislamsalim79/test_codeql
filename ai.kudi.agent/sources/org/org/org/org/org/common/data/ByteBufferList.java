package org.org.org.org.org.common.data;

import org.org.org.org.android.util.menu.C14572i;
import org.org.org.org.android.util.menu.EnumC14570c;
import org.org.org.org.android.util.menu.EnumC14571f;
/* loaded from: classes.dex */
public final class ByteBufferList {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final long add(org.org.org.org.org.common.telemetry.Item item, Entity entity) {
        long $l0 = item.set();
        return $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void add(org.org.org.org.org.common.telemetry.Item item, C14641f c14641f, Object obj) {
        boolean $z0 = obj instanceof Item;
        if ($z0) {
            C14572i $r4 = EnumC14571f.f32274l;
            Item $r5 = (Item) obj;
            long $l0 = $r5.getId();
            EnumC14571f $r6 = item.get($l0);
            EnumC14570c $r7 = $r4.m1195d($r6);
            double $d0 = c14641f.add($r7);
            double $d1 = c14641f.m935a($r7);
            $r5.mo936a($d0, $d1);
        }
        boolean $z02 = obj instanceof Entity;
        if ($z02) {
            Entity $r8 = (Entity) obj;
            long $l02 = add(item, $r8);
            $r8.set($l02);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x005c */
    /* JADX WARN: Incorrect condition in loop: B:16:0x007c */
    /* JADX WARN: Incorrect condition in loop: B:20:0x009e */
    /* JADX WARN: Incorrect condition in loop: B:24:0x00c2 */
    /* JADX WARN: Incorrect condition in loop: B:28:0x00e6 */
    /* JADX WARN: Incorrect condition in loop: B:32:0x010a */
    /* JADX WARN: Incorrect condition in loop: B:36:0x012e */
    /* JADX WARN: Incorrect condition in loop: B:40:0x0152 */
    /* JADX WARN: Incorrect condition in loop: B:44:0x0176 */
    /* JADX WARN: Incorrect condition in loop: B:48:0x019a */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001c */
    /* JADX WARN: Incorrect condition in loop: B:52:0x01be */
    /* JADX WARN: Incorrect condition in loop: B:56:0x01e2 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x003c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(org.org.org.org.org.common.telemetry.Item r38) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.common.data.ByteBufferList.add(org.org.org.org.org.common.telemetry.Item):void");
    }
}
