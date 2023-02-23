package lombok.org.asm;

import lombok.org.asm.asm.DownloadFile;
/* renamed from: lombok.org.asm.a */
/* loaded from: classes.dex */
public final class C14247a extends DownloadFile implements InterfaceC14267e {
    @Override // lombok.org.asm.InterfaceC14267e
    /* renamed from: a */
    public C14247a mo2173a() {
        return this;
    }

    @Override // lombok.org.asm.InterfaceC14267e
    /* renamed from: b */
    public boolean mo2172b() {
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0023 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String build(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "List{"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = "}["
            r0.append(r1)
            java.lang.Object r2 = r11.next()
            if (r2 == 0) goto L4d
            r4 = r2
            lombok.org.asm.asm.Integer r4 = (lombok.org.asm.asm.Integer) r4
            r3 = r4
            r5 = 1
        L1d:
            boolean r6 = kotlin.p483e0.p485d.Log_OC.append(r3, r11)
            r7 = 1
            r6 = r6 ^ r7
            if (r6 == 0) goto L3e
            boolean r6 = r3 instanceof lombok.org.asm.AbstractC14276m
            if (r6 == 0) goto L39
            r9 = r3
            lombok.org.asm.m r9 = (lombok.org.asm.AbstractC14276m) r9
            r8 = r9
            if (r5 == 0) goto L31
            r5 = 0
            goto L36
        L31:
            java.lang.String r1 = ", "
            r0.append(r1)
        L36:
            r0.append(r8)
        L39:
            lombok.org.asm.asm.Integer r3 = r3.getValue()
            goto L1d
        L3e:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r12 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r12, r1)
            return r12
        L4d:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
        */
        //  java.lang.String r1 = "null cannot be cast to non-null type com.smartlook.coroutines.internal.Node /* = com.smartlook.coroutines.internal.LockFreeLinkedListNode */"
        /*
            r10.<init>(r1)
            goto L55
        L55:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.C14247a.build(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.asm.Integer
    public String toString() {
        boolean $z0 = Item.f31287a;
        if ($z0) {
            String $r1 = build("Active");
            return $r1;
        }
        String $r12 = super.toString();
        return $r12;
    }
}
