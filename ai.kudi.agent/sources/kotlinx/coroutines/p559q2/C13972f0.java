package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.flow.internal.AbstractC13817a;
import kotlinx.coroutines.flow.internal.C13841p;
import kotlinx.coroutines.flow.internal.InterfaceC13837m;
import kotlinx.coroutines.internal.C13914y;
/* compiled from: StateFlow.kt */
/* renamed from: kotlinx.coroutines.q2.f0 */
/* loaded from: classes3.dex */
final class C13972f0<T> extends AbstractC13817a<C13981h0> implements InterfaceC14022s<T>, Object<T>, InterfaceC13837m<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: w */
    private int f30474w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateFlow.kt */
    @f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    /* renamed from: kotlinx.coroutines.q2.f0$a */
    /* loaded from: classes3.dex */
    public static final class C13973a extends AbstractC11738d {

        /* renamed from: c */
        Object f30475c;

        /* renamed from: d */
        Object f30476d;

        /* renamed from: e */
        Object f30477e;

        /* renamed from: f */
        Object f30478f;

        /* renamed from: w */
        Object f30479w;

        /* renamed from: x */
        /* synthetic */ Object f30480x;

        /* renamed from: y */
        final /* synthetic */ C13972f0<T> f30481y;

        /* renamed from: z */
        int f30482z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13973a(C13972f0<T> c13972f0, InterfaceC11714d<? super C13973a> interfaceC11714d) {
            super(interfaceC11714d);
            this.f30481y = c13972f0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f30480x = obj;
            this.f30482z |= Integer.MIN_VALUE;
            return this.f30481y.mo3175a(null, this);
        }
    }

    public C13972f0(Object obj) {
        this._state = obj;
    }

    /* renamed from: q */
    private final boolean m3306q(Object obj, Object obj2) {
        m3606n();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !l.b(obj3, obj)) {
                return false;
            }
            if (l.b(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i = this.f30474w;
            if ((i & 1) == 0) {
                int i2 = i + 1;
                this.f30474w = i2;
                C13981h0[] m3606n = m3606n();
                C13666w c13666w = C13666w.f30112a;
                while (true) {
                    C13981h0[] c13981h0Arr = m3606n;
                    if (c13981h0Arr != null) {
                        for (C13981h0 c13981h0 : c13981h0Arr) {
                            if (c13981h0 != null) {
                                c13981h0.m3290f();
                            }
                        }
                    }
                    synchronized (this) {
                        if (this.f30474w == i2) {
                            this.f30474w = i2 + 1;
                            return true;
                        }
                        i2 = this.f30474w;
                        m3606n = m3606n();
                        C13666w c13666w2 = C13666w.f30112a;
                    }
                }
            } else {
                this.f30474w = i + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
        if (kotlin.e0.d.l.b(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:59:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:59:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:59:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d5 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e7 -> B:34:0x00a6). Please submit an issue!!! */
    @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3175a(kotlinx.coroutines.p559q2.InterfaceC13969e<? super T> r11, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C13972f0.mo3175a(kotlinx.coroutines.q2.e, kotlin.c0.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC13837m
    /* renamed from: b */
    public InterfaceC13964d<T> mo3233b(InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        return C13978g0.m3299d(this, interfaceC11719g, i, enumC13778e);
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC14022s
    /* renamed from: c */
    public boolean mo3257c(T t, T t2) {
        if (t == null) {
            t = (T) C13841p.f30311a;
        }
        if (t2 == null) {
            t2 = (T) C13841p.f30311a;
        }
        return m3306q(t, t2);
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC14021r
    /* renamed from: e */
    public void mo3232e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC14021r, kotlinx.coroutines.p559q2.InterfaceC13969e
    public Object emit(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        setValue(t);
        return C13666w.f30112a;
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC14021r
    /* renamed from: f */
    public boolean mo3231f(T t) {
        setValue(t);
        return true;
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC14022s
    public T getValue() {
        C13914y c13914y = C13841p.f30311a;
        T t = (T) this._state;
        if (t == c13914y) {
            return null;
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractC13817a
    /* renamed from: o */
    public C13981h0 mo3230j() {
        return new C13981h0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractC13817a
    /* renamed from: p */
    public C13981h0[] mo3229k(int i) {
        return new C13981h0[i];
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC14022s
    public void setValue(T t) {
        if (t == null) {
            t = (T) C13841p.f30311a;
        }
        m3306q(null, t);
    }
}
