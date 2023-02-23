package com.github.kittinunf.result;

import java.lang.Exception;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: Result.kt */
/* renamed from: com.github.kittinunf.result.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2512a<V, E extends Exception> {

    /* renamed from: a */
    public static final C2513a f7138a = new C2513a(null);

    /* compiled from: Result.kt */
    /* renamed from: com.github.kittinunf.result.a$a */
    /* loaded from: classes2.dex */
    public static final class C2513a {
        private C2513a() {
        }

        /* renamed from: a */
        public final <E extends Exception> C2514b<E> m32700a(E e) {
            l.g(e, "ex");
            return new C2514b<>(e);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final <V, E extends Exception> AbstractC2512a<V, E> m32699b(InterfaceC11756a<? extends V> interfaceC11756a) {
            l.g(interfaceC11756a, "f");
            try {
                return m32698c(interfaceC11756a.invoke());
            } catch (Exception e) {
                return m32700a(e);
            }
        }

        /* renamed from: c */
        public final <V> C2515c<V> m32698c(V v) {
            l.g(v, "v");
            return new C2515c<>(v);
        }

        public /* synthetic */ C2513a(g gVar) {
            this();
        }
    }

    /* compiled from: Result.kt */
    /* renamed from: com.github.kittinunf.result.a$b */
    /* loaded from: classes2.dex */
    public static final class C2514b<E extends Exception> extends AbstractC2512a {

        /* renamed from: b */
        private final E f7139b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2514b(E e) {
            super(null);
            l.g(e, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            this.f7139b = e;
        }

        @Override // com.github.kittinunf.result.AbstractC2512a
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo32694a() {
            m32697b();
            throw null;
        }

        /* renamed from: b */
        public Void m32697b() {
            throw this.f7139b;
        }

        /* renamed from: c */
        public final E m32696c() {
            return this.f7139b;
        }

        /* renamed from: d */
        public final E m32695d() {
            return this.f7139b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2514b) && l.b(this.f7139b, ((C2514b) obj).f7139b);
        }

        public int hashCode() {
            return this.f7139b.hashCode();
        }

        public String toString() {
            return "[Failure: " + this.f7139b + ']';
        }
    }

    /* compiled from: Result.kt */
    /* renamed from: com.github.kittinunf.result.a$c */
    /* loaded from: classes2.dex */
    public static final class C2515c<V> extends AbstractC2512a {

        /* renamed from: b */
        private final V f7140b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2515c(V v) {
            super(null);
            l.g(v, "value");
            this.f7140b = v;
        }

        @Override // com.github.kittinunf.result.AbstractC2512a
        /* renamed from: a */
        public V mo32694a() {
            return this.f7140b;
        }

        /* renamed from: b */
        public final V m32693b() {
            return this.f7140b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2515c) && l.b(this.f7140b, ((C2515c) obj).f7140b);
        }

        public int hashCode() {
            return this.f7140b.hashCode();
        }

        public String toString() {
            return "[Success: " + this.f7140b + ']';
        }
    }

    private AbstractC2512a() {
    }

    /* renamed from: a */
    public abstract V mo32694a();

    public /* synthetic */ AbstractC2512a(g gVar) {
        this();
    }
}
