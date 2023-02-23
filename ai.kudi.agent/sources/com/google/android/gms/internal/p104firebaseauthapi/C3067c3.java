package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c3 */
/* loaded from: classes2.dex */
public final class C3067c3 {

    /* renamed from: a */
    private static final Logger f8296a = Logger.getLogger(C3067c3.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, InterfaceC3040b3> f8297b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, C3013a3> f8298c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, Boolean> f8299d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<Class<?>, InterfaceC3569v2<?, ?>> f8300e;

    /* renamed from: f */
    private static final ConcurrentMap<String, C3120e2> f8301f;

    static {
        new ConcurrentHashMap();
        f8300e = new ConcurrentHashMap();
        f8301f = new ConcurrentHashMap();
    }

    private C3067c3() {
    }

    /* renamed from: a */
    public static InterfaceC3039b2<?> m31308a(String str) throws GeneralSecurityException {
        return m31293p(str).zzb();
    }

    /* renamed from: b */
    public static C3602w9 m31307b(String str, AbstractC3223ho abstractC3223ho) throws GeneralSecurityException {
        InterfaceC3039b2 m31294o = m31294o(str, null);
        if (m31294o instanceof C3595w2) {
            return ((C3595w2) m31294o).m30100g(abstractC3223ho);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("manager for key type ");
        sb.append(str);
        sb.append(" is not a PrivateKeyManager");
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: c */
    public static synchronized C3602w9 m31306c(C3020aa c3020aa) throws GeneralSecurityException {
        C3602w9 mo31275b;
        synchronized (C3067c3.class) {
            InterfaceC3039b2<?> m31308a = m31308a(c3020aa.m31430E());
            if (f8299d.get(c3020aa.m31430E()).booleanValue()) {
                mo31275b = m31308a.mo31275b(c3020aa.m31431D());
            } else {
                String valueOf = String.valueOf(c3020aa.m31430E());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return mo31275b;
    }

    /* renamed from: d */
    public static synchronized InterfaceC3644y m31305d(C3020aa c3020aa) throws GeneralSecurityException {
        InterfaceC3644y mo31273d;
        synchronized (C3067c3.class) {
            InterfaceC3039b2<?> m31308a = m31308a(c3020aa.m31430E());
            if (f8299d.get(c3020aa.m31430E()).booleanValue()) {
                mo31273d = m31308a.mo31273d(c3020aa.m31431D());
            } else {
                String valueOf = String.valueOf(c3020aa.m31430E());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return mo31273d;
    }

    /* renamed from: e */
    public static Class<?> m31304e(Class<?> cls) {
        InterfaceC3569v2<?, ?> interfaceC3569v2 = f8300e.get(cls);
        if (interfaceC3569v2 == null) {
            return null;
        }
        return interfaceC3569v2.zza();
    }

    @Deprecated
    /* renamed from: f */
    public static <P> P m31303f(C3602w9 c3602w9) throws GeneralSecurityException {
        return (P) m31292q(c3602w9.m30091E(), c3602w9.m30092D(), null);
    }

    /* renamed from: g */
    public static <P> P m31302g(C3602w9 c3602w9, Class<P> cls) throws GeneralSecurityException {
        return (P) m31292q(c3602w9.m30091E(), c3602w9.m30092D(), cls);
    }

    /* renamed from: h */
    public static <P> P m31301h(String str, InterfaceC3644y interfaceC3644y, Class<P> cls) throws GeneralSecurityException {
        return (P) m31294o(str, cls).mo31276a(interfaceC3644y);
    }

    /* renamed from: i */
    public static <P> P m31300i(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) m31292q(str, AbstractC3223ho.m31022J(bArr), cls);
    }

    /* renamed from: j */
    public static <B, P> P m31299j(C3543u2<B> c3543u2, Class<P> cls) throws GeneralSecurityException {
        InterfaceC3569v2<?, ?> interfaceC3569v2 = f8300e.get(cls);
        if (interfaceC3569v2 == null) {
            String valueOf = String.valueOf(c3543u2.m30203c().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
        } else if (interfaceC3569v2.zza().equals(c3543u2.m30203c())) {
            return (P) interfaceC3569v2.mo30143a(c3543u2);
        } else {
            String valueOf2 = String.valueOf(interfaceC3569v2.zza());
            String valueOf3 = String.valueOf(c3543u2.m30203c());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 44 + String.valueOf(valueOf3).length());
            sb.append("Wrong input primitive class, expected ");
            sb.append(valueOf2);
            sb.append(", got ");
            sb.append(valueOf3);
            throw new GeneralSecurityException(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static synchronized Map<String, C3120e2> m31298k() {
        Map<String, C3120e2> unmodifiableMap;
        synchronized (C3067c3.class) {
            unmodifiableMap = Collections.unmodifiableMap(f8301f);
        }
        return unmodifiableMap;
    }

    /* renamed from: l */
    public static synchronized <KeyProtoT extends InterfaceC3644y, PublicKeyProtoT extends InterfaceC3644y> void m31297l(AbstractC3621x2<KeyProtoT, PublicKeyProtoT> abstractC3621x2, AbstractC3255j2<PublicKeyProtoT> abstractC3255j2, boolean z) throws GeneralSecurityException {
        Class<?> mo29908d;
        synchronized (C3067c3.class) {
            m31291r("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", abstractC3621x2.getClass(), abstractC3621x2.mo29976a().mo30065d(), true);
            m31291r("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", abstractC3255j2.getClass(), Collections.emptyMap(), false);
            if (f8297b.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (mo29908d = f8297b.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").mo29908d()) != null && !mo29908d.getName().equals(abstractC3255j2.getClass().getName())) {
                f8296a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", abstractC3621x2.getClass().getName(), mo29908d.getName(), abstractC3255j2.getClass().getName()));
            }
            if (!f8297b.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || f8297b.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").mo29908d() == null) {
                f8297b.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new C3673z2(abstractC3621x2, abstractC3255j2));
                f8298c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new C3013a3(abstractC3621x2));
                m31290s("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", abstractC3621x2.mo29976a().mo30065d());
            }
            f8299d.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
            if (!f8297b.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                f8297b.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new C3647y2(abstractC3255j2));
            }
            f8299d.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
        }
    }

    /* renamed from: m */
    public static synchronized <KeyProtoT extends InterfaceC3644y> void m31296m(AbstractC3255j2<KeyProtoT> abstractC3255j2, boolean z) throws GeneralSecurityException {
        synchronized (C3067c3.class) {
            String mo29904g = abstractC3255j2.mo29904g();
            m31291r(mo29904g, abstractC3255j2.getClass(), abstractC3255j2.mo29976a().mo30065d(), true);
            if (!f8297b.containsKey(mo29904g)) {
                f8297b.put(mo29904g, new C3647y2(abstractC3255j2));
                f8298c.put(mo29904g, new C3013a3(abstractC3255j2));
                m31290s(mo29904g, abstractC3255j2.mo29976a().mo30065d());
            }
            f8299d.put(mo29904g, Boolean.TRUE);
        }
    }

    /* renamed from: n */
    public static synchronized <B, P> void m31295n(InterfaceC3569v2<B, P> interfaceC3569v2) throws GeneralSecurityException {
        synchronized (C3067c3.class) {
            if (interfaceC3569v2 != null) {
                Class<P> zzb = interfaceC3569v2.zzb();
                if (f8300e.containsKey(zzb)) {
                    InterfaceC3569v2<?, ?> interfaceC3569v22 = f8300e.get(zzb);
                    if (!interfaceC3569v2.getClass().getName().equals(interfaceC3569v22.getClass().getName())) {
                        Logger logger = f8296a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(zzb);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                        sb.append("Attempted overwrite of a registered PrimitiveWrapper for type ");
                        sb.append(valueOf);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb.getName(), interfaceC3569v22.getClass().getName(), interfaceC3569v2.getClass().getName()));
                    }
                }
                f8300e.put(zzb, interfaceC3569v2);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: o */
    private static <P> InterfaceC3039b2<P> m31294o(String str, Class<P> cls) throws GeneralSecurityException {
        InterfaceC3040b3 m31293p = m31293p(str);
        if (cls == null) {
            return (InterfaceC3039b2<P>) m31293p.zzb();
        }
        if (m31293p.mo29911a().contains(cls)) {
            return m31293p.mo29910b(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(m31293p.mo29909c());
        Set<Class<?>> mo29911a = m31293p.mo29911a();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : mo29911a) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        int length = String.valueOf(name).length();
        StringBuilder sb3 = new StringBuilder(length + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    /* renamed from: p */
    private static synchronized InterfaceC3040b3 m31293p(String str) throws GeneralSecurityException {
        InterfaceC3040b3 interfaceC3040b3;
        synchronized (C3067c3.class) {
            if (!f8297b.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            interfaceC3040b3 = f8297b.get(str);
        }
        return interfaceC3040b3;
    }

    /* renamed from: q */
    private static <P> P m31292q(String str, AbstractC3223ho abstractC3223ho, Class<P> cls) throws GeneralSecurityException {
        return (P) m31294o(str, cls).mo31274c(abstractC3223ho);
    }

    /* renamed from: r */
    private static synchronized <KeyProtoT extends InterfaceC3644y, KeyFormatProtoT extends InterfaceC3644y> void m31291r(String str, Class cls, Map<String, C3174g2<KeyFormatProtoT>> map, boolean z) throws GeneralSecurityException {
        synchronized (C3067c3.class) {
            InterfaceC3040b3 interfaceC3040b3 = f8297b.get(str);
            if (interfaceC3040b3 != null && !interfaceC3040b3.mo29909c().equals(cls)) {
                f8296a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, interfaceC3040b3.mo29909c().getName(), cls.getName()));
            } else if (z) {
                if (f8299d.containsKey(str) && !f8299d.get(str).booleanValue()) {
                    throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
                } else if (f8297b.containsKey(str)) {
                    for (Map.Entry<String, C3174g2<KeyFormatProtoT>> entry : map.entrySet()) {
                        if (!f8301f.containsKey(entry.getKey())) {
                            String key = entry.getKey();
                            StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 79 + str.length());
                            sb.append("Attempted to register a new key template ");
                            sb.append(key);
                            sb.append(" from an existing key manager of type ");
                            sb.append(str);
                            throw new GeneralSecurityException(sb.toString());
                        }
                    }
                } else {
                    for (Map.Entry<String, C3174g2<KeyFormatProtoT>> entry2 : map.entrySet()) {
                        if (f8301f.containsKey(entry2.getKey())) {
                            String valueOf = String.valueOf(entry2.getKey());
                            throw new GeneralSecurityException(valueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(valueOf) : new String("Attempted overwrite of a registered key template "));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private static <KeyFormatProtoT extends InterfaceC3644y> void m31290s(String str, Map<String, C3174g2<KeyFormatProtoT>> map) {
        for (Map.Entry<String, C3174g2<KeyFormatProtoT>> entry : map.entrySet()) {
            f8301f.put(entry.getKey(), C3120e2.m31211e(str, entry.getValue().f8499a.mo30000p(), entry.getValue().f8500b));
        }
    }
}
