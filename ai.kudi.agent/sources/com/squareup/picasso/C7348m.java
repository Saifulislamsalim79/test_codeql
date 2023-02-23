package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
/* compiled from: LruCache.java */
/* renamed from: com.squareup.picasso.m */
/* loaded from: classes2.dex */
public final class C7348m implements InterfaceC7331d {

    /* renamed from: a */
    final LruCache<String, C7350b> f17397a;

    /* compiled from: LruCache.java */
    /* renamed from: com.squareup.picasso.m$a */
    /* loaded from: classes2.dex */
    class C7349a extends LruCache<String, C7350b> {
        C7349a(C7348m c7348m, int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a */
        public int sizeOf(String str, C7350b c7350b) {
            return c7350b.f17399b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LruCache.java */
    /* renamed from: com.squareup.picasso.m$b */
    /* loaded from: classes2.dex */
    public static final class C7350b {

        /* renamed from: a */
        final Bitmap f17398a;

        /* renamed from: b */
        final int f17399b;

        C7350b(Bitmap bitmap, int i) {
            this.f17398a = bitmap;
            this.f17399b = i;
        }
    }

    public C7348m(Context context) {
        this(C7332d0.m18955b(context));
    }

    @Override // com.squareup.picasso.InterfaceC7331d
    /* renamed from: a */
    public int mo18905a() {
        return this.f17397a.maxSize();
    }

    @Override // com.squareup.picasso.InterfaceC7331d
    /* renamed from: b */
    public Bitmap mo18904b(String str) {
        C7350b c7350b = this.f17397a.get(str);
        if (c7350b != null) {
            return c7350b.f17398a;
        }
        return null;
    }

    @Override // com.squareup.picasso.InterfaceC7331d
    /* renamed from: c */
    public void mo18903c(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int m18948i = C7332d0.m18948i(bitmap);
            if (m18948i > mo18905a()) {
                this.f17397a.remove(str);
                return;
            } else {
                this.f17397a.put(str, new C7350b(bitmap, m18948i));
                return;
            }
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // com.squareup.picasso.InterfaceC7331d
    public int size() {
        return this.f17397a.size();
    }

    public C7348m(int i) {
        this.f17397a = new C7349a(this, i);
    }
}
