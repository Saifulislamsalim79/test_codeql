package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.p109io.BaseEncoding;
import com.google.firebase.C5988g;
import io.grpc.AbstractC9508e;
import io.grpc.C10049s0;
import io.grpc.C9985k;
import io.grpc.p390k1.C9998d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9392g;
/* compiled from: GrpcClientModule.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.z */
/* loaded from: classes2.dex */
public class C6327z {

    /* renamed from: a */
    private final C5988g f15336a;

    public C6327z(C5988g c5988g) {
        this.f15336a = c5988g;
    }

    /* renamed from: a */
    public static String m22286a(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length != 0 && packageInfo.signatures[0] != null) {
                return m22283d(packageInfo.signatures[0]);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: d */
    private static String m22283d(Signature signature) {
        try {
            return BaseEncoding.m25552a().mo25531n().m25548f(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public C10049s0 m22285b() {
        C10049s0.AbstractC10055f m13185e = C10049s0.AbstractC10055f.m13185e("X-Goog-Api-Key", C10049s0.f23786c);
        C10049s0.AbstractC10055f m13185e2 = C10049s0.AbstractC10055f.m13185e("X-Android-Package", C10049s0.f23786c);
        C10049s0.AbstractC10055f m13185e3 = C10049s0.AbstractC10055f.m13185e("X-Android-Cert", C10049s0.f23786c);
        C10049s0 c10049s0 = new C10049s0();
        String packageName = this.f15336a.m23093i().getPackageName();
        c10049s0.m13203n(m13185e, this.f15336a.m23089m().m23069b());
        c10049s0.m13203n(m13185e2, packageName);
        String m22286a = m22286a(this.f15336a.m23093i().getPackageManager(), packageName);
        if (m22286a != null) {
            c10049s0.m13203n(m13185e3, m22286a);
        }
        return c10049s0;
    }

    /* renamed from: c */
    public C9392g.C9394b m22284c(AbstractC9508e abstractC9508e, C10049s0 c10049s0) {
        return C9392g.m14863b(C9985k.m13367b(abstractC9508e, C9998d.m13339a(c10049s0)));
    }
}
