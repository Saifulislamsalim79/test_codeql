package com.bumptech.glide.load.p074o.p078g;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C1997e;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1994b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.load.p074o.C2250c;
import com.bumptech.glide.p065k.C1968c;
import com.bumptech.glide.p065k.C1969d;
import com.bumptech.glide.p065k.C1970e;
import com.bumptech.glide.p065k.InterfaceC1965a;
import com.bumptech.glide.p086q.C2376f;
import com.bumptech.glide.p086q.C2381k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
/* compiled from: ByteBufferGifDecoder.java */
/* renamed from: com.bumptech.glide.load.o.g.a */
/* loaded from: classes2.dex */
public class C2261a implements InterfaceC2124j<ByteBuffer, C2265c> {

    /* renamed from: f */
    private static final C2262a f6596f = new C2262a();

    /* renamed from: g */
    private static final C2263b f6597g = new C2263b();

    /* renamed from: a */
    private final Context f6598a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f6599b;

    /* renamed from: c */
    private final C2263b f6600c;

    /* renamed from: d */
    private final C2262a f6601d;

    /* renamed from: e */
    private final C2264b f6602e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.g.a$a */
    /* loaded from: classes2.dex */
    public static class C2262a {
        C2262a() {
        }

        /* renamed from: a */
        InterfaceC1965a m33464a(InterfaceC1965a.InterfaceC1966a interfaceC1966a, C1968c c1968c, ByteBuffer byteBuffer, int i) {
            return new C1970e(interfaceC1966a, c1968c, byteBuffer, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.g.a$b */
    /* loaded from: classes2.dex */
    public static class C2263b {

        /* renamed from: a */
        private final Queue<C1969d> f6603a = C2381k.m33123e(0);

        C2263b() {
        }

        /* renamed from: a */
        synchronized C1969d m33463a(ByteBuffer byteBuffer) {
            C1969d poll;
            poll = this.f6603a.poll();
            if (poll == null) {
                poll = new C1969d();
            }
            poll.m34034p(byteBuffer);
            return poll;
        }

        /* renamed from: b */
        synchronized void m33462b(C1969d c1969d) {
            c1969d.m34049a();
            this.f6603a.offer(c1969d);
        }
    }

    public C2261a(Context context, List<ImageHeaderParser> list, InterfaceC2100e interfaceC2100e, InterfaceC2095b interfaceC2095b) {
        this(context, list, interfaceC2100e, interfaceC2095b, f6597g, f6596f);
    }

    /* renamed from: c */
    private C2268e m33468c(ByteBuffer byteBuffer, int i, int i2, C1969d c1969d, C2122h c2122h) {
        Bitmap.Config config;
        long m33145b = C2376f.m33145b();
        try {
            C1968c m34047c = c1969d.m34047c();
            if (m34047c.m34052b() > 0 && m34047c.m34051c() == 0) {
                if (c2122h.m33661b(C2276i.f6643a) == EnumC1994b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                InterfaceC1965a m33464a = this.f6601d.m33464a(this.f6602e, m34047c, byteBuffer, m33466e(m34047c, i, i2));
                m33464a.mo34027e(config);
                m33464a.mo34030b();
                Bitmap mo34031a = m33464a.mo34031a();
                if (mo34031a == null) {
                    return null;
                }
                C2268e c2268e = new C2268e(new C2265c(this.f6598a, m33464a, C2250c.m33493b(), i, i2, mo34031a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2376f.m33146a(m33145b));
                }
                return c2268e;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2376f.m33146a(m33145b));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2376f.m33146a(m33145b));
            }
        }
    }

    /* renamed from: e */
    private static int m33466e(C1968c c1968c, int i, int i2) {
        int min = Math.min(c1968c.m34053a() / i2, c1968c.m34050d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + c1968c.m34050d() + "x" + c1968c.m34053a() + "]");
        }
        return max;
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: d */
    public C2268e mo33300b(ByteBuffer byteBuffer, int i, int i2, C2122h c2122h) {
        C1969d m33463a = this.f6600c.m33463a(byteBuffer);
        try {
            return m33468c(byteBuffer, i, i2, m33463a, c2122h);
        } finally {
            this.f6600c.m33462b(m33463a);
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: f */
    public boolean mo33301a(ByteBuffer byteBuffer, C2122h c2122h) throws IOException {
        return !((Boolean) c2122h.m33661b(C2276i.f6644b)).booleanValue() && C1997e.m33946f(this.f6599b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    C2261a(Context context, List<ImageHeaderParser> list, InterfaceC2100e interfaceC2100e, InterfaceC2095b interfaceC2095b, C2263b c2263b, C2262a c2262a) {
        this.f6598a = context.getApplicationContext();
        this.f6599b = list;
        this.f6601d = c2262a;
        this.f6602e = new C2264b(interfaceC2100e, interfaceC2095b);
        this.f6600c = c2263b;
    }
}
