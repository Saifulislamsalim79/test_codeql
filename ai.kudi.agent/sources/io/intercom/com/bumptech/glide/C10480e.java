package io.intercom.com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import io.intercom.com.bumptech.glide.load.engine.C10549j;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10870i;
import io.intercom.com.bumptech.glide.p412p.p413k.C10866e;
import java.util.Map;
/* compiled from: GlideContext.java */
/* renamed from: io.intercom.com.bumptech.glide.e */
/* loaded from: classes3.dex */
public class C10480e extends ContextWrapper {

    /* renamed from: i */
    static final AbstractC10491j<?, ?> f23954i = new C10477b();

    /* renamed from: a */
    private final Handler f23955a;

    /* renamed from: b */
    private final InterfaceC10576b f23956b;

    /* renamed from: c */
    private final Registry f23957c;

    /* renamed from: d */
    private final C10866e f23958d;

    /* renamed from: e */
    private final C10856g f23959e;

    /* renamed from: f */
    private final Map<Class<?>, AbstractC10491j<?, ?>> f23960f;

    /* renamed from: g */
    private final C10549j f23961g;

    /* renamed from: h */
    private final int f23962h;

    public C10480e(Context context, InterfaceC10576b interfaceC10576b, Registry registry, C10866e c10866e, C10856g c10856g, Map<Class<?>, AbstractC10491j<?, ?>> map, C10549j c10549j, int i) {
        super(context.getApplicationContext());
        this.f23956b = interfaceC10576b;
        this.f23957c = registry;
        this.f23958d = c10866e;
        this.f23959e = c10856g;
        this.f23960f = map;
        this.f23961g = c10549j;
        this.f23962h = i;
        this.f23955a = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public <X> AbstractC10870i<ImageView, X> m13013a(ImageView imageView, Class<X> cls) {
        return this.f23958d.m12070a(imageView, cls);
    }

    /* renamed from: b */
    public InterfaceC10576b m13012b() {
        return this.f23956b;
    }

    /* renamed from: c */
    public C10856g m13011c() {
        return this.f23959e;
    }

    /* renamed from: d */
    public <T> AbstractC10491j<?, T> m13010d(Class<T> cls) {
        AbstractC10491j<?, T> abstractC10491j = (AbstractC10491j<?, T>) this.f23960f.get(cls);
        if (abstractC10491j == null) {
            for (Map.Entry<Class<?>, AbstractC10491j<?, ?>> entry : this.f23960f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    abstractC10491j = (AbstractC10491j<?, T>) entry.getValue();
                }
            }
        }
        return abstractC10491j == null ? (AbstractC10491j<?, T>) f23954i : abstractC10491j;
    }

    /* renamed from: e */
    public C10549j m13009e() {
        return this.f23961g;
    }

    /* renamed from: f */
    public int m13008f() {
        return this.f23962h;
    }

    /* renamed from: g */
    public Handler m13007g() {
        return this.f23955a;
    }

    /* renamed from: h */
    public Registry m13006h() {
        return this.f23957c;
    }
}
