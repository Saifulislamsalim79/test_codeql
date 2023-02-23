package lombok.org.asm;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.p476c0.InterfaceC11715e;
import kotlin.p476c0.InterfaceC11719g;
/* renamed from: lombok.org.asm.l */
/* loaded from: classes.dex */
public final class C14275l {

    /* renamed from: c */
    public static final boolean f31408c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r4 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r4 != false) goto L21;
     */
    static {
        /*
            java.lang.String r1 = "com.smartlook.coroutines.scheduler"
            java.lang.String r0 = lombok.org.asm.asm.ByteVector.get(r1)
            if (r0 != 0) goto L9
            goto L33
        L9:
            int r2 = r0.hashCode()
            if (r2 == 0) goto L2b
            r3 = 3551(0xddf, float:4.976E-42)
            if (r2 == r3) goto L22
            r3 = 109935(0x1ad6f, float:1.54052E-40)
            if (r2 != r3) goto L37
            java.lang.String r1 = "off"
            boolean r4 = r0.equals(r1)
            if (r4 == 0) goto L37
            r4 = 0
            goto L34
        L22:
            java.lang.String r1 = "on"
            boolean r4 = r0.equals(r1)
            if (r4 == 0) goto L37
            goto L33
        L2b:
            java.lang.String r1 = ""
            boolean r4 = r0.equals(r1)
            if (r4 == 0) goto L37
        L33:
            r4 = 1
        L34:
            lombok.org.asm.C14275l.f31408c = r4
            return
        L37:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "System property 'com.smartlook.coroutines.scheduler' has unrecognized value '"
            r5.append(r1)
            r5.append(r0)
            r3 = 39
            r5.append(r3)
            java.lang.String r0 = r5.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.C14275l.<clinit>():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final InterfaceC11719g m2261a(Number number, InterfaceC11719g interfaceC11719g) {
        InterfaceC11719g $r3;
        InterfaceC11719g $r32 = number.mo474e();
        InterfaceC11719g $r2 = $r32.plus(interfaceC11719g);
        boolean $z0 = Item.f31287a;
        if ($z0) {
            AtomicLong $r5 = Item.f31290d;
            long $l0 = $r5.incrementAndGet();
            InterfaceC11719g r8 = new Attribute($l0);
            InterfaceC11719g $r33 = r8;
            $r3 = $r2.plus($r33);
        } else {
            $r3 = $r2;
        }
        InterfaceC11719g $r6 = DynamicTableModel$b.f31273a;
        if ($r2 != $r6) {
            InterfaceC11715e.C11717b $r0 = InterfaceC11715e.f26443r;
            InterfaceC11719g.InterfaceC11722b $r7 = $r2.get($r0);
            if ($r7 == null) {
                return $r3.plus($r6);
            }
        }
        return $r3;
    }
}
