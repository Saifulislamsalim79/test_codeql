package kotlin.p548k0;

import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13715n;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
/* renamed from: kotlin.k0.l */
/* loaded from: classes3.dex */
public class C13234l extends C13233k {

    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.k0.l$a */
    /* loaded from: classes3.dex */
    public static final class C13235a implements InterfaceC13230h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f29394a;

        public C13235a(Iterator it) {
            this.f29394a = it;
        }

        @Override // kotlin.p548k0.InterfaceC13230h
        public Iterator<T> iterator() {
            return this.f29394a;
        }
    }

    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.k0.l$b */
    /* loaded from: classes3.dex */
    static final class C13236b extends AbstractC11802m implements InterfaceC11767l<InterfaceC13230h<? extends T>, Iterator<? extends T>> {

        /* renamed from: c */
        public static final C13236b f29395c = new C13236b();

        C13236b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Iterator<T> invoke(InterfaceC13230h<? extends T> interfaceC13230h) {
            l.f(interfaceC13230h, "it");
            return interfaceC13230h.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.k0.l$c */
    /* loaded from: classes3.dex */
    public static final class C13237c extends AbstractC11802m implements InterfaceC11767l<T, T> {

        /* renamed from: c */
        public static final C13237c f29396c = new C13237c();

        C13237c() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public final T invoke(T t) {
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.k0.l$d */
    /* loaded from: classes3.dex */
    public static final class C13238d extends AbstractC11802m implements InterfaceC11767l<T, T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11756a f29397c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13238d(InterfaceC11756a interfaceC11756a) {
            super(1);
            this.f29397c = interfaceC11756a;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public final T invoke(T t) {
            l.f(t, "it");
            return this.f29397c.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.k0.l$e */
    /* loaded from: classes3.dex */
    public static final class C13239e extends AbstractC11802m implements InterfaceC11756a<T> {

        /* renamed from: c */
        final /* synthetic */ Object f29398c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13239e(Object obj) {
            super(0);
            this.f29398c = obj;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final T invoke() {
            return this.f29398c;
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC13230h<T> m5588a(Iterator<? extends T> it) {
        l.f(it, "$this$asSequence");
        return m5587b(new C13235a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <T> InterfaceC13230h<T> m5587b(InterfaceC13230h<? extends T> interfaceC13230h) {
        l.f(interfaceC13230h, "$this$constrainOnce");
        return interfaceC13230h instanceof C13219a ? interfaceC13230h : new C13219a(interfaceC13230h);
    }

    /* renamed from: c */
    public static <T> InterfaceC13230h<T> m5586c() {
        return C13223d.f29375a;
    }

    /* renamed from: d */
    public static final <T> InterfaceC13230h<T> m5585d(InterfaceC13230h<? extends InterfaceC13230h<? extends T>> interfaceC13230h) {
        l.f(interfaceC13230h, "$this$flatten");
        return m5584e(interfaceC13230h, C13236b.f29395c);
    }

    /* renamed from: e */
    private static final <T, R> InterfaceC13230h<R> m5584e(InterfaceC13230h<? extends T> interfaceC13230h, InterfaceC11767l<? super T, ? extends Iterator<? extends R>> interfaceC11767l) {
        if (interfaceC13230h instanceof C13248p) {
            return ((C13248p) interfaceC13230h).m5554d(interfaceC11767l);
        }
        return new C13226f(interfaceC13230h, C13237c.f29396c, interfaceC11767l);
    }

    /* renamed from: f */
    public static <T> InterfaceC13230h<T> m5583f(T t, InterfaceC11767l<? super T, ? extends T> interfaceC11767l) {
        l.f(interfaceC11767l, "nextFunction");
        if (t == null) {
            return C13223d.f29375a;
        }
        return new C13228g(new C13239e(t), interfaceC11767l);
    }

    /* renamed from: g */
    public static <T> InterfaceC13230h<T> m5582g(InterfaceC11756a<? extends T> interfaceC11756a) {
        l.f(interfaceC11756a, "nextFunction");
        return m5587b(new C13228g(interfaceC11756a, new C13238d(interfaceC11756a)));
    }

    /* renamed from: h */
    public static final <T> InterfaceC13230h<T> m5581h(T... tArr) {
        InterfaceC13230h<T> m4008q;
        InterfaceC13230h<T> m5586c;
        l.f(tArr, "elements");
        if (tArr.length == 0) {
            m5586c = m5586c();
            return m5586c;
        }
        m4008q = C13715n.m4008q(tArr);
        return m4008q;
    }
}
