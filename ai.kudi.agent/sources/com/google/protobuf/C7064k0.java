package com.google.protobuf;

import com.google.protobuf.C7118t1;
import java.io.IOException;
/* compiled from: MapEntryLite.java */
/* renamed from: com.google.protobuf.k0 */
/* loaded from: classes2.dex */
public class C7064k0<K, V> {

    /* renamed from: a */
    private final C7065a<K, V> f16873a;

    /* renamed from: b */
    private final K f16874b;

    /* renamed from: c */
    private final V f16875c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapEntryLite.java */
    /* renamed from: com.google.protobuf.k0$a */
    /* loaded from: classes2.dex */
    public static class C7065a<K, V> {

        /* renamed from: a */
        public final C7118t1.EnumC7120b f16876a;

        /* renamed from: b */
        public final K f16877b;

        /* renamed from: c */
        public final C7118t1.EnumC7120b f16878c;

        /* renamed from: d */
        public final V f16879d;

        public C7065a(C7118t1.EnumC7120b enumC7120b, K k, C7118t1.EnumC7120b enumC7120b2, V v) {
            this.f16876a = enumC7120b;
            this.f16877b = k;
            this.f16878c = enumC7120b2;
            this.f16879d = v;
        }
    }

    private C7064k0(C7118t1.EnumC7120b enumC7120b, K k, C7118t1.EnumC7120b enumC7120b2, V v) {
        this.f16873a = new C7065a<>(enumC7120b, k, enumC7120b2, v);
        this.f16874b = k;
        this.f16875c = v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <K, V> int m19870b(C7065a<K, V> c7065a, K k, V v) {
        return C7126u.m19556d(c7065a.f16876a, 1, k) + C7126u.m19556d(c7065a.f16878c, 2, v);
    }

    /* renamed from: d */
    public static <K, V> C7064k0<K, V> m19868d(C7118t1.EnumC7120b enumC7120b, K k, C7118t1.EnumC7120b enumC7120b2, V v) {
        return new C7064k0<>(enumC7120b, k, enumC7120b2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <K, V> void m19867e(CodedOutputStream codedOutputStream, C7065a<K, V> c7065a, K k, V v) throws IOException {
        C7126u.m19535y(codedOutputStream, c7065a.f16876a, 1, k);
        C7126u.m19535y(codedOutputStream, c7065a.f16878c, 2, v);
    }

    /* renamed from: a */
    public int m19871a(int i, K k, V v) {
        return CodedOutputStream.m20341W(i) + CodedOutputStream.m20372D(m19870b(this.f16873a, k, v));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C7065a<K, V> m19869c() {
        return this.f16873a;
    }
}
