package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import com.google.android.gms.common.internal.s;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import p272h.p286c.p360e.p361a.p362a.C9395a;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: com.google.mlkit.vision.common.internal.c */
/* loaded from: classes2.dex */
public class C6969c {

    /* renamed from: a */
    private static final C6969c f16692a = new C6969c();

    private C6969c() {
    }

    /* renamed from: a */
    public static ByteBuffer m20417a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public static C6969c m20415c() {
        return f16692a;
    }

    /* renamed from: e */
    public static ByteBuffer m20413e(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer allocateDirect;
        int i;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i2 = limit / 6;
        if (z) {
            allocateDirect = ByteBuffer.allocate(limit);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(limit);
        }
        int i3 = 0;
        while (true) {
            i = i2 * 4;
            if (i3 >= i) {
                break;
            }
            allocateDirect.put(i3, byteBuffer.get(i3));
            i3++;
        }
        for (int i4 = 0; i4 < i2 + i2; i4++) {
            allocateDirect.put(i + i4, byteBuffer.get(((i4 % 2) * i2) + i + (i4 / 2)));
        }
        return allocateDirect;
    }

    /* renamed from: f */
    private static final void m20412f(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit == 0) {
            return;
        }
        int i5 = i / (i2 / limit);
        int i6 = 0;
        for (int i7 = 0; i7 < limit; i7++) {
            int i8 = i6;
            for (int i9 = 0; i9 < i5; i9++) {
                bArr[i3] = buffer.get(i8);
                i3 += i4;
                i8 += plane.getPixelStride();
            }
            i6 += plane.getRowStride();
        }
    }

    /* renamed from: b */
    public ByteBuffer m20416b(C9395a c9395a, boolean z) throws MlKitException {
        ByteBuffer allocateDirect;
        int m14855e = c9395a.m14855e();
        if (m14855e != -1) {
            if (m14855e == 17) {
                if (z) {
                    ByteBuffer m14857c = c9395a.m14857c();
                    s.j(m14857c);
                    return m20417a(m14857c);
                }
                ByteBuffer m14857c2 = c9395a.m14857c();
                s.j(m14857c2);
                return m14857c2;
            } else if (m14855e == 35) {
                Image.Plane[] m14852h = c9395a.m14852h();
                s.j(m14852h);
                return m20414d(m14852h, c9395a.m14850j(), c9395a.m14854f());
            } else if (m14855e == 842094169) {
                ByteBuffer m14857c3 = c9395a.m14857c();
                s.j(m14857c3);
                return m20413e(m14857c3, z);
            } else {
                throw new MlKitException("Unsupported image format", 13);
            }
        }
        Bitmap m14858b = c9395a.m14858b();
        s.j(m14858b);
        Bitmap bitmap = m14858b;
        if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        double d = height;
        Double.isNaN(d);
        int ceil = (int) Math.ceil(d / 2.0d);
        double d2 = width;
        Double.isNaN(d2);
        int ceil2 = ((ceil + ceil) * ((int) Math.ceil(d2 / 2.0d))) + i;
        if (z) {
            allocateDirect = ByteBuffer.allocate(ceil2);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(ceil2);
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < height; i4++) {
            int i5 = 0;
            while (i5 < width) {
                int i6 = iArr[i2];
                int i7 = (i6 >> 16) & 255;
                int i8 = (i6 >> 8) & 255;
                int i9 = i6 & 255;
                int i10 = (((((i7 * (-38)) - (i8 * 74)) + (i9 * 112)) + 128) >> 8) + 128;
                int i11 = (((((i7 * 112) - (i8 * 94)) - (i9 * 18)) + 128) >> 8) + 128;
                int i12 = i3 + 1;
                allocateDirect.put(i3, (byte) Math.min(255, (((((i7 * 66) + (i8 * 129)) + (i9 * 25)) + 128) >> 8) + 16));
                if (i4 % 2 == 0 && i2 % 2 == 0) {
                    int i13 = i + 1;
                    allocateDirect.put(i, (byte) Math.min(255, i11));
                    i = i13 + 1;
                    allocateDirect.put(i13, (byte) Math.min(255, i10));
                }
                i2++;
                i5++;
                i3 = i12;
            }
        }
        return allocateDirect;
    }

    /* renamed from: d */
    public ByteBuffer m20414d(Image.Plane[] planeArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = i3 / 4;
        byte[] bArr = new byte[i4 + i4 + i3];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i5 = (i3 + i3) / 4;
        boolean z = buffer2.remaining() == i5 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i5 - 1);
        } else {
            m20412f(planeArr[0], i, i2, bArr, 0, 1);
            m20412f(planeArr[1], i, i2, bArr, i3 + 1, 2);
            m20412f(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
