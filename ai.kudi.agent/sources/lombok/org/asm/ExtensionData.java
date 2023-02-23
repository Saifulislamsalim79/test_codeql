package lombok.org.asm;
/* loaded from: classes.dex */
public class ExtensionData extends ByteVector implements Menu {

    /* renamed from: c */
    public final boolean f31278c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ExtensionData(Label label) {
        super(true);
        m2395a(label);
        boolean $z0 = m2378b();
        this.f31278c = $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x001d */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2378b() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f31269a
            r2 = r0
            lombok.org.asm.MenuItem r2 = (lombok.org.asm.MenuItem) r2
            r1 = r2
            boolean r3 = r1 instanceof lombok.org.asm.C14298p
            if (r3 != 0) goto Lb
            r1 = 0
        Lb:
            r5 = r1
            lombok.org.asm.p r5 = (lombok.org.asm.C14298p) r5
            r4 = r5
            if (r4 == 0) goto L3b
            J extends a.a.a.t r6 = r4.f31409a
            r8 = r6
            lombok.org.asm.ByteVector r8 = (lombok.org.asm.ByteVector) r8
            r7 = r8
            if (r7 == 0) goto L3b
        L19:
            boolean r3 = r7.equals()
            if (r3 == 0) goto L21
            r9 = 1
            return r9
        L21:
            java.lang.Object r0 = r7.f31269a
            r10 = r0
            lombok.org.asm.MenuItem r10 = (lombok.org.asm.MenuItem) r10
            r1 = r10
            boolean r3 = r1 instanceof lombok.org.asm.C14298p
            if (r3 != 0) goto L2c
            r1 = 0
        L2c:
            r11 = r1
            lombok.org.asm.p r11 = (lombok.org.asm.C14298p) r11
            r4 = r11
            if (r4 == 0) goto L3b
            J extends a.a.a.t r6 = r4.f31409a
            r12 = r6
            lombok.org.asm.ByteVector r12 = (lombok.org.asm.ByteVector) r12
            r7 = r12
            if (r7 == 0) goto L3b
            goto L19
        L3b:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.ExtensionData.m2378b():boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.ByteVector
    public boolean equals() {
        boolean z0 = this.f31278c;
        return z0;
    }

    @Override // lombok.org.asm.ByteVector
    public boolean putInt() {
        return true;
    }
}
