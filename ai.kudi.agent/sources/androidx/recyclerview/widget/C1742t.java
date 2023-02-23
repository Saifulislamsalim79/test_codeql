package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1661a;
import java.util.List;
/* compiled from: OpReorderer.java */
/* renamed from: androidx.recyclerview.widget.t */
/* loaded from: classes2.dex */
class C1742t {

    /* renamed from: a */
    final InterfaceC1743a f5371a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OpReorderer.java */
    /* renamed from: androidx.recyclerview.widget.t$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1743a {
        /* renamed from: a */
        void mo34622a(C1661a.C1663b c1663b);

        /* renamed from: b */
        C1661a.C1663b mo34621b(int i, int i2, int i3, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1742t(InterfaceC1743a interfaceC1743a) {
        this.f5371a = interfaceC1743a;
    }

    /* renamed from: a */
    private int m34628a(List<C1661a.C1663b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f5127a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m34626c(List<C1661a.C1663b> list, int i, C1661a.C1663b c1663b, int i2, C1661a.C1663b c1663b2) {
        int i3 = c1663b.f5130d < c1663b2.f5128b ? -1 : 0;
        if (c1663b.f5128b < c1663b2.f5128b) {
            i3++;
        }
        int i4 = c1663b2.f5128b;
        int i5 = c1663b.f5128b;
        if (i4 <= i5) {
            c1663b.f5128b = i5 + c1663b2.f5130d;
        }
        int i6 = c1663b2.f5128b;
        int i7 = c1663b.f5130d;
        if (i6 <= i7) {
            c1663b.f5130d = i7 + c1663b2.f5130d;
        }
        c1663b2.f5128b += i3;
        list.set(i, c1663b2);
        list.set(i2, c1663b);
    }

    /* renamed from: d */
    private void m34625d(List<C1661a.C1663b> list, int i, int i2) {
        C1661a.C1663b c1663b = list.get(i);
        C1661a.C1663b c1663b2 = list.get(i2);
        int i3 = c1663b2.f5127a;
        if (i3 == 1) {
            m34626c(list, i, c1663b, i2, c1663b2);
        } else if (i3 == 2) {
            m34624e(list, i, c1663b, i2, c1663b2);
        } else if (i3 != 4) {
        } else {
            m34623f(list, i, c1663b, i2, c1663b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m34627b(List<C1661a.C1663b> list) {
        while (true) {
            int m34628a = m34628a(list);
            if (m34628a == -1) {
                return;
            }
            m34625d(list, m34628a, m34628a + 1);
        }
    }

    /* renamed from: e */
    void m34624e(List<C1661a.C1663b> list, int i, C1661a.C1663b c1663b, int i2, C1661a.C1663b c1663b2) {
        boolean z;
        int i3 = c1663b.f5128b;
        int i4 = c1663b.f5130d;
        boolean z2 = false;
        if (i3 < i4) {
            if (c1663b2.f5128b == i3 && c1663b2.f5130d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (c1663b2.f5128b == i4 + 1 && c1663b2.f5130d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = c1663b.f5130d;
        int i6 = c1663b2.f5128b;
        if (i5 < i6) {
            c1663b2.f5128b = i6 - 1;
        } else {
            int i7 = c1663b2.f5130d;
            if (i5 < i6 + i7) {
                c1663b2.f5130d = i7 - 1;
                c1663b.f5127a = 2;
                c1663b.f5130d = 1;
                if (c1663b2.f5130d == 0) {
                    list.remove(i2);
                    this.f5371a.mo34622a(c1663b2);
                    return;
                }
                return;
            }
        }
        int i8 = c1663b.f5128b;
        int i9 = c1663b2.f5128b;
        C1661a.C1663b c1663b3 = null;
        if (i8 <= i9) {
            c1663b2.f5128b = i9 + 1;
        } else {
            int i10 = c1663b2.f5130d;
            if (i8 < i9 + i10) {
                c1663b3 = this.f5371a.mo34621b(2, i8 + 1, (i9 + i10) - i8, null);
                c1663b2.f5130d = c1663b.f5128b - c1663b2.f5128b;
            }
        }
        if (z2) {
            list.set(i, c1663b2);
            list.remove(i2);
            this.f5371a.mo34622a(c1663b);
            return;
        }
        if (z) {
            if (c1663b3 != null) {
                int i11 = c1663b.f5128b;
                if (i11 > c1663b3.f5128b) {
                    c1663b.f5128b = i11 - c1663b3.f5130d;
                }
                int i12 = c1663b.f5130d;
                if (i12 > c1663b3.f5128b) {
                    c1663b.f5130d = i12 - c1663b3.f5130d;
                }
            }
            int i13 = c1663b.f5128b;
            if (i13 > c1663b2.f5128b) {
                c1663b.f5128b = i13 - c1663b2.f5130d;
            }
            int i14 = c1663b.f5130d;
            if (i14 > c1663b2.f5128b) {
                c1663b.f5130d = i14 - c1663b2.f5130d;
            }
        } else {
            if (c1663b3 != null) {
                int i15 = c1663b.f5128b;
                if (i15 >= c1663b3.f5128b) {
                    c1663b.f5128b = i15 - c1663b3.f5130d;
                }
                int i16 = c1663b.f5130d;
                if (i16 >= c1663b3.f5128b) {
                    c1663b.f5130d = i16 - c1663b3.f5130d;
                }
            }
            int i17 = c1663b.f5128b;
            if (i17 >= c1663b2.f5128b) {
                c1663b.f5128b = i17 - c1663b2.f5130d;
            }
            int i18 = c1663b.f5130d;
            if (i18 >= c1663b2.f5128b) {
                c1663b.f5130d = i18 - c1663b2.f5130d;
            }
        }
        list.set(i, c1663b2);
        if (c1663b.f5128b != c1663b.f5130d) {
            list.set(i2, c1663b);
        } else {
            list.remove(i2);
        }
        if (c1663b3 != null) {
            list.add(i, c1663b3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m34623f(java.util.List<androidx.recyclerview.widget.C1661a.C1663b> r9, int r10, androidx.recyclerview.widget.C1661a.C1663b r11, int r12, androidx.recyclerview.widget.C1661a.C1663b r13) {
        /*
            r8 = this;
            int r0 = r11.f5130d
            int r1 = r13.f5128b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f5128b = r1
            goto L20
        Ld:
            int r5 = r13.f5130d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f5130d = r5
            androidx.recyclerview.widget.t$a r0 = r8.f5371a
            int r1 = r11.f5128b
            java.lang.Object r5 = r13.f5129c
            androidx.recyclerview.widget.a$b r0 = r0.mo34621b(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f5128b
            int r5 = r13.f5128b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f5128b = r5
            goto L41
        L2b:
            int r6 = r13.f5130d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.t$a r3 = r8.f5371a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f5129c
            androidx.recyclerview.widget.a$b r3 = r3.mo34621b(r2, r1, r5, r4)
            int r1 = r13.f5130d
            int r1 = r1 - r5
            r13.f5130d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f5130d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.t$a r11 = r8.f5371a
            r11.mo34622a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1742t.m34623f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
