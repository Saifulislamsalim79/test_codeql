package com.google.android.gms.internal.p104firebaseauthapi;

import java.lang.reflect.Type;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yj */
/* loaded from: classes2.dex */
public final class C3664yj {
    /* renamed from: a */
    public static Object m29942a(String str, Type type) throws zzpz {
        if (type == String.class) {
            try {
                C3220hl c3220hl = new C3220hl();
                c3220hl.m31046a(str);
                if (c3220hl.m31044c()) {
                    return c3220hl.m31045b();
                }
                String valueOf = String.valueOf(str);
                throw new zzpz(valueOf.length() != 0 ? "No error message: ".concat(valueOf) : new String("No error message: "));
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e.getMessage());
                throw new zzpz(valueOf2.length() != 0 ? "Json conversion failed! ".concat(valueOf2) : new String("Json conversion failed! "), e);
            }
        } else if (type != Void.class) {
            try {
                InterfaceC3030ak interfaceC3030ak = (InterfaceC3030ak) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    interfaceC3030ak.mo29936e(str);
                    return interfaceC3030ak;
                } catch (Exception e2) {
                    String valueOf3 = String.valueOf(e2.getMessage());
                    throw new zzpz(valueOf3.length() != 0 ? "Json conversion failed! ".concat(valueOf3) : new String("Json conversion failed! "), e2);
                }
            } catch (Exception e3) {
                String valueOf4 = String.valueOf(type);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 38);
                sb.append("Instantiation of JsonResponse failed! ");
                sb.append(valueOf4);
                throw new zzpz(sb.toString(), e3);
            }
        } else {
            return null;
        }
    }
}
