package kotlinx.coroutines.internal;

import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.InterfaceC13919j2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadContext.kt */
/* renamed from: kotlinx.coroutines.internal.f0 */
/* loaded from: classes3.dex */
public final class C13882f0 {

    /* renamed from: a */
    public final InterfaceC11719g f30357a;

    /* renamed from: b */
    private final Object[] f30358b;

    /* renamed from: c */
    private final InterfaceC13919j2<Object>[] f30359c;

    /* renamed from: d */
    private int f30360d;

    public C13882f0(InterfaceC11719g interfaceC11719g, int i) {
        this.f30357a = interfaceC11719g;
        this.f30358b = new Object[i];
        this.f30359c = new InterfaceC13919j2[i];
    }

    /* renamed from: a */
    public final void m3518a(InterfaceC13919j2<?> interfaceC13919j2, Object obj) {
        Object[] objArr = this.f30358b;
        int i = this.f30360d;
        objArr[i] = obj;
        InterfaceC13919j2<Object>[] interfaceC13919j2Arr = this.f30359c;
        this.f30360d = i + 1;
        interfaceC13919j2Arr[i] = interfaceC13919j2;
    }

    /* renamed from: b */
    public final void m3517b(InterfaceC11719g interfaceC11719g) {
        int length = this.f30359c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC13919j2<Object> interfaceC13919j2 = this.f30359c[length];
            kotlin.e0.d.l.d(interfaceC13919j2);
            interfaceC13919j2.mo3404w0(interfaceC11719g, this.f30358b[length]);
            if (i < 0) {
                return;
            }
            length = i;
        }
    }
}
