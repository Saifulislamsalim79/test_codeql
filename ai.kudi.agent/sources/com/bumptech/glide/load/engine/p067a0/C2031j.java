package com.bumptech.glide.load.engine.p067a0;

import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.p086q.C2377g;
import com.bumptech.glide.p086q.C2380j;
import com.bumptech.glide.p086q.C2381k;
import com.bumptech.glide.p086q.p087l.AbstractC2392c;
import com.bumptech.glide.p086q.p087l.C2383a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: SafeKeyGenerator.java */
/* renamed from: com.bumptech.glide.load.engine.a0.j */
/* loaded from: classes2.dex */
public class C2031j {

    /* renamed from: a */
    private final C2377g<InterfaceC2118f, String> f6141a = new C2377g<>(1000);

    /* renamed from: b */
    private final InterfaceC7672e<C2033b> f6142b = C2383a.m33105d(10, new C2032a(this));

    /* compiled from: SafeKeyGenerator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.j$a */
    /* loaded from: classes2.dex */
    class C2032a implements C2383a.InterfaceC2387d<C2033b> {
        C2032a(C2031j c2031j) {
        }

        @Override // com.bumptech.glide.p086q.p087l.C2383a.InterfaceC2387d
        /* renamed from: a */
        public C2033b create() {
            try {
                return new C2033b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeKeyGenerator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.j$b */
    /* loaded from: classes2.dex */
    public static final class C2033b implements C2383a.InterfaceC2389f {

        /* renamed from: c */
        final MessageDigest f6143c;

        /* renamed from: d */
        private final AbstractC2392c f6144d = AbstractC2392c.m33094a();

        C2033b(MessageDigest messageDigest) {
            this.f6143c = messageDigest;
        }

        @Override // com.bumptech.glide.p086q.p087l.C2383a.InterfaceC2389f
        /* renamed from: g */
        public AbstractC2392c mo33100g() {
            return this.f6144d;
        }
    }

    /* renamed from: a */
    private String m33897a(InterfaceC2118f interfaceC2118f) {
        C2033b mo11982b = this.f6142b.mo11982b();
        C2380j.m33129d(mo11982b);
        C2033b c2033b = mo11982b;
        try {
            interfaceC2118f.updateDiskCacheKey(c2033b.f6143c);
            return C2381k.m33109s(c2033b.f6143c.digest());
        } finally {
            this.f6142b.mo11983a(c2033b);
        }
    }

    /* renamed from: b */
    public String m33896b(InterfaceC2118f interfaceC2118f) {
        String m33142g;
        synchronized (this.f6141a) {
            m33142g = this.f6141a.m33142g(interfaceC2118f);
        }
        if (m33142g == null) {
            m33142g = m33897a(interfaceC2118f);
        }
        synchronized (this.f6141a) {
            this.f6141a.m33138k(interfaceC2118f, m33142g);
        }
        return m33142g;
    }
}
