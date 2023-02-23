package p201g.p259r;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11773r;
import kotlinx.coroutines.C14109y;
import kotlinx.coroutines.InterfaceC14103w;
import kotlinx.coroutines.p564v2.C14102d;
import kotlinx.coroutines.p564v2.InterfaceC14094b;
/* compiled from: FlowExt.kt */
/* renamed from: g.r.m1 */
/* loaded from: classes2.dex */
public final class C7974m1<T1, T2> {

    /* renamed from: a */
    private final InterfaceC11773r<T1, T2, EnumC7899i, InterfaceC11714d<? super C13666w>, Object> f19194a;

    /* renamed from: b */
    private final InterfaceC14103w<C13666w> f19195b;

    /* renamed from: c */
    private final InterfaceC14094b f19196c;

    /* renamed from: d */
    private final InterfaceC14103w<C13666w>[] f19197d;

    /* renamed from: e */
    private final Object[] f19198e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowExt.kt */
    @f(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", l = {188, 227, 205}, m = "onNext")
    /* renamed from: g.r.m1$a */
    /* loaded from: classes2.dex */
    public static final class C7975a extends AbstractC11738d {

        /* renamed from: c */
        Object f19199c;

        /* renamed from: d */
        Object f19200d;

        /* renamed from: e */
        Object f19201e;

        /* renamed from: f */
        int f19202f;

        /* renamed from: w */
        /* synthetic */ Object f19203w;

        /* renamed from: x */
        final /* synthetic */ C7974m1<T1, T2> f19204x;

        /* renamed from: y */
        int f19205y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7975a(C7974m1<T1, T2> c7974m1, InterfaceC11714d<? super C7975a> interfaceC11714d) {
            super(interfaceC11714d);
            this.f19204x = c7974m1;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f19203w = obj;
            this.f19205y |= Integer.MIN_VALUE;
            return this.f19204x.m16975a(0, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7974m1(InterfaceC11773r<? super T1, ? super T2, ? super EnumC7899i, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11773r) {
        l.f(interfaceC11773r, "send");
        this.f19194a = interfaceC11773r;
        this.f19195b = C14109y.m2940b(null, 1, null);
        this.f19196c = C14102d.m2968b(false, 1, null);
        InterfaceC14103w<C13666w>[] interfaceC14103wArr = new InterfaceC14103w[2];
        for (int i = 0; i < 2; i++) {
            interfaceC14103wArr[i] = C14109y.m2940b(null, 1, null);
        }
        this.f19197d = interfaceC14103wArr;
        Object[] objArr = new Object[2];
        for (int i2 = 0; i2 < 2; i2++) {
            objArr[i2] = C8004r.f19277a;
        }
        this.f19198e = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[Catch: all -> 0x011b, TryCatch #1 {all -> 0x011b, blocks: (B:34:0x00ab, B:36:0x00b2, B:44:0x00c5, B:46:0x00cf, B:56:0x00e6, B:60:0x00f0, B:58:0x00eb, B:59:0x00ee, B:52:0x00de, B:42:0x00c1), top: B:76:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf A[Catch: all -> 0x011b, TryCatch #1 {all -> 0x011b, blocks: (B:34:0x00ab, B:36:0x00b2, B:44:0x00c5, B:46:0x00cf, B:56:0x00e6, B:60:0x00f0, B:58:0x00eb, B:59:0x00ee, B:52:0x00de, B:42:0x00c1), top: B:76:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16975a(int r17, java.lang.Object r18, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r19) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7974m1.m16975a(int, java.lang.Object, kotlin.c0.d):java.lang.Object");
    }
}
