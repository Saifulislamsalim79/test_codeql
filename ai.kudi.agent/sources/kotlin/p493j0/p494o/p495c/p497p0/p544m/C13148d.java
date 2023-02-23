package kotlin.p493j0.p494o.p495c.p497p0.p544m;

import java.util.Collection;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.AbstractC13144c;
import kotlin.p549l0.C13262h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.j0.o.c.p0.m.d */
/* loaded from: classes3.dex */
public final class C13148d {

    /* renamed from: a */
    private final C12614f f29227a;

    /* renamed from: b */
    private final C13262h f29228b;

    /* renamed from: c */
    private final Collection<C12614f> f29229c;

    /* renamed from: d */
    private final InterfaceC11767l<InterfaceC13554x, String> f29230d;

    /* renamed from: e */
    private final InterfaceC13142b[] f29231e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.d$a */
    /* loaded from: classes3.dex */
    public static final class C13149a extends AbstractC11802m implements InterfaceC11767l {

        /* renamed from: c */
        public static final C13149a f29232c = new C13149a();

        C13149a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Void invoke(InterfaceC13554x interfaceC13554x) {
            l.f(interfaceC13554x, "$this$null");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.d$b */
    /* loaded from: classes3.dex */
    public static final class C13150b extends AbstractC11802m implements InterfaceC11767l {

        /* renamed from: c */
        public static final C13150b f29233c = new C13150b();

        C13150b() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Void invoke(InterfaceC13554x interfaceC13554x) {
            l.f(interfaceC13554x, "$this$null");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.d$c */
    /* loaded from: classes3.dex */
    public static final class C13151c extends AbstractC11802m implements InterfaceC11767l {

        /* renamed from: c */
        public static final C13151c f29234c = new C13151c();

        C13151c() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Void invoke(InterfaceC13554x interfaceC13554x) {
            l.f(interfaceC13554x, "$this$null");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C13148d(C12614f c12614f, C13262h c13262h, Collection<C12614f> collection, InterfaceC11767l<? super InterfaceC13554x, String> interfaceC11767l, InterfaceC13142b... interfaceC13142bArr) {
        this.f29227a = c12614f;
        this.f29228b = c13262h;
        this.f29229c = collection;
        this.f29230d = interfaceC11767l;
        this.f29231e = interfaceC13142bArr;
    }

    /* renamed from: a */
    public final AbstractC13144c m5732a(InterfaceC13554x interfaceC13554x) {
        l.f(interfaceC13554x, "functionDescriptor");
        InterfaceC13142b[] interfaceC13142bArr = this.f29231e;
        int length = interfaceC13142bArr.length;
        int i = 0;
        while (i < length) {
            InterfaceC13142b interfaceC13142b = interfaceC13142bArr[i];
            i++;
            String mo5717b = interfaceC13142b.mo5717b(interfaceC13554x);
            if (mo5717b != null) {
                return new AbstractC13144c.C13146b(mo5717b);
            }
        }
        String invoke = this.f29230d.invoke(interfaceC13554x);
        if (invoke != null) {
            return new AbstractC13144c.C13146b(invoke);
        }
        return AbstractC13144c.C13147c.f29226b;
    }

    /* renamed from: b */
    public final boolean m5731b(InterfaceC13554x interfaceC13554x) {
        l.f(interfaceC13554x, "functionDescriptor");
        if (this.f29227a == null || l.b(interfaceC13554x.mo5012b(), this.f29227a)) {
            if (this.f29228b != null) {
                String m7353b = interfaceC13554x.mo5012b().m7353b();
                l.e(m7353b, "functionDescriptor.name.asString()");
                if (!this.f29228b.m5522e(m7353b)) {
                    return false;
                }
            }
            Collection<C12614f> collection = this.f29229c;
            return collection == null || collection.contains(interfaceC13554x.mo5012b());
        }
        return false;
    }

    public /* synthetic */ C13148d(C12614f c12614f, InterfaceC13142b[] interfaceC13142bArr, InterfaceC11767l interfaceC11767l, int i, g gVar) {
        this(c12614f, interfaceC13142bArr, (i & 4) != 0 ? C13149a.f29232c : interfaceC11767l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13148d(kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f r8, kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b[] r9, kotlin.p483e0.p484c.InterfaceC11767l<? super kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x, java.lang.String> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.e0.d.l.f(r8, r0)
            java.lang.String r0 = "checks"
            kotlin.e0.d.l.f(r9, r0)
            java.lang.String r0 = "additionalChecks"
            kotlin.e0.d.l.f(r10, r0)
            int r0 = r9.length
            kotlin.j0.o.c.p0.m.b[] r6 = new kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b[r0]
            int r0 = r9.length
            r1 = 0
            java.lang.System.arraycopy(r9, r1, r6, r1, r0)
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p544m.C13148d.<init>(kotlin.j0.o.c.p0.f.f, kotlin.j0.o.c.p0.m.b[], kotlin.e0.c.l):void");
    }

    public /* synthetic */ C13148d(C13262h c13262h, InterfaceC13142b[] interfaceC13142bArr, InterfaceC11767l interfaceC11767l, int i, g gVar) {
        this(c13262h, interfaceC13142bArr, (i & 4) != 0 ? C13150b.f29233c : interfaceC11767l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13148d(kotlin.p549l0.C13262h r8, kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b[] r9, kotlin.p483e0.p484c.InterfaceC11767l<? super kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x, java.lang.String> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "regex"
            kotlin.e0.d.l.f(r8, r0)
            java.lang.String r0 = "checks"
            kotlin.e0.d.l.f(r9, r0)
            java.lang.String r0 = "additionalChecks"
            kotlin.e0.d.l.f(r10, r0)
            int r0 = r9.length
            kotlin.j0.o.c.p0.m.b[] r6 = new kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b[r0]
            int r0 = r9.length
            r1 = 0
            java.lang.System.arraycopy(r9, r1, r6, r1, r0)
            r2 = 0
            r4 = 0
            r1 = r7
            r3 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p544m.C13148d.<init>(kotlin.l0.h, kotlin.j0.o.c.p0.m.b[], kotlin.e0.c.l):void");
    }

    public /* synthetic */ C13148d(Collection collection, InterfaceC13142b[] interfaceC13142bArr, InterfaceC11767l interfaceC11767l, int i, g gVar) {
        this(collection, interfaceC13142bArr, (i & 4) != 0 ? C13151c.f29234c : interfaceC11767l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13148d(java.util.Collection<kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f> r8, kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b[] r9, kotlin.p483e0.p484c.InterfaceC11767l<? super kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x, java.lang.String> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "nameList"
            kotlin.e0.d.l.f(r8, r0)
            java.lang.String r0 = "checks"
            kotlin.e0.d.l.f(r9, r0)
            java.lang.String r0 = "additionalChecks"
            kotlin.e0.d.l.f(r10, r0)
            int r0 = r9.length
            kotlin.j0.o.c.p0.m.b[] r6 = new kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b[r0]
            int r0 = r9.length
            r1 = 0
            java.lang.System.arraycopy(r9, r1, r6, r1, r0)
            r2 = 0
            r3 = 0
            r1 = r7
            r4 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p544m.C13148d.<init>(java.util.Collection, kotlin.j0.o.c.p0.m.b[], kotlin.e0.c.l):void");
    }
}
