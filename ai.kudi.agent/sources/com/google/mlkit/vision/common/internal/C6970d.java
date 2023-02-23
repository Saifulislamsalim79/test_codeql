package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.internal.C2886k;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamic.BinderC2989b;
import com.google.android.gms.dynamic.InterfaceC2987a;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import p272h.p286c.p360e.p361a.p362a.C9395a;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: com.google.mlkit.vision.common.internal.d */
/* loaded from: classes2.dex */
public class C6970d {

    /* renamed from: a */
    private static C6970d f16693a;

    static {
        new C2886k("MLKitImageUtils", "");
        f16693a = new C6970d();
    }

    private C6970d() {
    }

    /* renamed from: b */
    public static C6970d m20410b() {
        return f16693a;
    }

    /* renamed from: a */
    public InterfaceC2987a m20411a(C9395a c9395a) throws MlKitException {
        int m14855e = c9395a.m14855e();
        if (m14855e != -1) {
            if (m14855e != 17) {
                if (m14855e == 35) {
                    return BinderC2989b.m31494p1(c9395a.m14853g());
                }
                if (m14855e != 842094169) {
                    int m14855e2 = c9395a.m14855e();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unsupported image format: ");
                    sb.append(m14855e2);
                    throw new MlKitException(sb.toString(), 3);
                }
            }
            ByteBuffer m14857c = c9395a.m14857c();
            s.j(m14857c);
            return BinderC2989b.m31494p1(m14857c);
        }
        Bitmap m14858b = c9395a.m14858b();
        s.j(m14858b);
        return BinderC2989b.m31494p1(m14858b);
    }

    /* renamed from: c */
    public int m20409c(C9395a c9395a) {
        return c9395a.m14855e();
    }

    /* renamed from: d */
    public int m20408d(C9395a c9395a) {
        if (c9395a.m14855e() == -1) {
            Bitmap m14858b = c9395a.m14858b();
            s.j(m14858b);
            return m14858b.getAllocationByteCount();
        } else if (c9395a.m14855e() != 17 && c9395a.m14855e() != 842094169) {
            if (c9395a.m14855e() != 35) {
                return 0;
            }
            Image.Plane[] m14852h = c9395a.m14852h();
            s.j(m14852h);
            return (m14852h[0].getBuffer().limit() * 3) / 2;
        } else {
            ByteBuffer m14857c = c9395a.m14857c();
            s.j(m14857c);
            return m14857c.limit();
        }
    }
}
