package p425j.p444e.p451f0.p467j;

import p425j.p444e.p450e0.InterfaceC11292g;
/* compiled from: AppendOnlyLinkedArrayList.java */
/* renamed from: j.e.f0.j.a */
/* loaded from: classes3.dex */
public class C11653a<T> {

    /* renamed from: a */
    final int f26341a;

    /* renamed from: b */
    final Object[] f26342b;

    /* renamed from: c */
    Object[] f26343c;

    /* renamed from: d */
    int f26344d;

    /* compiled from: AppendOnlyLinkedArrayList.java */
    /* renamed from: j.e.f0.j.a$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC11654a<T> extends InterfaceC11292g<T> {
        @Override // p425j.p444e.p450e0.InterfaceC11292g
        /* renamed from: c */
        boolean mo10557c(T t);
    }

    public C11653a(int i) {
        this.f26341a = i;
        Object[] objArr = new Object[i + 1];
        this.f26342b = objArr;
        this.f26343c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <U> boolean m10667a(p425j.p444e.InterfaceC11695u<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f26342b
            int r1 = r4.f26341a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = p425j.p444e.p451f0.p467j.EnumC11664j.m10638b(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p425j.p444e.p451f0.p467j.C11653a.m10667a(j.e.u):boolean");
    }

    /* renamed from: b */
    public void m10666b(T t) {
        int i = this.f26341a;
        int i2 = this.f26344d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.f26343c[i] = objArr;
            this.f26343c = objArr;
            i2 = 0;
        }
        this.f26343c[i2] = t;
        this.f26344d = i2 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
        continue;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m10665c(p425j.p444e.p451f0.p467j.C11653a.InterfaceC11654a<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f26342b
            int r1 = r4.f26341a
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.mo10557c(r3)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p425j.p444e.p451f0.p467j.C11653a.m10665c(j.e.f0.j.a$a):void");
    }

    /* renamed from: d */
    public void m10664d(T t) {
        this.f26342b[0] = t;
    }
}
