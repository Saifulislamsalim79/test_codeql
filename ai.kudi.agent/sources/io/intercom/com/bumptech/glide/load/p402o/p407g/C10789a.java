package io.intercom.com.bumptech.glide.load.p402o.p407g;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import io.intercom.com.bumptech.glide.load.C10621f;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10508b;
import io.intercom.com.bumptech.glide.load.InterfaceC10511e;
import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.load.p402o.C10737b;
import io.intercom.com.bumptech.glide.p393l.C10504c;
import io.intercom.com.bumptech.glide.p393l.C10505d;
import io.intercom.com.bumptech.glide.p393l.C10506e;
import io.intercom.com.bumptech.glide.p393l.InterfaceC10501a;
import io.intercom.com.bumptech.glide.p416r.C10888d;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
/* compiled from: ByteBufferGifDecoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.g.a */
/* loaded from: classes3.dex */
public class C10789a implements InterfaceC10627j<ByteBuffer, C10793c> {

    /* renamed from: f */
    private static final C10790a f24632f = new C10790a();

    /* renamed from: g */
    private static final C10791b f24633g = new C10791b();

    /* renamed from: a */
    private final Context f24634a;

    /* renamed from: b */
    private final List<InterfaceC10511e> f24635b;

    /* renamed from: c */
    private final C10791b f24636c;

    /* renamed from: d */
    private final C10790a f24637d;

    /* renamed from: e */
    private final C10792b f24638e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.g.a$a */
    /* loaded from: classes3.dex */
    public static class C10790a {
        C10790a() {
        }

        /* renamed from: a */
        InterfaceC10501a m12329a(InterfaceC10501a.InterfaceC10502a interfaceC10502a, C10504c c10504c, ByteBuffer byteBuffer, int i) {
            return new C10506e(interfaceC10502a, c10504c, byteBuffer, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.g.a$b */
    /* loaded from: classes3.dex */
    public static class C10791b {

        /* renamed from: a */
        private final Queue<C10505d> f24639a = C10893i.m12007f(0);

        C10791b() {
        }

        /* renamed from: a */
        synchronized C10505d m12328a(ByteBuffer byteBuffer) {
            C10505d poll;
            poll = this.f24639a.poll();
            if (poll == null) {
                poll = new C10505d();
            }
            poll.m12895p(byteBuffer);
            return poll;
        }

        /* renamed from: b */
        synchronized void m12327b(C10505d c10505d) {
            c10505d.m12910a();
            this.f24639a.offer(c10505d);
        }
    }

    public C10789a(Context context, List<InterfaceC10511e> list, InterfaceC10581e interfaceC10581e, InterfaceC10576b interfaceC10576b) {
        this(context, list, interfaceC10581e, interfaceC10576b, f24633g, f24632f);
    }

    /* renamed from: c */
    private C10796e m12333c(ByteBuffer byteBuffer, int i, int i2, C10505d c10505d, C10626i c10626i) {
        long m12031b = C10888d.m12031b();
        C10504c m12908c = c10505d.m12908c();
        if (m12908c.m12913b() <= 0 || m12908c.m12912c() != 0) {
            return null;
        }
        Bitmap.Config config = c10626i.m12593a(C10804i.f24675a) == EnumC10508b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
        InterfaceC10501a m12329a = this.f24637d.m12329a(this.f24638e, m12908c, byteBuffer, m12331e(m12908c, i, i2));
        m12329a.mo12888e(config);
        m12329a.mo12891b();
        Bitmap mo12892a = m12329a.mo12892a();
        if (mo12892a == null) {
            return null;
        }
        C10793c c10793c = new C10793c(this.f24634a, m12329a, C10737b.m12452a(), i, i2, mo12892a);
        if (Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C10888d.m12032a(m12031b));
        }
        return new C10796e(c10793c);
    }

    /* renamed from: e */
    private static int m12331e(C10504c c10504c, int i, int i2) {
        int min = Math.min(c10504c.m12914a() / i2, c10504c.m12911d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + c10504c.m12911d() + "x" + c10504c.m12914a() + "]");
        }
        return max;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: d */
    public C10796e mo12276a(ByteBuffer byteBuffer, int i, int i2, C10626i c10626i) {
        C10505d m12328a = this.f24636c.m12328a(byteBuffer);
        try {
            return m12333c(byteBuffer, i, i2, m12328a, c10626i);
        } finally {
            this.f24636c.m12327b(m12328a);
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: f */
    public boolean mo12275b(ByteBuffer byteBuffer, C10626i c10626i) throws IOException {
        return !((Boolean) c10626i.m12593a(C10804i.f24676b)).booleanValue() && C10621f.m12601c(this.f24635b, byteBuffer) == InterfaceC10511e.EnumC10512a.GIF;
    }

    C10789a(Context context, List<InterfaceC10511e> list, InterfaceC10581e interfaceC10581e, InterfaceC10576b interfaceC10576b, C10791b c10791b, C10790a c10790a) {
        this.f24634a = context.getApplicationContext();
        this.f24635b = list;
        this.f24637d = c10790a;
        this.f24638e = new C10792b(interfaceC10581e, interfaceC10576b);
        this.f24636c = c10791b;
    }
}
