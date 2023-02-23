package com.google.firebase.inappmessaging.display.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.C1950g;
import com.bumptech.glide.ComponentCallbacks2C1952h;
import com.bumptech.glide.load.EnumC1994b;
import com.bumptech.glide.load.p072n.C2186g;
import com.bumptech.glide.load.p072n.C2189j;
import com.bumptech.glide.p082o.p083j.AbstractC2357a;
import com.bumptech.glide.p082o.p084k.InterfaceC2363b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: FiamImageLoader.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.e */
/* loaded from: classes2.dex */
public class C6044e {

    /* renamed from: a */
    private final ComponentCallbacks2C1952h f14751a;

    /* renamed from: b */
    private final Map<String, Set<AbstractC2357a>> f14752b = new HashMap();

    /* compiled from: FiamImageLoader.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.e$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6045a extends AbstractC2357a<Drawable> {

        /* renamed from: f */
        private ImageView f14753f;

        /* renamed from: h */
        private void m22919h(Drawable drawable) {
            ImageView imageView = this.f14753f;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }

        /* renamed from: e */
        public abstract void mo22922e(Exception exc);

        @Override // com.bumptech.glide.p082o.p083j.InterfaceC2360d
        /* renamed from: f */
        public void mo22923b(Drawable drawable, InterfaceC2363b<? super Drawable> interfaceC2363b) {
            C6065m.m22821a("Downloading Image Success!!!");
            m22919h(drawable);
            mo22920g();
        }

        /* renamed from: g */
        public abstract void mo22920g();

        /* renamed from: i */
        void m22918i(ImageView imageView) {
            this.f14753f = imageView;
        }

        @Override // com.bumptech.glide.p082o.p083j.InterfaceC2360d
        public void onLoadCleared(Drawable drawable) {
            C6065m.m22821a("Downloading Image Cleared");
            m22919h(drawable);
            mo22920g();
        }

        @Override // com.bumptech.glide.p082o.p083j.AbstractC2357a, com.bumptech.glide.p082o.p083j.InterfaceC2360d
        public void onLoadFailed(Drawable drawable) {
            C6065m.m22821a("Downloading Image Failed");
            m22919h(drawable);
            mo22922e(new Exception("Image loading failed!"));
        }
    }

    /* compiled from: FiamImageLoader.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.e$b */
    /* loaded from: classes2.dex */
    public class C6046b {

        /* renamed from: a */
        private final C1950g<Drawable> f14754a;

        /* renamed from: b */
        private AbstractC6045a f14755b;

        /* renamed from: c */
        private String f14756c;

        public C6046b(C1950g<Drawable> c1950g) {
            this.f14754a = c1950g;
        }

        /* renamed from: a */
        private void m22917a() {
            Set hashSet;
            if (this.f14755b == null || TextUtils.isEmpty(this.f14756c)) {
                return;
            }
            synchronized (C6044e.this.f14752b) {
                if (C6044e.this.f14752b.containsKey(this.f14756c)) {
                    hashSet = (Set) C6044e.this.f14752b.get(this.f14756c);
                } else {
                    hashSet = new HashSet();
                    C6044e.this.f14752b.put(this.f14756c, hashSet);
                }
                if (!hashSet.contains(this.f14755b)) {
                    hashSet.add(this.f14755b);
                }
            }
        }

        /* renamed from: b */
        public void m22916b(ImageView imageView, AbstractC6045a abstractC6045a) {
            C6065m.m22821a("Downloading Image Callback : " + abstractC6045a);
            abstractC6045a.m22918i(imageView);
            this.f14754a.m34133h0(abstractC6045a);
            this.f14755b = abstractC6045a;
            m22917a();
        }

        /* renamed from: c */
        public C6046b m22915c(int i) {
            this.f14754a.m33248K(i);
            C6065m.m22821a("Downloading Image Placeholder : " + i);
            return this;
        }

        /* renamed from: d */
        public C6046b m22914d(Class cls) {
            this.f14756c = cls.getSimpleName();
            m22917a();
            return this;
        }
    }

    public C6044e(ComponentCallbacks2C1952h componentCallbacks2C1952h) {
        this.f14751a = componentCallbacks2C1952h;
    }

    /* renamed from: b */
    public void m22925b(Class cls) {
        String simpleName = cls.getSimpleName();
        synchronized (simpleName) {
            if (this.f14752b.containsKey(simpleName)) {
                for (AbstractC2357a abstractC2357a : this.f14752b.get(simpleName)) {
                    if (abstractC2357a != null) {
                        this.f14751a.m34122i(abstractC2357a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public C6046b m22924c(String str) {
        C6065m.m22821a("Starting Downloading Image : " + str);
        C2189j.C2190a c2190a = new C2189j.C2190a();
        c2190a.m33571b("Accept", "image/*");
        return new C6046b(this.f14751a.m34118m(new C2186g(str, c2190a.m33570c())).m33231f(EnumC1994b.PREFER_ARGB_8888));
    }
}
