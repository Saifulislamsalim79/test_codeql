package io.intercom.com.bumptech.glide.load.engine.p396y;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: LruBitmapPool.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.y.k */
/* loaded from: classes3.dex */
public class C10590k implements InterfaceC10581e {

    /* renamed from: j */
    private static final Bitmap.Config f24364j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final InterfaceC10593l f24365a;

    /* renamed from: b */
    private final Set<Bitmap.Config> f24366b;

    /* renamed from: c */
    private final InterfaceC10591a f24367c;

    /* renamed from: d */
    private long f24368d;

    /* renamed from: e */
    private long f24369e;

    /* renamed from: f */
    private int f24370f;

    /* renamed from: g */
    private int f24371g;

    /* renamed from: h */
    private int f24372h;

    /* renamed from: i */
    private int f24373i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LruBitmapPool.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.y.k$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC10591a {
        /* renamed from: a */
        void mo12658a(Bitmap bitmap);

        /* renamed from: b */
        void mo12657b(Bitmap bitmap);
    }

    /* compiled from: LruBitmapPool.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.y.k$b */
    /* loaded from: classes3.dex */
    private static final class C10592b implements InterfaceC10591a {
        C10592b() {
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.p396y.C10590k.InterfaceC10591a
        /* renamed from: a */
        public void mo12658a(Bitmap bitmap) {
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.p396y.C10590k.InterfaceC10591a
        /* renamed from: b */
        public void mo12657b(Bitmap bitmap) {
        }
    }

    C10590k(long j, InterfaceC10593l interfaceC10593l, Set<Bitmap.Config> set) {
        this.f24368d = j;
        this.f24365a = interfaceC10593l;
        this.f24366b = set;
        this.f24367c = new C10592b();
    }

    /* renamed from: e */
    private static void m12668e(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: f */
    private void m12667f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m12666g();
        }
    }

    /* renamed from: g */
    private void m12666g() {
        Log.v("LruBitmapPool", "Hits=" + this.f24370f + ", misses=" + this.f24371g + ", puts=" + this.f24372h + ", evictions=" + this.f24373i + ", currentSize=" + this.f24369e + ", maxSize=" + this.f24368d + "\nStrategy=" + this.f24365a);
    }

    /* renamed from: h */
    private void m12665h() {
        m12659n(this.f24368d);
    }

    /* renamed from: i */
    private static Set<Bitmap.Config> m12664i() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: j */
    private static InterfaceC10593l m12663j() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C10595n();
        }
        return new C10577c();
    }

    /* renamed from: k */
    private synchronized Bitmap m12662k(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap;
        m12668e(config);
        bitmap = this.f24365a.get(i, i2, config != null ? config : f24364j);
        if (bitmap == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f24365a.mo12656a(i, i2, config));
            }
            this.f24371g++;
        } else {
            this.f24370f++;
            this.f24369e -= this.f24365a.mo12655b(bitmap);
            this.f24367c.mo12658a(bitmap);
            m12660m(bitmap);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f24365a.mo12656a(i, i2, config));
        }
        m12667f();
        return bitmap;
    }

    /* renamed from: l */
    private static void m12661l(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: m */
    private static void m12660m(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m12661l(bitmap);
    }

    /* renamed from: n */
    private synchronized void m12659n(long j) {
        while (this.f24369e > j) {
            Bitmap removeLast = this.f24365a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m12666g();
                }
                this.f24369e = 0L;
                return;
            }
            this.f24367c.mo12658a(removeLast);
            this.f24369e -= this.f24365a.mo12655b(removeLast);
            this.f24373i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f24365a.mo12653d(removeLast));
            }
            m12667f();
            removeLast.recycle();
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e
    /* renamed from: a */
    public void mo12671a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40) {
            mo12670b();
        } else if (i >= 20) {
            m12659n(this.f24368d / 2);
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e
    /* renamed from: b */
    public void mo12670b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m12659n(0L);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e
    /* renamed from: c */
    public synchronized void mo12398c(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f24365a.mo12655b(bitmap) <= this.f24368d && this.f24366b.contains(bitmap.getConfig())) {
                        int mo12655b = this.f24365a.mo12655b(bitmap);
                        this.f24365a.mo12654c(bitmap);
                        this.f24367c.mo12657b(bitmap);
                        this.f24372h++;
                        this.f24369e += mo12655b;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f24365a.mo12653d(bitmap));
                        }
                        m12667f();
                        m12665h();
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f24365a.mo12653d(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f24366b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e
    /* renamed from: d */
    public Bitmap mo12669d(int i, int i2, Bitmap.Config config) {
        Bitmap m12662k = m12662k(i, i2, config);
        return m12662k == null ? Bitmap.createBitmap(i, i2, config) : m12662k;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        Bitmap m12662k = m12662k(i, i2, config);
        if (m12662k != null) {
            m12662k.eraseColor(0);
            return m12662k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public C10590k(long j) {
        this(j, m12663j(), m12664i());
    }
}
