package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.load.C10623h;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10509c;
import io.intercom.com.bumptech.glide.load.InterfaceC10628k;
/* compiled from: BitmapEncoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.c */
/* loaded from: classes3.dex */
public class C10740c implements InterfaceC10628k<Bitmap> {

    /* renamed from: a */
    public static final C10623h<Integer> f24561a = C10623h.m12595f("io.intercom.com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: b */
    public static final C10623h<Bitmap.CompressFormat> f24562b = C10623h.m12596e("io.intercom.com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: d */
    private Bitmap.CompressFormat m12449d(Bitmap bitmap, C10626i c10626i) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c10626i.m12593a(f24562b);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10628k
    /* renamed from: a */
    public EnumC10509c mo12307a(C10626i c10626i) {
        return EnumC10509c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #5 {all -> 0x00cb, blocks: (B:3:0x0038, B:8:0x0056, B:24:0x0075, B:26:0x007b, B:30:0x00c7, B:31:0x00ca, B:22:0x0071), top: B:44:0x0038 }] */
    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10510d
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo12306b(io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t<android.graphics.Bitmap> r9, java.io.File r10, io.intercom.com.bumptech.glide.load.C10626i r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.m12449d(r9, r11)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "encode: ["
            r2.append(r3)
            int r3 = r9.getWidth()
            r2.append(r3)
            java.lang.String r3 = "x"
            r2.append(r3)
            int r3 = r9.getHeight()
            r2.append(r3)
            java.lang.String r3 = "] "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            androidx.core.p058os.C1382j.m36160a(r2)
            long r2 = io.intercom.com.bumptech.glide.p416r.C10888d.m12031b()     // Catch: java.lang.Throwable -> Lcb
            io.intercom.com.bumptech.glide.load.h<java.lang.Integer> r4 = io.intercom.com.bumptech.glide.load.p402o.p403c.C10740c.f24561a     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r11.m12593a(r4)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lcb
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lcb
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r9.compress(r1, r4, r7)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            r7.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            r5 = 1
            r7.close()     // Catch: java.io.IOException -> L74 java.lang.Throwable -> Lcb
            goto L74
        L5a:
            r9 = move-exception
            r6 = r7
            goto Lc5
        L5d:
            r10 = move-exception
            r6 = r7
            goto L63
        L60:
            r9 = move-exception
            goto Lc5
        L62:
            r10 = move-exception
        L63:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L6f
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch: java.lang.Throwable -> L60
        L6f:
            if (r6 == 0) goto L74
            r6.close()     // Catch: java.io.IOException -> L74 java.lang.Throwable -> Lcb
        L74:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lcb
            if (r10 == 0) goto Lc1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r10.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch: java.lang.Throwable -> Lcb
            r10.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lcb
            int r1 = io.intercom.com.bumptech.glide.p416r.C10893i.m12005h(r9)     // Catch: java.lang.Throwable -> Lcb
            r10.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lcb
            double r1 = io.intercom.com.bumptech.glide.p416r.C10888d.m12032a(r2)     // Catch: java.lang.Throwable -> Lcb
            r10.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lcb
            io.intercom.com.bumptech.glide.load.h<android.graphics.Bitmap$CompressFormat> r1 = io.intercom.com.bumptech.glide.load.p402o.p403c.C10740c.f24562b     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r11 = r11.m12593a(r1)     // Catch: java.lang.Throwable -> Lcb
            r10.append(r11)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lcb
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lcb
            r10.append(r9)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> Lcb
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> Lcb
        Lc1:
            androidx.core.p058os.C1382j.m36159b()
            return r5
        Lc5:
            if (r6 == 0) goto Lca
            r6.close()     // Catch: java.io.IOException -> Lca java.lang.Throwable -> Lcb
        Lca:
            throw r9     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            r9 = move-exception
            androidx.core.p058os.C1382j.m36159b()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.com.bumptech.glide.load.p402o.p403c.C10740c.mo12306b(io.intercom.com.bumptech.glide.load.engine.t, java.io.File, io.intercom.com.bumptech.glide.load.i):boolean");
    }
}
