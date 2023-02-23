package io.intercom.com.bumptech.glide.load.engine.p397z;

import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.p416r.C10889e;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import io.intercom.com.bumptech.glide.p416r.p417j.AbstractC10903b;
import io.intercom.com.bumptech.glide.p416r.p417j.C10895a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: SafeKeyGenerator.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.z.j */
/* loaded from: classes3.dex */
public class C10618j {

    /* renamed from: a */
    private final C10889e<InterfaceC10622g, String> f24414a = new C10889e<>(1000);

    /* renamed from: b */
    private final InterfaceC7672e<C10620b> f24415b = C10895a.m11988e(10, new C10619a(this));

    /* compiled from: SafeKeyGenerator.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.z.j$a */
    /* loaded from: classes3.dex */
    class C10619a implements C10895a.InterfaceC10899d<C10620b> {
        C10619a(C10618j c10618j) {
        }

        @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10899d
        /* renamed from: a */
        public C10620b create() {
            try {
                return new C10620b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeKeyGenerator.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.z.j$b */
    /* loaded from: classes3.dex */
    public static final class C10620b implements C10895a.InterfaceC10901f {

        /* renamed from: c */
        final MessageDigest f24416c;

        /* renamed from: d */
        private final AbstractC10903b f24417d = AbstractC10903b.m11979a();

        C10620b(MessageDigest messageDigest) {
            this.f24416c = messageDigest;
        }

        @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10901f
        /* renamed from: g */
        public AbstractC10903b mo11981g() {
            return this.f24417d;
        }
    }

    /* renamed from: a */
    private String m12606a(InterfaceC10622g interfaceC10622g) {
        C10620b mo11982b = this.f24415b.mo11982b();
        C10892h.m12014d(mo11982b);
        C10620b c10620b = mo11982b;
        try {
            interfaceC10622g.updateDiskCacheKey(c10620b.f24416c);
            return C10893i.m11993t(c10620b.f24416c.digest());
        } finally {
            this.f24415b.mo11983a(c10620b);
        }
    }

    /* renamed from: b */
    public String m12605b(InterfaceC10622g interfaceC10622g) {
        String m12028g;
        synchronized (this.f24414a) {
            m12028g = this.f24414a.m12028g(interfaceC10622g);
        }
        if (m12028g == null) {
            m12028g = m12606a(interfaceC10622g);
        }
        synchronized (this.f24414a) {
            this.f24414a.m12024k(interfaceC10622g, m12028g);
        }
        return m12028g;
    }
}
