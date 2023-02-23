package com.bumptech.glide.load.engine.p069z;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: LruBitmapPool.java */
/* renamed from: com.bumptech.glide.load.engine.z.k */
/* loaded from: classes2.dex */
public class C2109k implements InterfaceC2100e {

    /* renamed from: j */
    private static final Bitmap.Config f6391j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final InterfaceC2112l f6392a;

    /* renamed from: b */
    private final Set<Bitmap.Config> f6393b;

    /* renamed from: c */
    private final InterfaceC2110a f6394c;

    /* renamed from: d */
    private long f6395d;

    /* renamed from: e */
    private long f6396e;

    /* renamed from: f */
    private int f6397f;

    /* renamed from: g */
    private int f6398g;

    /* renamed from: h */
    private int f6399h;

    /* renamed from: i */
    private int f6400i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LruBitmapPool.java */
    /* renamed from: com.bumptech.glide.load.engine.z.k$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2110a {
        /* renamed from: a */
        void mo33684a(Bitmap bitmap);

        /* renamed from: b */
        void mo33683b(Bitmap bitmap);
    }

    /* compiled from: LruBitmapPool.java */
    /* renamed from: com.bumptech.glide.load.engine.z.k$b */
    /* loaded from: classes2.dex */
    private static final class C2111b implements InterfaceC2110a {
        C2111b() {
        }

        @Override // com.bumptech.glide.load.engine.p069z.C2109k.InterfaceC2110a
        /* renamed from: a */
        public void mo33684a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.p069z.C2109k.InterfaceC2110a
        /* renamed from: b */
        public void mo33683b(Bitmap bitmap) {
        }
    }

    C2109k(long j, InterfaceC2112l interfaceC2112l, Set<Bitmap.Config> set) {
        this.f6395d = j;
        this.f6392a = interfaceC2112l;
        this.f6393b = set;
        this.f6394c = new C2111b();
    }

    /* renamed from: e */
    private static void m33696e(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: f */
    private static Bitmap m33695f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f6391j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: g */
    private void m33694g() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m33693h();
        }
    }

    /* renamed from: h */
    private void m33693h() {
        Log.v("LruBitmapPool", "Hits=" + this.f6397f + ", misses=" + this.f6398g + ", puts=" + this.f6399h + ", evictions=" + this.f6400i + ", currentSize=" + this.f6396e + ", maxSize=" + this.f6395d + "\nStrategy=" + this.f6392a);
    }

    /* renamed from: i */
    private void m33692i() {
        m33685p(this.f6395d);
    }

    /* renamed from: j */
    private static Set<Bitmap.Config> m33691j() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: k */
    private static InterfaceC2112l m33690k() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C2114n();
        }
        return new C2096c();
    }

    /* renamed from: l */
    private synchronized Bitmap m33689l(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap;
        m33696e(config);
        bitmap = this.f6392a.get(i, i2, config != null ? config : f6391j);
        if (bitmap == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f6392a.mo33682a(i, i2, config));
            }
            this.f6398g++;
        } else {
            this.f6397f++;
            this.f6396e -= this.f6392a.mo33681b(bitmap);
            this.f6394c.mo33684a(bitmap);
            m33686o(bitmap);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f6392a.mo33682a(i, i2, config));
        }
        m33694g();
        return bitmap;
    }

    /* renamed from: n */
    private static void m33687n(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: o */
    private static void m33686o(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m33687n(bitmap);
    }

    /* renamed from: p */
    private synchronized void m33685p(long j) {
        while (this.f6396e > j) {
            Bitmap removeLast = this.f6392a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m33693h();
                }
                this.f6396e = 0L;
                return;
            }
            this.f6394c.mo33684a(removeLast);
            this.f6396e -= this.f6392a.mo33681b(removeLast);
            this.f6400i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f6392a.mo33679d(removeLast));
            }
            m33694g();
            removeLast.recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2100e
    /* renamed from: a */
    public void mo33699a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            mo33698b();
        } else if (i >= 20 || i == 15) {
            m33685p(m33688m() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2100e
    /* renamed from: b */
    public void mo33698b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m33685p(0L);
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2100e
    /* renamed from: c */
    public synchronized void mo33347c(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f6392a.mo33681b(bitmap) <= this.f6395d && this.f6393b.contains(bitmap.getConfig())) {
                        int mo33681b = this.f6392a.mo33681b(bitmap);
                        this.f6392a.mo33680c(bitmap);
                        this.f6394c.mo33683b(bitmap);
                        this.f6399h++;
                        this.f6396e += mo33681b;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f6392a.mo33679d(bitmap));
                        }
                        m33694g();
                        m33692i();
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f6392a.mo33679d(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f6393b.contains(bitmap.getConfig()));
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

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2100e
    /* renamed from: d */
    public Bitmap mo33697d(int i, int i2, Bitmap.Config config) {
        Bitmap m33689l = m33689l(i, i2, config);
        return m33689l == null ? m33695f(i, i2, config) : m33689l;
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2100e
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        Bitmap m33689l = m33689l(i, i2, config);
        if (m33689l != null) {
            m33689l.eraseColor(0);
            return m33689l;
        }
        return m33695f(i, i2, config);
    }

    /* renamed from: m */
    public long m33688m() {
        return this.f6395d;
    }

    public C2109k(long j) {
        this(j, m33690k(), m33691j());
    }
}
