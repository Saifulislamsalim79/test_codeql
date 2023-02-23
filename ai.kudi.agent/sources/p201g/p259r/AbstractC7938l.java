package p201g.p259r;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
/* compiled from: DataSource.kt */
/* renamed from: g.r.l */
/* loaded from: classes2.dex */
public abstract class AbstractC7938l<Key, Value> {

    /* compiled from: DataSource.kt */
    /* renamed from: g.r.l$a */
    /* loaded from: classes2.dex */
    public static final class C7939a<Value> {

        /* renamed from: a */
        public final List<Value> f19058a;

        /* renamed from: b */
        private final Object f19059b;

        /* renamed from: c */
        private final Object f19060c;

        /* renamed from: d */
        private final int f19061d;

        /* renamed from: e */
        private final int f19062e;

        /* renamed from: a */
        public final int m17020a() {
            return this.f19062e;
        }

        /* renamed from: b */
        public final int m17019b() {
            return this.f19061d;
        }

        /* renamed from: c */
        public final Object m17018c() {
            return this.f19060c;
        }

        /* renamed from: d */
        public final Object m17017d() {
            return this.f19059b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C7939a) {
                C7939a c7939a = (C7939a) obj;
                return l.b(this.f19058a, c7939a.f19058a) && l.b(this.f19059b, c7939a.f19059b) && l.b(this.f19060c, c7939a.f19060c) && this.f19061d == c7939a.f19061d && this.f19062e == c7939a.f19062e;
            }
            return false;
        }
    }

    /* compiled from: DataSource.kt */
    /* renamed from: g.r.l$b */
    /* loaded from: classes2.dex */
    public enum EnumC7940b {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    /* compiled from: DataSource.kt */
    /* renamed from: g.r.l$c */
    /* loaded from: classes2.dex */
    public static final class C7941c<K> {

        /* renamed from: a */
        private final EnumC7830b0 f19067a;

        /* renamed from: b */
        private final K f19068b;

        public C7941c(EnumC7830b0 enumC7830b0, K k, int i, boolean z, int i2) {
            l.f(enumC7830b0, "type");
            this.f19067a = enumC7830b0;
            this.f19068b = k;
            if (enumC7830b0 != EnumC7830b0.REFRESH && k == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }
    }

    /* renamed from: a */
    public final EnumC7940b m17022a() {
        throw null;
    }

    /* renamed from: b */
    public abstract Object m17021b(C7941c<Key> c7941c, InterfaceC11714d<? super C7939a<Value>> interfaceC11714d);
}
